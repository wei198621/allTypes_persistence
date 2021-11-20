package com.tiza.leo.beetSql.util;

import org.beetl.sql.core.ClasspathLoader;
import org.beetl.sql.core.ConnectionSource;
import org.beetl.sql.core.ConnectionSourceHelper;
import org.beetl.sql.core.Interceptor;
import org.beetl.sql.core.SQLLoader;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.UnderlinedNameConversion;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.core.db.OracleStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Author: tz_wl
 * Date: 2020/3/30 16:07
 * Content:
 * 完成核心功能是 初始化   org.beetl.sql.core.SQLManager
 * SQLManager 需要参数 (  dbStyle    MySqlStyle、OracleStyle
 *                     , loader    SQLLoader : sql 文件
 *                     , source    dbDriver, dbUrl, dbUser, dbPassword
 *                     )
 */
/*@Component*/
public class BeetlSQLManagerInit {

    private static String dbUrl = "";
    private static String dbUser ="";
    private static String dbPassword ="";
    private static String dbDriver = "";
    private static String dbStyleName="";

    private static SQLManager sqlManager ;

    public static SQLManager getSqlManager(){
        return sqlManager;
    }

    //  BeetlSQLManagerInit 需要实例化 SQLManager
    public void init( ) {
        try {
            getProperties("/jdbc.properties");
            DBStyle dbStyle;//= new MySqlStyle() ;                                //  数据库类型

            /*// 根据 dbStyleName 设置 数据库类型   MySql oracle  或者其他
            if(dbStyleName.equals(enumDB.MySqlStyle)){
                dbStyle = new MySqlStyle();
            }else if(dbStyleName.equals(enumDB.OracleStyle)){
                dbStyle = new OracleStyle();
            }else {
                dbStyle = new OracleStyle();
            }*/

            if(dbStyleName.equals("OracleStyle")){
                dbStyle = new OracleStyle();
            }else if(dbStyleName.equals("MySqlStyle")){
                dbStyle = new MySqlStyle();
            }else {
                dbStyle = new MySqlStyle();
            }


            System.out.println("===========dbStyleName is "+ dbStyleName);

            // sql语句放在classpath的/sql 目录下
            SQLLoader loader = new ClasspathLoader("/sql", dbStyle);
            ConnectionSource source = ConnectionSourceHelper.getSimple(dbDriver, dbUrl, dbUser, dbPassword);
            // 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的，
            UnderlinedNameConversion nameConversion = new UnderlinedNameConversion();
            // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
            sqlManager = new SQLManager(dbStyle, loader, source, nameConversion, new Interceptor[]{new DebugInterceptor()});

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取properties 方式一
     * @param filePath
     * @throws IOException
     */
    private void getProperties(String filePath) throws IOException {
        Properties props=new Properties();
        InputStream inputStream= this.getClass().getResourceAsStream(filePath);
        InputStreamReader inputStreamReader =new InputStreamReader(inputStream,"utf-8");
        props.load(inputStreamReader);
        dbStyleName =props.getProperty("dbStyleName","");    //数据库类型  本示例 oracle  mysql
        dbDriver =props.getProperty("jdbc.driver","");
        dbUrl = props.getProperty("jdbc.url","");
        dbUser =props.getProperty("jdbc.username","");
        dbPassword =props.getProperty("jdbc.password","");
    }

}

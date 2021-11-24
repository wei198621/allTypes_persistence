
 http://localhost:3281/swagger-ui.html#/

************************************************************
*********************1. 基本的 restful ************************
************************************************************
1. 启动端口 8081
2. springboot  方式  启动
3.
3.1  http://localhost:3281/msg/messageMock50  首先模拟50条数据       get
3.2  http://localhost:3281/msg/listMsg        获取模拟的50条数据     get
3.3  http://localhost:3281/msg/message        post
3.4  http://localhost:3281/msg/message        put
3.5  http://localhost:3281/msg/message/id     get
3.5  http://localhost:3281/msg/message/id     del


************************************************************
****************2. jpa 连接 db   **************************
************************************************************

本示例fork  diyiliu 做修改
基本信息：
1.数据库使用mysql,共建立user表
3.mybatis作为数据库持久化工具
5.spingboot架构 2.1.0.RELEASE
7.提供swagger2供查询调用接口     http://localhost:3281/swagger-ui.html#/







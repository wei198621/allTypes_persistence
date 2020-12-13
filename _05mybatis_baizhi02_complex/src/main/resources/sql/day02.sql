


------------------ myslq  方式

CREATE TABLE mybatis_baizhi_emp(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40),
	age INT,
	bir DATE
);

INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('1','xiaowei',33,NOW());
INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('2','xiaowang',23,NOW());

select id,name,age, bir  from mybatis_baizhi_emp ;

----------------------   oracle 方式
-- 员工表
create table mybatis_baizhi_emp(
	id varchar2(36) primary key,
	name varchar2(40),
	age number(3),
	bir TIMESTAMP
);

-- drop table t_emp ;

insert into mybatis_baizhi_emp values('2','小三',23,sysdate);

select id,name,age, bir  from mybatis_baizhi_emp

------------------------------------------------------------------------------


select * from mybatis_baizhi_emp;


insert into mybatis_baizhi_emp values('7','小黑1',23,sysdate);
insert into mybatis_baizhi_emp values('8','小黑2',23,sysdate);
insert into mybatis_baizhi_emp values('9','小黑3',23,sysdate);
insert into mybatis_baizhi_emp values('10','小黑4',23,sysdate);
insert into mybatis_baizhi_emp values('2','小三',23,sysdate);
insert into mybatis_baizhi_emp values('3','小牛',23,sysdate);
insert into mybatis_baizhi_emp values('4','小黄',23,sysdate);
insert into mybatis_baizhi_emp values('5','小猫',23,sysdate);
insert into mybatis_baizhi_emp values('6','小金豆',23,sysdate);

delete from mybatis_baizhi_emp;

--业务   每页显示2条

	1
    0(1-1)*2    2  1*2
    2
	2(2-1)*2    4  2*2
	3
	4(3-1)*2    6  3*2

---- 一下为oracle 语法
-- 分页  数据过多 一张页面展示  不开    业务系统中   用户关系数据放置第一页展示
	--1.业务系统中的数据  排序
	select id , name ,age , birthday from mybatis_baizhi_emp order by name

	--2.给rownum获取一个范围
	select e.*,rownum r from (select id , name ,age , bir from mybatis_baizhi_emp order by name) e
	where rownum < 9

	--3.确定r起始位置
	select e1.* from (select e.*,rownum r from (select id , name ,age , bir from mybatis_baizhi_emp order by name) e
	where rownum <= 4(pageNow*pageSize)) e1 where r > 2 (pageNow-1)*pageSize



--模糊查询

 select * from mybatis_baizhi_emp where name like %小%;
 --=================================================================================================================
 ---库表结构  oracle
create table mybatis_baizhi_book(
	id varchar2(40) primary key,
	name varchar2(40),
	publishDate date,
	price number(7,3),
	author varchar2(50)
);

 ---库表结构   mysql
create table mybatis_baizhi_book(
	id varchar(40) primary key,
	name varchar(40),
	publishDate date,
	price decimal(7,3),
	author varchar(50)
);
drop table mybatis_baizhi_book;
-------------------oracle
BEGIN
	insert into mybatis_baizhi_book values('13','六脉神剑',sysdate,120.23,'小黑');
	insert into mybatis_baizhi_book values('14','如来神掌',sysdate,110.23,'小名');
	insert into mybatis_baizhi_book values('15','葵花宝典',sysdate,80.23,'无名');
	insert into mybatis_baizhi_book values('16','星星点灯',sysdate,90.34,'小牛');
	insert into mybatis_baizhi_book values('17','黯然销魂掌',sysdate,67.23,'小伟');
END;

-------------------mysql

BEGIN
	insert into mybatis_baizhi_book values('13','六脉神剑',now(),120.23,'小黑');
	insert into mybatis_baizhi_book values('14','如来神掌',now(),110.23,'小名');
	insert into mybatis_baizhi_book values('15','葵花宝典',now(),80.23,'无名');
	insert into mybatis_baizhi_book values('16','星星点灯',now(),90.34,'小牛');
	insert into mybatis_baizhi_book values('17','黯然销魂掌',now(),67.23,'小伟');
END;


select * from t_book;




----------------------------------------------------------------------------------




--一对一
--用户表
create table t_users(
	id varchar2(36) primary key,
	name varchar2(40),
	age Integer,
	bir date,
	cardId varchar2(36) references t_card(id)
);
--身份信息表
create table t_card(
	id  varchar2(36) primary key,
	no varchar2(18),
	address varchar2(100),
	fork varchar2(30)
);
------------------------------------------------
--测试数据
insert into t_card values('1','1','北京市海淀区','汉族');
insert into t_card values('2','2','北京市昌平区','满族');

insert into t_users values('1','小黑',23,sysdate,'1');
insert into t_users values('2','小三',23,sysdate,'2');

--连接查询语句
select * from t_users u left join t_card c on u.cardId = c.id


















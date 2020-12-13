


------------------ myslq  方式
-- drop table   mybatis_baizhi_emp ;

CREATE TABLE mybatis_baizhi_emp(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40),
	age INT,
	bir DATE
);

INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('1','xiaowei',21,NOW());
INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('2','xiaowang',23,NOW());
INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('25','xiaowang',25,NOW());
INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('26','xiaowang',26,NOW());
INSERT INTO mybatis_baizhi_emp(id ,NAME,age,bir) VALUES('27','xiaowang',27,NOW());

select id,name,age, bir  from mybatis_baizhi_emp ;



------------------------------------------------------------------------------



--业务   每页显示2条

	1
    0(1-1)*2    2  1*2
    2
	2(2-1)*2    4  2*2
	3
	4(3-1)*2    6  3*2



--模糊查询

 select * from mybatis_baizhi_emp where name like %小%;
 --=================================================================================================================


 ---库表结构   mysql
create table mybatis_baizhi_book(
	id varchar(40) primary key,
	name varchar(40),
	publishDate date,
	price decimal(7,3),
	author varchar(50)
);
drop table mybatis_baizhi_book;


-------------------mysql

BEGIN
	insert into mybatis_baizhi_book values('13','六脉神剑',now(),120.23,'小黑');
	insert into mybatis_baizhi_book values('14','如来神掌',now(),110.23,'小名');
	insert into mybatis_baizhi_book values('15','葵花宝典',now(),80.23,'无名');
	insert into mybatis_baizhi_book values('16','星星点灯',now(),90.34,'小牛');
	insert into mybatis_baizhi_book values('17','黯然销魂掌',now(),67.23,'小伟');
END;


select * from t_book;


/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 5.6.11
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

insert into `mybatis_baizhi_book` (`id`, `name`, `publishDate`, `price`, `author`) values('1','leo','2020-12-12','22','leo');
insert into `mybatis_baizhi_book` (`id`, `name`, `publishDate`, `price`, `author`) values('2','wei','2020-12-12','33','gousheng');

----------------------------------------------------------------------------------




--一对一
--用户表
create table mybatis_baizhi_users(
	id varchar(36) primary key,
	name varchar(40),
	age Integer,
	bir date,
	cardId varchar(36) references mybatis_baizhi_card(id)
);
--身份信息表
create table mybatis_baizhi_card(
	id  varchar(36) primary key,
	no varchar(18),
	address varchar(100),
	fork varchar(30)
);
------------------------------------------------
--测试数据
insert into mybatis_baizhi_card values('1','1','北京市海淀区','汉族');
insert into mybatis_baizhi_card values('2','2','北京市昌平区','满族');

insert into mybatis_baizhi_users values('1','小黑',23,now(),'1');
insert into mybatis_baizhi_users values('2','小三',23,now(),'2');

--连接查询语句
select * from mybatis_baizhi_users u left join mybatis_baizhi_card c on u.cardId = c.id


















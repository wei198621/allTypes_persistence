


------------------ myslq  方式

CREATE TABLE mybatis_baizhi_emp(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40),
	age INT,
	birthday DATE
);

INSERT INTO mybatis_baizhi_emp(id ,NAME,age,birthday) VALUES('1','xiaowei',33,NOW());
INSERT INTO mybatis_baizhi_emp(id ,NAME,age,birthday) VALUES('2','xiaowang',23,NOW());

select id,name,age,birthday bir  from mybatis_baizhi_emp ;

----------------------   oracle 方式
-- 员工表
create table mybatis_baizhi_emp(
	id varchar2(36) primary key,
	name varchar2(40),
	age number(3),
	birthday TIMESTAMP
);

-- drop table t_emp ;

insert into mybatis_baizhi_emp values('2','小三',23,sysdate);

select id,name,age,birthday bir  from mybatis_baizhi_emp


--处理一对多
--部门表
create table t_dept(
	id varchar2(36) primary key,
	name varchar2(40)
);
--员工表
create table t_emps(
	id varchar2(36) primary key,
	name varchar2(40),
	age Integer ,
	bir date,
	salary number(7,2),
	deptId varchar2(36) references t_dept(id)
);
--部门测试数据
insert into t_dept values('1','教学部');
insert into t_dept values('2','研发部');
--员工的测试数据
insert into t_emps values('1','小黑',12,sysdate,23000.12,'1');
insert into t_emps values('2','小三',12,sysdate,23000.12,'2');
insert into t_emps values('3','小黄',12,sysdate,23000.12,'1');
insert into t_emps values('4','小牛',12,sysdate,23000.12,'1');
insert into t_emps values('5','小金',12,sysdate,23000.12,'1');
insert into t_emps values('6','小陈',12,sysdate,23000.12,'2');

--根据部门找员工信息
select * from t_dept d left join t_emps e on d.id  = e.deptId where d.id = '1'
--===============================================================================================
--多对多
--学生表
create table t_student(
	id varchar2(36) primary key,
	name varchar2(40),
	age Integer 
);

--课程表
create table t_course(
	id varchar2(36) primary key,
	name varchar2(40)
);

--学生选课表  关系表   多的一方
create table t_student_course(
	sid varchar2(36) references t_student(id),--学生主键
	cid varchar2(36) references t_course(id), --课程主键
	primary key (sid,cid)
);
drop table t_course;
--测试数据
insert into t_student values ('11','小明',23);
insert into t_student values ('22','小王',23);

insert into t_course  values ('1','语文');
insert into t_course  values ('2','数学');
insert into t_course  values ('3','政治');


insert into t_student_course values('11','1');
insert into t_student_course values('11','2');
insert into t_student_course values('11','3');

insert into t_student_course values('22','1');
insert into t_student_course values('22','3');


select s.id,s.name,s.age,c.id cid,c.name cname from t_student s 
         left join t_student_course sc 
         on s.id = sc.sid
         left join t_course c
         on sc.cid = c.id
         








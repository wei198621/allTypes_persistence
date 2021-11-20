

-- 处理一对多
-- 部门表
drop table if exists mybatis_baizhi_dept;
CREATE TABLE mybatis_baizhi_dept
(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40)
);
-- 员工表
drop table if exists mybatis_baizhi_emps;
CREATE TABLE mybatis_baizhi_emps(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40),
	age INTEGER ,
	bir DATE,
	salary DECIMAL(7,2),
	deptId VARCHAR(36) REFERENCES t_dept(id)
);
-- 部门测试数据
INSERT INTO mybatis_baizhi_dept VALUES('1','教学部');
INSERT INTO mybatis_baizhi_dept VALUES('2','研发部');
-- 员工的测试数据
INSERT INTO mybatis_baizhi_emps VALUES('1','小黑',12,NOW(),23000.12,'1');
INSERT INTO mybatis_baizhi_emps VALUES('2','小三',12,NOW(),23000.12,'2');
INSERT INTO mybatis_baizhi_emps VALUES('3','小黄',12,NOW(),23000.12,'1');
INSERT INTO mybatis_baizhi_emps VALUES('4','小牛',12,NOW(),23000.12,'1');
INSERT INTO mybatis_baizhi_emps VALUES('5','小金',12,NOW(),23000.12,'1');
INSERT INTO mybatis_baizhi_emps VALUES('6','小陈',12,NOW(),23000.12,'2');

-- 根据部门找员工信息
SELECT * FROM mybatis_baizhi_dept d LEFT JOIN mybatis_baizhi_emps e ON d.id  = e.deptId WHERE d.id = '1';
-- ===============================================================================================
-- 多对多
-- 学生表
drop table if exists mybatis_baizhi_student;
CREATE TABLE mybatis_baizhi_student(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40),
	age INTEGER
);

-- 课程表
drop table if exists mybatis_baizhi_course;
CREATE TABLE mybatis_baizhi_course(
	id VARCHAR(36) PRIMARY KEY,
	NAME VARCHAR(40)
);

-- 学生选课表  关系表   多的一方
drop table if exists mybatis_baizhi_student_course;
CREATE TABLE mybatis_baizhi_student_course(
	sid VARCHAR(36) REFERENCES mybatis_baizhi_student(id),
	cid VARCHAR(36) REFERENCES mybatis_baizhi_course(id),
	PRIMARY KEY (sid,cid)
);

-- 测试数据
INSERT INTO mybatis_baizhi_student VALUES ('11','小明',23);
INSERT INTO mybatis_baizhi_student VALUES ('22','小王',23);

INSERT INTO mybatis_baizhi_course  VALUES ('1','语文');
INSERT INTO mybatis_baizhi_course  VALUES ('2','数学');
INSERT INTO mybatis_baizhi_course  VALUES ('3','政治');


INSERT INTO mybatis_baizhi_student_course VALUES('11','1');
INSERT INTO mybatis_baizhi_student_course VALUES('11','2');
INSERT INTO mybatis_baizhi_student_course VALUES('11','3');

INSERT INTO mybatis_baizhi_student_course VALUES('22','1');
INSERT INTO mybatis_baizhi_student_course VALUES('22','3');


SELECT s.id,s.name,s.age,c.id cid,c.name cname FROM mybatis_baizhi_student s
         LEFT JOIN mybatis_baizhi_student_course sc
         ON s.id = sc.sid
         LEFT JOIN mybatis_baizhi_course c
         ON sc.cid = c.id ;
         


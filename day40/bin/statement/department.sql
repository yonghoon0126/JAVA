create table department(
	deptno number(3) not null,
	dname varchar2(50) not null,
	college number(3) not null,
	loc varchar2(10) not null,
	constraint department_pk primary key(deptno)
);

select * from DEPARTMENT;

delete department where deptno='203';
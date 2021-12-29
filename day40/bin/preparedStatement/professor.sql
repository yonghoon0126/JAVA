----------�θ�-----------------

create table department(
	deptno number(3) not null,		--- �⺻Ű(=����Ǹ� ����Ű)
	dname varchar2(50) not null,
	college number(3) not null,
	loc varchar2(10) not null,
	constraint department_pk primary key(deptno)
);

----------�ڽ�-----------------

create table professor(
	profno	number(5) not null,		--- �⺻Ű
	name	varchar2(10) not null,
	ename	varchar2(20) not null,
	position	varchar2(20) not null,
	sal	number(4) not null,
	hiredate date not null,
	age	number(3) not null,
	deptno	number(3) not null,		--- �ܷ�Ű
	constraint professor_pk
	primary key(profno)
);

----------����-----------------

insert into professor values
	(9901, 'ȫ�浿', 'capool', '����', 500, TO_DATE('24-06-1982','DD-MM-YYYY'),20, 101);



---------���� ����---------------

alter table professor			--- �ڽ� ���̺�
add constraint professor_fk		--- �������� �̸� �߰�
foreign key(deptno)				--- �ڽ� ���̺��� �ܷ�Ű ����
references department(deptno);	--- �θ� ���̺��� ����Ű ����

select * from department;
select * from professor;

---------������ �θ� ���� ���� �� �ڽ� ����---------------
---------������ �ڽ� ���� ���� �� �ڽ� ����---------------


select a.name,a.profno,a.position,b.dname 
from professor a, department b            
where a.deptno=b.deptno	-- ����            
and a.deptno=203 ;                           
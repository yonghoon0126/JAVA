----------부모-----------------

create table department(
	deptno number(3) not null,		--- 기본키(=연결되면 참조키)
	dname varchar2(50) not null,
	college number(3) not null,
	loc varchar2(10) not null,
	constraint department_pk primary key(deptno)
);

----------자식-----------------

create table professor(
	profno	number(5) not null,		--- 기본키
	name	varchar2(10) not null,
	ename	varchar2(20) not null,
	position	varchar2(20) not null,
	sal	number(4) not null,
	hiredate date not null,
	age	number(3) not null,
	deptno	number(3) not null,		--- 외래키
	constraint professor_pk
	primary key(profno)
);

----------삽입-----------------

insert into professor values
	(9901, '홍길동', 'capool', '교수', 500, TO_DATE('24-06-1982','DD-MM-YYYY'),20, 101);



---------구조 변경---------------

alter table professor			--- 자식 테이블
add constraint professor_fk		--- 제약조건 이름 추가
foreign key(deptno)				--- 자식 테이블의 외래키 설정
references department(deptno);	--- 부모 테이블의 참조키 설정

select * from department;
select * from professor;

---------삽입은 부모 먼저 삽입 후 자식 삽입---------------
---------삭제는 자식 먼저 삭제 후 자식 삭제---------------


select a.name,a.profno,a.position,b.dname 
from professor a, department b            
where a.deptno=b.deptno	-- 조인            
and a.deptno=203 ;                           
create table stock(
	code char(5) not null,
	quantity number(3) not null,
	primary key(code)
);

insert into stock values('10001',100);
insert into stock values('10002',200);
insert into stock values('10003',50);
insert into stock values('10004',100);
insert into stock values('10005',150);

select * from stock;



create table customerinfo(
name varchar2(10) not null,
address varchar2(80) not null,
tel varchar2(15) not null,
primary key(tel)
);

drop table customerinfo;

select * from customerinfo;



insert into customerinfo values('김재명','서울시 서초구 FFF동 222-777호','02/540/0000');
insert into customerinfo values('박철규','경기도 고양시 일산서구 HHH동 999-888호','031/915/0000');
insert into customerinfo values('변재희','서울시 마포구 EEE동 555-333','02/715/0000');
insert into customerinfo values('김미경','서울시 서대문구 BCD동 888-999호','02/326/0000');
insert into customerinfo values('진석영','서울시 노원구 111동 777-555호','02/977/0000');
insert into customerinfo values('박지영','경기도 성남시 분당구 BBB동 333-444 1아파트 711동 707호','031/702/0000');
insert into customerinfo values('최미화','인천시 계양구 DDD동 000-000호','032/541/0000');
insert into customerinfo values('김철수','서울시 동대문구 AAA동 11-222호','02/958/0000');


delete from customerinfo where name='변재희';
delete from customerinfo where name='김미경';
delete from customerinfo where name='진석영';
delete from customerinfo where name='최미화';
delete from customerinfo where name='김철수';
delete from customerinfo where name='김재명';
delete from customerinfo where name='박철규';

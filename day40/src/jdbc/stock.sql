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



insert into customerinfo values('�����','����� ���ʱ� FFF�� 222-777ȣ','02/540/0000');
insert into customerinfo values('��ö��','��⵵ ���� �ϻ꼭�� HHH�� 999-888ȣ','031/915/0000');
insert into customerinfo values('������','����� ������ EEE�� 555-333','02/715/0000');
insert into customerinfo values('��̰�','����� ���빮�� BCD�� 888-999ȣ','02/326/0000');
insert into customerinfo values('������','����� ����� 111�� 777-555ȣ','02/977/0000');
insert into customerinfo values('������','��⵵ ������ �д籸 BBB�� 333-444 1����Ʈ 711�� 707ȣ','031/702/0000');
insert into customerinfo values('�ֹ�ȭ','��õ�� ��籸 DDD�� 000-000ȣ','032/541/0000');
insert into customerinfo values('��ö��','����� ���빮�� AAA�� 11-222ȣ','02/958/0000');


delete from customerinfo where name='������';
delete from customerinfo where name='��̰�';
delete from customerinfo where name='������';
delete from customerinfo where name='�ֹ�ȭ';
delete from customerinfo where name='��ö��';
delete from customerinfo where name='�����';
delete from customerinfo where name='��ö��';

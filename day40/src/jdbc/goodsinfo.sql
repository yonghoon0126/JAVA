create table goodsinfo(
code 	char(5) 	not null,
name 	varchar2(30)not null,
price 	number(8) 	not null,
maker 	varchar2(20),
primary key(code)
);
select * from GOODSINFO;
    
insert into goodsinfo (code,name,price,maker) 
values('10001','������ TV',350000,'LG');
    
insert into goodsinfo (code,name,price,maker) 
values('10002','DVD �÷��̾�',250000,'LG');
    
insert into goodsinfo (code,name,price,maker) 
values('10003','������ ī�޶�',210000,'�Ｚ');
    
insert into goodsinfo (code,name,price,maker) 
values('10004','���ڻ���',190000,'���̸���');
    
insert into goodsinfo (code,name,price,maker) 
values('10005','������ ������',400000,'�Ｚ');
    
insert into goodsinfo (code,name,price,maker) 
values('10006','������ ������',400000,'�Ｚ');
    
insert into goodsinfo (code,name,price,maker) 
values('10007','������ ������',400000,'�Ｚ');
    
update goodsinfo set name='������ �÷�TV' where code='10001';
update goodsinfo set name='������ TV' where code='10001';
update goodsinfo set name='���̾' where maker='���̸���';
    
delete goodsinfo where code='10007';
    
    
    
select * from GOODSINFO;
select name,price,maker 
from goodsinfo where maker='LG'; --���� ��ġ�� �͵� �˻�
    
select name,price,maker 
from goodsinfo where NAME LIKE='%TV'; -- �κ� ��ġ�� �͵� �˻�
    
select *
from goodsinfo where NAME LIKE='*��%' AND MAKER='�Ｚ'; -- �κ� ��ġ�� �͵� �˻�
    
select *
from goodsinfo where NAME LIKE='*��%' OR MAKER='�Ｚ'; -- �κ� ��ġ�� �͵� �˻�
    
    
delete goodsinfo where NAME LIKE '%ī%';    


    
    
    
    
    
    
create table goodsinfo(
code 	char(5) 	not null,
name 	varchar2(30)not null,
price 	number(8) 	not null,
maker 	varchar2(20),
primary key(code)
);
select * from GOODSINFO;
    
insert into goodsinfo (code,name,price,maker) 
values('10001','디지털 TV',350000,'LG');
    
insert into goodsinfo (code,name,price,maker) 
values('10002','DVD 플레이어',250000,'LG');
    
insert into goodsinfo (code,name,price,maker) 
values('10003','디지털 카메라',210000,'삼성');
    
insert into goodsinfo (code,name,price,maker) 
values('10004','전자사전',190000,'아이리버');
    
insert into goodsinfo (code,name,price,maker) 
values('10005','벽걸이 에어컨',400000,'삼성');
    
insert into goodsinfo (code,name,price,maker) 
values('10006','벽걸이 에어컨',400000,'삼성');
    
insert into goodsinfo (code,name,price,maker) 
values('10007','벽걸이 에어컨',400000,'삼성');
    
update goodsinfo set name='디지털 컬러TV' where code='10001';
update goodsinfo set name='디지털 TV' where code='10001';
update goodsinfo set name='다이어리' where maker='아이리버';
    
delete goodsinfo where code='10007';
    
    
    
select * from GOODSINFO;
select name,price,maker 
from goodsinfo where maker='LG'; --완전 일치한 것들 검색
    
select name,price,maker 
from goodsinfo where NAME LIKE='%TV'; -- 부분 일치한 것들 검색
    
select *
from goodsinfo where NAME LIKE='*디%' AND MAKER='삼성'; -- 부분 일치한 것들 검색
    
select *
from goodsinfo where NAME LIKE='*디%' OR MAKER='삼성'; -- 부분 일치한 것들 검색
    
    
delete goodsinfo where NAME LIKE '%카%';    


    
    
    
    
    
    
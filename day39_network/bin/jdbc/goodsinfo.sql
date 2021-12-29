create table goodsinfo(
    code 	char(5) 	not null,
    name 	varchar2(30)not null,
    price 	number(8) 	not null,
    maker 	varchar2(20),
    primary key(code)
    );
    select * from GOODSINFO;
    
    insert into goodsinfo (code,name,price,maker) values('10001','디지털 TV',350000,'LG');
    insert into goodsinfo (code,name,price,maker) values('10002','DVD 플레이어',250000,'LG');
    insert into goodsinfo (code,name,price,maker) values('10003','디지털 카메라',210000,'삼성');
    insert into goodsinfo (code,name,price,maker) values('10004','전자사전',190000,'아이리버');
    insert into goodsinfo (code,name,price,maker) values('10005','벽걸이 에어컨',400000,'삼성');
    
    select * from GOODSINFO;
    
    
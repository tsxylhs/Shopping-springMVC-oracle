drop table users;
drop table users;
create table users(
  userId number(10) primary key,
  username varchar2(50) ,
  userpassword  varchar(50),
  age number(10),
  sex varchar2(20),
  address varchar(20)
)
delete  USERS where userId=76
insert into users values(user_id.nextval,'ad','123',12,'12','123');
create sequence user_id 
increment by 1 
start with 1 
minvalue 1
 maxvalue 99999999 
 cache 20;
 select * from users;
select * from users where rowid in(select rid from (select rownum rn,rid from(select rowid rid,userId from
users) where rownum<11) where rn>1);



/*
*   商品列表
*
*/
create table goods(
goodsId number(10) primary key,--商品编号
goodsName varchar(50) ,--商品名
goodsPrice float,--商品价格
goodsImage blob,--商品图片
goodsmessages varchar(250)--商品介绍

)
alter table goods  column  goodsImage;
create sequence seq_goods
start with 1001
increment by 1;
create or replace trigger t_goods
before insert on goods
for each row 
  begin 
    select seq_goods.nextval into :new.goodsId from dual;
    end;
    commit
    --插入商品
    insert into goods values(12,'烧饼',1.0,'','山东大烧饼','1')
     insert into goods values(12,'油饼',2.0,'','山东大油饼');
      insert into goods values(12,'芝麻饼',3.0,'','山东大芝麻饼')
      select * from goods;

/*
* 会员表
*/
create table shoppinguser(
userId number(10) primary key,
userEmail varchar(50),
userName varchar(50) not null,
userPassword varchar(50) not null
)
create sequence seq_shoppinguser
start with 10001
increment by 1;
create or replace trigger t_shoppinguser
before insert on shoppinguser
for each row 
  begin 
    select seq_shoppinguser.nextval into :new.userId from dual;
    end;
    insert into shoppinguser values(12,'123@qq.com','admin','123321')
    insert into shoppinguser values(1,'234@qq.com','xiaoming','123321')
    select * from shoppinguser;
select * from shoppinguser
--购物车
create table goodscart(
cartId number(10) primary key,
userId number(10) references shoppinguser(userId),
createTime varchar(50),
totalPrice float ,--商品总价
totalCount number(10) --商品总数量
)
create sequence seq_goodscart
start with 1001
increment by 1;
create or replace trigger t_goodscart
before insert on goodscart
for each row 
begin 
  select seq_goodscart.nextval into :new.cartId from dual;
  end;
  insert  into goodscart values(1,10002,'2017-0706',350,12);
  select * from goodscart;
  



--购物清单表
drop table cartlist;
create  table cartlist(
cartlistId number(10) primary key,
goodscarId number(10) references goodscart(cartId) ,
goodsId number(10) references goods(goodsId),
goodsCount number(10) 
)
create sequence seq_cartlist
start with 101
increment by 1;
create or replace trigger t_cartlist
before insert on cartlist
for each row 
  begin
    select seq_cartlist.nextval into :new.cartlistId from dual;
    end;
insert into cartlist values(1,1001,1001,5);
--insert into cartlist values(1,1001,1001,5);
select * from cartlist;


--订单表
create table orders(
orderId number(10) primary key,
userId number(10) references shoppinguser(userId),--外键
orderTime varchar(50),
totalCount number(10),--商品数量
totalPrice float ,--图书总价
payMode varchar(100),--付款方式
deliverMode varchar(30) ,--配送方式
isOut char(1) --是否发货
)
create sequence seq_orders
start with 10001
increment by 1;
create or replace trigger t_orders
before insert on orders
for each row 
  begin
     select seq_orders.nextval into :new.orderId from dual;
     end;
     insert into orders values(1,10001,'2017-0706',4,4,'微信','蜂鸣速递',1);
     select * from orders;


/*
* 收货地址表
*/
create table address(
addressId number(10) primary key,
userId number(10) references shoppinguser(userId),--外键
address varchar(100) ,
addressName varchar(50),--收货人姓名
tel varchar(11) ,
postNumber varchar(10)
)
create sequence seq_address
start with 11
increment by 1;
create or replace trigger t_address
before insert on address
for each row
  begin 
   select  seq_address.nextval into :new.addressId from dual;
    end;
    insert into address values(1,10001,'山东菏泽','吕后','17863818241','5021');
    select * from address;

create table orderlist(
orderlistId number(10) primary key,
orderId  number(10) references orders(orderId),--外键
goodsId   number(10) references goods(goodsId)--外键
)
select * from orders;
select * from goods;
insert into orderlist values(1,10002,1001)
select *from orderlist;

/*
*需求查询
*/



--根据用户查询购物车商品信息
select * from shoppinguser sp inner join  goodscart gc on sp.userid=gc.userid 
inner join  cartlist cl  on gc.cartid=cl.goodscarid inner join 
 goods gs on cl.goodsid=gs.goodsid where sp.userid=10001;
;

















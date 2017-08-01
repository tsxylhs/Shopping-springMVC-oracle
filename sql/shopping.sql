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
*   ��Ʒ�б�
*
*/
create table goods(
goodsId number(10) primary key,--��Ʒ���
goodsName varchar(50) ,--��Ʒ��
goodsPrice float,--��Ʒ�۸�
goodsImage blob,--��ƷͼƬ
goodsmessages varchar(250)--��Ʒ����

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
    --������Ʒ
    insert into goods values(12,'�ձ�',1.0,'','ɽ�����ձ�','1')
     insert into goods values(12,'�ͱ�',2.0,'','ɽ�����ͱ�');
      insert into goods values(12,'֥���',3.0,'','ɽ����֥���')
      select * from goods;

/*
* ��Ա��
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
--���ﳵ
create table goodscart(
cartId number(10) primary key,
userId number(10) references shoppinguser(userId),
createTime varchar(50),
totalPrice float ,--��Ʒ�ܼ�
totalCount number(10) --��Ʒ������
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
  



--�����嵥��
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


--������
create table orders(
orderId number(10) primary key,
userId number(10) references shoppinguser(userId),--���
orderTime varchar(50),
totalCount number(10),--��Ʒ����
totalPrice float ,--ͼ���ܼ�
payMode varchar(100),--���ʽ
deliverMode varchar(30) ,--���ͷ�ʽ
isOut char(1) --�Ƿ񷢻�
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
     insert into orders values(1,10001,'2017-0706',4,4,'΢��','�����ٵ�',1);
     select * from orders;


/*
* �ջ���ַ��
*/
create table address(
addressId number(10) primary key,
userId number(10) references shoppinguser(userId),--���
address varchar(100) ,
addressName varchar(50),--�ջ�������
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
    insert into address values(1,10001,'ɽ������','����','17863818241','5021');
    select * from address;

create table orderlist(
orderlistId number(10) primary key,
orderId  number(10) references orders(orderId),--���
goodsId   number(10) references goods(goodsId)--���
)
select * from orders;
select * from goods;
insert into orderlist values(1,10002,1001)
select *from orderlist;

/*
*�����ѯ
*/



--�����û���ѯ���ﳵ��Ʒ��Ϣ
select * from shoppinguser sp inner join  goodscart gc on sp.userid=gc.userid 
inner join  cartlist cl  on gc.cartid=cl.goodscarid inner join 
 goods gs on cl.goodsid=gs.goodsid where sp.userid=10001;
;

















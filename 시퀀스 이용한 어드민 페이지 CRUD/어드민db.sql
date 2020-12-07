create table userTable(
    user_idNumber varchar2(30)not null primary key,
    userid varchar2(30) not null primary key,
    userpassword varchar2(20) not null,
    gender char(1),
    usermobile varchar2 (20),
    useremail varchar2(20),
    username varchar2(5)
);



create sequence user_idNum start with 1;


INSERT INTO userTable
VALUES(user_idNum.NEXTVAL, 'dlwnghks61', '12223qwe','m','0103083232','dlwnhsk@gmail.com','lee');
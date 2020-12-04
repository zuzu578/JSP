create table staff(
    staff_id varchar2(30)not null primary key,
    nick varchar2(30) not null,
    mobile varchar2(20) not null,
    gender char(1)
    
);


create sequence staffid start with 1;
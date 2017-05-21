/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/5/21 ÏÂÎç 12:25:17                        */
/*==============================================================*/


drop table if exists attention;

drop table if exists myfriends;

drop table if exists user;

drop table if exists userdetails;

/*==============================================================*/
/* Table: attention                                             */
/*==============================================================*/
create table attention
(
   id                   bigint not null,
   myPhoneNum           varchar(256),
   myAttentionPhoneNum  varchar(256),
   primary key (id)
);

/*==============================================================*/
/* Table: myfriends                                             */
/*==============================================================*/
create table myfriends
(
   id                   bigint not null,
   myPhoneNum           varchar(256),
   myFriendPhoneNum     varchar(256),
   status               char(1),
   primary key (id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   bigint not null,
   phoneNum             varchar(256) not null,
   password             varchar(256) not null,
   primary key (id)
);

/*==============================================================*/
/* Table: userdetails                                           */
/*==============================================================*/
create table userdetails
(
   id                   bigint not null,
   phoneNum             varchar(256) not null,
   userName             varchar(256),
   hobbes               varchar(256),
   likeSports           varchar(256),
   likeBooks            varchar(256),
   motto                varchar(256)
);

alter table userdetails add constraint FK_Reference_1 foreign key (id)
      references user (id) on delete restrict on update restrict;


# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  address_id                    bigint auto_increment not null,
  unit_number                   varchar(255),
  street_name                   varchar(255),
  community_name                varchar(255),
  is_community                  tinyint(1) default 0,
  constraint pk_address primary key (address_id)
);

create table customer (
  user_id                       bigint auto_increment not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  cell_number                   varchar(255),
  address_id                    bigint,
  is_student                    tinyint(1) default 0,
  email_verified                tinyint(1) default 0,
  token                         varchar(255),
  is_complete                   tinyint(1) default 0 not null,
  balance                       double,
  constraint pk_customer primary key (user_id)
);

create table payment (
  payment_id                    bigint auto_increment not null,
  date                          datetime(6),
  time                          datetime(6),
  amount                        double,
  is_cash                       tinyint(1) default 0,
  constraint pk_payment primary key (payment_id)
);

create table queue_type (
  type_id                       bigint auto_increment not null,
  type                          varchar(255),
  description                   varchar(255),
  constraint pk_queue_type primary key (type_id)
);

create table redeemed_vouchers (
  voucher_code                  bigint auto_increment not null,
  voucher_id                    varchar(255),
  user_id                       bigint,
  redeemed_on                   datetime(6),
  constraint pk_redeemed_vouchers primary key (voucher_code)
);

create table staff (
  user_id                       bigint auto_increment not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  cell_number                   varchar(255),
  is_kitchen_staff              tinyint(1) default 0,
  token                         varchar(255),
  constraint pk_staff primary key (user_id)
);

create table voucher (
  voucher_id                    bigint auto_increment not null,
  voucher_code                  varchar(255),
  value                         double,
  constraint pk_voucher primary key (voucher_id)
);


# --- !Downs

drop table if exists address;

drop table if exists customer;

drop table if exists payment;

drop table if exists queue_type;

drop table if exists redeemed_vouchers;

drop table if exists staff;

drop table if exists voucher;


# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  address_id                    varchar(255) auto_increment not null,
  unit_number                   varchar(255),
  street_name                   varchar(255),
  community_name                varchar(255),
  is_community                  tinyint(1) default 0,
  constraint pk_address primary key (address_id)
);

create table order_schedule (
  order_sched_id                varchar(255) auto_increment not null,
  date                          datetime(6),
  time                          varchar(255),
  constraint pk_order_schedule primary key (order_sched_id)
);

create table payment (
  payment_id                    varchar(255) auto_increment not null,
  date                          datetime(6),
  amount                        double,
  is_cash                       tinyint(1) default 0,
  constraint pk_payment primary key (payment_id)
);

create table queue_type (
  type                          varchar(255) auto_increment not null,
  description                   varchar(255),
  constraint pk_queue_type primary key (type)
);

create table user (
  user_id                       varchar(255) not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  cell_number                   varchar(255),
  email_verified                tinyint(1) default 0,
  crsftoken                     varchar(255),
  token                         varchar(255),
  constraint pk_user primary key (user_id)
);


# --- !Downs

drop table if exists address;

drop table if exists order_schedule;

drop table if exists payment;

drop table if exists queue_type;

drop table if exists user;


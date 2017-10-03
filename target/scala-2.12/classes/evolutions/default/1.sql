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

create table customer_order (
  order_id                      bigint auto_increment not null,
  status_id                     varchar(255),
  user_id                       varchar(255),
  payment_id                    varchar(255),
  meal_order_id                 varchar(255),
  constraint pk_customer_order primary key (order_id)
);

create table ingredient (
  ingredient_id                 varchar(255) not null,
  description                   varchar(255),
  qty_ordered                   integer not null,
  constraint pk_ingredient primary key (ingredient_id)
);

create table meal (
  meal_id                       varchar(255) not null,
  recipe_id                     varchar(255),
  description                   varchar(255),
  type                          varchar(255),
  cost                          double not null,
  constraint pk_meal primary key (meal_id)
);

create table meal_order (
  meal_order_id                 bigint auto_increment not null,
  meal_id                       varchar(255),
  order_id                      varchar(255),
  order_qty                     integer not null,
  constraint pk_meal_order primary key (meal_order_id)
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

create table recipe (
  recipe_id                     varchar(255) not null,
  num_people_serves             integer not null,
  preparation_time              double not null,
  constraint pk_recipe primary key (recipe_id)
);

create table recipe_ingredients (
  recipe_id                     varchar(255) not null,
  ingredient_id                 varchar(255),
  qty_required                  integer not null,
  constraint pk_recipe_ingredients primary key (recipe_id)
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

drop table if exists customer_order;

drop table if exists ingredient;

drop table if exists meal;

drop table if exists meal_order;

drop table if exists payment;

drop table if exists queue_type;

drop table if exists recipe;

drop table if exists recipe_ingredients;

drop table if exists redeemed_vouchers;

drop table if exists staff;

drop table if exists voucher;


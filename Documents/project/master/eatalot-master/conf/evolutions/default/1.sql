# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  address_id                    varchar(255) not null,
  unit_number                   varchar(255),
  street_name                   varchar(255),
  community_name                varchar(255),
  is_community                  tinyint(1) default 0,
  constraint pk_address primary key (address_id)
);

create table admin (
  admin_id                      varchar(255) not null,
  alias                         varchar(255),
  password                      varchar(255),
  token                         varchar(255),
  constraint pk_admin primary key (admin_id)
);

create table customer (
  user_id                       varchar(255) not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  cell_number                   varchar(255),
  token                         varchar(255),
  is_student                    tinyint(1) default 0,
  email_verified                tinyint(1) default 0,
  is_complete                   tinyint(1) default 0 not null,
  balance                       double,
  address_address_id            varchar(255),
  order_schedule_order_sched_id varchar(255),
  constraint uq_customer_address_address_id unique (address_address_id),
  constraint uq_customer_order_schedule_order_sched_id unique (order_schedule_order_sched_id),
  constraint pk_customer primary key (user_id)
);

create table customer_order (
  order_id                      varchar(255) not null,
  status_id                     varchar(255),
  customer_user_id              varchar(255),
  payment_payment_id            varchar(255),
  delivery_date                 datetime(6),
  constraint uq_customer_order_payment_payment_id unique (payment_payment_id),
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
  image                         varchar(255),
  cost                          double not null,
  constraint pk_meal primary key (meal_id)
);

create table meal_order (
  meal_order_id                 varchar(255) not null,
  meal_id                       varchar(255),
  order_id                      varchar(255),
  order_qty                     integer not null,
  constraint pk_meal_order primary key (meal_order_id)
);

create table order_schedule (
  order_sched_id                varchar(255) not null,
  title                         varchar(255),
  is_active                     tinyint(1) default 0,
  constraint pk_order_schedule primary key (order_sched_id)
);

create table order_schedule_item (
  order_sched_item_id           varchar(255) not null,
  order_id                      varchar(255),
  order_sched_id                varchar(255),
  constraint pk_order_schedule_item primary key (order_sched_item_id)
);

create table payment (
  payment_id                    varchar(255) not null,
  date                          varchar(255),
  time                          varchar(255),
  amount                        double,
  is_cash                       tinyint(1) default 0,
  is_paid                       tinyint(1) default 0,
  constraint pk_payment primary key (payment_id)
);

create table queue_type (
  type_id                       varchar(255) not null,
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
  voucher_code                  varchar(255) not null,
  voucher_id                    varchar(255),
  user_id                       varchar(255),
  redeemed_on                   datetime(6),
  constraint pk_redeemed_vouchers primary key (voucher_code)
);

create table staff (
  user_id                       varchar(255) not null,
  name                          varchar(255),
  surname                       varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  cell_number                   varchar(255),
  token                         varchar(255),
  is_kitchen_staff              tinyint(1) default 0,
  alias                         varchar(255),
  constraint pk_staff primary key (user_id)
);

create table staff_order_interaction (
  staff_order_interaction_id    varchar(255) not null,
  staff_id                      varchar(255),
  order_id                      varchar(255),
  placed                        datetime(6),
  start_processing              datetime(6),
  finish_processing             datetime(6),
  started_delivery              datetime(6),
  finished_delivery             datetime(6),
  constraint pk_staff_order_interaction primary key (staff_order_interaction_id)
);

create table voucher (
  voucher_id                    varchar(255) not null,
  voucher_code                  varchar(255),
  value                         double,
  constraint pk_voucher primary key (voucher_id)
);

alter table customer add constraint fk_customer_address_address_id foreign key (address_address_id) references address (address_id) on delete restrict on update restrict;

alter table customer add constraint fk_customer_order_schedule_order_sched_id foreign key (order_schedule_order_sched_id) references order_schedule (order_sched_id) on delete restrict on update restrict;

alter table customer_order add constraint fk_customer_order_customer_user_id foreign key (customer_user_id) references customer (user_id) on delete restrict on update restrict;
create index ix_customer_order_customer_user_id on customer_order (customer_user_id);

alter table customer_order add constraint fk_customer_order_payment_payment_id foreign key (payment_payment_id) references payment (payment_id) on delete restrict on update restrict;


# --- !Downs

alter table customer drop foreign key fk_customer_address_address_id;

alter table customer drop foreign key fk_customer_order_schedule_order_sched_id;

alter table customer_order drop foreign key fk_customer_order_customer_user_id;
drop index ix_customer_order_customer_user_id on customer_order;

alter table customer_order drop foreign key fk_customer_order_payment_payment_id;

drop table if exists address;

drop table if exists admin;

drop table if exists customer;

drop table if exists customer_order;

drop table if exists ingredient;

drop table if exists meal;

drop table if exists meal_order;

drop table if exists order_schedule;

drop table if exists order_schedule_item;

drop table if exists payment;

drop table if exists queue_type;

drop table if exists recipe;

drop table if exists recipe_ingredients;

drop table if exists redeemed_vouchers;

drop table if exists staff;

drop table if exists staff_order_interaction;

drop table if exists voucher;


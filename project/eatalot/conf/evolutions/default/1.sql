# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

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


# --- !Downs

drop table if exists customer_order;

drop table if exists ingredient;

drop table if exists meal;

drop table if exists meal_order;

drop table if exists recipe;

drop table if exists recipe_ingredients;


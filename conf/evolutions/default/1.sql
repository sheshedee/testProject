# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table department (
  department_id                 integer auto_increment not null,
  department_name               varchar(255),
  description                   varchar(255),
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_department primary key (department_id)
);

create table facilities (
  facility_id                   integer auto_increment not null,
  facility_name                 varchar(255),
  description                   varchar(255),
  hotel_id                      integer,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_facilities primary key (facility_id)
);

create table guest_facilities (
  guest_id                      integer,
  facility_id                   integer,
  date_created                  datetime not null,
  date_modified                 datetime not null
);

create table guests (
  guest_id                      integer auto_increment not null,
  guest_name                    varchar(255),
  guest_address                 varchar(255),
  phone_number                  integer,
  email                         varchar(255),
  nationality                   varchar(255),
  dob                           datetime,
  identity_number               integer,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_guests primary key (guest_id)
);

create table hotel (
  hotel_id                      integer auto_increment not null,
  hotel_name                    varchar(255),
  hotel_address                 varchar(255),
  phone_number                  integer,
  email                         varchar(255),
  website                       varchar(255),
  description                   varchar(255),
  check_in_time                 time,
  check_out_time                time,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_hotel primary key (hotel_id)
);

create table payment (
  payment_id                    integer auto_increment not null,
  payment_date                  datetime,
  payment_method                varchar(255),
  transaction_status            varchar(255),
  reservation_id                integer,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_payment primary key (payment_id)
);

create table rooms (
  room_id                       integer auto_increment not null,
  room_type                     varchar(255),
  max_occupancy                 integer,
  room_price                    integer,
  availability_status           varchar(255),
  hotel_id                      integer,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_rooms primary key (room_id)
);

create table room_service (
  service_id                    integer auto_increment not null,
  service_date                  datetime,
  service_status                varchar(255),
  hotel_id                      integer,
  room_id                       integer,
  guest_id                      integer,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_room_service primary key (service_id)
);

create table staff (
  staff_id                      integer auto_increment not null,
  staff_name                    varchar(255),
  staff_address                 varchar(255),
  job_title                     varchar(255),
  phone_number                  integer,
  email                         varchar(255),
  department_id                 integer,
  date_created                  datetime not null,
  date_modified                 datetime not null,
  constraint pk_staff primary key (staff_id)
);


# --- !Downs

drop table if exists department;

drop table if exists facilities;

drop table if exists guest_facilities;

drop table if exists guests;

drop table if exists hotel;

drop table if exists payment;

drop table if exists rooms;

drop table if exists room_service;

drop table if exists staff;


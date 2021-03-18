--DROP DATABASE IF EXISTS kingcabanaDB;
--CREATE DATABASE kingcabanaDB;
--USE kingcabanaDB;
--
--create table event_organizer_address(
--        id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
--        house_no VARCHAR(10) NOT NULL,
--        street VARCHAR(10) NOT NULL,
--        state VARCHAR(10) NOT NULL,
--        city VARCHAR(10) NOT NULL,
--        country VARCHAR(10) NOT NULL,
--        zipcode VARCHAR(10) NOT NULL,
--        PRIMARY KEY (id)
--)
--create table event_organizer(
--
--id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
--first_name VARCHAR(10) NOT NULL,
--last_name VARCHAR(10) NOT NULL,
--phone_number VARCHAR(10) NOT NULL,
--email_address VARCHAR(10) NOT NULL,
--password VARCHAR(10) NOT NULL,
--PRIMARY KEY (id)
--)
--create table event_organizer_addresses(
--       id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
--       event_organizer_id INT NOT NULL,
--       event_organizer_addresses_id INT NOT NULL,
--       PRIMARY KEY (id)
--)
set foreign_key_checks = 0;


insert into event_organizer_address (`id`,`house_no`,`street`,`state`,`city`,`country`, `zipcode`)
values (1, "10", "olapeju street", "Osun", "Osun city","Nigeria", "100110"),
       (2, "19", "mokola street", "Ondo", "Ondo city","Nigeria", "100770");

insert into event_organizer (`id`,`first_name`,`last_name`,`phone_number`,`email_address`,`password`)
values (1, "Shola", "adekola", "0908765432", "ade@gmail.com", "012123"),
       (2, "Tokunbo", "Oshunrinde", "0904566432", "tokunbo@gmail.com", "345456");


insert into event_organizer_addresses (`event_organizer_id`,`event_organizer_addresses_id`)
values (1, 1),
       (1, 2),
       (2, 2);

set foreign_key_checks = 1;
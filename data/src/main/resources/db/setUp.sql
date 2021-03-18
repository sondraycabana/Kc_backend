drop user  if exists 'cabana'@'localhost';
create user 'cabana'@'localhost' identified by  'password';
grant all privileges on kingcabanaDB.* to 'cabana'@'localhost';
flush privileges;
drop database if  exists kingcabanaDB;
create database kingcabanaDB;


DROP DATABASE IF EXISTS flowers;
create database flowers;
use flowers;

create table flower(
id int primary key auto_increment,
`name` varchar(80) not null,
country varchar(80) not null
);

insert into flower(`name`, country) values 
("Rosa","España");
insert into flower(`name`, country) values 
("Clavel","China");

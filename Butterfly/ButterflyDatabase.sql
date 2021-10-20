create schema butterfly;

use butterfly;

create table butterfly_details (id int primary key,speciesName varchar(50),wingSize int,wingColor varchar(50),age int,origin varchar(50),antennaeSize int);

insert into butterfly_details values(1,'Red Butterfly',2,'Red',4,'India',5);

select * from butterfly_details;


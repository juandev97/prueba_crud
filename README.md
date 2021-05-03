# prueba_crud
crud con spring boot

____DDL_______ 
create database prueba;

use prueba;

create table Departament(
ID BIGINT NOT NULL AUTO_INCREMENT,
Name varchar(120) NOT NULL,
location varchar(60) NOT NULL,
PRIMARY KEY (ID)
);

create table Employee(
ID BIGINT NOT NULL AUTO_INCREMENT,
Name varchar(120) NOT NULL,
Salary int,
depto_id BIGINT,
PRIMARY KEY(ID),
FOREIGN KEY (depto_id) REFERENCES Departament(ID)
);


select Departament.ID,Departament.Name, count(Employee.Name) from Departament
left outer join employee
on employee.depto_id = Departament.ID
group by Departament.ID;

insert into Departament(Name,location) values ("Executive","Sydney");

insert into Departament(Name,location) values ("Production","Sydney");

insert into Departament(Name,location) values ("Resources","Cape Town");

insert into Departament(Name,location) values ("Technical","Texas");

insert into Departament(Name,location) values ("Management","Paris");

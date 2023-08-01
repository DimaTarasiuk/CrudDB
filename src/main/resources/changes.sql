create table if not exists skills(
    skill_id int autoincrement not null primary key,
    skill_name varchar(255),
);

insert into skills(skill_name) values ("java");
insert into skills(skill_name) values ("sql");
insert into skills(skill_name) values ("html");
insert into skills(skill_name) values ("css");
insert into skills(skill_name) values ("js");
insert into skills(skill_name) values ("junit");
/*=====================================================================*/
create table if not exists developers(
    developer_id int autoincrement not null,
    first_name varchar(255);
    last_name varchar(255);
);

/*=========================================================================*/
create table if not exists specialties(
     specialty_id int autoincrement primary key not null,
     specialty varchar(255)
);

insert into specialties(specialty) values ("back-end-developer");
insert into specialties(specialty) values ("front-end-developer");
insert into specialties(specialty) values ("tester");
/*=========================================================================*/

create table if not exists status(
    status_id int autoincrement primary key not null,
    status varchar(255),
);

insert into status(status) values ("active");
insert into status(status) values ("deleted");



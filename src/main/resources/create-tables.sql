create table if not exists skills(
    id int autoincrement not null primary key,
    name varchar(255),
);

create table if not exists specialties(
        id int autoincrement primary key not null,
        name varchar(255)
);

create table if not exists developers(
    id int autoincrement not null,
    first_name varchar(255);
    last_name varchar(255);
    specialty_id INT,
    FOREIGN KEY (specialty_id) REFERENCES specialties (specialty_id)
);

CREATE TABLE IF NOT EXISTS developer_skills(
  developer_id INT NOT NULL,
  skill_id INT NOT NULL,

  FOREIGN KEY (developer_id) REFERENCES developers(developer_id),
  FOREIGN KEY (skill_id) REFERENCES skills(skill_id),
);

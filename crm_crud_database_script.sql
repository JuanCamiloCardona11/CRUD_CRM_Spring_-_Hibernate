CREATE DATABASE IF NOT EXISTS crm_crud_database;

USE crm_crud_database;

CREATE TABLE customer (
	  id INT NOT NULL AUTO_INCREMENT,
	  first_name VARCHAR(50) NOT NULL,
	  last_name VARCHAR(50) NOT NULL,
	  age INT NOT NULL,
	  email VARCHAR(100) NOT NULL,
	  PRIMARY KEY (id),
	  UNIQUE INDEX email_UNIQUE (email ASC) VISIBLE
  );

INSERT INTO customer (first_name,last_name,age,email) VALUES 
	('Mario','Rodriguez',22,'mario.rodriguez@j3c.dev'),
	('Paula','Valencia',30,'paula.valencia22@j3c.dev'),
	('Ramiro','Otalvaro',21,'ramiro.2345@j3c.dev'),
	('Luis','Gaviria',19,'lucho.gav22@j3c.dev'),
	('Julian','Marin',24,'juli.mar555@j3c.dev');
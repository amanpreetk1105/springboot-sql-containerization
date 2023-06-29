CREATE DATABASE IF NOT EXISTS mydb;

USE mydb;

CREATE TABLE mydb.entities(
id VARCHAR(255) NOT NULL,
name VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO entities(id, name) values("1", "Ammy");
CREATE DATABASE aula_ddl;

USE aula_ddl;
CREATE TABLE Alunos(
	id INT,
    cpf INT,
    nome VARCHAR(100),
    idade INT
);
ALTER TABLE Alunos ADD email VARCHAR(100);

CREATE TABLE Produtos (
	id INT,
    nome VARCHAR(100),
    categoria VARCHAR(100),
    preco DECIMAL (10, 2),
    estoque INT
);
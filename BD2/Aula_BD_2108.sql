 #DDL = 
create database loja_pascotto;
use loja_pascotto;

create table produtos(
	id int,
    nome varchar(255),
    data_validade varchar(15),
	quantidade int,
    preco double
);
alter table produtos add column categoria varchar(25);
select * from produtos;


create table funcionario(
	matricula int,
    nome varchar(255),
    idade int,
    salario double
);
select * from funcionario;




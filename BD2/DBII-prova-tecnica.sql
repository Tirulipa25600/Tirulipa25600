CREATE DATABASE Loja_Pascotto;
USE loja_pascotto;
CREATE TABLE fornecedores(
    idfornecedor INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cnpj INT(11),
    telefone INT(12),
    cpf INT(11)
);


CREATE TABLE colaborador(
	idcolaborador INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(225),
    salario INT(10)
);


CREATE TABLE produtos(
	idproduto INT AUTO_INCREMENT KEY,
    nome VARCHAR(100) NOT NULL,
    preco int,
    quantidadeemestoque int
);


CREATE TABLE pedidos(
	idpedido INT AUTO_INCREMENT KEY,
    data DATE,
	quantidade int
);
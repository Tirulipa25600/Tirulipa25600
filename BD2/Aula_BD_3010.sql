CREATE DATABASE EtecUirapuru;
USE EtecUirapuru;

CREATE TABLE Alunos (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (250),
    curso VARCHAR (250),
    idade int

);
ALTER TABLE alunos ADD cargo VARCHAR (250) AFTER idade;
UPDATE alunos SET cargo = 'programador' WHERE id=1;
INSERT INTO Alunos(nome, curso, idade, cargo) VALUES ('DayDay','Desenvolvimento de Sistemas', 17, 'Aluno');
INSERT INTO Alunos(nome, curso, idade, cargo) VALUES ('Gabis','Tecnico em Sistemas', 21, 'Aluno');
SELECT * FROM alunos WHERE idade >= 18;

UPDATE alunos
SET nome = 'Anne'
WHERE id = 1;

SELECT COUNT(*) FROM alunos WHERE idade > 21;
SELECT AVG(idade) FROM alunos;
SELECT * FROM alunos WHERE idade = (SELECT MAX(idade) FROM alunos);
SELECT * FROM alunos WHERE idade = (SELECT MIN(idade) FROM alunos);
SELECT * FROM alunos WHERE idade BETWEEN 17 AND 21;

ALTER TABLE alunos ADD sexo VARCHAR (250) AFTER cargo;
ALTER TABLE alunos ADD qtdehomens VARCHAR (250) AFTER sexo;
ALTER TABLE alunos ADD qtdemulheres VARCHAR (250) AFTER qtdehomens;
UPDATE alunos SET sexo = 'Feminino' WHERE id=1;
INSERT INTO Alunos(nome, curso, idade, cargo, sexo) VALUES ('DayDay','Desenvolvimento de Sistemas', 17, 'Aluno', 'Feminino');
INSERT INTO Alunos(nome, curso, idade, cargo, sexo) VALUES ('Gabis','Desenvolvimento de Sistemas', 21, 'Aluno', 'Masculino');
INSERT INTO Alunos(nome, curso, idade, cargo, sexo) VALUES ('Anne','Técnico de Informação em Sistemas', 31, 'Professor', 'Feminino');
INSERT INTO Alunos(nome, curso, idade, cargo, sexo) VALUES ('Biel','Tecnico em Sistemas', 19, 'Professor', 'Masculino');

SELECT COUNT(*) FROM alunos WHERE sexo = 'Masculino';
SELECT COUNT(*) FROM alunos WHERE sexo = 'Feminino';


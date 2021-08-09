CREATE DATABASE bd_evento;

USE bd_evento;

create table eventos (
	ID int NOT NULL AUTO_INCREMENT,
    TIPO_EVENTO varchar(15),
    ORCAMENTO int,
    NUMERO_DE_PESSOAS int,
    DATA_EVENTO date,
    LOCAL_EVENTO varchar(20),
    MUSICA varchar(15),
    COMIDA varchar(20),
    PRIMARY KEY(ID)
);

CREATE TABLE clientes (
	ID int NOT NULL AUTO_INCREMENT,
    RG varchar(9),
    ENDERECO varchar(20),
    EMAIL varchar(40),
    TELEFONE varchar(11),
    PRIMARY KEY (ID)
);

INSERT INTO eventos (TIPO_EVENTO, ORCAMENTO, NUMERO_DE_PESSOAS, DATA_EVENTO, LOCAL_EVENTO, MUSICA, COMIDA) VALUES ("CORPORATIVO", 25000, 200,'2021-10-19', "Rua Almeida de Souza", "SERTANEJA", "FRUTOS DO MAR");
INSERT INTO clientes (RG, ENDERECO, EMAIL, TELEFONE) VALUES ("227219220","Rua Alcantara 20","zezinhopereira@hotmail.com","81926327121");
SELECT * FROM eventos;

DELETE FROM eventos;

SELECT ORCAMENTO, DATA_EVENTO FROM eventos;
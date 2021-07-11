/*
Quantos registros foram retornados em cada consulta?
A) Selecione os nomes dos artistas (tabela artistas) que tem albuns, e o nome de
seus albuns (tabelas albuns) ordenado por id do artista (Order by). [Inner]
*/
-- CREATE VIEW `AlbunsArtistas` AS
SELECT `artistas`.`nome`,`albuns`.`titulo`
FROM `artistas`
INNER JOIN `albuns`
ON `albuns`.`id_artista` = `artistas`.`id`
ORDER BY `artistas`.`id`;

/*
B) Agora selecione os nomes dos artistas (tabela artistas) que tem, e que não
tem albuns, e o nome de seus albuns quando houver (tabelas albuns) ordenado por id
do artista (Order by). [left]
*/
-- CREATE VIEW `Artistas` AS
SELECT `artistas`.`nome`,`albuns`.`titulo`
FROM `artistas`
LEFT JOIN `albuns`
ON `albuns`.`id_artista` = `artistas`.`id`
ORDER BY `artistas`.`id`;

/*
2 - Quantos registros foram retornados em cada consulta?

A) Selecione o id e o nome dos cliente (clientes) e o valor suas faturas (faturas)
[inner].
*/
-- CREATE VIEW `ClientesFaturas` AS
SELECT 
	`clientes`.`id`,
	`clientes`.`nome`, 
	`faturas`.`valor_total`
FROM `clientes`
INNER JOIN `faturas`
ON `faturas`.`id_cliente` = `clientes`.`id`;

/*
B) Agora selecione o id e o nome dos cliente (clientes) e o valor suas faturas
(faturas). E selecione também as faturas que não tem clientes. [right].
*/
-- CREATE VIEW `Faturas` AS
SELECT 
	`clientes`.`id`,
	`clientes`.`nome`, 
	`faturas`.`valor_total`
FROM `clientes`
RIGHT JOIN `faturas`
ON `faturas`.`id_cliente` = `clientes`.`id`;

/*
3 - Quantos registros foram retornados em cada consulta?

A) Selecione o nome da canção (cancoes) e o tipo e arquivo delas [inner].
*/
-- CREATE VIEW `CancoesExtensoes` AS
SELECT
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoDeArquivo`
FROM `cancoes` INNER JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`;

/*
B) Agora selecione o nome da canção (cancoes) e o tipo e arquivo delas. E
selecione também os tipos de arquivo que não tem musicas. [right].
*/
SELECT
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoDeArquivo`
FROM `cancoes` RIGHT JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`;

/*
C) Agora selecione o nome da canção (cancoes) e o tipo e arquivo delas. E
selecione também as musicas que não tem tipo de arquivo. [left].
*/

SELECT
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoDeArquivo`
FROM `cancoes` LEFT JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`;

/*
Transforme todas as consultas feitas nos exercícios anteriores (A - JOINS) em
views. E salve-as.
*/

CREATE VIEW `AlbunsArtistas` AS
SELECT `artistas`.`nome`,`albuns`.`titulo`
FROM `artistas`
INNER JOIN `albuns`
ON `albuns`.`id_artista` = `artistas`.`id`
ORDER BY `artistas`.`id`;

CREATE VIEW `ApenasArtistas` AS
SELECT `artistas`.`nome`,`albuns`.`titulo`
FROM `artistas`
LEFT JOIN `albuns`
ON `albuns`.`id_artista` = `artistas`.`id`
ORDER BY `artistas`.`id`;

CREATE VIEW `ClientesFaturas` AS
SELECT 
	`clientes`.`id`,
	`clientes`.`nome`, 
	`faturas`.`valor_total`
FROM `clientes`
INNER JOIN `faturas`
ON `faturas`.`id_cliente` = `clientes`.`id`;

CREATE VIEW `ApenasFaturas` AS
SELECT 
	`clientes`.`id`,
	`clientes`.`nome`, 
	`faturas`.`valor_total`
FROM `clientes`
RIGHT JOIN `faturas`
ON `faturas`.`id_cliente` = `clientes`.`id`;

CREATE VIEW `CancoesExtensoes` AS
SELECT
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoDeArquivo`
FROM `cancoes` INNER JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`;

CREATE VIEW `Apenastipos_de_arquivo` AS
SELECT
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoDeArquivo`
FROM `cancoes` RIGHT JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`;

CREATE VIEW `ApenasCancoes` AS
SELECT
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoDeArquivo`
FROM `cancoes` LEFT JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`;

/*
Crie Views para as seguintes consultas:
*/
-- Consultar todas as canções;
SELECT * FROM `ApenasCancoes`;
-- Consultar todas as faturas com valor maior que 5.
CREATE VIEW `faturasAcimaDe5` AS SELECT `valor_total` FROM `apenasfaturas` WHERE  `valor_total` > 5;
SELECT * FROM `faturasAcimaDe5`;
-- Consultar todos artistas cujo o nome começa com a letra B.
CREATE VIEW `LetraB`AS SELECT `nome` FROM `artistas` WHERE nome LIKE ("B%");
SELECT * FROM `LetraB`;


UPDATE faturas SET id_cliente = NULL WHERE id_cliente > 50;

UPDATE cancoes SET cancoes.id_tipo_de_arquivo = NULL WHERE cancoes.id > 850;

-- INNER JOIN
SELECT 
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoArquivo`
FROM `cancoes` INNER JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = 
`tipos_de_arquivo`.`id`;

-- LEFT JOIN
SELECT 
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoArquivo`
FROM `cancoes` LEFT JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = 
`tipos_de_arquivo`.`id`;

-- RIGHT JOIN
SELECT 
	`cancoes`.`nome` AS `CancaoNome`,
    `tipos_de_arquivo`.`nome` AS `TipoArquivo`
FROM `cancoes` RIGHT JOIN `tipos_de_arquivo`
ON `cancoes`.`id_tipo_de_arquivo` = 
`tipos_de_arquivo`.`id`;


-- VIEW
CREATE VIEW `contatoEmpregados` AS
SELECT `nome`,`sobrenome`,`telefone`,`email`
FROM `empregados` ORDER BY `nome`;

CREATE VIEW `aniversariantes` AS
SELECT `nome`,`sobrenome`,`email`, DAY(`data_nascimento`)
FROM `empregados`
WHERE MONTH(`data_nascimento`) = MONTH(NOW());

SELECT `nome` FROM `aniversariantes`;

SELECT * FROM `contatoEmpregados`;
-- TABELA FATURAS
-- 1) Crie uma procedure que selecione o valor da fatura com o valor mais baixo.
DELIMITER $$
CREATE PROCEDURE `MinValorFatura`()
BEGIN
SELECT `valor_total` 
FROM `faturas` 
ORDER BY `valor_total` ASC
LIMIT 1;
END $$
DELIMITER ;
CALL `MinValorFatura`();
DROP PROCEDURE IF EXISTS `MinValorFatura`;

-- 2) Crie uma procedure que retorna a quantidade de faturas que tem o país de cobrança como “Canada”.
DELIMITER $$
CREATE PROCEDURE `QntdFaturaCanada`()
BEGIN 
SELECT COUNT(`valor_total`)
FROM `faturas` 
WHERE `pais_cobranNomeCompositorCancaoNomeCompositorCancaoca` = "Canada";
END $$
DELIMITER ;
CALL `QntdFaturaCanada`();
DROP PROCEDURE IF EXISTS `QntdFaturaCanada`;

-- 3) Uma procedure que retorna o valor somado de todas as faturas.
DELIMITER $$
CREATE PROCEDURE `ValorTotalFatura`()
BEGIN
SELECT SUM(`valor_total`) 
FROM `faturas`;
END $$
DELIMITER ;
CALL `ValorTotalFatura`();
DROP PROCEDURE IF EXISTS `QntdFaturaCanada`;
-- 4) Uma procedure que retorna o valor médio de todas as faturas.
DELIMITER $$
CREATE PROCEDURE `ValorMedioFaturas`()
BEGIN 
SELECT AVG(`valor_total`)
FROM `faturas`;
END $$ 
DELIMITER ;
CALL `ValorMedioFaturas`();
DROP PROCEDURE IF EXISTS `QntdFaturaCanada`;

-- TABELA CANCOES
-- 1) Crie uma procedure que retorna o tamanho em bytes e a duração de uma canção pelo seu id.
DELIMITER $$
CREATE PROCEDURE `BytesDuracaoCancao`(IN `id_cancao` INT)
BEGIN
SELECT `bytes`, `duracao_milisegundos`
FROM `cancoes` 
WHERE `id_cancao` = `id`;
END $$
DELIMITER ;
CALL `BytesDuracaoCancao`(1);
DROP PROCEDURE IF EXISTS `BytesDuracaoCancao`;
-- 2) Crie uma procedure que retorna o preço unitário uma canção pelo seu id.
DELIMITER $$
CREATE PROCEDURE `PrecoUnitarioCancao`(IN `id_cancao` INT)
BEGIN 
SELECT `preco_unitario` 
FROM `cancoes`
WHERE `id_cancao` = `id`;
END  $$
DELIMITER ;
CALL `PrecoUnitarioCancao`(1);
DROP PROCEDURE IF EXISTS `BytesDuracaoCancao`;
-- 3)Crie uma procedure que retorna o id da canção, o nome da canção e o tipo de arquivo(table tipos_de_arquivo)
-- desta canção á partir de um id da canção informado.
DELIMITER $$
CREATE PROCEDURE `ProcurarCancao`(IN `id_cancao` INT)
BEGIN
SELECT `cancoes`.`id`,`cancoes`.`nome`,`tipos_de_arquivo`.`nome` 
FROM `cancoes`
INNER JOIN `tipos_de_arquivo`
ON `cancoes`.`id` = `tipos_de_arquivo`.`id`
WHERE `id_cancao` = `cancoes`.`id`;
END $$
DELIMITER ;
CALL `ProcurarCancao`(1);
DROP PROCEDURE IF EXISTS `ProcurarCancao`;

-- TABELA CLIENTES
-- 1)Crie uma procedure que retorna o nome e sobrenome concatenados e também o email de todos os clientes.
DELIMITER $$
CREATE PROCEDURE `TodosClientes`()
BEGIN
SELECT CONCAT(`nome`,' ',`sobrenome`) , `email`
FROM `clientes`;
END $$
DELIMITER ;
CALL `TodosClientes`();
DROP PROCEDURE IF EXISTS `TodosClientes`;
-- 2) Crie uma procedure que retorna o nome completo (nome e sobrenome concatenados)  
-- e também o endereço completo (endereço, cidade, estado e país) de um cliente pelo id informado.
DELIMITER $$
CREATE PROCEDURE `ProcurarCliente`(IN `id_cliente` INT)
BEGIN
SELECT CONCAT(`nome`,' ',`sobrenome`), `endereco`, `cidade`,`estado`,`pais`
FROM `clientes`
WHERE `id_cliente` = `id`;
END $$
DELIMITER ;
CALL `ProcurarCliente`(1);
DROP PROCEDURE IF EXISTS `ProcurarCliente`;
-- 3) Crie uma procedure que retorna o nome do cliente e o valor total de cada uma 
-- das suas faturas pelo id do cliente informado.
DELIMITER $$
CREATE PROCEDURE `ValorTotalCliente`(IN `id_cliente` INT)
BEGIN 
SELECT `clientes`.`nome`,`faturas`.`valor_total` 
FROM `clientes` 
INNER JOIN `faturas`
ON `clientes`.`id` = `faturas`.`id_cliente`
WHERE `id_cliente` = `clientes`.`id`;
END $$
DELIMITER ;
CALL `ValorTotalCliente`(1);
DROP PROCEDURE IF EXISTS `ValorTotalCliente`;

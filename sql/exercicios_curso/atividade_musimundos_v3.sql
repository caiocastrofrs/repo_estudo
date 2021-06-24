-- exercicio 1
SELECT MAX(`valor_total`) FROM `faturas` WHERE `cidade_cobranca` = 'Oslo';
-- exercicio 2
SELECT MIN(`valor_total`) FROM `faturas`;
-- exercicio 3
SELECT AVG(`valor_total`) FROM `faturas` WHERE `pais_cobranca` = 'Canada';
-- exercicio 4
SELECT COUNT(`valor_total`) FROM `faturas` WHERE `pais_cobranca` = 'Canada';
-- exercicio 5
SELECT SUM(`valor_total`) FROM `faturas`;
-- exercicio 6
SELECT `id`,`data_fatura`,`valor_total` FROM `faturas` WHERE `valor_total` < (SELECT AVG(`valor_total`) FROM `faturas`);
-- exercicio 7
SELECT MAX(`data_nascimento`) FROM `empregados`;
-- exercicio 8
SELECT MIN(`data_nascimento`) FROM `empregados`;
-- exercicio 9
SELECT DATE_FORMAT(`data_nascimento`, "%d %b %Y") FROM `empregados`;
-- exercicio 10
SELECT COUNT(`id`) FROM `cancoes` WHERE `compositor` = "AC/DC";
-- exercicio 11
SELECT AVG(`duracao_segundos`) FROM `cancoes`;
-- exercicio 12
SELECT AVG(`bytes`) FROM `cancoes`;
-- exercicio 13
SELECT COUNT(`id`) FROM `clientes` WHERE `cidade` = 'São Paulo'; 
-- exercicio 14
SELECT COUNT(`id`) FROM `clientes` WHERE `cidade` = "paris";
-- exercicio 15
SELECT COUNT(`id`) FROM `clientes` WHERE `email` LIKE'%yahoo%';

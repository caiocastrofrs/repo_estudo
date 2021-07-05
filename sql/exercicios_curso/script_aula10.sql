-- 1) Liste a quantidade de canções existem para cada gênero musical, agrupando a consulta por gênero e ordenando da maior quantidade para a menor.
SELECT 
`g`.`nome`, 
COUNT(`c`.`nome`) AS `quantidade`
FROM `generos` AS `g`
INNER JOIN `cancoes` AS `c`
ON `g`.`id` = `c`.`id_genero`
GROUP BY `g`.`nome`
ORDER BY `quantidade` DESC;
-- 2) Liste a quantidade de canções existentes para gênero musical, agrupando por gênero. Exiba apenas os genêros que tem mais de 10 canções.
SELECT 
`g`.`nome`, 
COUNT(`c`.`nome`) AS `quantidade`
FROM `generos` AS `g`
INNER JOIN `cancoes` AS `c`
ON `g`.`id` = `c`.`id_genero`
GROUP BY `g`.`nome`
HAVING `quantidade` > 10;
-- 3) Utilizando as tabelas clientes e faturas, liste os países,a quantidade de clientes e a soma das faturas por país,ordenando do maior para o menor, limitando a consulta a 7 registros.
SELECT COUNT(`clientes`.`id`) AS `qnt_clientes`,
`clientes`.`pais`, 
SUM(`faturas`.`valor_total`) AS `total_fatura`
FROM `clientes`
INNER JOIN `faturas`
ON `clientes`.`id` = `faturas`.`id_cliente`
GROUP BY `clientes`.`pais`
ORDER BY `total_fatura`DESC
LIMIT 7; 

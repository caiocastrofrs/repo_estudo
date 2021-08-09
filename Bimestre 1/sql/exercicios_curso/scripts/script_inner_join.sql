SELECT
	`c`.`pais` AS `pais`,
	count(`c`.`id`) AS `qtd_clientes`,
    avg(`f`.`valor_total`) AS `media_faturas`
FROM `clientes` AS `c`
INNER JOIN `faturas` AS `f`
ON `c`.`id` = `f`.`id_cliente`
GROUP BY `c`.`pais`
HAVING `qtd_clientes` > 3
ORDER BY `qtd_clientes` DESC
LIMIT 7;

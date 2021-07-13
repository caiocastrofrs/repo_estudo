-- Queries para análise de boas práticas e ordem de processamento.

-- GRUPO 1
SELECT `nome`, `sobrenome`, `email`, DAY(`data_nascimento`)
FROM `empregados`
WHERE MONTH(`data_nascimento`) = MONTH(NOW());


-- GRUPO 2
SELECT `artistas`.`nome` as `NomeArtista`,
		`albuns`.`titulo` as `NomeAlbum` 
FROM `artistas`
INNER JOIN `albuns`
on `artistas`.`id` = `albuns`.`id_artista`
WHERE `artistas`.`nome` LIKE "%kiss%"
order by `artistas`.`id`;


-- GRUPO 3
SELECT distinct `a`.`nome` as `NomeArtista`, count(`b`.`id`) as `Qtd_Albuns` 
FROM `artistas` `a`
INNER JOIN `albuns` `b`
on `a`.`id` = `b`.`id_artista`
group by `a`.`nome`
order by `Qtd_Albuns` desc
LIMIT 10;

-- GRUPO 4
SELECT `a`.`pais`, count(`a`.`id`) as `qtd_clientes`, sum(`b`.`valor_total`) as `Total`
FROM `clientes` `a` inner join `faturas` `b`
on `a`.`id` = `b`.`id_cliente`
group by `b`.`pais_cobranca`
order by `Total` desc
LIMIT 7;

-- GRUPO 5
SELECT  `a`.`id`, `a`.`nome`, count(`b`.`id`) as `qtd_cancoes` 
from `generos` `a` inner join `cancoes` `b`
on `a`.`id` = `b`.`id_genero`
group by `a`.`nome`
having `qtd_cancoes` > 10;

-- Grupo  6
SELECT `cancoes`.`nome` as `NomeCancao`, `tipos_de_arquivo`.`nome` as `TipoArquivo` 
FROM `cancoes` left join `tipos_de_arquivo`
on `cancoes`.`id_tipo_de_arquivo` = `tipos_de_arquivo`.`id`
order by `cancoes`.`id` DESC
limit 4000;

-- Grupo  7
SELECT  `a`.`nome`, count(`b`.`id`) as `qtd_cancoes`
from `generos` `a` inner join `cancoes` `b`
on `a`.`id` = `b`.`id_genero`
group by `a`.`nome`
order by `Qtd_cancoes` desc;

-- Grupo 8
SELECT distinct  `a`.`nome` as `NomeArtista`, count(`b`.`id`) as `Qtd_Albuns` 
FROM `artistas` `a`
INNER JOIN `albuns` `b`
on `a`.`id` = `b`.`id_artista`
group by `a`.`nome`
having `Qtd_Albuns`   > 6
order by `NomeArtista`;
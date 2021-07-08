CREATE VIEW FATURAS_NACIONAIS AS 
SELECT faturas.data_fatura,faturas.valor_total,faturas.pais_cobranca,clientes.id,clientes.nome,clientes.sobrenome
FROM faturas
INNER JOIN clientes 
ON faturas.id_cliente = clientes.id
WHERE faturas.pais_cobranca = 'Argentina';

SELECT * FROM FATURAS_NACIONAIS;

CREATE VIEW LATINOS AS
SELECT artistas.nome,albuns.titulo,cancoes.nome FROM artistas,albuns
INNER JOIN cancoes
ON cancoes.id_artista = artistas.id
HAVING cancoes.id_genero;

SELECT
	`itens_da_faturas`.`id_cancao`,
    `cancoes`.`nome`
FROM `itens_da_faturas`
INNER JOIN `cancoes`
ON `cancoes`.`id` = `itens_da_faturas`.`id_cancao`
HAVING `cancoes`.`nome` = 'Overdose';
SELECT * FROM artistas;

-- SELECT
-- 	`cancoes`.`nome`,
--    SUM(`itens_da_faturas`.`quantidade`) AS `quantidade`
-- FROM `musimundos`.`cancoes`
-- INNER JOIN `musimundos`.`itens_da_faturas`
-- ON `cancoes`.`id` = `itens_da_faturas`.`id_cancao`
-- GROUP BY `cancoes`.`nome`
-- HAVING `cancoes`.`nome` = 'Overdose';

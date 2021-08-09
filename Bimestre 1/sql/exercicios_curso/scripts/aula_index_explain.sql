
-- Exercicio 2 - Índices (tabela cancoes)
-- Exiba os índices da tabela. (Show Index).
SHOW INDEX FROM `cancoes`;
-- Execute um explain select selecionando o campo
-- nome da canção “Hero” e observe quantas rows foram
-- percorridas para chegar ao resultado.
EXPLAIN SELECT `nome` FROM `cancoes` WHERE `nome` = "Hero";
-- Crie um índice chamado `I_cancoes_nome` para a
-- tabela pelo campo nome.
CREATE INDEX `I_cancoes_nome` ON `cancoes`(`nome`);
-- Execute o explain novamente e veja quantas rows
-- foram percorridas agora.
EXPLAIN SELECT `nome` FROM `cancoes` WHERE `nome` = "Hero";
-- Exclua este índice.
DROP INDEX `I_cancoes_nome` ON `cancoes`;

-- Exercicio 2 - Índices (tabela albuns)
-- Exiba os índices da tabela. (Show Index).
SHOW INDEX FROM `albuns`;
-- Execute um explain select selecionando o título do
-- álbum chamado “Na Pista” e observe quantas rows
-- foram percorridas para chegar ao resultado.
EXPLAIN SELECT `titulo` FROM `albuns` WHERE `titulo` = "Na Pista";
-- Crie um índice chamado `I_albuns_titulo` para a tabela
-- pelo campo titulo.
CREATE INDEX `I_albuns_titulo` ON `albuns`(`titulo`);
-- Execute o explain novamente e veja quantas rows
-- foram percorridas agora.
EXPLAIN SELECT `titulo` FROM `albuns` WHERE `titulo` = "Na Pista";
-- Exclua este índice.
DROP INDEX `I_albuns_titulo` ON `albuns`
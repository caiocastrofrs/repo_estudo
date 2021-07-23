SELECT `nome`, `compositor` FROM `cancoes`;

DELIMITER $$
CREATE PROCEDURE `NomeCompositorCancoes`()
BEGIN 
SELECT `nome`, `compositor` FROM `cancoes`;
END $$ 
DELIMITER ;

CALL `NomeCompositorCancoes`();

DROP PROCEDURE IF EXISTS `NomeCompositorCancoes`;

DELIMITER %%
CREATE PROCEDURE `NomeCompositorCancao`(IN `id_cancao` INT)
BEGIN
SELECT `nome`,`compositor` 
FROM `cancoes` 
WHERE `id` = `id_cancao`;
END %%
DELIMITER ;
CALL `NomeCompositorCancao`(1);

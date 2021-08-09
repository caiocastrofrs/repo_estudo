CREATE SCHEMA `meusistema`;

CREATE TABLE `meusistema`.`usuarios` (
	usuario_id INT NOT NULL AUTO_INCREMENT,
    usuario_nome VARCHAR(150),
    usuario_login VARCHAR(20),
    usuario_senha VARCHAR(50),
    PRIMARY KEY(usuario_id)
);
	
INSERT INTO `meusistema`.`usuarios` (`usuario_nome`,`usuario_login`,`usuario_senha`)
VALUES ('Caio Castro', 'caiocastro', '123456');

INSERT INTO `meusistema`.`usuarios` (`usuario_nome`,`usuario_login`,`usuario_senha`) 
VALUES ('Luiz Gustavo','luizgustavo','835262');

INSERT INTO `meusistema`.`usuarios` (`usuario_nome`,`usuario_login`,`usuario_senha`) 
VALUES ('Ivan Santos','ivansantos','5263721');

INSERT INTO `meusistema`.`usuarios` (`usuario_nome`,`usuario_login`,`usuario_senha`) 
VALUES ('Fernando Victor','fernandovictor','1237827');

SELECT * FROM `meusistema`.`usuarios`;

UPDATE `meusistema`.`usuarios` SET `usuario_nome` = 'Caio S Castro' 
WHERE `usuario_nome` = 'Caio Castro';


DELETE FROM `meusistema`.`usuarios` WHERE `usuario_login` = 'caiocastro'; 
CREATE SCHEMA escolas;

CREATE TABLE `escolas`.`escolas`(
	`escola_id` INT NOT NULL AUTO_INCREMENT,
    `escola_nome` VARCHAR(150),
    PRIMARY KEY (escola_id)
);

CREATE TABLE `escolas`.`estudantes`(
	`estudante_id` INT NOT NULL AUTO_INCREMENT,
    `estudante_nome` VARCHAR(150),
    `escola_id` INT NULL,
    PRIMARY KEY (`estudante_id`),
    CONSTRAINT `escola_estudante` 
		FOREIGN KEY (`escola_id`)
        REFERENCES `escolas`.`escolas` (`escola_id`)
);
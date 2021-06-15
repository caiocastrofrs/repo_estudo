CREATE SCHEMA eventos;

CREATE TABLE `eventos`.`eventos` (
	`evento_id` INT NOT NULL AUTO_INCREMENT,
    `evento_nome` VARCHAR(150),
    PRIMARY KEY (`evento_id`)
);

CREATE TABLE `eventos`.`competidores` (
	`competidor_id` INT NOT NULL AUTO_INCREMENT,
    `competidor_nome` VARCHAR(150),
    PRIMARY KEY (`competidor_id`)
);
CREATE TABLE `eventos`.`evento_competidor` (
	`evento_competidor_id` INT NOT NULL AUTO_INCREMENT,
    `evento_id` INT NULL,
    `competidor_id` INT NULL,
    PRIMARY KEY(`evento_competidor_id`),
	CONSTRAINT `evento_competidor` 
		FOREIGN KEY(`evento_id`)
        REFERENCES `eventos`.`eventos`(`evento_id`),
        
	CONSTRAINT `competidor_evento`
		FOREIGN KEY(`competidor_id`)
        REFERENCES `eventos`.`competidores` (`competidor_id`)
);
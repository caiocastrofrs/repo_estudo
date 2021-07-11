CREATE DATABASE `Hospital`;

USE `Hospital`;

CREATE TABLE `Doutores` 
(
	`doutor_id` INT NOT NULL AUTO_INCREMENT,
    `doutor_nome` VARCHAR(40) NOT NULL,
    `doutor_data_nasc` DATE NOT NULL,
    `doutor_endereco` VARCHAR(150) NOT NULL,
    `doutor_crm` CHAR(6) NOT NULL,
    `doutor_especialidade` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`doutor_id`)
);

CREATE TABLE `Medicamentos`
(
	`medicamento_id` INT NOT NULL AUTO_INCREMENT,
    `medicamento_nome` VARCHAR(100) NOT NULL,
    `medicamento_validade` DATE NOT NULL,
    `medicamento_nome_generico` VARCHAR(100) NOT NULL,
    `medicamento_comprimidos` TINYINT NOT NULL,
    PRIMARY KEY(`medicamento_id`)
);

CREATE TABLE `Pacientes`
(
	`paciente_id` INT NOT NULL AUTO_INCREMENT,
    `paciente_nome` VARCHAR(50) NOT NULL,
    `paciente_data_nasc` DATE NOT NULL,
    `paciente_endereco` VARCHAR(150) NOT NULL,
    `paciente_estado` VARCHAR(100) NOT NULL,
    `paciente_nome_mae` VARCHAR(100) NOT NULL,
    PRIMARY KEY(`paciente_id`)
);

CREATE TABLE `Enfermeiros`
(
	`enfermeiro_id` INT NOT NULL AUTO_INCREMENT,
    `enfermeiro_nome` VARCHAR(100) NOT NULL,
    `enfermeiro_data_nasc` DATE NOT NULL,
    `enfermeiro_endereco` VARCHAR(150) NOT NULL,
    PRIMARY KEY (`enfermeiro_id`)
);

CREATE TABLE `Consultas`
(
	`consulta_id` INT NOT NULL AUTO_INCREMENT,
    `consulta_horario` TIME,
    `doutor_id` INT,
    `paciente_id` INT,
    PRIMARY KEY(`consulta_id`),
    CONSTRAINT `doutor_consulta` FOREIGN KEY(`doutor_id`) REFERENCES `Doutores`(`doutor_id`),
    CONSTRAINT `paciente_consulta` FOREIGN KEY(`paciente_id`) REFERENCES `Pacientes`(`paciente_id`)
);

CREATE TABLE `Consulta_Medicamento`
(
	`consulta_id` INT,
    `medicamento_id` INT,
	CONSTRAINT `fk_consulta` FOREIGN KEY(`consulta_id`) REFERENCES `Consultas`(`consulta_id`),
    CONSTRAINT `fk_medicamento` FOREIGN KEY(`medicamento_id`) REFERENCES `Medicamentos`(`medicamento_id`)
);

CREATE TABLE `Farmacia_hospital`
(
	`medicamento_id` INT,
    `enfermeiro_id` INT,
    CONSTRAINT `fk_enfermeiro` FOREIGN KEY(`enfermeiro_id`) REFERENCES `Enfermeiros`(`enfermeiro_id`),
    CONSTRAINT `fk_medicamento_enfermeiro` FOREIGN KEY(`medicamento_id`) REFERENCES `Medicamentos`(`medicamento_id`)
);

-- CREATE
-- INSERTS DOUTORES
INSERT INTO `Doutores` (`doutor_nome`,`doutor_data_nasc`,`doutor_endereco`,`doutor_crm`,`doutor_especialidade`) VALUES ("Quail","1963/03/12","Ap #631-9577 Phasellus St.",521506,"Cardiologia");
INSERT INTO `Doutores` (`doutor_nome`,`doutor_data_nasc`,`doutor_endereco`,`doutor_crm`,`doutor_especialidade`) VALUES ("Boris","1970/10/10","Ap #613-4872 Non, Road",258421,"Dermatologia");
INSERT INTO `Doutores` (`doutor_nome`,`doutor_data_nasc`,`doutor_endereco`,`doutor_crm`,`doutor_especialidade`) VALUES ("Blake","1956/06/02","Ap #424-2216 Diam Street",362621,"Infectologia");
INSERT INTO `Doutores` (`doutor_nome`,`doutor_data_nasc`,`doutor_endereco`,`doutor_crm`,`doutor_especialidade`) VALUES ("Anthony","1970/11/11","Ap #949-9507 Ornare Rd.",577654,"Neurocirurgia");
INSERT INTO `Doutores` (`doutor_nome`,`doutor_data_nasc`,`doutor_endereco`,`doutor_crm`,`doutor_especialidade`) VALUES ("Jasmine","1989/10/05","693-8961 Mauris Rd.",193853,"Reumatologia");
SELECT * FROM `Doutores`;

-- INSERTS PACIENTES
INSERT INTO `Pacientes` (`paciente_nome`,`paciente_data_nasc`,`paciente_endereco`,`paciente_estado`,`paciente_nome_mae`) VALUES ("Vernon","2020-12-03","5437 Tempus, Av.","São Paulo","Beverly");
INSERT INTO `Pacientes` (`paciente_nome`,`paciente_data_nasc`,`paciente_endereco`,`paciente_estado`,`paciente_nome_mae`) VALUES ("Daryl","2021-12-17","319-5087 Non Rd.","GO","Justina");
INSERT INTO `Pacientes` (`paciente_nome`,`paciente_data_nasc`,`paciente_endereco`,`paciente_estado`,`paciente_nome_mae`) VALUES ("Hiram","2021-04-28","134-3097 Fusce Av.","Minas Gerais","Karyn");
INSERT INTO `Pacientes` (`paciente_nome`,`paciente_data_nasc`,`paciente_endereco`,`paciente_estado`,`paciente_nome_mae`) VALUES ("Vera","2022-01-20","P.O. Box 629, 5348 Congue Ave","Pará","Quinn");
INSERT INTO `Pacientes` (`paciente_nome`,`paciente_data_nasc`,`paciente_endereco`,`paciente_estado`,`paciente_nome_mae`) VALUES ("Elton","2022-06-28","108 Velit. Avenue","RS","Medge");
SELECT * FROM `Pacientes`;

-- INSERTS MEDICAMENTOS
INSERT INTO `Medicamentos` (`medicamento_nome`,`medicamento_validade`,`medicamento_nome_generico`,`medicamento_comprimidos`) VALUES ("Dorflex ","2020-08-29","Orfenadrina",28);
INSERT INTO `Medicamentos` (`medicamento_nome`,`medicamento_validade`,`medicamento_nome_generico`,`medicamento_comprimidos`) VALUES ("Xarelto","2020-10-27","Rivaroxabana",30);
INSERT INTO `Medicamentos` (`medicamento_nome`,`medicamento_validade`,`medicamento_nome_generico`,`medicamento_comprimidos`) VALUES ("Neosaldina","2021-03-02","Besodin ",17);
INSERT INTO `Medicamentos` (`medicamento_nome`,`medicamento_validade`,`medicamento_nome_generico`,`medicamento_comprimidos`) VALUES ("Torsilax","2021-09-16","Tandrilax",22);
INSERT INTO `Medicamentos` (`medicamento_nome`,`medicamento_validade`,`medicamento_nome_generico`,`medicamento_comprimidos`) VALUES ("Selozok","2022-01-17","Tartarato de Metoprolol",20);
SELECT * FROM `Medicamentos`;

-- INSERTS CONSULTAS
INSERT INTO `Consultas` 
(`consulta_horario`,`doutor_id`,`paciente_id`)
VALUES ("13:19", 4, 2);

INSERT INTO `Consultas` 
(`consulta_horario`,`doutor_id`,`paciente_id`)
VALUES ("19:19", 1 , 1);

INSERT INTO `Consultas` 
(`consulta_horario`,`doutor_id`,`paciente_id`)
VALUES ("16:55", 5, 4);

INSERT INTO `Consultas` 
(`consulta_horario`,`doutor_id`,`paciente_id`)
VALUES ("13:00", 2 ,3, 3);

INSERT INTO `Consultas` 
(`consulta_horario`,`doutor_id`,`paciente_id`)
VALUES ("14:19", 3, 5, 1);

SELECT * FROM `Consultas`;
SELECT * FROM `Consulta_Medicamento`;
SELECT * FROM `Farmacia_Hospital`;

-- READ
SELECT `doutor_crm`,`doutor_id` FROM `Doutores`;
SELECT `paciente_id`,`paciente_nome_mae` FROM `Pacientes`;
SELECT `enfermeiro_id`,`enfermeiro_endereco` FROM `Enfermeiros`;
SELECT `medicamento_id`,`medicamento_comprimidos` FROM `Medicamentos`;

-- UPDATE
UPDATE `Consultas` SET `consulta_horario` = "14:14" WHERE `doutor_id` = 2;
UPDATE `Consultas` SET `consulta_horario` = "10:35" WHERE `paciente_id` = 5;
UPDATE `Consultas` SET `consulta_horario` = "06:10" WHERE `medicamento_id` = 1;


-- DELETE
DELETE FROM `Doutores` WHERE `doutor_id` = 2;
DELETE FROM `Enfermeiros` WHERE DAY(`enfermeiro_data_nasc`) > DAY(NOW());
DELETE FROM `Pacientes` WHERE `paciente_estado` = `GO`;
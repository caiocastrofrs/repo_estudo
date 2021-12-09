DROP TABLE IF EXISTS dentistas;
CREATE TABLE dentistas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numeroMatricula VARCHAR(32),
    nome VARCHAR(16),
    sobrenome VARCHAR(32)
);

DROP TABLE IF EXISTS enderecos;
CREATE TABLE enderecos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(16),
    bairro VARCHAR(64),
    cidade VARCHAR(64)
);

DROP TABLE IF EXISTS pacientes;
CREATE TABLE pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(32),
    sobrenome VARCHAR(32),
    rg VARCHAR(12)
    data_cadastro TIMESTAMP WITHOUT TIME ZONE,
    endereco_id int
);

DROP TABLE IF EXISTS dentistas;
CREATE TABLE dentistas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numeroMatricula VARCHAR(32),
    nome VARCHAR(16),
    sobrenome VARCHAR(32)
);
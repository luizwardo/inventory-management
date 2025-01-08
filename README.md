//comando para executar tabela corretamente no db

CREATE TABLE db_produtos.tb_produtos (
	id INT auto_increment NOT NULL,
	nome varchar(100) NOT NULL,
	descricao varchar(100) NOT NULL,
	quantidade INT NOT NULL,
	preco DOUBLE NOT NULL,
	data_cadastro varchar(100) NOT NULL,
	CONSTRAINT tb_produtos_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

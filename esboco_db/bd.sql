CREATE TABLE escola(
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cnpj BIGINT NOT NULL UNIQUE,
nome VARCHAR(100) NOT NULL,
turnos VARCHAR(100),
qt_alunos MEDIUMINT,
diretor VARCHAR(100),
vice_diretor VARCHAR(100),
coordenador VARCHAR(100),
secretaria VARCHAR(100),
uf CHAR(2) NOT NULL,
cep INT(8) NOT NULL,
cidade VARCHAR(100),
pbairro VARCHAR(100),
rua VARCHAR(100),
numero MEDIUMINT,
complemento VARCHAR(100),
email VARCHAR(100) NOT NULL UNIQUE,
telefone BIGINT(11) NOT NULL UNIQUE
);

#conferir cadastro no site
#setar melhor restricoes NOT NULL
CREATE TABLE  empresa(
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cpnj BIGINT(14) NOT NULL UNIQUE,
nome_fantasia VARCHAR(100) NOT NULL,#null?
razao_social VARCHAR(100) NOT NULL,#null?
ativ_empresarial VARCHAR(100) NOT NULL,
propieratio VARCHAR(100),
socios VARCHAR(100),
administrador VARCHAR(100),
uf CHAR(2) NOT NULL,
cep MEDIUMINT(8) NOT NULL,
cidade VARCHAR(100),
bairro VARCHAR(100),
rua VARCHAR(100),
numero MEDIUMINT,
complemento VARCHAR(100),
email VARCHAR(100) UNIQUE NOT NULL,
telefone BIGINT(11) NOT NULL UNIQUE
);

CREATE TABLE perfil (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL UNIQUE,
senha VARCHAR(50) NOT NULL,
ativo BIT NOT NULL,
data_criado DATE NOT NULL,
data_mod DATE,
id_permissao BIGINT,
id_empresa BIGINT,
id_escola bigint,
id_interese BIGINT,
id_projeto BIGINT,
CONSTRAINT `fk_empresa_perfil`
    FOREIGN KEY (id) REFERENCES empresa (id),
CONSTRAINT `fk_escola_perfil`
    FOREIGN KEY (id) REFERENCES escola(id),
CONSTRAINT `fk_interese_perfil`
    FOREIGN KEY (id) REFERENCES interese (id),
CONSTRAINT `fk_projeto_perfil`
    FOREIGN KEY (id) REFERENCES projeto (id)
);

CREATE TABLE interese (
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_perfil BIGINT NOT NULL,
texto VARCHAR(250),
imagem VARCHAR(300),
data_criado DATE NOT NULL,
data_mod DATE,
CONSTRAINT `fk_perfil_interese`
    FOREIGN KEY (id) REFERENCES perfil (id)
);


CREATE TABLE projeto(
id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_perfil BIGINT  NOT NULL,
id_interese BIGINT NOT NULL,
data_criado DATE NOT NULL,
data_entrega DATE,
estado VARCHAR(300),
CONSTRAINT `fk_perfil_projeto`
    FOREIGN KEY (id) REFERENCES perfil (id),
CONSTRAINT `fk_interese_projeto`
    FOREIGN KEY (id) REFERENCES interese (id)
);

CREATE OR REPLACE TABLE perguntas(
id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL UNIQUE,
assunto_ops INT,
assunto_txt VARCHAR(250),
respondido BIT NOT NULL
);

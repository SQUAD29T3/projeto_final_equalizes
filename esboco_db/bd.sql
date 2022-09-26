create table escola(
    escola_id bigint unsigned auto_increment,
    cnpj bigint not null unique,
    nome varchar(100) not null,
    turnos varchar(100),
    qt_alunos mediumint,
    diretor varchar(100),
    vice_diretor varchar(100),
    coordenador varchar(100),
    secretaria varchar(100),
    uf char(2) not null,
    cep int(8) not null,
    cidade varchar(100) not null,
    bairro varchar(100),
    rua varchar(100),
    numero mediumint,
    complemento varchar(100),
    email varchar(100) not null unique,
    telefone bigint(11) not null unique,
    primary key(escola_id)

) engine = innodb default character set = utf8;
#conferir cadastro no site
#setar melhor restricoes not null

create table empresa(
    empresa_id bigint unsigned auto_increment,
    cpnj bigint(14) unsigned  not null unique,
    nome_fantasia varchar(100) not null,
    #null?
    razao_social varchar(100) not null,
    #null?
    ativ_empresarial varchar(100) not null,
    propietario varchar(100),
    socios varchar(100),
    administrador varchar(100),
    uf char(2) not null,
    cep mediumint(8) not null,
    cidade varchar(100),
    bairro varchar(100),
    rua varchar(100),
    numero mediumint unsigned,
    complemento varchar(100),
    email varchar(100) unique not null unique,
    telefone bigint(11) unsigned not null unique,
    primary key(empresa_id)
)engine = innodb default character set = utf8;

create table interese(
    interese_id bigint unsigned  auto_increment,
    id_perfil bigint unsigned,
    texto varchar(250),
    imagem varchar(300),
    data_criado date not null,
    data_mod date,
    primary key(interese_id)
)engine = innodb default character set = utf8;

create table projeto(
    projeto_id bigint unsigned auto_increment,
    id_perfil bigint unsigned,
    id_interese bigint unsigned,
    data_criado date,
    data_entrega date,
    estado varchar(300),
    primary key(projeto_id)
)engine = innodb default character set = utf8;

create table pergunta(
    pergunta_id bigint unsigned  auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    assunto_ops int,
    assunto_txt varchar(250),
    respondido bit not null,
    primary key(pergunta_id)
)engine = innodb default character set = utf8;

create table perfil(
    perfil_id bigint unsigned  auto_increment,
    email varchar(100) not null unique,
    senha varchar(50) not null,
    ativo bit not null,
    data_criado date not null,
    data_mod date,
    id_permissao bigint unsigned,
    id_empresa bigint unsigned,
    id_escola bigint unsigned,
    id_interese bigint unsigned,
    id_projeto bigint unsigned,
    primary key(perfil_id)
)engine = innodb default character set = utf8;

alter table perfil
    add constraint `fk_empresa_perfil` foreign key (id_empresa) references empresa(empresa_id),
    add constraint `fk_escola_perfil` foreign key (id_escola) references escola(escola_id),
    add constraint `fk_interese_perfil` foreign key (id_interese) references interese(interese_id),
    add constraint `fk_projeto_perfil` foreign key (id_projeto) references projeto(projeto_id);

alter table projeto
    add constraint `fk_perfil_projeto` foreign key (id_perfil) references perfil(perfil_id),
    add constraint `fk_interese_projeto` foreign key (id_interese) references interese(interese_id);


alter table interese
    add constraint `fk_perfil_interese` foreign key (id_perfil) references perfil(perfil_id);

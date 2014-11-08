create database revisteiro;
use revisteiro;

-- create table ufs(
-- 		sigla	char(2)		not null	primary key,
--		nome	varchar(50)	not null);

-- insert into ufs(sigla, nome) values ('SP', 'SAO PAULO');
-- insert into ufs(sigla, nome) values ('RJ', 'RIO DE JANEIRO');
-- insert into ufs(sigla, nome) values ('MG', 'MINAS GERAIS');

-- create table cidades(
-- 		id              int             not null	primary key	auto_increment,
-- 		nome		varchar(50)	not null,
-- 		uf_sigla	char(2)		not null,
-- 		foreign key(uf_sigla)		references ufs(sigla));

-- insert into cidades(nome, uf_sigla) values('ARARAS', 'SP');
-- insert into cidades(nome, uf_sigla) values('CABO FRIO', 'RJ');
-- insert into cidades(nome, uf_sigla) values('BELO HORIZONTE', 'MG');
--select * from cidades;

-- insert into pessoas(nome, cidade_id) values('RAPHAEL FREIRE', 1);
-- insert into pessoas(nome, cidade_id) values('JULIANA FREITAS', 2);
-- insert into pessoas(nome, cidade_id) values('SANDRA MACHADO', 3);
--select * from pessoas;

-- create table telefones(
-- 		pessoa_id	int             not null,
-- 		numero		varchar(10)	not null,
-- 		primary key(pessoa_id, numero),
-- 		foreign key(pessoa_id) 	references pessoas(id));


-- insert into telefones(pessoa_id, numero) values (1 , '(17)3033-6053');
-- insert into telefones(pessoa_id, numero) values (1 , '(17)99224-2020');
-- insert into telefones(pessoa_id, numero) values (2 , '(19)3352-5510');
-- insert into telefones(pessoa_id, numero) values (2 , '(19)99933-2121');
-- insert into telefones(pessoa_id, numero) values (3 , '(19)62933-2121');
-- select * from telefones;


-- create table emails(
-- 		pessoa_id		int 		not null,
-- 		endereco		varchar(100)	not null,
-- 		primary key(pessoa_id, endereco),
-- 		foreign key(pessoa_id)	references pessoas(id));


-- insert into emails(pessoa_id, endereco) values(1, 'RAPHAELMACHADOFREIRE@GMAIL.COM');
-- insert into emails(pessoa_id, endereco) values(2, 'JUFREI@GMAIL.COM');
-- insert into emails(pessoa_id, endereco) values(3, 'SANDRA@GMAIL.COM');
-- select * from emails;

create table pessoas(
		id              int             not null	primary key	auto_increment,
		nome		varchar(100)	not null,
		cidade          varchar(50)	not null,
                uf              char(2)         not null,
                numero          varchar(10)     not null,
                email           varchar(100)    not null);



create table usuarios(
		id              int             not null	primary key,
		cpf             varchar(12)	not null 	unique,
		login           varchar(50)	not null,
		senha		varchar(15)	not null,
		conf_senha	varchar(15)	not null,
		foreign key(id)	references	pessoas(id));


create table clientes(
		id	int	not null        primary key,
		cnpj		varchar(20)     not null	unique,
		endereco	varchar(100)	not null,
		site		varchar(100)	null,
		revista		varchar(75)	not null,
		foreign key(id)	references pessoas(id));


create table revistas(
		id          int             not null	primary key	auto_increment,
		projeto     varchar(75)     not null,
		nome        varchar(75)     not null,
		imagem      varchar(100)    not null,
		url         varchar(150)    not null,
		descricao   varchar(200)    not null,
		categoria   varchar(75)     not null);


create table clientes_revistas(
		cliente_id	int 	not null,
		revista_id	int 	not null,
		primary key(cliente_id, revista_id),
		foreign key(cliente_id)	references clientes(id),
		foreign key(revista_id)	references revistas(id));


create table edicoes(
		id                  int 	not null    primary key,
		numero              int		not null,
		data_edicoes        datetime    not null,
		revista_id          int 	not null,
		foreign key(revista_id)		references revistas(id));
	

create table uploads(
		cliente_id	int 	not null,
		edicao_id	int             not null,
		usuario_id	int             not null,
		nome		varchar(50)	not null,
		caminho		varchar(150)	not null,
		primary key(cliente_id, edicao_id),
		foreign key(cliente_id)	references	clientes(id),
		foreign key(edicao_id)	references	edicoes(id),
		foreign key(usuario_id)	references 	usuarios(id));
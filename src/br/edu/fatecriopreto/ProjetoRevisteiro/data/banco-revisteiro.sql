create database revisteiro;
use revisteiro;

create table pessoas(
		id              int             not null    primary key	auto_increment,
		nome		varchar(100)	not null,
		cidade          varchar(50)	not null,
                uf              char(2)         not null,
                telefone        varchar(10)     not null,
                email           varchar(100)    not null);



create table usuarios(
		id              int             not null	primary key,
		cpf             varchar(12)	not null 	unique,
		login           varchar(50)	not null,
		senha		varchar(15)	not null,
		confsenha	varchar(15)	not null,
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
		cliente_id	int 	not null references clientes(id),
		revista_id	int 	not null references revistas(id),
		primary key(cliente_id, revista_id));


create table edicoes(
		id                  int 	not null    primary key,
		numero              int		not null,
		dataedicao          datetime    not null,
		revista_id          int 	not null,
		foreign key(revista_id)		references revistas(id));
	

create table uploads(
		cliente_id	int             not null,
		edicao_id	int             not null,
		usuario_id	int             not null,
		nome		varchar(50)	not null,
		caminho		varchar(150)	not null,
		primary key(cliente_id, edicao_id),
		foreign key(cliente_id)	references	clientes(id),
		foreign key(edicao_id)	references	edicoes(id),
		foreign key(usuario_id)	references 	usuarios(id));
create database locadora;
use locadora;
create table cliente(
	cpf_cliente int not null PRIMARY KEY,
	nome varchar(40),
	endereco varchar(40),
	telefone int(11),
	data_nasc date,
	sexo char
);
create table emprestimo(
	idEmprestimo int not null auto_increment,
	data_devolucao date,
	data_emprestimo date,
	data_prevista date,
	idFilme int not null,
	cpf_cliente int,
	cpf_funcionario int,
	PRIMARY KEY(idEmprestimo) 
);
create table funcionario(
	cpf_funcionario int not null PRIMARY KEY,
	nome varchar(40) not null,
	fone int not null,
	endereco varchar(40) not null
);
create table filme(
	idFilme int auto_increment ,
	idGenero int,
	nome varchar(40) not null,
	duracao time,
	PRIMARY KEY(idFilme)
);
create table genero(
	idGenero int not null auto_increment,
	nome varchar(40) not null,
	primary key(idGenero)
);
alter table filme add foreign key (idGenero) references genero (idGenero);
alter table emprestimo add foreign key(idFilme) references filme(idFilme);
alter table emprestimo add foreign key(cpf_cliente) references cliente(cpf_cliente);
alter table emprestimo add foreign key(cpf_funcionario) references funcionario(cpf_funcionario);

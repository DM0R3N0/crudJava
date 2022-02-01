create database agenda;

create table contatos(
	id int null auto_increment primary key,
	nome varchar(40),
	idade int,
	dataCadastro date)
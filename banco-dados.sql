create database bancoDeDadosTera;
use bancoDeDadosTera;

create table Monitor
(
	id int auto_increment primary key,
	CPF varchar(20),
    Nome varchar(60),
    Sobrenome varchar(60),
    Login varchar(60),
    Celular varchar(30),
    Telefone varchar(30),
    Email varchar(60),
    Senha varchar(30)
);

create table Clinica
(
	id int auto_increment primary key,
    CNPJ varchar(50),
    RazaoSocial varchar(60),
    NomeFantasia varchar(60),
    Telefone varchar(30),
    Endereco varchar(60),
    Cidade varchar(60),
    Estado varchar(60),
    Email varchar(60),
    Senha varchar(60)
);



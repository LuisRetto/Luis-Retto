
DROP DATABASE IF EXISTS Examen_02;

create database Examen_02;

USE Examen_02;

drop table tb_Candidato;


create table tb_candidato(
	idCandidato			int(11)  		auto_increment,
    nomCandidato		varchar(45)		not null,
    apeCandidato		varchar(45)		not null,
    anioRegCandidato	int(4)			not null,
    partido				varchar(50)		not null,
    PRIMARY KEY (idCandidato)
);


insert into tb_candidato values (null,'Juan', 'Pereda Alva',2014, 'Peruanos por el Cambio');
insert into tb_candidato values (null,'Renzo', 'Poma Chavez',2015, 'Unidos por el Progreso');



select * from tb_candidato
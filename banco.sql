create database JPAPAGAIO;


-- Tabela principal de pessoas
create table PESSOAS (
    EMAIL VARCHAR(100) PRIMARY KEY NOT NULL,
    NOME VARCHAR(50) NOT NULL,
    NASCIMENTO date,
    SENHA VARCHAR(100)
)
insert into PESSOAS VALUES
("greg@gmail.com","Greg", "19980103", "SENHA3"),
("Tobias@hotmal.com", "Tobias", "19170105", "SENHA4"),
("maria@gmail.com","Maria", "20200105", "SENHA2"),
("gabriel.gregorio@outlook.com", "Gabriel Gregório", "20190102", "SENHA")


-- Tabela de usuários
create table AMIGOS (
    EMAIL_USUARIO VARCHAR(100), 
    EMAIL_AMIGO VARCHAR(100),
    FOREIGN KEY (EMAIL_USUARIO) REFERENCES PESSOAS(EMAIL),
    FOREIGN KEY (EMAIL_AMIGO) REFERENCES PESSOAS(EMAIL)
)
insert into AMIGOS VALUES
("maria@gmail.com", "gabriel.gregorio@outlook.com"),
("maria@gmail.com", "Tobias@hotmal.com"),
("maria@gmail.com", "greg@gmail.com"),
("greg@gmail.com", "gabriel.gregorio@outlook.com"),
("greg@gmail.com", "Tobias@hotmal.com")




-- Tabela postagem, POSTS na time line
create table POSTAGEM (
    id INT auto_increment PRIMARY KEY,
    EMAIL_USUARIO VARCHAR(100) NOT NULL,
    DATA DATE,
    TEXTO VARCHAR(255),
    FOREIGN KEY (EMAIL_USUARIO) REFERENCES PESSOAS(EMAIL)
)

insert into POSTAGEM  
(EMAIL_USUARIO, DATA, TEXTO)
VALUES
(
    "greg@gmail.com",
    "20200105",
    "Iai pessoa, tudo bem com você?"
)





-- Comentários na postagem
create table COMENTARIO_POSTAGEM (
	id INT auto_increment PRIMARY KEY,
    ID_POST INT,
    EMAIL_USUARIO VARCHAR(100) NOT NULL,
    DATA DATE,
    COMENTARIO varchar(100),
    FOREIGN KEY (ID_POST) REFERENCES POSTAGEM(id),
    FOREIGN KEY (EMAIL_USUARIO) REFERENCES PESSOAS(EMAIL)
)


insert into COMENTARIO_POSTAGEM
(ID_POST, EMAIL_USUARIO, DATA, COMENTARIO)
values
(1, "greg@gmail.com", "20200102", "Esse post é horrível"),
(1,"Tobias@hotmal.com", "20200102", "é dois poh")








create table LIKES_POSTAGEM(
    ID_POST INT,
    EMAIL_USUARIO VARCHAR(100) NOT NULL ,
    PRIMARY KEY (ID_POST, EMAIL_USUARIO),
    FOREIGN KEY (ID_POST) REFERENCES POSTAGEM(id),
    FOREIGN KEY (EMAIL_USUARIO) REFERENCES PESSOAS(EMAIL)
)

insert into LIKES_POSTAGEM (ID_POST, EMAIL_USUARIO) values (1,"Tobias@hotmal.com")





create table DISLIKES_POSTAGEM(
    ID_POST INT,
    EMAIL_USUARIO VARCHAR(100) NOT NULL ,
    PRIMARY KEY (ID_POST, EMAIL_USUARIO),
    FOREIGN KEY (ID_POST) REFERENCES POSTAGEM(id),
    FOREIGN KEY (EMAIL_USUARIO) REFERENCES PESSOAS(EMAIL)
)

insert into DISLIKES_POSTAGEM (ID_POST, EMAIL_USUARIO) values (1,"Tobias@hotmal.com")






-- Mensagems
create table MESSENGER(
	ID INT PRIMARY KEY auto_increment not null,
    EMAIL_USUARIO VARCHAR(100) NOT NULL,
    EMAIL_AMIGO VARCHAR(100) NOT NULL,
    MENSAGEM varchar(100),
    DATA DATE,
    FOREIGN KEY (EMAIL_USUARIO) REFERENCES PESSOAS(EMAIL),
    FOREIGN KEY (EMAIL_AMIGO) REFERENCES PESSOAS(EMAIL)
)

insert into MESSENGER
(EMAIL_USUARIO, EMAIL_AMIGO, MENSAGEM, DATA)
VALUES
("maria@gmail.com", "Tobias@hotmal.com", "Iai amigo, tudo bem?", "20200102"),
("Tobias@hotmal.com", "maria@gmail.com", "Eu estou bem!", "20200102")

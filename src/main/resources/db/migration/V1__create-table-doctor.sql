CREATE TABLE tb_doctor(

    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    phone varchar(100) not null,
    crm varchar(6) not null unique,
    speciality varchar(100) not null,
    cep varchar(9) not null,
    name_street varchar(100) not null,
    number varchar(10) not null,
    complement varchar(100),
    neighborhood varchar(100) not null,
    city varchar(100) not null,
    uf varchar(2) not null,
    active TINYINT NOT NULL,

    PRIMARY KEY(id)
);
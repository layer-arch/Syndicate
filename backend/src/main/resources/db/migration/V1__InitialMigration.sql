create sequence hibernate_sequence start 1 increment 1;

create table users(
    id bigint,
    username varchar(255),
    password varchar(255),
    token varchar(255)
);
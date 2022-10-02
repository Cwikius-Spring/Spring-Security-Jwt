DROP ALL OBJECTS;

CREATE SCHEMA IF NOT EXISTS iOssez;

CREATE TABLE IF NOT EXISTS iOssez.users
(
    id                INT     NOT NULL,
    user_name         varchar(11) NOT NULL,
    user_password     varchar(2)  NOT NULL,
    user_email        varchar(2)  NOT NULL,
    is_email_verified INT     NOT NULL
);

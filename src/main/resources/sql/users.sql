-- DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS "users";

-- CREATE TABLE `users` (
--     `username`  VARCHAR(255) NOT NULL,
--     `password`  VARCHAR(255) NOT NULL,
--     PRIMARY KEY (`username`)
create table "users" (
    "username" varchar(255) not null
        constraint "users_pk"
            primary key,
    "password" varchar(255) not null,
    "balance" float default 0.0 not null,
    "authority" varchar(255) not null
);



-- INSERT INTO `users`
INSERT INTO "users"
VALUES ('user', 'user', 555.60, 'ROLE_USER'),
       ('tomcat', 'tomcat', 10.18, 'ROLE_ADMIN');

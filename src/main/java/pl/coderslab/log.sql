CREATE DATABASE users_workshop03;

CREATE TABLE users
(
    ID       INT(11) AUTO_INCREMENT,
    EMAIL    VARCHAR(255) UNIQUE,
    USERNAME VARCHAR(255),
    PASSWORD VARCHAR(60),
    PRIMARY KEY (ID)
);

INSERT INTO users (EMAIL, USERNAME, PASSWORD)
VALUES ('julia.kisielewska@gmail.com', 'Juliak', '123haslo%');

INSERT INTO users (EMAIL, USERNAME, PASSWORD)
VALUES ('jan.kowalski@onet.pl', 'Jan_Kowalski', '567haslo%');
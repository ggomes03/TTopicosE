-- Banco: topicos
CREATE TABLE tb1 (
    id_tb1 int NOT NULL
);

CREATE TABLE tb2 (
    id_tb2 null NOT NULL
);

CREATE TABLE tb3 (
    id_tb3 int NOT NULL,
    id_tb1_tb3 null NOT NULL,
    id_tb2_tb3 null NOT NULL,
    PRIMARY KEY (id_tb3),
    FOREIGN KEY (id_tb1_tb3) REFERENCES tb1 (),
    FOREIGN KEY (id_tb2_tb3) REFERENCES tb2 ()
);

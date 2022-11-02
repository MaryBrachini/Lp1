create table curriculo(
id_curriculo serial,
nome character varying(50),
cpf character varying (14) unique,
tell integer,
email character varying (30),
exp character  varying (30),
resumo character varying (300),
esc character varying (30),
CONSTRAINT curriculo_pkey PRIMARY KEY (id_curriculo)
)
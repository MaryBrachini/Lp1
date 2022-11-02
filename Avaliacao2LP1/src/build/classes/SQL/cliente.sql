CREATE table cliente(
id_cliente serial,
nome character varying(50),
logradouro character varying (50),
numero integer,
bairro character varying (30),
cidade character  varying (30),
 estado character varying (2),
cep character varying (9),
cpf character varying (14) unique,
CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente)
)

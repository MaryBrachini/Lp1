create table fornecedor(
id_for serial,
nome_for character varying(50),
cnpj_for character varying(15),
tel_for character varying(13),
constraint fornecedor_pkey primary key (id_for)
)

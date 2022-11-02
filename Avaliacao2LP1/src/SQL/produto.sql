create table produto(
id_prod serial,
nome_prod character varying(50),
desc_prod character varying(50),
preco_prod double precision,
id_for integer,
constraint produto_pkey primary key (id_prod),
constraint fornecedor_pkey foreign key (id_for) references fornecedor (id_for)
)

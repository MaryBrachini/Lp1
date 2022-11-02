CREATE table venda(
id_vend serial,
dat_vend date,
val_vend double precision,
id_cliente integer,
CONSTRAINT venda_pkey PRIMARY KEY (id_vend),
CONSTRAINT venda_id_cliente_pkey foreign key (id_cliente) references cliente (id_cliente)
)

CREATE table produto_venda(
id_prod integer,
id_vend integer,
val_prod double precision,
qtd_prod integer,
constraint produto_venda_id_prod_pkey foreign key (id_prod) references produto (id_prod),
constraint produto_venda_id_venda_pkey foreign key (id_vend) references venda (id_vend)
)

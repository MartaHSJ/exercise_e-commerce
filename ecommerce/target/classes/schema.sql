create sequence hibernate_sequence start with 1 increment by 1
create table brand (brand_id bigint not null, name varchar(255) not null, primary key (brand_id))
create table price_list (id_price bigint not null, end_date timestamp not null, start_date timestamp not null, curr varchar(255) not null, price double not null, price_list integer not null, priority integer not null, product_id bigint not null, brand_id bigint not null, primary key (id_price))
alter table price_list add constraint FKs6c6i7syqgahwhx8h1ov2fu8f foreign key (brand_id) references brand


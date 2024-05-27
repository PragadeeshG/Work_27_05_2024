create table if not exists data_granting(
granting_id bigint not null,
customer_id varchar(255) null,
aggregate varchar(255) null,
aggregate_formula varchar(255) null,
global_market varchar(255) null,
asset_class varchar(255) null,
creation_date  varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint data_granting_pk primary key(granting_id));
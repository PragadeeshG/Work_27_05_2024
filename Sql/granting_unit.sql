create table if not exists grantig_unit(
granting_id bigint not null,
unit_id varchar(255) null,
number_of_sub_units Integer null,
potential varchar(255) null,
returns varchar(255) null,
is_approved char null,
range1 varchar(255) null,
wide_range char null,
creation_date  varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint granting_unit_pk primary key(granting_id));
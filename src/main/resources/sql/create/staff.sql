CREATE TABLE example.staff(
	id          int              not null primary key,
	name        varchar(20)      not null,
	age         int              not null,
	company_id  int              not null,
	house_id    int              not null
);
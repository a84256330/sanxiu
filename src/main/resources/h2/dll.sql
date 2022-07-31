create table house
(
    id bigint primary key not null,
    name varchar(40) not null
);

create table house_score
(
    id bigint primary key not null,
    house_id bigint not null
);

create table types
(
    id   UUID primary key,
    type varchar(255)
);

create table type_of_constructions
(
    id                UUID primary key,
    type_construction varchar(255)
);

create table buildings
(
    id                      UUID primary key,
    completion_time         varchar(255),
    house_type_id           UUID not null,
    type_of_construction_id UUID not null,
    constraint house_type_buildings_fk foreign key (house_type_id) references types ,
    constraint type_of_constructions_buildings_fk foreign key (type_of_construction_id) references type_of_constructions
);

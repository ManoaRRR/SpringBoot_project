create database projetrans;
\c projetrans;
create table client(
    id_client serial primary key,
    name_client varchar (50),
    firs_tname_client varchar (50),
    contact varchar (10)
);
create table car(
    id_car serial primary key,
    mark varchar (50),
    functional boolean,
    imatriculation varchar(50),
    id_client int references client (id_client)
);
create table reservation(
    id_reservation serial primary key,
    type_reservation varchar (20),
    date_reservation date,
    full_payment boolean,
    id_client int references client (id_client) 
);
create table driver(
    id_driver serial primary key,
    name_driver varchar (100),
    first_name_driver varchar (100),
    contact varchar (10),
    id_car int references car (id_car)
);
create table travel (
    id_travel serial primary key,
    date_travel date,
    travel_path varchar (100),
    id_client int references client (id_client),
    id_driver int references driver (id_driver)
);


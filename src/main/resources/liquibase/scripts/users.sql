-- liquibase formatted sql

-- changeset vPotapov:1
CREATE TABLE users(
    id    SERIAL,
    email TEXT
)

create table if not exists exchange_rate (
    id bigint unsigned not null auto_increment primary key,
    short_name varchar(3) not null,
    valid_from timestamp not null,
    name varchar(255) not null,
    country varchar(255) not null,
    move decimal(10, 4) not null,
    amount decimal(10, 4) not null,
    val_buy decimal(10, 4) not null,
    val_sell decimal(10, 4) not null,
    val_mid decimal(10, 4) not null,
    curr_buy decimal(10, 4) not null,
    curr_sell decimal(10, 4) not null,
    curr_mid decimal(10, 4) not null,
    version int not null,
    cnb_mid decimal(10, 4) not null,
    ecb_mid decimal(10, 4) not null,
    created_at timestamp not null default current_timestamp
);

create index exchange_rate_short_name_idx on exchange_rate (short_name);
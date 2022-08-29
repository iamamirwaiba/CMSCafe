Create table "employee"(
    id int not null generated by default as identity constraint pk_employee_id primary key,
    name varchar(25),
    contact_name varchar(25),
    created_at date,
    updated_at date

);

create table "employee_payment"(
    id int not null generated by default as identity constraint pk_employee_payment_id primary key,
    name varchar(25),
    amount int,
    created_at date,
    updated_at date

);

create table "category"(
    id int not null generated by default as identity constraint pk_category_id primary key,
    name varchar(25),
    created_at date,
    updated_at date

);

create table "payment_means"(
    id int not null generated by default as identity constraint pk_payment_means_id primary key,
    name varchar(25),
    created_at date,
    update_at date
);

create table "daily_sales"(
    id int not null generated by default as identity constraint pk_daily_sales_id primary key,
    opening_balance int,
    closing_balance int,
    expenses int,
    dues int,
    payment_means varchar(25),
    customer_count int
);

create table "dues"(
    id int not null generated by default as identity constraint pk_dues_id primary key ,
    name varchar(25),
    amount int,
    paid_amount int,
    contact_number varchar(10),
    paid_date date,
    created_at date,
    updated_at date

);

create table "menu"(
    id int not null generated by default as identity constraint pk_menu_id primary key,
    category_id int ,
    name varchar(25),
    price int,
    created_at date,
    updated_at date,
    constraint fk_category_id foreign key(category_id) references "category"(id)

);

create table "transaction"(
    id int not null generated by default as identity constraint pk_transaction_id primary key ,
    menu_item_id int ,
    menu_item_qty int,
    sale_amount int,
    table_number int,
    paid_means_id int ,
    created_at date,
    updated_at date,
    constraint fk_menu_id foreign key (menu_item_id) references menu(id),
    constraint fk_paid_means_id foreign key (paid_means_id) references payment_means(id)

);


create table "daily_purchases"(
    id int not null generated by default as identity constraint pk_daily_purchases_id primary key,
    item_id int,
    item_category int ,
    qty int,
    price int,
    paid_means_id int ,
    created_at date,
    updated_at date,
    constraint fk_item_category_id foreign key (item_category) references "category"(id),
    constraint fk_paid_means_id foreign key (paid_means_id) references payment_means(id)

);

create table "raw_items"(
    id int not null generated by default as identity constraint pk_raw_items primary key ,
    name varchar(25),
    category_id int ,
    mrp int,
    purchased_from int,
    created_at date,
    updated_at date,
    constraint fk_category_id foreign key (category_id) references "category"(id)


);

create table "non_profitable_item"(
    id int not null generated by default as identity constraint pk_non_profitable_item primary key,
    name varchar(25),
    category_id int,
    created_at date,
    updated_at date,
    constraint fk_category_id foreign key (category_id) references "category"(id)

);
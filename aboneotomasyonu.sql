create database aboneotomasyonu;

use aboneotomasyonu;
create table kullanicilar (
kid int UNSIGNED AUTO_INCREMENT,
kadi varchar(50) not null,
adi varchar(50) not null, 
soyadi varchar(50) not null, 
sifre varchar(50) not null,   

primary key(kid)
);

use aboneotomasyonu;
create table musteriler (
mid int UNSIGNED AUTO_INCREMENT,
ad varchar(50) not null, 
soyad varchar(50) not null, 
unvani varchar(50) not null,   
telefon varchar(50) not null, 
eposta varchar(50) not null, 
firma varchar(50) not null, 
adres varchar(50) not null, 

primary key(mid)
);
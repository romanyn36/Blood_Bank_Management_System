#create database blood_bank;
#create table donor (donor_id int primary key auto_increment ,donor_first_name varchar(20) not null,donor_last_name varchar(20)not null,donor_blood_type varchar (4) not null,donor_number varchar(20) not null,donor_email varchar(50) not null,donor_address varchar(100) not null );
#insert into donor (donor_id ,donor_first_name,donor_last_name,donor_blood_type,donor_number,donor_email,donor_address) values (1,"ROAA" ,"ABDOU",'A',01228973718,"roaaabdou@gmail.com","benha");
#alter table donor add column (donor_age int not null)  ;
#alter table donor add column (pass varchar(30) not null)  ;
#update  donor set donor_age =19 where donor_id =1 ;
#alter table donor add column (donor_gender  varchar(7)not null)  ;
#update  donor set donor_gender= " female" where donor_id =1 ;
#drop table donor;
#select *from donor ;
SET SQL_SAFE_UPDATES=0;



#create table blood_type (blood_type  varchar(5)  primary key not null   references donor (donor_id)  ,available_number int );
#insert into blood_type(blood_type  ,available_number)values ('A+',15);
#insert into blood_type(blood_type  ,available_number)values ('A-',20);
#insert into blood_type(blood_type  ,available_number)values ('B+',35);
#insert into blood_type(blood_type  ,available_number)values ('B-',45);
#insert into blood_type(blood_type  ,available_number)values ('AB+',75);
#insert into blood_type(blood_type  ,available_number)values ('AB-',10);
#insert into blood_type(blood_type  ,available_number)values ('O+',50);
#insert into blood_type(blood_type  ,available_number)values ('O-',25);
#select *from blood_type;


#create table recieptence (recieptence_first_name varchar (50) not null,recieptence_last_name varchar (50) not null,recieptence_number varchar (20) not null);
#alter table recieptence  add column (blood_type2 varchar(5) not null references blood_type );
#alter table recieptence  add column (blood_bags int  not null );
#insert into recieptence (recieptence_first_name ,recieptence_last_name ,recieptence_number,blood_type2,blood_bags) values ("sameh ","galal","01029082326","A+",2);
#insert into recieptence (recieptence_first_name ,recieptence_last_name ,recieptence_number,blood_type2,blood_bags) values ("sohaila  ","ibrahim","01024401732","A-",4);
#insert into recieptence (recieptence_first_name ,recieptence_last_name ,recieptence_number,blood_type2,blood_bags) values ("roaa  ","abdou","01228973718","A+",1);
#insert into recieptence (recieptence_first_name ,recieptence_last_name ,recieptence_number,blood_type2,blood_bags) values ("reham ","ibrahim","01029456638","AB",1);
#insert into recieptence (recieptence_first_name ,recieptence_last_name ,recieptence_number,blood_type2,blood_bags) values ("romany ","nasser ","01552030539","A+",2);
#select *from recieptence

#create table staff (id varchar(30) primary key ,password varchar(30));
#insert into staff (id,password) values (1,'romany') ,(2,'sameh')
#drop table staff;

#create table log(id varchar(15) primary key ,pas varchar(15)) ;
#alter table log add column(ct int);
#insert into log (id,pas,ct) values ("o","r",1);

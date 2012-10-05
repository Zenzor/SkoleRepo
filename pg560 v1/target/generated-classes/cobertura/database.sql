drop table PG560_USER;
drop table PG560_COUNTRY;

create table PG560_USER(
	id integer generated by default as identity primary key,
	username varchar(30) not null, 
	name varchar(60) not null,
	city varchar(30) not null,
	country varchar(30) not null
	);

insert into PG560_USER(username, name, city, country) values( 'tonnyg', 'Tonny Gundersen', 'Oslo', 'Norway');


create table PG560_COUNTRY(
	id integer generated by default as identity primary key,
	fullvalue varchar(30) not null, 
	shortvalue varchar(2) not null
	);
	
insert into PG560_COUNTRY(fullvalue, shortvalue) values( 'Norway', 'NO');
insert into PG560_COUNTRY(fullvalue, shortvalue) values( 'United States of America', 'US');
insert into PG560_COUNTRY(fullvalue, shortvalue) values( 'Sweden', 'SE');
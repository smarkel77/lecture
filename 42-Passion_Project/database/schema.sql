CREATE TABLE songs (
	id serial,
	title varchar(100) not null,
	artist varchar(100) not null,
	album varchar(100),
	
	constraint pk_songs_id primary key (id)
);


CREATE TABLE requests (
	id serial,
	title varchar(100) not null,
	artist varchar(100) not null,
	album varchar(100),
	
	constraint pk_requests_id primary key (id)
);


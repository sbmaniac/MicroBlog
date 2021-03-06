drop TABLE user if exists;
CREATE TABLE user(
  id_user INT primary key GENERATED BY DEFAULT AS IDENTITY,
  username VARCHAR(45) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL);

drop table follower if exists;
CREATE TABLE follower (
  id_follower INT NOT NULL,
  id_followee INT NOT NULL);

drop table message if exists;
CREATE TABLE message (
  id_message INT GENERATED BY DEFAULT AS IDENTITY,
  id_author INT NOT NULL,
  text VARCHAR(140) NOT NULL,
  publication_date TIMESTAMP NOT NULL
  );



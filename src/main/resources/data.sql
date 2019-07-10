DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  description VARCHAR(250)DEFAULT NULL,
  event_time  TIMESTAMP DEFAULT NULL,
  title  VARCHAR(250) DEFAULT NULL
);

INSERT INTO todo (title, description, event_time) VALUES
('Todo1', 'this is to do 1', '2019-07-11 10:10:00'),
('Todo2', 'this is to do 2', '2019-07-12 10:10:00'),
('Todo3', 'this is to do 3', '2019-07-13 10:10:00'),
('Todo4', 'this is to do 4', '2019-07-14 10:10:00');

CREATE DATABASE sketch;
CREATE USER sketch_user WITH PASSWORD 'sketch_user';
GRANT ALL ON DATABASE sketch TO sketch_user;

CREATE TABLE sketch (
  id   BIGSERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  text TEXT         NOT NULL
);

INSERT INTO sketch (name, text)
VALUES
  ('test_name_1', 'test_text_1'),
  ('test_name_2', 'test_text_2'),
  ('test_name_3', 'test_text_3');
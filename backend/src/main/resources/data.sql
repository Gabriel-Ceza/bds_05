INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Ana Brown', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_genre (id, name) VALUES (1, 'ACTION');
INSERT INTO tb_genre (id, name) VALUES (2, 'COMEDY');

INSERT INTO tb_movie (id, title, sub_title, year, img_url, synopsis, genre_id) VALUES (1, 'The Godfather', 'part I', '1969','https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 'melhor filme', 1);
INSERT INTO tb_movie (id, title, sub_title, year, img_url, synopsis, genre_id) VALUES (2, 'The Godfather', 'part II', '1970','https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 'segundo melhor filme', 1);
INSERT INTO tb_movie (id, title, sub_title, year, img_url, synopsis, genre_id) VALUES (3, 'The Godfather', 'part III', '1971','https://cdn.pixabay.com/photo/2018/03/22/10/55/training-course-3250007_1280.jpg', 'terceiro melhor filme', 2);

INSERT INTO tb_review (id, text, movie_id, user_id) VALUES (1, 'legal', 1, 2);
INSERT INTO tb_review (id, text, movie_id, user_id) VALUES (2, 'muito bom', 2, 2);

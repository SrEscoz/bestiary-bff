INSERT INTO creatures (name, type, size, armor_class, hit_points, challenge_rating)
VALUES ('Goblin', 'Humanoide', 'Pequeño', '15', '7 (2d6)', '1/4'),
       ('Orco', 'Humanoide', 'Mediano', '13', '15 (2d8+2)', '1/2'),
       ('Dragón', 'Dragón', 'Grande', '19', '200 (16d12+64)', '14'),
       ('Esqueleto', 'No Muerto', 'Mediano', '13', '13 (2d8+4)', '1/4'),
       ('Zombi', 'No Muerto', 'Mediano', '8', '22 (3d8+9)', '1/4'),
       ('Ogro', 'Gigante', 'Grande', '11', '59 (7d10+21)', '2'),
       ('Trol', 'Gigante', 'Grande', '15', '84 (8d10+40)', '5'),
       ('Duendecillo', 'Feérico', 'Diminuto', '13', '1 (1d4)', '1/8'),
       ('Liche', 'No Muerto', 'Mediano', '17', '135 (18d8+54)', '21'),
       ('Desuellamentes', 'Aberración', 'Mediano', '15', '71 (13d8+13)', '7');

INSERT INTO creature_types (name)
VALUES ('Humanoide'),
       ('No Muerto'),
       ('Dragón'),
       ('Aberración'),
       ('Bestia'),
       ('Gigante'),
       ('Constructo'),
       ('Elemental'),
       ('Feérico'),
       ('Celestial'),
       ('Infernal'),
       ('Planta');

INSERT INTO alignments (name)
VALUES ('Legal Bueno'),
       ('Neutral Bueno'),
       ('Caótico Bueno'),
       ('Legal Neutral'),
       ('Neutral'),
       ('Caótico Neutral'),
       ('Legal Malvado'),
       ('Neutral Malvado'),
       ('Caótico Malvado'),
       ('No alineado');


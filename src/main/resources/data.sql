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

INSERT INTO creatures (name, type_id, aligment_id, size, armor_class, hit_points, challenge_rating)
VALUES ('Dragón Ancestral Dorado', 3, 1, 'Enorme', '22', '546 (28d20+224)', '24'), -- Dragón, Legal Bueno
       ('Titán', 6, 1, 'Enorme', '25', '487 (25d20+200)', '22'),                   -- Gigante, Legal Bueno
       ('Demonio Balor', 11, 9, 'Enorme', '19', '262 (21d12+126)', '19'),          -- Infernal, Caótico Malvado
       ('Ángel Solar', 10, 1, 'Grande', '21', '243 (18d10+144)', '21'),            -- Celestial, Legal Bueno
       ('Kraken', 5, 6, 'Enorme', '18', '472 (27d12+270)', '23'),                  -- Bestia, Caótico Neutral
       ('Ancestro de la Tormenta', 8, 5, 'Enorme', '22', '432 (28d12+224)', '20'), -- Elemental, Neutral
       ('Tarrasque', 6, 5, 'Enorme', '25', '676 (33d20+330)', '30'),               -- Gigante, Neutral
       ('Devorador de Mundos', 4, 8, 'Enorme', '20', '496 (27d20+189)', '27'),     -- Aberración, Neutral Malvado
       ('Archidemonio', 11, 9, 'Grande', '21', '350 (28d10+196)', '25'),           -- Infernal, Caótico Malvado
       ('Empíreo', 6, 1, 'Enorme', '23', '470 (27d12+270)', '23'); -- Gigante, Legal Bueno



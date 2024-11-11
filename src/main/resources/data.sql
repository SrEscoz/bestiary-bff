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

INSERT INTO action (name, description)
VALUES ('Mordisco', 'El monstruo muerde al objetivo causando 30 (4d10 + 8) puntos de daño perforante.'),
       ('Garrazo', 'El monstruo ataca con sus garras causando 25 (3d8 + 6) puntos de daño cortante.'),
       ('Aliento de Fuego',
        'El monstruo exhala fuego en un área. Cada criatura en el área debe hacer una tirada de salvación de Destreza CD 24 o recibir 90 (20d6) puntos de daño por fuego.'),
       ('Golpe con Cola',
        'El monstruo ataca con su cola, causando 20 (3d10 + 5) puntos de daño contundente y derribando al objetivo.'),
       ('Aullido Aterrador',
        'El monstruo emite un aullido aterrador. Cada criatura debe hacer una tirada de salvación de Sabiduría CD 18 o quedar asustada.'),
       ('Desgarrón',
        'El monstruo desgarra a su enemigo, causando 40 (5d10 + 10) puntos de daño cortante y provocando sangrado.'),
       ('Rayo de Energía',
        'El monstruo dispara un rayo de energía, causando 30 (4d12) puntos de daño por fuerza a un objetivo a distancia.'),
       ('Puñetazo Colosal',
        'El monstruo golpea con su puño gigante, causando 35 (6d8 + 12) puntos de daño contundente.'),
       ('Trueno Ensordecedor',
        'El monstruo provoca una explosión de trueno en un área, causando 45 (10d6) puntos de daño de trueno y ensordeciendo a las criaturas afectadas.'),
       ('Teletransportación', 'El monstruo se teletransporta hasta 120 pies a una ubicación desocupada que pueda ver.');

INSERT INTO action (name, description)
VALUES ('Rugido de Trueno',
        'El monstruo emite un rugido ensordecedor en un radio de 20 pies, causando 20 (3d8) de daño de trueno.'),
       ('Garra de Sombras', 'Las garras del monstruo se envuelven en sombras, causando 25 (3d10) de daño necrótico.'),
       ('Lanza de Hielo',
        'El monstruo lanza una lanza de hielo que causa 18 (4d6) de daño perforante y congela al objetivo.'),
       ('Viento Cortante',
        'Crea una ráfaga de viento que causa 20 (4d6) de daño cortante a todas las criaturas en un cono de 15 pies.'),
       ('Pulso de Vida',
        'Emite un pulso que cura 15 (3d8) puntos de vida a todas las criaturas aliadas en un radio de 30 pies.'),
       ('Maldición Infernal',
        'El monstruo lanza una maldición que causa 25 (5d6) de daño necrótico y reduce la velocidad a la mitad.');

INSERT INTO creatures (name, type_id, aligment_id, size, armor_class, hit_points, challenge_rating)
VALUES ('Dragón Ancestral Dorado', 3, 1, 'Enorme', '22', '546 (28d20+224)', '24'),
       ('Titán', 6, 1, 'Enorme', '25', '487 (25d20+200)', '22'),
       ('Demonio Balor', 11, 9, 'Enorme', '19', '262 (21d12+126)', '19'),
       ('Ángel Solar', 10, 1, 'Grande', '21', '243 (18d10+144)', '21'),
       ('Kraken', 5, 6, 'Enorme', '18', '472 (27d12+270)', '23'),
       ('Ancestro de la Tormenta', 8, 5, 'Enorme', '22', '432 (28d12+224)', '20'),
       ('Tarrasque', 6, 5, 'Enorme', '25', '676 (33d20+330)', '30'),
       ('Devorador de Mundos', 4, 8, 'Enorme', '20', '496 (27d20+189)', '27'),
       ('Archidemonio', 11, 9, 'Grande', '21', '350 (28d10+196)', '25'),
       ('Empíreo', 6, 1, 'Enorme', '23', '470 (27d12+270)', '23');

INSERT INTO creatures (name, type_id, aligment_id, size, armor_class, hit_points, challenge_rating)
VALUES ('Espectro Sombrío', 2, 8, 'Mediano', '13', '45 (6d8+12)', '5'),
       ('Guardián de la Arboleda', 12, 2, 'Grande', '16', '112 (15d10+30)', '8'),
       ('Salamandra de Lava', 8, 6, 'Mediano', '15', '85 (10d8+30)', '7'),
       ('Coloso de Hierro', 7, 5, 'Enorme', '20', '350 (30d10+100)', '19'),
       ('Duque Demoníaco', 11, 9, 'Grande', '18', '190 (20d10+80)', '16'),
       ('Guardián Solar', 10, 1, 'Grande', '19', '190 (20d8+80)', '15');


-- Dragón Ancestral Dorado
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Ataque de Viento Huracanado',
        'El monstruo genera una ráfaga de viento que empuja 30 pies y derriba a todas las criaturas en un cono de 60 pies. Daño: 20 (3d10 + 5) contundente.',
        1),
       ('Torbellino de Destrucción',
        'El monstruo crea un torbellino en un radio de 30 pies. Daño: 45 (10d6) por fuerza. Las criaturas son lanzadas fuera del área.',
        1),
       ('Llamarada Infernal',
        'Explosión de fuego en 40 pies de radio. Daño: 50 (12d6) por fuego. CD 21 en Destreza para evitar el daño completo.',
        1);

-- Titán
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Ataque de Viento Huracanado',
        'Genera una ráfaga que empuja 30 pies y derriba. Daño: 20 (3d10 + 5) contundente.', 2),
       ('Rugido Aterrador', 'Las criaturas deben hacer una tirada de Sabiduría CD 17 o quedan asustadas por 1 minuto.',
        2);

-- Demonio Balor
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Torbellino de Destrucción', 'Causa 45 (10d6) de daño de fuerza y lanza criaturas fuera de un área de 30 pies.',
        3),
       ('Llamarada Infernal', 'Explosión de fuego en un radio de 40 pies. Daño: 50 (12d6). CD 21 en Destreza.', 3),
       ('Vórtice de Oscuridad', 'Zona de oscuridad de 20 pies. Daño psíquico: 40 (8d8) y ceguera temporal.', 3);

-- Ángel Solar
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Golpe Divino', 'Ataque radiante. Daño: 30 (4d8 + 10). Contra no-muertos o infernales, +15 de daño radiante.',
        4);

-- Tarrasque
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Ataque de Viento Huracanado',
        'Empuja y derriba a criaturas en un cono de 60 pies. Daño: 20 (3d10 + 5) contundente.', 7),
       ('Rugido Aterrador', 'Las criaturas en un radio de 60 pies deben pasar CD 17 en Sabiduría o quedan asustadas.',
        7);

-- Archidemonio
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Torbellino de Destrucción', 'Causa 45 (10d6) de daño de fuerza en un área de 30 pies.', 9),
       ('Llamarada Infernal', 'Explosión de fuego en un radio de 40 pies. Daño: 50 (12d6). CD 21 en Destreza.', 9),
       ('Vórtice de Oscuridad', 'Crea una zona de oscuridad mágica de 20 pies. Daño psíquico: 40 (8d8).', 9);


-- Espectro Sombrío
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Vórtice de Sombras', 'Envuelve un área en sombras. Daño: 30 (6d8) necrótico. CD 16 en Constitución.', 11),
       ('Mordisco Etéreo', 'Daño de fuerza: 25 (4d10). Atraviesa armaduras físicas.', 11);

-- Guardián de la Arboleda
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Raíces Enredadoras',
        'Las raíces del guardián atrapan a todas las criaturas en un radio de 20 pies. CD 17 en Fuerza o quedan sujetas.',
        12),
       ('Explosión de Esencias',
        'Libera esencias curativas. Aliados en un radio de 20 pies recuperan 20 (4d8) puntos de vida.', 12);

-- Coloso de Hierro
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Puño Triturador', 'El coloso golpea con fuerza. Daño: 45 (8d10) contundente.', 15),
       ('Grito de Hierro',
        'Emite un grito resonante que ensordece y aturde a todas las criaturas en 30 pies. CD 18 en Constitución.', 15);

-- Duque Demoníaco
INSERT INTO legendary_action (name, description, creature_id)
VALUES ('Rayo del Abismo', 'Dispara un rayo que causa 35 (6d10) de daño necrótico a un objetivo a distancia.', 16),
       ('Desgarrón Dimensional',
        'Rasga el tejido del plano, causando daño necrótico y teletransportando criaturas cercanas al inframundo.', 16);


-- Dragón Ancestral Dorado
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (1, 4);

-- Titán
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (2, 2),
       (2, 8),
       (2, 9);

-- Demonio Balor
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (3, 1),
       (3, 2),
       (3, 5),
       (3, 7);

-- Ángel Solar
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (4, 1),
       (4, 4),
       (4, 7),
       (4, 10);

-- Kraken
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (5, 1),
       (5, 2),
       (5, 6),
       (5, 8);

-- Ancestro de la Tormenta
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (6, 9),
       (6, 6),
       (6, 10);

-- Tarrasque
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (7, 1),
       (7, 2),
       (7, 4),
       (7, 6);

-- Devorador de Mundos
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (8, 7),
       (8, 5),
       (8, 9);

-- Archidemonio
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (9, 1),
       (9, 2),
       (9, 3),
       (9, 5);

-- Empíreo
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (10, 1),
       (10, 4),
       (10, 8),
       (10, 9);

-- Espectro Sombrío
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (11, 1),
       (11, 12),
       (11, 16);

-- Guardián de la Arboleda
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (12, 15),
       (12, 6),
       (12, 10);

-- Salamandra de Lava
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (13, 3),
       (13, 14);

-- Coloso de Hierro
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (15, 8),
       (15, 9),
       (15, 12);

-- Duque Demoníaco
INSERT INTO creatures_actions (creature_id, actions_id)
VALUES (16, 13),
       (16, 5),
       (16, 16);


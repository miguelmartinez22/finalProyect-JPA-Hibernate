INSERT INTO festival(id, fecha, nombre) VALUES
    (0, '2022-07-15 16:00:00', 'Festival 2022');

INSERT INTO escenario(id, capacidad, hora, nombre) VALUES
    (0, 1500, '16:30', 'Escenario Urbano'),
    (1, 1000, '16:30', 'Escenario Electrónico'),
    (2, 2000, '16:30', 'Escenario Moderno');

INSERT INTO cartel(id, nombre, genero_musical, fecha, escenario_id, festival_id) VALUES
    (0, 'Cartel de Rock', 'Rock', '2022-07-15 16:30:00', 2, 0),
    (1, 'Cartel de Pop', 'Pop', '2022-07-16 16:30:00', 2, 0),
    (2, 'Cartel de Rap/Trap', 'RapTrap', '2022-07-15 16:30:00', 0, 0),
    (3, 'Cartel de Reggaeton', 'Reggaeton', '2022-07-16 16:30:00', 0, 0),
    (4, 'Cartel de Electronica', 'Electronica', '2022-07-15 16:30:00', 1, 0),
    (5, 'Cartel de Hardcore', 'Hardcore', '2022-07-16 16:30:00', 1, 0);

INSERT INTO patrocinador(id, nombre, recaudacion, telefono) VALUES
    (0, 'RedBull', 1500, '685447585'),
    (1, 'JD Sports', 1000, '641586987'),
    (2, 'Sony', 2000, '652987441'),
    (3, 'Grefusa', 750, '636517642'),
    (4, 'Cupra', 1500, '684847951'),
    (5, 'AliExpress', 1000, '641232122');

INSERT INTO escenario_patrocinadores(escenario_id, patrocinador_id) VALUES
    (0, 0),
    (0, 5),
    (1, 1),
    (1, 4),
    (2, 2),
    (2, 3);

INSERT INTO entrada(id, fecha_compra, festival_id) VALUES
    (0, '2022-02-15 16:30:00', 0),
    (1, '2022-03-25 18:30:00', 0),
    (2, '2022-02-20 15:33:00', 0),
    (3, '2022-03-10 10:20:00', 0),
    (4, '2022-02-22 14:30:00', 0),
    (5, '2022-04-15 19:30:00', 0),
    (6, '2022-03-01 17:00:00', 0),
    (7, '2022-02-28 20:50:00', 0),
    (8, '2022-04-01 18:50:00', 0),
    (9, '2022-02-19 16:30:00', 0),
    (10, '2022-03-15 16:30:00', 0);

INSERT INTO usuario(usuario, contrasena, tipo) VALUES
    ('admin', 'admin123', 'Administrador'),
    ('pepe', 'pepe123', 'Cliente'),
    ('ramon', 'ramon123', 'Cliente'),
    ('paula', 'paula123', 'Cliente'),
    ('juan', 'juan123', 'Cliente'),
    ('rodrigo', 'rodrigo123', 'Cliente'),
    ('cristina', 'cristina123', 'Cliente'),
    ('lucia', 'lucia123', 'Cliente'),
    ('marta', 'marta123', 'Cliente'),
    ('luis', 'luis123', 'Cliente'),
    ('pedro', 'pedro123', 'Cliente'),
    ('lucas', 'lucas123', 'Cliente');

INSERT INTO cliente(dni, nombre, apellido1, apellido2, fecha_nacimiento, id, localidad, precio, telefono, usuario, entrada_id) VALUES
    ('06517226L', 'Pepe', 'Gómez', 'Sánchez', '2000-05-20 16:30:00', 0, 'Madrid', 60, '651621333', 'pepe', 0),
    ('78136569N', 'Ramón', 'Arias', 'López', '2002-02-23 16:30:00', 1, 'Lugo', 80, '655556571', 'ramon', 1),
    ('07782351N', 'Paula', 'Redondo', 'Granero', '2001-07-22 16:30:00', 2, 'Ávila', 60, '601323548', 'paula', 2),
    ('07848795P', 'Juan', 'Gil', 'Gutiérrez', '2002-10-06 16:30:00', 3, 'Albacete', 60, '698453216', 'juan', 3),
    ('06568697N', 'Rodrigo', 'Gutíerrez', 'Domingo', '1999-06-25 16:30:00', 4, 'Madrid', 150, '678102456', 'rodrigo', 4),
    ('08469847F', 'Cristina', 'Jiménez', 'Alguacil', '2001-01-31 16:30:00', 5, 'Toledo', 80, '605741832', 'cristina', 5),
    ('12495987R', 'Lucía', 'García', 'García', '1993-04-30 16:30:00', 6, 'Madrid', 60, '698323255', 'lucia', 6),
    ('12458721M', 'Marta', 'González', 'Alcántara', '1999-12-02 16:30:00', 7, 'Cuenca', 80, '669874558', 'marta', 7),
    ('08823451N', 'Luis', 'Márquez', null , '2001-04-18 16:30:00', 8, 'Barcelona', 60, '684141450', 'luis', 8),
    ('45871235K', 'Pedro', 'Calvo', 'Sánchez', '1995-06-20 16:30:00', 9, 'Madrid', 150, '641256547', 'pedro', 9),
    ('51484236P', 'Lucas', 'Martínez', 'Gómez', '1997-10-22 18:50:00', 10, 'Zamora', 60, '689764055', 'lucas', 10);

INSERT INTO manager(dni, nombre, telefono) VALUES
    ('01458987L', 'Marta González', '684211472'),
    ('02574941L', 'Manuel Rodríguez', '695321412'),
    ('02574588K', 'Lucía Martínez', '698587412'),
    ('02574712U', 'Jorge Rodríguez', '662356412'),
    ('02574211P', 'Luis Pérez', '695849412'),
    ('02572369M', 'Paco Píriz', '695322582'),
    ('04514758K', 'Juanjo Ramírez', '647125487'),
    ('02573499R', 'Carmen Gutiérrez', '695384559'),
    ('84121203K', 'Luis Abascal', '621585696'),
    ('02165413P', 'Jose López', '641258472'),
    ('60446462J', 'Pedro Casado', '696548534'),
    ('20135463E', 'Lucía Gutiérrez', '695254152'),
    ('69880264L', 'Hector Gil', '692456452'),
    ('68773547K', 'Lucía Seijo', '624542554'),
    ('12546542P', 'Fernando Fernández', '665496874'),
    ('24466850N', 'Marta Albendea', '665456122'),
    ('68973686L', 'Sandra Gómez', '696545620'),
    ('20156768S', 'Pedro García', '695645612'),
    ('58762502T', 'Luis Pantoja', '684854521'),
    ('12865085G', 'Yannis Montes', '665423209'),
    ('47555564D', 'Beatriz Gil', '693542002'),
    ('55256576F', 'Marta Granero', '602541630'),
    ('69860544N', 'Carmen García', '650655465'),
    ('98635646L', 'Miguel Fernández', '654653685');

INSERT INTO artista(dni, nombre, salario, hora_entrada, hora_salida, genero_musical, nacionalidad, manager_dni, cartel_id) VALUES
    ('04569816R', 'Fito y Fitipaldis',1500 , '16:00', '20:00', 'Rock', 'Española', '01458987L', 0),
    ('04448726R', 'Iron Maiden',1500 , '16:00', '20:00', 'Rock', 'Estadounidense', '02574941L', 0),
    ('04495268N', 'Imagine Dragons',1500 , '20:00', '00:00', 'Rock', 'Estadounidense', '02574588K', 0),
    ('94587268N', 'Leña',750 , '20:00', '00:00', 'Rock', 'Española','02574712U', 0),
    ('02295748L', 'Fernando Costa',1500 , '16:00', '20:00', 'RapTrap', 'Española', '02574211P', 2),
    ('54862148R', 'Kidd Keo',1500 , '16:00', '20:00', 'RapTrap', 'Canadiense', '02572369M', 2),
    ('95182572K', 'Natos y Waor',1500 , '20:00', '00:00', 'RapTrap', 'Española', '04514758K', 2),
    ('48952194V', 'Kaze',750 , '20:00', '00:00', 'RapTrap', 'Española', '02573499R', 2),
    ('59712514K', 'Bad Bunny',1500 , '16:00', '20:00', 'Reggaeton', 'República Dominicana', '84121203K', 3),
    ('56462115F', 'Anuel AA',1500 , '16:00', '20:00', 'Reggaeton', 'República Dominicana', '02165413P', 3),
    ('92121382L', 'Rauw Alejandro',750 , '20:00', '00:00', 'Reggaeton', 'Puerto Riqueña', '60446462J', 3),
    ('51325756P', 'Sech',750 , '20:00', '00:00', 'Reggaeton', 'Puerto Riqueña', '20135463E', 3),
    ('54621687J', 'David Guetta',1500 , '16:00', '20:00', 'Electronica', 'Estadounidense', '69880264L', 4),
    ('84232511F', 'Alan Walker',1500 , '16:00', '20:00', 'Electronica', 'Estadounidense', '68773547K', 4),
    ('69532135L', 'The ChainSmokers',750 , '20:00', '00:00', 'Electronica', 'Francesa', '12546542P', 4),
    ('32154635N', 'Kiko Rivera',750 , '20:00', '00:00', 'Electronica', 'Española', '24466850N', 4),
    ('95521132F', 'Black Flag',750 , '16:00', '20:00', 'Hardcore', 'Alemana', '68973686L', 5),
    ('54532413P', 'Rise Against',750 , '16:00', '20:00', 'Hardcore', 'Francesa', '20156768S', 5),
    ('75624246M', 'Angerfist',750 , '20:00', '00:00', 'Hardcore', 'Inglesa', '58762502T', 5),
    ('34553556N', 'A Day To Remember',750 , '20:00', '00:00', 'Hardcore', 'Inglesa', '12865085G', 5),
    ('15354665L', 'Ariana Grande',750 , '16:00', '20:00', 'Pop', 'Estadounidense', '47555564D', 1),
    ('89795413J', 'Katty Perry',750 , '16:00', '20:00', 'Pop', 'Estadounidense', '55256576F', 1),
    ('02465416R', 'Lola Indigo',750 , '20:00', '00:00', 'Pop', 'Española', '69860544N', 1),
    ('67894413T', 'Rihanna',750 , '20:00', '00:00', 'Pop', 'Estadounidense', '98635646L', 1);

INSERT INTO camerino (id, fecha_hora, gama, nombre, artista_dni) VALUES
    (0, '2022-07-15 15:00:00', 'Alta', 'Camerino 0', '04569816R'),
    (1, '2022-07-16 15:00:00', 'Media', 'Camerino 1', '04448726R'),
    (2, '2022-07-15 19:00:00', 'Baja', 'Camerino 2', '04495268N'),
    (3, '2022-07-16 19:00:00', 'Media', 'Camerino 3', '94587268N'),
    (4, '2022-07-15 15:00:00', 'Alta', 'Camerino 4', '02295748L'),
    (5, '2022-07-16 15:00:00', 'Baja', 'Camerino 5', '54862148R'),
    (6, '2022-07-15 19:00:00', 'Media', 'Camerino 6', '95182572K'),
    (7, '2022-07-16 19:00:00', 'Alta', 'Camerino 7', '48952194V'),
    (8, '2022-07-15 15:00:00', 'Media', 'Camerino 8', '59712514K'),
    (9, '2022-07-16 15:00:00', 'Baja', 'Camerino 9', '56462115F'),
    (10, '2022-07-15 19:00:00', 'Alta', 'Camerino 10', '92121382L'),
    (11, '2022-07-16 19:00:00', 'Media', 'Camerino 11', '51325756P'),
    (12, '2022-07-15 15:00:00', 'Alta', 'Camerino 12', '54621687J'),
    (13, '2022-07-16 15:00:00', 'Baja', 'Camerino 13', '84232511F'),
    (14, '2022-07-15 19:00:00', 'Alta', 'Camerino 14', '69532135L'),
    (15, '2022-07-16 19:00:00', 'Media', 'Camerino 15', '32154635N'),
    (16, '2022-07-15 15:00:00', 'Baja', 'Camerino 16', '95521132F'),
    (17, '2022-07-16 15:00:00', 'Alta', 'Camerino 17', '54532413P'),
    (18, '2022-07-15 19:00:00', 'Media', 'Camerino 18', '75624246M'),
    (19, '2022-07-16 19:00:00', 'Baja', 'Camerino 19', '34553556N'),
    (20, '2022-07-15 15:00:00', 'Alta', 'Camerino 20', '15354665L'),
    (21, '2022-07-16 15:00:00', 'Media', 'Camerino 21', '89795413J'),
    (22, '2022-07-15 19:00:00', 'Alta', 'Camerino 22', '02465416R'),
    (23, '2022-07-16 19:00:00', 'Alta', 'Camerino 23', '67894413T');

INSERT INTO club_fans(id, fecha_creacion, nombre, recaudacion, artista_dni) VALUES
    (0, '2022-01-15 14:00:00', 'ClubFans Fito', 500, '04569816R'),
    (1, '2022-01-15 14:00:00', 'ClubFans Iron', 800, '04448726R'),
    (2, '2022-01-15 14:00:00', 'ClubFans Imagine', 1000, '04495268N'),
    (3, '2022-01-15 14:00:00', 'ClubFans Leña', 500, '94587268N'),
    (4, '2022-01-15 14:00:00', 'ClubFans Fernando', 300, '02295748L'),
    (5, '2022-01-15 14:00:00', 'ClubFans Keo', 600, '54862148R'),
    (6, '2022-01-15 14:00:00', 'ClubFans NyW', 400, '95182572K'),
    (7, '2022-01-15 14:00:00', 'ClubFans Kaze', 300, '48952194V'),
    (8, '2022-01-15 14:00:00', 'ClubFans Bad', 800, '59712514K'),
    (9, '2022-01-15 14:00:00', 'ClubFans Anuel', 700, '56462115F'),
    (10, '2022-01-15 14:00:00', 'ClubFans Rauw', 600, '92121382L'),
    (11, '2022-01-15 14:00:00', 'ClubFans Sech', 500, '51325756P'),
    (12, '2022-01-15 14:00:00', 'ClubFans Guetta', 800, '54621687J'),
    (13, '2022-01-15 14:00:00', 'ClubFans Walker', 600, '84232511F'),
    (14, '2022-01-15 14:00:00', 'ClubFans Chainsmokers', 800, '69532135L'),
    (15, '2022-01-15 14:00:00', 'ClubFans Rivera', 500, '32154635N'),
    (16, '2022-01-15 14:00:00', 'ClubFans BF', 400, '95521132F'),
    (17, '2022-01-15 14:00:00', 'ClubFans RA', 300, '54532413P'),
    (18, '2022-01-15 14:00:00', 'ClubFans Angerfist', 150, '75624246M'),
    (19, '2022-01-15 14:00:00', 'ClubFans ADTR', 200, '34553556N'),
    (20, '2022-01-15 14:00:00', 'ClubFans Ariana', 700, '15354665L'),
    (21, '2022-01-15 14:00:00', 'ClubFans Katty', 600, '89795413J'),
    (22, '2022-01-15 14:00:00', 'ClubFans Indigo', 300, '02465416R'),
    (23, '2022-01-15 14:00:00', 'ClubFans Rihanna', 800, '67894413T');

INSERT INTO club_fans_clientes(club_fans_id, cliente_usuario) VALUES
    (22, 'lucia'),
    (2, 'ramon'),
    (8, 'lucas'),
    (20, 'paula'),
    (15, 'cristina');
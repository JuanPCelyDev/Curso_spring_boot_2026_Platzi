-- 1. Interestelar
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES (8.70, 'Un grupo de exploradores viaja a traves de un agujero de gusano en el espacio para asegurar la supervivencia de la humanidad.', 'Christopher Nolan', 169, 'A', '2014-11-07', 'Ciencia Ficcion', 'Interestelar')
ON CONFLICT(titulo) DO NOTHING;
-- 2. El Padrino
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES (9.20, 'El envejecido patriarca de una dinastia del crimen organizado transfiere el control de su imperio clandestino a su reacio hijo.', 'Francis Ford Coppola', 175, 'A', '1972-03-24', 'Drama', 'El Padrino')
ON CONFLICT(titulo) DO NOTHING;
-- 3. Matrix
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES ( 8.70, 'Un hacker informatico aprende de rebeldes misteriosos sobre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores.', 'Lana Wachowski', 136, 'A', '1999-03-31', 'Accion', 'Matrix')
ON CONFLICT(titulo) DO NOTHING;
-- 4. El Viaje de Chihiro
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES ( 8.60, 'Durante el traslado de su familia a los suburbios, una niña de 10 años de edad deambula por un mundo gobernado por dioses, brujas y espiritus.', 'Hayao Miyazaki', 125, 'A', '2001-07-20', 'Animacion', 'El Viaje de Chihiro')
ON CONFLICT(titulo) DO NOTHING;
-- 5. Parásitos
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES ( 8.50, 'La codicia y la discriminacion de clases amenazan la relacion recién formada entre la adinerada familia Park y el clan Kim, que carece de medios.', 'Bong Joon Ho', 132, 'I', '2019-05-30', 'Suspenso', 'Parasitos')
ON CONFLICT(titulo) DO NOTHING;
-- 6. Pulp Fiction
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES (8.90, 'Las vidas de dos asesinos a sueldo, un boxeador, la esposa de un gángster y un par de bandidos se entrelazan en cuatro historias de violencia y redención.', 'Quentin Tarantino', 154, 'A', '1994-10-14', 'Crimen', 'Pulp Fiction')
ON CONFLICT(titulo) DO NOTHING;
-- 7. Inception (El Origen)
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES ( 8.80, 'A un ladron que roba secretos corporativos a traves del uso de la tecnologia de compartir sueños se le da la tarea inversa de plantar una idea.', 'Christopher Nolan', 148, 'A', '2010-07-16', 'Ciencia Ficcion', 'Inception')
ON CONFLICT(titulo) DO NOTHING;
-- 8. El Club de la Pelea
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES ( 8.80, 'Un oficinista insomne y un desapegado fabricante de jabones forman un club de lucha clandestino que se convierte en algo mucho mas grande.', 'David Fincher', 139, 'A', '1999-10-15', 'Drama', 'El Club de la Pelea')
ON CONFLICT(titulo) DO NOTHING;
-- 9. Gladiador
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES (8.50, 'Un antiguo general romano se propone vengarse del corrupto emperador que asesino a su familia y lo envio a el a la esclavitud.', 'Ridley Scott', 155, 'A', '2000-05-05', 'Accion', 'Gladiador')
ON CONFLICT(titulo) DO NOTHING;
-- 10. Whiplash
INSERT INTO plataforma_pelicula (calificacion, descripcion, director, duracion, estado, fecha_estreno, genero, titulo)
VALUES (8.50, 'Un joven y prometedor baterista de jazz se inscribe en un cortejado conservatorio de musica donde sus sueños de grandeza son guiados por un feroz instructor.', 'Damien Chazelle', 106, 'I', '2014-10-10', 'Drama', 'Whiplash')
ON CONFLICT(titulo) DO NOTHING;
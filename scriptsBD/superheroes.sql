DROP DATABASE IF EXISTS superheroes; -- Elimina a base de Datos en caso de estar creador
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, -- columnas
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, -- clave primaria, identificador
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador) -- clave de otra tabla para establecer relación UNO A MUCHOS
  );
-- DROP DATABASE IF EXISTS superheroes;
-- Creadores
  INSERT INTO creador VALUES(1, "Marvel");
  INSERT INTO creador VALUES(2,"DC Comics");
  -- Personajes
  INSERT INTO personajes VALUES(1,"BRUCE BANNER", "HULK", 160, "600MIL", 75, 98, 1962, "FISICO NUCLEAR", 1);
  INSERT INTO personajes VALUES(2, "TONY STARK", "IRONMAN", 170, "200MIL", 70, 123, 1963, "inventor industrial",      1);
  INSERT INTO personajes VALUES(3, "Thor Odinson", "Thor", 145, "infinita", 100, 235, 1962, "Rey de Asgard",1);
  INSERT INTO personajes VALUES(4, "Wanda Maximoff", "bruja Escarlata", 170, "100MIL", 90,345,1964,"bruja",1);
  INSERT INTO personajes VALUES(5, "Carol Danvers", "Capitana Marvel", 157, "250MIL", 85, 128, 1968, "oficial de inteligencia",1);
  INSERT INTO personajes VALUES(6, "Thanos", "Thanos", 170, "infinita", 40, 306, 1973, "Adorador de a muerte",1);
  INSERT INTO personajes VALUES(7, "Peter Parker", "SpiderMan", 165, "25MIl",80,74,1962,"fotografo",1);
  INSERT INTO personajes VALUES(8, "steve rogers", "capitan America", 145, "600", 45, 60, 1941, "oficial federal",1);
  INSERT INTO personajes VALUES(9, "Bobby Drake", "iceMan", 140, "2MIL", 64, 122, 1963, "contador",2);
  INSERT INTO personajes VALUES(10, "Barry Allen", "Flash", 160, "10MIL", 120, 168, 1956, "cinetifico forense",2);
  INSERT INTO personajes VALUES(11, "Bruce Wayne", "Batman", 170, "500", 32, 47, 1939, "Empresario",2);
  INSERT INTO personajes VALUES(12, "Clarck Kent", "Superman", 165, "infinita", 120, 182, 1948, "Periodista",2);
  INSERT INTO personajes VALUES(13, "Diana Prince", "Mujer Maravilla", 160, "infinita", 95, 127, 1949, "princesa guerrera",2);
  -- a) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman
   update personajes
   set aparicion = 1938
   where id_personaje = 12; 
   -- b) Eliminar el registro que contiene al personaje Flash. 
   delete from personajes
   where id_personaje = 12;
   -- a) Ahora veamos cómo ha quedado la tabla “superheroes” que creaste anteriormente. Para ello necesitarás una consulta de tipo SELECT.
    SELECT * FROM personajes; -- Mostrar toda la pantalla 
    -- b) Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla superhéroe.
    SELECT nombre_real FROM personajes;
    -- c) Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre empieza con “B”. 
    SELECT nombre_real FROM personajes WHERE nombre_real LIKE 'B%';
    -- Pongamos a prueba esta nueva cláusula: order by. Seguiremos trabajando con la tabla “superhéroe”. Realiza una consulta que devuelva todos los registros ordenados por “inteligencia”
    SELECT * FROM superhéroe ORDER BY inteligencia DESC;
    
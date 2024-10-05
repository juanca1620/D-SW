create DATABASE gallinero;

USE gallinero;

CREATE TABLE roles(
  id int PRIMARY KEY,
  nombre VARCHAR(30)
)

INSERT INTO roles (id,nombre)VALUES
(1,"AdminGeneral"),
(2,"Cliente");


CREATE TABLE usuarios(
  id INT PRIMARY KEY,
  nombre VARCHAR(100),
  fecha_nacimiento DATE,
  contrasenna VARCHAR(255),
  id_rol INT,
  FOREIGN KEY (id_rol) REFERENCES roles(id)
)

CREATE TABLE ventas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  fecha_venta DATE,
  cantidad_vendida INT,
  precio_venta FLOAT,
  id_usuario INT,
  id_produccion INT,
  FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
  FOREIGN KEY (id_produccion) REFERENCES produccion(id)
)

CREATE TABLE produccion(
  id INT AUTO_INCREMENT PRIMARY KEY,
  cantidad_huevos INT,
  fecha_produccion DATE,
  id_lote INT,
  FOREIGN KEY (id_lote) REFERENCES lotes(id)
)

CREATE TABLE reportes(
  id INT AUTO_INCREMENT PRIMARY KEY,
  argumento TEXT,
  tipo_reporte INT,
  id_produccion INT ,
  id_lote INT ,
  FOREIGN KEY (id_produccion) REFERENCES produccion(id),
  FOREIGN KEY (id_lote) REFERENCES lotes(id),
  CHECK(
    (id_lote IS NOT NULL AND id_produccion IS NULL) OR
    (id_lote IS NULL AND id_produccion IS NOT NULL)
  )
)

CREATE TABLE lotes(
  id INT PRIMARY KEY,
  nombre VARCHAR(100),
  nombre_ubicacion VARCHAR(100)
)

INSERT INTO lotes (id, nombre, nombre_ubicacion) VALUES
(1, 'Lote 1', 'Ubicación 1'),
(2, 'Lote 2', 'Ubicación 2'),
(3, 'Lote 3', 'Ubicación 3'),
(4, 'Lote 4', 'Ubicación 4'),
(5, 'Lote 5', 'Ubicación 5'),
(6, 'Lote 6', 'Ubicación 6'),
(7, 'Lote 7', 'Ubicación 7'),
(8, 'Lote 8', 'Ubicación 8'),
(9, 'Lote 9', 'Ubicación 9'),
(10, 'Lote 10', 'Ubicación 10');

CREATE TABLE gallinas(
  id INT PRIMARY KEY,
  fecha_nacimiento DATE,
  estado_salud BOOLEAN,
  id_lote INT,
  FOREIGN KEY (id_lote) REFERENCES lotes(id)
)

CREATE TABLE alimentacion(
  id INT AUTO_INCREMENT PRIMARY KEY,
  tipo_alimento VARCHAR(30),
  cantidad_alimento INT,
  fecha_alimento DATE,
  id_lote INT,
  FOREIGN KEY (id_lote) REFERENCES lotes (id)
)


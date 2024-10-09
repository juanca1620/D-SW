create DATABASE gallinero;

USE gallinero;

CREATE TABLE roles(
  id int PRIMARY KEY,
  nombre VARCHAR(30)
)

INSERT INTO roles (id,nombre)VALUES
(1,"AdminGeneral"),
(2,"Cliente");roles

CREATE TABLE usuarios(
  id INT PRIMARY KEY,
  nombre VARCHAR(100),
  fecha_nacimiento DATE,
  gmail VARCHAR(100),
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
  id_produccion INT,
  FOREIGN KEY (id_produccion) REFERENCES lotes(id)
)


CREATE TABLE lotes(
  id INT PRIMARY KEY,
  nombre VARCHAR(100),
  nombre_ubicacion VARCHAR(100)
)

INSERT INTO lotes (nombre,nombre_ubicacion)VALUES
("a","pe");

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
  
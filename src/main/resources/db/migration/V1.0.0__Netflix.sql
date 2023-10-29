-- Creación de la tabla 'categoria'

CREATE TABLE
    categoria (
        id INT PRIMARY KEY,
        nombre_categoria VARCHAR(100),
        clasificacion VARCHAR(1)
    );

-- Creación de la tabla 'directores'

CREATE TABLE
    directores (
        id INT PRIMARY KEY,
        nombre VARCHAR(100),
        pais_origen VARCHAR(100),
        oscar TINYINT(1)
    );

-- Creación de la tabla 'pelicula'

CREATE TABLE
    pelicula (
        id INT PRIMARY KEY,
        nombre VARCHAR(100),
        año INT,
        estrellas INT,
        categoria_id INT,
        director_id INT,
        FOREIGN KEY (categoria_id) REFERENCES categoria(id),
        FOREIGN KEY (director_id) REFERENCES directores(id)
    );
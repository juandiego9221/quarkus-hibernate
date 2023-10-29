-- Insertando registros en la tabla 'categoria'

INSERT INTO
    categoria (
        id,
        nombre_categoria,
        clasificacion
    )
VALUES (1, 'Acción', 'A'), (2, 'Drama', 'B'), (3, 'Comedia', 'C');

-- Insertando registros en la tabla 'directores'

INSERT INTO
    directores (id, nombre, pais_origen, oscar)
VALUES (1, 'Director Uno', 'México', 1), (2, 'Director Dos', 'España', 0), (
        3,
        'Director Tres',
        'Argentina',
        0
    );

-- Insertando registros en la tabla 'pelicula'

INSERT INTO
    pelicula (
        id,
        nombre,
        anio,
        estrellas,
        categoria_id,
        director_id
    )
VALUES (1, 'Pelicula Uno', 2020, 5, 1, 1), (2, 'Pelicula Dos', 2021, 4, 2, 2), (3, 'Pelicula Tres', 2022, 3, 3, 3);
# DEMO NETFLIX 
# quarkus-getting-started


## Funcionalidades a impleemntar


1. **Categorías**:
   - `GET /categories`: Listar todas las categorías disponibles para navegar por el contenido.

2. **Películas**:
   - `GET /movies`: Listar las películas más populares o destacadas.
   - `GET /movies/{pelicula_id}`: Ver detalles y metadatos de una película específica.
   - `GET /movies/categories/{categoria_id}`: Listar todas las películas de una categoría específica.
   - `GET /movies/directors/{director_id}`: Listar todas las películas de un director específico.

3. **Directores**:
   - `GET /directors/{director_id}`: Ver detalles de un director en particular (esto podría incluir su filmografía y un poco de biografía).

8. **Valoraciones**:
   - `PATCH /movies/{pelicula_id}/reviews`: Añadir una valoración a una película.

Estos endpoints se centran más en la experiencia del usuario y en proporcionarle la información que probablemente querría ver o interactuar en una plataforma tipo Netflix.

## Considerar usar docker para poder correr el proyecto

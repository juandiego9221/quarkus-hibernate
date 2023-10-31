# DEMO NETFLIX 
# quarkus-getting-started


## Funcionalidades a impleemntar


1. **Categorías**:
   - `GET /categorias`: Listar todas las categorías disponibles para navegar por el contenido.

2. **Películas**:
   - `GET /peliculas`: Listar las películas más populares o destacadas.
   - `GET /peliculas/{pelicula_id}`: Ver detalles y metadatos de una película específica.
   - `GET /peliculas/categoria/{categoria_id}`: Listar todas las películas de una categoría específica.
   - `GET /peliculas/director/{director_id}`: Listar todas las películas de un director específico.

3. **Directores**:
   - `GET /directores/{director_id}`: Ver detalles de un director en particular (esto podría incluir su filmografía y un poco de biografía).

4. **Búsqueda**:
   - `GET /buscar?nombre={nombre}`: Buscar películas y/o directores por nombre.

5. **Recomendaciones**:
   - `GET /recomendaciones`: Basado en las películas que ha visto o marcado como favoritas el usuario, devolver películas recomendadas.

6. **Lista de favoritos**:
   - `POST /peliculas/{pelicula_id}/favoritos`: Marcar una película como favorita.
   - `DELETE /peliculas/{pelicula_id}/favoritos`: Desmarcar una película como favorita.
   - `GET /usuario/favoritos`: Listar las películas que el usuario ha marcado como favoritas.

7. **Historial de visualización**:
   - `GET /usuario/historial`: Ver las películas que el usuario ha visto recientemente.

8. **Valoraciones**:
   - `POST /peliculas/{pelicula_id}/valorar`: Añadir una valoración a una película.
   - `DELETE /peliculas/{pelicula_id}/valorar`: Eliminar o modificar la valoración de una película.

Estos endpoints se centran más en la experiencia del usuario y en proporcionarle la información que probablemente querría ver o interactuar en una plataforma tipo Netflix.

## Considerar usar docker para poder correr el proyecto

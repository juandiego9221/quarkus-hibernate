package pe.com.jdmm21.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pelicula")
public class MovieEntity {
    @Id
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "anio")
    private int year;
    @Column(name = "estrellas")
    private int stars;
    /*
     * La relación se establece con la entidad CategoryEntity mediante la
     * anotación @JoinColumn.
     * 
     * La anotación @JoinColumn se utiliza para especificar la columna de la tabla
     * de la entidad MovieEntity que se utilizará para almacenar la clave externa de
     * la relación. En este caso, la columna se llama category_id.
     * 
     * Considerar que se debe asignar el nombre de la foranea , si se agrega otro valor se creara una nueva columna y eso hara que la busqueda devolvera vacio
     */
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private DirectorEntity director;
}

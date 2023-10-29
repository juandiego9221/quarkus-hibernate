package pe.com.jdmm21.model;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pelicula")
public class MovieEntity {
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "anio")
    private int year;
    @Column(name = "estrellas")
    private int stars;

}

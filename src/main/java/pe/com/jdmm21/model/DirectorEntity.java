package pe.com.jdmm21.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "directores")
public class DirectorEntity {
    @Id
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "pais_origen")
    private String country;
    @Column(name = "oscar")
    private boolean hasOscar;
}

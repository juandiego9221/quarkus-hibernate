package pe.com.jdmm21.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "categoria")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {
    @Id
    private int id;
    @Column(name = "nombre_categoria")
    private String categoryName;
    @Column(name = "clasificacion")
    private String clasification;

}

package pe.com.jdmm21.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DirectorEntity {
    private int id;
    private String name;
    private String country;
    private boolean hasOscar;
}

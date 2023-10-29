package pe.com.jdmm21.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DirectorDTO {
    private String name;
    private String country;
    private boolean hasOscar;
}

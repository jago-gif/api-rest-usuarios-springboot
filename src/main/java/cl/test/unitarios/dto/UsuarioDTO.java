package cl.test.unitarios.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {
	
	private  Long id;
	@NotEmpty (message = "nombre no puede ser vacio")
    private String nombre;
	@NotEmpty (message = "apellido no puede ser vacio")
    private String apellido;
	@NotEmpty (message = "username no puede ser vacio")
    private String username;
	@NotEmpty (message = "email no puede ser vacio")
    private String email;
}

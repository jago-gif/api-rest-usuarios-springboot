package cl.test.unitarios.services;

import java.util.List;

import cl.test.unitarios.dto.UsuarioDTO;

public interface UsuarioService {
	public UsuarioDTO guardarUsuario( UsuarioDTO usuarioDTO);
	public UsuarioDTO buscarUsuarioPorUsername(String username);
	public boolean actualizarUsuario(UsuarioDTO usuarioDTO);
	public boolean eliminarUsuario(Long id);
	public List<UsuarioDTO> listarUsuarios();

}

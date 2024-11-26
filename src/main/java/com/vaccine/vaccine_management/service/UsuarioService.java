package com.vaccine.vaccine_management.service;
import com.vaccine.vaccine_management.model.CitaMedica;
import com.vaccine.vaccine_management.model.Usuario;
import com.vaccine.vaccine_management.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean login(String correo, String contrasena) {
        Usuario usuario = usuarioRepository.findByCorreo(correo);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return true;
        }
        return false;
    }

    public Usuario registrarusuario(Usuario usuario) {
        return usuarioRepository.save(usuario);

    }
}
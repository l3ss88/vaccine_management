package com.vaccine.vaccine_management.controller;

import com.vaccine.vaccine_management.model.Usuario;
import com.vaccine.vaccine_management.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = usuarioService.login(loginRequest.getCorreo(), loginRequest.getContrasena());
        if (isAuthenticated) {
            return ResponseEntity.ok("Login exitoso");
        }
        return ResponseEntity.status(401).body("Correo o contraseña incorrectos");
    }
    public static class LoginRequest {
        private String correo;
        private String contrasena;

        public String getCorreo() {
            return correo;
        }
        public String getContrasena() {
            return contrasena;
        }

    }

    @PostMapping("/registrarusuario") //http://localhost:8090/api/citas/registrar enviar el registro en formato json
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        Usuario nuevousaurio = new Usuario();
        nuevousaurio.setNombre(usuario.getNombre());
        nuevousaurio.setContrasena(usuario.getContrasena());
        nuevousaurio.setDireccion(usuario.getDireccion());
        nuevousaurio.setTelefono(usuario.getTelefono());
        nuevousaurio.setCorreo(usuario.getCorreo());
        nuevousaurio.setCreadoEn(date);
        nuevousaurio.setTipoUsuario(Usuario.TipoUsuario.USUARIO);
        //nuevousaurio.setFechaNacimiento(usuario.getFechaNacimiento());

        System.out.println("Ingreso al servicio registrar usuario"+ usuario.getNombre());
        usuarioService.registrarusuario(nuevousaurio);
        return ResponseEntity.ok(usuario);


        /*Usuario nuevoUsuario= usuarioService.registrarusuario(usuario);
        return ResponseEntity.ok(nuevoUsuario); */
    }
}
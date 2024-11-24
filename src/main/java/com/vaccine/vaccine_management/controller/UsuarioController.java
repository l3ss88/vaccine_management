package com.vaccine.vaccine_management.controller;

import com.vaccine.vaccine_management.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
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
}
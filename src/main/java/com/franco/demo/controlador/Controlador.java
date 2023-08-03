/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.franco.demo.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.franco.demo.dominio.Usuario;
import com.franco.demo.interfazservicio.IUsuarioService;



@Controller
@RequestMapping("/inicio")
public class Controlador {
    
    @Autowired
    private IUsuarioService service;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/form")
    public String iniciar(){
    
    return "inicio";
    }


    @PostMapping("/ingreso")
    public String ingresar(@RequestParam("correo") String correo, @RequestParam("contrasena") String contrasena, Model model) {
        // Buscar el usuario en la base de datos por correo y contraseña
        Usuario usuario = service.buscarPorEmail(correo);

        if (usuario != null && passwordEncoder.matches(contrasena, usuario.getContrasena())) {
            model.addAttribute("mensaje", "Hola " + correo + ", has iniciado sesión correctamente.");
            return "ingreso";
        } else {
            model.addAttribute("error", "Usuario o contraseña inválida. Inténtalo de nuevo.");
            return "inicio";
        }
    }

      @GetMapping("/registro")
    public String registro(){


        return "registrarse";
    }


     @GetMapping("/recupera")
    public String recupera(){


        return "recuperaContra";
    }

    
    
}

package com.franco.demo.interfazservicio;

import com.franco.demo.dominio.Usuario;

public interface IUsuarioService {
    public Usuario buscarPorEmailYCorreo(String email, String contrasena);

    public Usuario buscarPorEmail(String email);

}

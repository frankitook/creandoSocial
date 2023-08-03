package com.franco.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franco.demo.dominio.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    
    Usuario findByEmailAndContrasena(String email, String contrasena);

    Usuario findByEmail(String email);
}

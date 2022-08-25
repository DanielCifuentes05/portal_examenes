package com.sistema.examenes.repositorios;

import com.sistema.examenes.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);
}

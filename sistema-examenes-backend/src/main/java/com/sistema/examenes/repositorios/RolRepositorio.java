package com.sistema.examenes.repositorios;

import com.sistema.examenes.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepositorio extends JpaRepository<Rol,Long> {
}

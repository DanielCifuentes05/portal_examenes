package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioServicio {

    public Usuario guardarUsuario(Usuario usuario , Set<UsuarioRol> usuarioRoles) throws Exception;
}

package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Rol;
import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.entidades.UsuarioRol;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServicioImplTest {

    @Test
    void guardarUsuario(){


        Usuario usuario = new Usuario();

        usuario.setNombre("Daniel");
        usuario.setApellido("apellido");
        usuario.setUsername("daniel");
        usuario.setPassword("123");
        usuario.setEmail("daniel@email.com");
        usuario.setTelefono("313131313");
        usuario.setPerfil("foto.png");

        Rol rol = new Rol();
        rol.setRolId(1L);
        rol.setNombre("ADMIN");

        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();

        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);
        usuarioRoles.add(usuarioRol);

        //Usuario usuarioGuardado =

    }

}
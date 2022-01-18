package com.example.atividadejpateste;

import com.example.atividadejpateste.entity.Usuario;
import com.example.atividadejpateste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeJpaTesteApplication {

    @Autowired
    private UsuarioService usuarioService;

    public void persisteUsuario() {
        Usuario usuario = Usuario.builder()
                .nome("Nathan")
                .build();

        usuarioService.salvar(usuario);
    }

    @Override
    public void run(String... args) throws Exception {
        persisteUsuario();
    }

    public static void main(String[] args) {

        SpringApplication.run(AtividadeJpaTesteApplication.class, args);
    }

}

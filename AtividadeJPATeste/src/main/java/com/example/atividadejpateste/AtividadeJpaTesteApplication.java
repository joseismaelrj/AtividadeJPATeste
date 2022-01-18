package com.example.atividadejpateste;

import com.example.atividadejpateste.entity.Endereco;
import com.example.atividadejpateste.entity.Usuario;
import com.example.atividadejpateste.service.EnderecoService;
import com.example.atividadejpateste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeJpaTesteApplication implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private EnderecoService enderecoService;

    public void persisteUsuario() {
        Usuario usuario = Usuario.builder()
                .nome("Nathan")
                .build();

        this.usuarioService.salvar(usuario);
    }

    public void persisteEndereco() {

        Usuario usuario = this.usuarioService.obter(3L);

        Endereco endereco = Endereco.builder()
                .bairro("Morumbi")
                .cidade("Sao Paulo")
                .complemento("próximo a paraisópolis")
                .estado("SP")
                .numero(10)
                .rua("Rua do Beco")
//                .usuario(usuario)
                .build();

        this.enderecoService.salvar(endereco);
    }


    @Override
    public void run(String... args) throws Exception {
//        persisteUsuario();
        persisteEndereco();
    }

    public static void main(String[] args) {

        SpringApplication.run(AtividadeJpaTesteApplication.class, args);
    }

}

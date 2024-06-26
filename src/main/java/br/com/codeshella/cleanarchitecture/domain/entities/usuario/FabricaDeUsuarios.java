package br.com.codeshella.cleanarchitecture.domain.entities.usuario;

import br.com.codeshella.cleanarchitecture.domain.entities.evento.Endereco;

import java.time.LocalDate;

public class FabricaDeUsuarios {

    private Usuario usuario;

    public Usuario criarUsuario(String cpf, String nome, LocalDate nascimento) {
        this.usuario = new Usuario(cpf, nome, nascimento, "");
        return this.usuario;
    }

    public Usuario incluiEndereco(String cep, Integer numero, String complemento) {
        this.usuario.setEndereco(new Endereco(cep, numero, complemento));
        return this.usuario;
    }


}

package org.oo.servico;

import org.oo.modelo.usuario.Usuario;
import modelo.util.Cpf;

import java.util.Optional;

public class ServicoUsuario {
    private Usuario usuario;
    public boolean cadastrarUsuario(String nome, String cpf){
        Optional<Cpf> optCpf = Cpf.getInstance(cpf);
        if(optCpf.isPresent()){
            Cpf cpfInstance = optCpf.get();
            usuario = new Usuario(nome, cpfInstance);
            //guardar usuário em um mapa, por exemplo
            return true;
        }
        return false;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}

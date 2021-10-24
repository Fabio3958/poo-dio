package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{




    private List<Endereco> enderecos;

    public Endereco endereco;

    public void addEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo!");
        }

        if (endereco.cep == null) {
            throw new NullPointerException("Cep não pode ser nulo!");
        }

        getEndereco().add(endereco);
    }

    private List<Endereco> getEndereco() {
        return enderecos;
    }
}

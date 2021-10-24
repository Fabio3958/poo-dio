package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartao {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "18260-000";

        Cliente cliente = new Cliente();


        cliente.addEndereco(endereco);

    }

}

package poo.model;

public class Pessoa {

    public enum TipoPessoa {FISICA, JURIDICA};

    public int codigo;
    public String nome;
    public String documento;
    public TipoPessoa tipoPessoa;

}

package poo.model;

public class Pessoa {

    private static final int tamanhoCpf = 11;
    private static final int tamanhoCnpj = 14;

    public enum TipoPessoa {FISICA, JURIDICA};

    public int codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipoPessoa;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }

        if (documento.length() == tamanhoCpf){
            setDocumento(documento, tipoPessoa = TipoPessoa.FISICA);
        }
        else if (documento.length() == tamanhoCnpj){
            setDocumento(documento, tipoPessoa = TipoPessoa.JURIDICA);

        }
        else{
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        }
        this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipoPessoa){

        this.documento = documento;
        this.tipoPessoa = tipoPessoa;
    }

    public TipoPessoa getTipoPessoa(){
        return tipoPessoa;
    }
}

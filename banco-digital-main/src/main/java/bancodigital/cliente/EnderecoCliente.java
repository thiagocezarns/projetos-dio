package bancodigital.cliente;

public class EnderecoCliente {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public EnderecoCliente(String cep, String logradouro, String numero, String complemento, String bairro, String cidade, String estado) {
        try {
            this.setCep(cep);
            this.setLogradouro(logradouro);
            this.setNumero(numero);
            this.setComplemento(complemento);
            this.setBairro(bairro);
            this.setCidade(cidade);
            this.setEstado(estado);

        } catch (Exception e) {
            throw new InvalidAttributeValueException("O valor de um atributo não pode ser null.");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        checarValor(cep, "cep");
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        checarValor(logradouro, "logradouro");
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        checarValor(numero, "numero");
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        checarValor(bairro, "bairro");
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        checarValor(cidade, "cidade");
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        checarValor(estado, "estado");
        this.estado = estado;
    }

    private void checarValor(String valor, String atributo) {
        if(valor.isBlank()) {
            throw new InvalidAttributeValueException("O atributo "+ atributo +" não pode conter apenas espaços em branco.");
        }
        if(valor.isEmpty()) {
            throw new InvalidAttributeValueException("O atributo "+ atributo +" não pode conter um valor vazio.");
        }
    }
}

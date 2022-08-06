package modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Frete implements EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_frete")
    private Integer codigo;

    @ManyToOne
    @JoinColumn(name = "codigo_cidade", nullable = false)
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente", nullable = false)
    private Cliente cliente;

    @Column(length = 30)
    private String descricao;

    @Column(precision = 4)
    private Float peso;

    @Column(precision = 4)
    private Float valor;



    public Frete() {}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getValor() {
        return valor;
    }

    @Override
    public Integer getId() {
        return getCodigo();
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Frete)) return false;
        Frete frete = (Frete) o;
        return getCodigo().equals(frete.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}

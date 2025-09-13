package ArquivoCSV;

import java.util.Objects;

public class Conta implements Comparable<Conta> {
    private String id;
    private String nomeTitular;
    private String tipo;
    private Double saldo;

    public Conta(String id, String nomeTitular, String tipo, Double saldo) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        return Objects.equals(id, other.getId());
    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.id.compareTo(outraConta.getId());
    }

    @Override
    public String toString() {
        return id + ", " + nomeTitular + ", " + tipo + ", " + saldo;
    }
}
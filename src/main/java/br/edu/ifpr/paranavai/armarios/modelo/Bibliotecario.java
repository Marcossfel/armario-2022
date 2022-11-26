package br.edu.ifpr.paranavai.armarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_bibliotecario")
public class Bibliotecario extends Pessoa {

    private String siape;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    public Bibliotecario() {
    }

    public Bibliotecario(String siape) {
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + " nome=" + nome + '}';
    }

}

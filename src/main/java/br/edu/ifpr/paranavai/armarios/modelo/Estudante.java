package br.edu.ifpr.paranavai.armarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estudante")
public class Estudante extends Pessoa {

    @Column(name = "ra", unique = true, nullable = false)
    private String ra;

    public Estudante() {
    }

    public Estudante(String ra) {
        this.ra = ra;

    }

    public Estudante(String nome, String email, String telefone, String ra) {
        super(nome, email, telefone);
        this.ra = ra;
    }
    

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

}

package br.edu.ifpr.paranavai.armarios.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "tb_estudante" , uniqueConstraints = { @UniqueConstraint(name = "estudante_unique",columnNames = {"nome","email","Ra","Telefone"})})
public class Estudante extends Pessoa implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_estudante", unique = true, nullable = false)
    private Integer estudanteId;

    @Column(name = "ra", unique = true, nullable = false)
    private String ra;


    public Estudante() {
    }

    public Estudante(String ra, String senha) {
        this.ra = ra;
       
    }

    public Estudante(String ra) {
        this.ra = ra;
    }

    public Estudante(String nome, String email, String telefone, String ra, String senha, boolean ativo) {
        super(nome, email, telefone, senha, ativo);
        this.ra = ra;
    }
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Object getPessoaId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    public Integer getEstudanteId() {
        return estudanteId;
    }

    public void setEstudanteId(Integer estudanteId) {
        this.estudanteId= estudanteId;
    }
}
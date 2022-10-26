package br.edu.ifpr.paranavai.armarios.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_localizacao")
public class Localizacao implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_localizacao", unique = true, nullable = false)
    private Integer localizacaoId;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    public Localizacao() {
    }

    public Localizacao(String nome) {
        this.nome = nome;
    }

    public Integer getLocalizacaoId() {
        return localizacaoId;
    }

    public void setLocalizacaoId(Integer localizacaoId) {
        this.localizacaoId = localizacaoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "localizacaoId=" + localizacaoId + ", nome=" + nome + '}';
    }

}

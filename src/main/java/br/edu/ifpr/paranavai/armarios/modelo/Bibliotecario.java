package br.edu.ifpr.paranavai.armarios.modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_bibliotecario")
public class Bibliotecario extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_bibliotecario", unique = true, nullable = false)
    private Integer bibliotecarioId;
    
    @Column(name = "siape", nullable = false, length = 100)
    private String siape;
    
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    
    @Column(name = "telefone", nullable = false, length = 100)
    private String telefone;
    
    @Column(name = "senha", nullable = false, length = 100)
    private String senha;
     
    @Column(name = "ativo", unique = true, nullable = false, length = 100)
    private boolean ativo;
    
    @Column(name = "dataAtualizacao", nullable = false, length = 100)
    private Date dataAtualizacao;
    
    @Column(name = "dataCriacao", nullable = false, length = 100)
    private Date dataCriacao;

    public Bibliotecario() {
    }

    public Bibliotecario(String siape, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
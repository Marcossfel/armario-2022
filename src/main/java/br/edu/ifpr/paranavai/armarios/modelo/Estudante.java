    package br.edu.ifpr.paranavai.armarios.modelo;


    import java.util.Date;
    import javax.persistence.Column;
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    import javax.persistence.Table;

    @Entity
    @Table(name= "tb_estudante")
    public class Estudante extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_estudante", unique = true, nullable = false)
    private Integer estudanteId;
    
    @Column(name = "ra", unique = true, nullable = false)
    private String ra;
    
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    
    @Column(name = "senha", nullable = false, length = 100)
    private String senha;
    
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    
    public Estudante() {
        
    }

    public Estudante(String ra, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}

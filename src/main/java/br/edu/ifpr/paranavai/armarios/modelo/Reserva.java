package br.edu.ifpr.paranavai.armarios.modelo;

import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reserva", unique = true, nullable = false)
    private Integer reservaId;
    
    //private Pessoa pessoa;
    //private Armario armario;
    
    @Column
    private Date dataHoraDevolucao;
    
    @Column
    private Date dataHoraEmprestimo;

    public Reserva() {
    }

    public Reserva(Pessoa pessoa, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        //this.pessoa = pessoa;
        //this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}

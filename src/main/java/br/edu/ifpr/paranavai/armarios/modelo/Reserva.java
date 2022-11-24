package br.edu.ifpr.paranavai.armarios.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reserva", unique = true, nullable = false)
    private Integer reservaId;

    @Column(name = "data_hora_emprestimo", nullable = false)
    @CreationTimestamp
    private Date dataHoraEmprestimo;

    @Column(name = "data_hora_devolucao")
    private Date dataHoraDevolucao;
    
    @Column(name = "data_criacao", nullable = false)
    @CreationTimestamp
    private Date dataCriacao;

    @Column(name = "data_atualizacao", nullable = false)
    @UpdateTimestamp
    private Date dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "id_armario")
    private Armario armario;

    @ManyToOne
    @JoinColumn(name = "id_estudante")
    private Estudante estudante;

    public Reserva() {
    }

    public Reserva(Date dataHoraEmprestimo, Date dataHoraDevolucao, Armario armario, Estudante estudante) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.armario = armario;
        this.estudante = estudante;
        
    }
    
    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Date getDataHoraEmprestimo() {
        return dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(Date dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return "Reserva{" + "reservaId=" + reservaId + ", dataHoraEmprestimo=" + dataHoraEmprestimo+ ",dataHoraDevolucao=" + dataHoraDevolucao+
                ",armario=" + armario+ ", estudante=" + estudante+ '}';
    }

}
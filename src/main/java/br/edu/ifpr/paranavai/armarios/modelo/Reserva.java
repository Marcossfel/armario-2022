package br.edu.ifpr.paranavai.armarios.modelo;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_Reserva")
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reserva", unique = true, nullable = false)
    private Integer reservaId;
    
    @Column(name = "estudante", nullable = false, length = 100) 
    private Estudante estudante;
    
    @Column(name = "armario", nullable = false, length = 100)
    private Armario armario;
    
    @Column(name = "dataDevolucao", nullable = false, length = 100)
    private Date dataDevolucao;
    
    @Column(name = "horaDevolucao", nullable = false, length = 100)
    private Date horaDevolucao;
    
    @Column(name = "dataEmprestimo", nullable = false, length = 100)
    private Date dataEmprestimo;
    
    @Column(name = "horaEmprestimo", nullable = false, length = 100)
    private Date horaEmprestimo;
   

    
    public Reserva() {
    
    }
    public Reserva(Estudante estudante, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        this.estudante = estudante;
        this.armario = armario;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
    public String getDataDevolucaoFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataDevolucao);
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getHoraDevolucao() {
        return horaDevolucao;
    }
     public String getHoraDevolucaoFormatada(){
        return new SimpleDateFormat("HH:mm").format(dataDevolucao);
    }

    public void setHoraDevolucao(Date horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    
     public String getDataEmprestimoFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataEmprestimo);
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getHoraEmprestimo() {
        return horaEmprestimo;
    }
    public String getHoraEmprestimoFormatada(){
        return new SimpleDateFormat("HH:mm").format(dataEmprestimo);
    }

    public void setHoraEmprestimo(Date horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

   
}

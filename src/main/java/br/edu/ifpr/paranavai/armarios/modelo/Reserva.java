package br.edu.ifpr.paranavai.armarios.modelo;
import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Reserva {
    private Estudante estudante;
    private Armario armario;
    private Date dataDevolucao;
    private Date horaDevolucao;
    private Date dataEmprestimo;
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

package br.edu.ifpr.paranavai.armarios.modelo;
public class Armario {
    private String numero;
    private boolean status;
    private String observacoes;

    public Armario() {
    }

    public Armario(String numero, boolean status, String observacoes) {
        this.numero = numero;
        this.status = status;
        this.observacoes = observacoes;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}

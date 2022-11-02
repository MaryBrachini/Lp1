package br.comAvaliancaoLP1.dto;

public class CurriculoDTO {

    private String nome, cpf, email, exp, resumo, esc;
    private int id_curriculo, tell;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getEsc() {
        return esc;
    }

    public void setEsc(String esc) {
        this.esc = esc;
    }

    public int getId_curriculo() {
        return id_curriculo;
    }

    public void setId_curriculo(int id_curriculo) {
        this.id_curriculo = id_curriculo;
    }

    public int getTell() {
        return tell;
    }

    public void setTell(int tell) {
        this.tell = tell;
    }
}

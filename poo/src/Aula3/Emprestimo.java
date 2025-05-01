package Aula3;

import java.util.*;

class Emprestimo {
    private int id;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private int renovacoes;
    private Livro livro;
    private Usuario usuario;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDataEmprestimo() { return dataEmprestimo; }
    public void setDataEmprestimo(Date dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

    public Date getDataDevolucao() { return dataDevolucao; }
    public void setDataDevolucao(Date dataDevolucao) { this.dataDevolucao = dataDevolucao; }

    public int getRenovacoes() { return renovacoes; }
    public void setRenovacoes(int renovacoes) { this.renovacoes = renovacoes; }

    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}


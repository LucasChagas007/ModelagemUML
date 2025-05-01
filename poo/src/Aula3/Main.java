package Aula3;

import java.util.*;

public class Main {

    public static void realizarEmprestimo(Usuario usuario, Livro livro) {
        livro.setEstado("emprestado");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataEmprestimo(new Date());
        emprestimo.setRenovacoes(0);
        System.out.println("Empréstimo realizado com sucesso.");
    }

    public static void reservarLivro(Usuario usuario, Livro livro) {
        livro.setEstado("reservado");
        System.out.println("Reserva realizada com sucesso.");
    }

    public static void renovarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getRenovacoes() < 1) {
            Calendar c = Calendar.getInstance();
            c.setTime(emprestimo.getDataDevolucao());
            c.add(Calendar.DATE, 7);
            emprestimo.setDataDevolucao(c.getTime());
            emprestimo.setRenovacoes(emprestimo.getRenovacoes() + 1);
            System.out.println("Empréstimo renovado.");
        } else {
            System.out.println("Renovação não permitida.");
        }
    }

    public static void devolverLivro(Emprestimo emprestimo) {
        emprestimo.getLivro().setEstado("disponível");
        System.out.println("Livro devolvido com sucesso.");
    }

    public static void buscarLivros(List<Livro> livros, String criterio, String valor) {
        for (Livro livro : livros) {
            if ((criterio.equals("titulo") && livro.getTitulo().equalsIgnoreCase(valor)) ||
                (criterio.equals("autor") && livro.getAutor().equalsIgnoreCase(valor)) ||
                (criterio.equals("categoria") && livro.getCategoria().equalsIgnoreCase(valor))) {
                System.out.println("Livro encontrado: " + livro.getTitulo());
            }
        }
    }

    public static void gerarRelatorioMensal() {
        System.out.println("Relatório mensal gerado.");
    }

    public static void main(String[] args) {
        // Inicialização para testes
        Usuario aluno = new Aluno();
        aluno.setNome("João");

        Livro livro = new Livro();
        livro.setTitulo("Java Completo");
        livro.setEstado("disponível");

        realizarEmprestimo(aluno, livro);
    }
}
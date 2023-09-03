package controller;

import model.Student;
import model.Book;

import java.util.HashMap;
import java.util.Map;

public class LibraryController {
    private Map<Book, Student> emprestimos = new HashMap<>();

    public void emprestarLivro(Book livro, Student aluno) {
        if (livro.getCopiasDisponiveis() > 0 && !emprestimos.containsKey(livro)) {
            livro.setCopiasDisponiveis(livro.getCopiasDisponiveis() - 1);
            emprestimos.put(livro, aluno);
            System.out.println("Livro emprestado com sucesso para " + aluno.getNome());
        } else {
            System.out.println("Livro indisponível para empréstimo");
        }
    }

    public void devolverLivro(Book livro) {
        if (emprestimos.containsKey(livro)) {
            Student aluno = emprestimos.remove(livro);
            livro.setCopiasDisponiveis(livro.getCopiasDisponiveis() + 1);
            System.out.println("Livro devolvido por " + aluno.getNome());
        } else {
            System.out.println("O livro não estava emprestado");
        }
    }

    public void registrarLivro(String titulo, String autor, String isbn, int quantidade) {
        Book livro = new Book(titulo, autor, isbn, quantidade);
        System.out.println("Livro registrado: " + livro.getTitulo());
    }
}

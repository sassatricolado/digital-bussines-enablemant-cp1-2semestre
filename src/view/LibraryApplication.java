package view;

import controller.LibraryController;
import model.Student;
import model.Book;

public class LibraryApplication {
    public static void main(String[] args) {
        LibraryController controller = new LibraryController();

        Student aluno1 = new Student("Samuel", 93789);
        Student aluno2 = new Student("Aluno 2", 92222);

        Book livro = new Book("Fogo e Sangue", "GRR Martin", "44000231231", 1);

        controller.registrarLivro("Cristianismo Puro e Simples", "CS Lewis", "44000205831", 1);

        livro.addObserver(aluno1);
        livro.addObserver(aluno2);

        controller.emprestarLivro(livro, aluno1);
        controller.devolverLivro(livro);

        // Remover aluno1 como observador do livro
        livro.removeObserver(aluno1);

        controller.emprestarLivro(livro, aluno2);
    }
}


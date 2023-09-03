package model;

public class Student implements Observer {
    private String nome;
    private int numeroMatricula;

    public Student(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void update(Book livro) {
        System.out.println("Notificação para " + nome + ": O livro '" + livro.getTitulo() + "' está disponível para empréstimo novamente.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}

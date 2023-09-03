package model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Subject {
    private String titulo;
    private String autor;
    private String isbn;
    private int copiasDisponiveis;
    private List<Observer> observers = new ArrayList<>();

    public Book(String titulo, String autor, String isbn, int copiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        if (this.copiasDisponiveis != copiasDisponiveis) {
            this.copiasDisponiveis = copiasDisponiveis;
            notifyObservers();
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    // Restante do código da classe Livro
}

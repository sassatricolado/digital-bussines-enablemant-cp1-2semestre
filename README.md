# Biblioteca-Design-Patterns
# Padrão Observer

Projeto feito em Java, sendo ele um software de gerenciamento de uma biblioteca, que inclui a implementação do Design Pattern Observer.

## Design Pattern Observer

Eles são objetos que desejam ser notificados quando o estado do sujeito muda. Os observadores implementam uma interface (ou abstração) que define um método de atualização. Quando o sujeito notifica os observadores, cada observador é chamado automaticamente através desse método de atualização para responder à mudança de estado do sujeito.

No contexto deste projeto, o padrão Observer é usado para gerenciar a relação entre livros e alunos. Quando um livro é emprestado e devolvido, os alunos observadores são notificados automaticamente sobre a disponibilidade do livro novamente.

## Uso do Padrão Observer

O padrão Observer é implementado nas classes `Book`, que atua como subject, e `Student`, que atua como o observer. A relação entre eles é gerenciada pelo controlador `LibraryController`.

- A classe `Book` implementa a interface Subject e mantém uma lista de observadores (alunos) que são notificados quando o estado do livro muda.
- A classe `Student` implementa a interface Observer e recebe notificações sobre as mudanças nos livros.

A classe `LibraryController` gerencia o empréstimo, devolução e registro de livros, além de conectar os observadores aos sujeitos.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

- Registro de livros.
- Empréstimo de livros para alunos, garantindo que cada livro seja emprestado apenas uma vez.
- Devolução de livros por alunos.
- Implementação do padrão de projeto Observer para notificar alunos quando um livro estiver disponível para empréstimo novamente.

## Como rodar o projeto no seu ambiente

1. Clone este repositório.
2. Ter o Java JDK instalado em sua máquina.
3. Vá até a pasta `src/main/java` no terminal.
4. Compile os arquivos `.java` usando o comando `javac model/*.java controller/*.java view/*.java`.
5. Execute o aplicativo usando o comando `java view.LibraryApplication`.

public class App {
    public static void main(String[] args) {
        // Criar livros
        Livro livro1 = new Livro("Aventuras na Biblioteca");
        Livro livro2 = new Livro("O Mistério do Livro Desaparecido");

        // Criar clientes
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        // Adicionar clientes como observadores dos livros
        livro1.adicionarObserver(cliente1);
        livro1.adicionarObserver(cliente2);
        livro2.adicionarObserver(cliente2);

        // Adicionar um novo livro e notificar os observadores
        livro1.adicionarLivro();
        livro2.adicionarLivro();
    }
}

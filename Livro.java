public class Livro extends LivroSubject {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Adicionar um novo livro à biblioteca
    public void adicionarLivro() {
        // Lógica para adicionar livro à biblioteca

        // Notificar os observadores
        notificarObservers();
    }
}

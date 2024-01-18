public class Cliente implements ClienteObserver {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(LivroSubject livro) {
        System.out.println("Cliente " + nome + " notificado sobre o novo livro: " + livro.getTitulo());
    }
}

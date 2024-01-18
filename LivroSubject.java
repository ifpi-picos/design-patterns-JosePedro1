import java.util.ArrayList;
import java.util.List;

public abstract class LivroSubject {
    private List<ClienteObserver> observers = new ArrayList<>();

    public void adicionarObserver(ClienteObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(ClienteObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (ClienteObserver observer : observers) {
            observer.atualizar(this);
        }
    }

    public abstract String getTitulo();
}

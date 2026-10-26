package service;
import java.util.ArrayList;
import java.util.List;
import model.Dispositivo;

public class GerenciadorDispositivos {

    private final List<Dispositivo> dispositivos = new ArrayList<>();

    public void adicionar(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public List<Dispositivo> listarTodos() {
        return new ArrayList<>(dispositivos);
    }

    public Dispositivo buscarPorCodigo(int codigo) {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getCodigo() == codigo) {
                return dispositivo;
            }
        }
        return null;
    }

    public boolean estaVazio() {
        return dispositivos.isEmpty();
    }
}
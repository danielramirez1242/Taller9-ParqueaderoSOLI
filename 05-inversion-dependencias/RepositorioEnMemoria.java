import java.util.ArrayList;
import java.util.List;

// Paso 5: implementacion en memoria para probar sin base de datos
public class RepositorioEnMemoria implements RepositorioCobros {
    private List<String> registros = new ArrayList<>();

    @Override
    public void insertar(String placa, double cobro) {
        String fila = placa + " -> $" + String.format("%,.0f", cobro);
        registros.add(fila);
        System.out.println("[Memoria] Guardado en RAM: " + fila);
    }

    public List<String> getRegistros() {
        return registros;
    }
}

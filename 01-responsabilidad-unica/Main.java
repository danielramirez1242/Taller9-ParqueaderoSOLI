import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("KLM321", "Camila Rojas", "MENSUAL", 180000, 0, 0));
        vehiculos.add(new Vehiculo("XYZ45F", "Andres Mora", "MINUTOS", 0, 80, 1500));
        vehiculos.add(new Bicicleta("BIC-07", "Valentina Diaz", 40000));

        GestorParqueadero gestor = new GestorParqueadero();
        gestor.cerrarMes(vehiculos); // Paso 1
    }
}

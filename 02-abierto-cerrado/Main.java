import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new VehiculoMensual("KLM321", "Camila Rojas", 180000)); // Paso 2
        vehiculos.add(new VehiculoPorMinutos("XYZ45F", "Andres Mora", 80, 1500)); // Paso 2
        vehiculos.add(new VehiculoPorDia("DIA999", "Carlos Perez", 5, 25000)); // Paso 2
        vehiculos.add(new Bicicleta("BIC-07", "Valentina Diaz", 40000));

        GestorParqueadero gestor = new GestorParqueadero();
        gestor.cerrarMes(vehiculos);

        // Paso 2: bloque que provoca el error del paso L (Bicicleta lanza excepcion)
        /*
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getPropietario() + " puntos: " + v.calcularPuntos());
        }
        */
    }
}

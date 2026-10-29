import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        VehiculoMensual mensual = new VehiculoMensual("KLM321", "Camila Rojas", 180000);
        vehiculos.add(mensual);
        vehiculos.add(new VehiculoPorMinutos("XYZ45F", "Andres Mora", 80, 1500));
        vehiculos.add(new VehiculoPorDia("DIA999", "Carlos Perez", 5, 25000));
        vehiculos.add(new Bicicleta("BIC-07", "Valentina Diaz", 40000));

        // Paso 5: se inyecta RepositorioEnMemoria para probar sin base de datos
        RepositorioCobros repo = new RepositorioEnMemoria();
        GestorParqueadero gestor = new GestorParqueadero(repo);
        gestor.cerrarMes(vehiculos);

        System.out.println("Puntos de " + mensual.getPropietario() + ": " + mensual.calcularPuntos());
    }
}

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

        GestorParqueadero gestor = new GestorParqueadero();
        gestor.cerrarMes(vehiculos);

        // Paso 3: solo se consultan puntos sobre tipos Fidelizable
        System.out.println("Puntos de " + mensual.getPropietario() + ": " + mensual.calcularPuntos());
    }
}

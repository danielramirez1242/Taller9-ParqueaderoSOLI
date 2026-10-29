import java.util.List;

// Paso 1: clase dedicada unicamente a exportar el reporte CSV
public class ExportadorCSV {

    public String exportar(List<Vehiculo> vehiculos, GestorParqueadero gestor) {
        StringBuilder sb = new StringBuilder("placa;propietario;cobro\n");

        for (Vehiculo v : vehiculos) {
            sb.append(v.getPlaca()).append(";")
              .append(v.getPropietario()).append(";")
              .append(gestor.calcularCobro(v)).append("\n");
        }

        return sb.toString();
    }
}

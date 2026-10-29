import java.util.List;

public class GestorParqueadero {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportador = new ExportadorCSV(); // Paso 1
    private NotificadorSMS notificador = new NotificadorSMS(); // Paso 1

    public double calcularCobro(Vehiculo v) {
        switch (v.getTipo()) {
            case "MENSUAL": return v.getValorMensualidad();
            case "MINUTOS": return v.getMinutos() * v.getTarifaMinuto();
            default: throw new IllegalArgumentException("Tipo desconocido: " + v.getTipo());
        }
    }

    public void guardar(Vehiculo v, double cobro) {
        repositorio.insertar(v.getPlaca(), cobro);
    }

    // Paso 1: el gestor conserva el calculo y coordina cerrarMes
    public void cerrarMes(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            double cobro = calcularCobro(v);
            guardar(v, cobro);
            notificador.enviarRecibo(v, cobro);
        }
        System.out.println(exportador.exportar(vehiculos, this));
    }
}

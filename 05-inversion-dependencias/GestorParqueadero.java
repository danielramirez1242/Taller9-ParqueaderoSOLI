import java.util.List;

public class GestorParqueadero {
    private RepositorioCobros repositorio; // Paso 5: depende de la interfaz, no de la clase concreta
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorSMS notificador = new NotificadorSMS();

    // Paso 5: el repositorio se recibe por el constructor
    public GestorParqueadero(RepositorioCobros repositorio) {
        this.repositorio = repositorio;
    }

    public double calcularCobro(Vehiculo v) {
        return v.calcularCobro();
    }

    public void guardar(Vehiculo v, double cobro) {
        repositorio.insertar(v.getPlaca(), cobro);
    }

    public void cerrarMes(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            double cobro = calcularCobro(v);
            guardar(v, cobro);
            notificador.enviarRecibo(v, cobro);
        }
        System.out.println(exportador.exportar(vehiculos, this));
    }
}

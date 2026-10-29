public abstract class Vehiculo implements ServicioParqueadero {
    protected String placa;
    protected String propietario;
    protected double valorMensualidad;
    protected int minutos;
    protected int lavados;

    public Vehiculo(String placa, String propietario, double valorMensualidad) {
        this.placa = placa;
        this.propietario = propietario;
        this.valorMensualidad = valorMensualidad;
    }

    public String getPlaca()       { return placa; }
    public String getPropietario() { return propietario; }

    public abstract double calcularCobro();

    // Paso 3: se elimina calcularPuntos() de Vehiculo para que ningun subtipo herede algo que no cumple

    public void registrarMinutos(int minutos) { this.minutos += minutos; }
    public double calcularSeguro()            { return valorMensualidad * 0.02; }
    public void solicitarLavados(int cantidad) { this.lavados += cantidad; }
}

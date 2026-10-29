// Paso 2: Vehiculo pasa a ser abstracta y delega el calculo de cobro a las subclases
public abstract class Vehiculo implements ServicioParqueadero {
    protected String placa;
    protected String propietario;
    protected double valorMensualidad;
    protected int minutos;
    protected int lavados;

    public Vehiculo(String placa, String propietario, double valorMensualidad) { // Paso 2
        this.placa = placa;
        this.propietario = propietario;
        this.valorMensualidad = valorMensualidad;
    }

    public String getPlaca()       { return placa; }
    public String getPropietario() { return propietario; }

    public abstract double calcularCobro(); // Paso 2: reemplaza el switch por polimorfismo

    public int calcularPuntos() {
        return (int) (valorMensualidad / 10000);
    }

    public void registrarMinutos(int minutos) { this.minutos += minutos; }
    public double calcularSeguro()            { return valorMensualidad * 0.02; }
    public void solicitarLavados(int cantidad) { this.lavados += cantidad; }
}

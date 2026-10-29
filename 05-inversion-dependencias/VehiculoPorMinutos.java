// Paso 2: subclase para vehiculos con cobro por minutos
public class VehiculoPorMinutos extends Vehiculo {
    private double tarifaMinuto;

    public VehiculoPorMinutos(String placa, String propietario, double tarifaMinuto, int minutos) {
        super(placa, propietario, 0);
        this.tarifaMinuto = tarifaMinuto;
        this.minutos = minutos;
    }

    @Override
    public double calcularCobro() {
        return minutos * tarifaMinuto;
    }
}

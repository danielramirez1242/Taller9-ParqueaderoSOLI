// Paso 2: subclase para vehiculos con pago mensual
public class VehiculoMensual extends Vehiculo {

    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario, valorMensualidad);
    }

    @Override
    public double calcularCobro() {
        return valorMensualidad;
    }
}

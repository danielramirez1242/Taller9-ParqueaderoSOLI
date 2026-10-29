// Paso 3: VehiculoMensual implementa Fidelizable
public class VehiculoMensual extends Vehiculo implements Fidelizable {

    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario, valorMensualidad);
    }

    @Override
    public double calcularCobro() {
        return valorMensualidad;
    }

    @Override
    public int calcularPuntos() { // Paso 3
        return (int) (valorMensualidad / 10000);
    }
}

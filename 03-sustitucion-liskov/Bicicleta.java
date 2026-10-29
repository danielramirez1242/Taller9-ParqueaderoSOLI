// Paso 3: Bicicleta extiende Vehiculo directamente y no promete calcularPuntos()
public class Bicicleta extends Vehiculo {

    public Bicicleta(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario, valorMensualidad);
    }

    @Override
    public double calcularCobro() { // Paso 3
        return valorMensualidad;
    }
}

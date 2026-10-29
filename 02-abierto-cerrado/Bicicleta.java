public class Bicicleta extends VehiculoMensual { // Paso 2

    public Bicicleta(String codigo, String propietario, double valorMensualidad) {
        super(codigo, propietario, valorMensualidad); // Paso 2
    }

    @Override
    public int calcularPuntos() {
        throw new UnsupportedOperationException(
            "Las bicicletas no acumulan puntos de fidelidad");
    }
}

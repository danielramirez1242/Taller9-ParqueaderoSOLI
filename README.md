Taller 9: Principios SOLID en Java

Estructura de carpetas con la refactorización paso a paso de un sistema de parqueadero para aplicar los cinco principios SOLID.

Versiones del proyecto

* 00-inicio: Código base que viola los principios a propósito.
* 01-responsabilidad-unica: Se sacaron la exportación a CSV y el envío de SMS fuera de `GestorParqueadero`, creándose `ExportadorCSV` y `NotificadorSMS`.
* 02-abierto-cerrado: Se eliminó el `switch` de tipos. `Vehiculo` pasa a ser abstracta con subclases por cada modelo de cobro, añadiendo `VehiculoPorDia` sin modificar el código anterior.
* 03-sustitucion-liskov: Se creó la interfaz `Fidelizable`. `Bicicleta` extiende directamente de `Vehiculo` para evitar heredar comportamientos inválidos.
* 04-segregacion-interfaces: Se dividió `ServicioParqueadero` en interfaces específicas (`ConMinutos`, `ConSeguro`, `ConLavado`), permitiendo que `Casillero` implemente solo lo necesario.
* 05-inversion-dependencias: Se añadió la interfaz `RepositorioCobros`. `GestorParqueadero` recibe el repositorio por constructor e incluye una implementación en memoria.

Ejecución

Para probar cualquier carpeta desde la terminal:

```bash
cd 00-inicio
javac *.java
java Main

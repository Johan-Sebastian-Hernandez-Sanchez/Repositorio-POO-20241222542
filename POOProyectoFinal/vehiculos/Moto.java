package POOProyectoFinal.vehiculos;

import POOProyectoFinal.vehiculos.Moto;
public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion();
        if (tieneSidecar) {
            this.cuotaMesGaraje *= 1.5; // Incremento del 50% si tiene sidecar
        }
    }

    @Override
    protected void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
        if (tieneSidecar) {
            this.impuestoCirculacion *= 1.1; // Incremento del 10% si tiene sidecar
        }
    }
}
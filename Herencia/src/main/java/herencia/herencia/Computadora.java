package herencia.herencia;

import java.util.*;
class Computadora extends DispositivoElectronico {
    private Microprocesador cpu;
    private long ramMB;

    public Computadora(String fabricante, String numeroSerie, String marca, String nombre, float costo, Microprocesador cpu, long ramMB) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    @Override
    public ArrayList<ComponenteElectronico> getComponentes() {
        // Implementación opcional, depende de la lógica de tu programa
        return null;
    }

    @Override
    public void agregarComponente(ComponenteElectronico componente) {
        // Implementación opcional, depende de la lógica de tu programa
    }

    @Override
    public void quitarComponente(ComponenteElectronico componente) {
        // Implementación opcional, depende de la lógica de tu programa
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "cpu=" + cpu +
                ", ramMB=" + ramMB +
                "} " + super.toString();
    }
}
package herencia.herencia;
import java.util.*;
import java.util.ArrayList;
class Television extends DispositivoElectronico {
    private final Pantalla pantalla;

    public Television(String fabricante, String numeroSerie, String marca, String nombre, float costo, Pantalla pantalla) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla() {
        return pantalla;
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
        return "Television{" +
                "pantalla=" + pantalla +
                "} " + super.toString();
    }
}
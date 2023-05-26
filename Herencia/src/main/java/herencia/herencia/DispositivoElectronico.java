package herencia.herencia;

import java.util.ArrayList;

// Clase padre DispositivoElectronico

import java.util.ArrayList;

public class DispositivoElectronico {
    protected String fabricante;
    protected String numeroSerie;
    protected String marca;
    protected String nombre;
    protected float costo;

    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return new ArrayList<>(); // No hay componentes en el dispositivo base, devuelve una lista vacía
    }

    public void agregarComponente(ComponenteElectronico componente) {
        // Implementación vacía, ya que no se pueden agregar componentes en el dispositivo base
    }

    public void quitarComponente(ComponenteElectronico componente) {
        // Implementación vacía, ya que no se pueden quitar componentes en el dispositivo base
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" +
                "fabricante='" + fabricante + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", costo=" + costo +
                '}';
    }
}

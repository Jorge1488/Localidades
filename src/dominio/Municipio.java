package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private String nombre;
    private List<Localidad> localidades;

    // Constructor
    public Municipio(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }

    // Método para agregar una localidad
    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    // Método para contar el número total de habitantes
    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumeroDeHabitantes();
        }
        return totalHabitantes;
    }

    // Método toString
    @Override
    public String toString() {
        return "Municipio: " + nombre + ", Localidades: " + localidades.size();
    }
}


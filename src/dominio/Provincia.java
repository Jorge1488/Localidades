package dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Municipio> municipios;

    // Constructor
    public Provincia(String nombre) {
        this.nombre = nombre;
        this.municipios = new ArrayList<>();
    }

    // Método para agregar un municipio
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    // Método para contar el número total de habitantes en la provincia
    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes();
        }
        return totalHabitantes;
    }

    // Método toString
    @Override
    public String toString() {
        return "Provincia: " + nombre + ", Municipios: " + municipios.size();
    }
}


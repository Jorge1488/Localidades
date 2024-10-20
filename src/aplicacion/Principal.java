package aplicacion;

import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de la clase Localidad
        Localidad localidad = new Localidad("Localidad1", 5000);
        System.out.println(localidad);
        
        // Crear un municipio con localidades
        Municipio municipio = new Municipio("Municipio1");
        municipio.agregarLocalidad(localidad);
        municipio.agregarLocalidad(new Localidad("Localidad2", 3000));
        
        System.out.println(municipio);
        System.out.println("Total habitantes del municipio: " + municipio.contarHabitantes());
        
        // Crear una provincia con municipios
        Provincia provincia = new Provincia("Provincia1");
        provincia.agregarMunicipio(municipio);
        provincia.agregarMunicipio(new Municipio("Municipio2"));
        
        System.out.println(provincia);
        System.out.println("Total habitantes de la provincia: " + provincia.contarHabitantes());
    }
}


package cl.llanquihuetour.app;

import cl.llanquihuetour.exceptions.RutInvalidoException;
import cl.llanquihuetour.model.Direccion;
import cl.llanquihuetour.model.Guia;
import cl.llanquihuetour.model.Persona;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws RutInvalidoException {

        Direccion direccion1 = new Direccion("Av. Vespucio", "333", "Las Condes", "R. Metropolitana" );
        Direccion direccion2 = new Direccion("Antonio Varas", "1108", "Puerto Montt", "R. de Los Lagos" );
        Direccion direccion3 = new Direccion("Klenner", "833", "Puerto Varas", "R. de Los Lagos" );

        ArrayList<String> idiomas1 = new ArrayList<>();
        idiomas1.add("Español");
        idiomas1.add("Inglés");

        ArrayList<String> idiomas2 = new ArrayList<>();
        idiomas2.add("Portugués");
        idiomas2.add("Inglés");

        ArrayList<String> idiomas3 = new ArrayList<>();
        idiomas3.add("Alemán");
        idiomas3.add("Español");

        Persona persona1 = new Persona("1-9", "Jaime", "j@gmail.com", "11111111", direccion1 );
        Guia guia1 = new Guia("1-9", "Emilio Perez", "emilio@gmail.com", "22224444", direccion2, "Agencia Lagos del Sur", idiomas1);
        Guia guia2 = new Guia("5555555-5", "Javiera Lopez", "jlopez@gmail.com", "33333333", direccion3, "Patagonia Tour", idiomas2);
        Guia guia3 = new Guia("33333333-7", "Alberto Fernandez", "afernandez@gmail.com", "33333333", direccion3, "Patagonia Tour", idiomas3);

        guia2.agregarIdioma("Chino");

        System.out.println(persona1.toString());
        System.out.println(guia1.toString());
        System.out.println(guia2.toString());
        System.out.println(guia3.toString());
    }
}

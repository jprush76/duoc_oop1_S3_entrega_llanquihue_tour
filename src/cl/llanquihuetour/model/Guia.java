package cl.llanquihuetour.model;

import cl.llanquihuetour.exceptions.RutInvalidoException;

import java.util.ArrayList;

/**
 * Clase que representa a un Guía de Turismo
 * Extiende de la clase Persona y agrega 'agencia' e 'idiomas'
 */
public class Guia extends Persona {
    private String agencia;
    private ArrayList<String> idiomas;

    public Guia(String rut, String nombre, String email, String telefono, Direccion direccion, String agencia, ArrayList<String> idiomas) throws RutInvalidoException {
        super(rut, nombre, email, telefono, direccion);
        this.agencia = agencia;
        this.idiomas = idiomas;
    }

    // GETTERS
    public String getAgencia() { return agencia; }
    public ArrayList<String> getIdiomas() { return idiomas; }

    // SETTERS
    public void setAgencia(String agencia) { this.agencia = agencia; }
    public void setIdiomas(ArrayList<String> idiomas) { this.idiomas = idiomas; }

    /**
     * Agrega un nuevo idioma al Guia.
     * @param idioma
     */
    public void agregarIdioma(String idioma) { this.idiomas.add(idioma); }


    @Override
    public String toString() {
        String resultado = "\nGuía\n" + "====\n" +
                "{ rut='" + this.getRut() + "', "  +
                "nombre='" + this.getNombre() + "', " +
                "email='" + this.getEmail() + "', " +
                "telefono='" + this.getTelefono() + "', " +
                "agencia='" + agencia + "', " +
                "idiomas='" + idiomas + "', " +
                "direccion='" + this.getDireccion() + "'}";
        return resultado;
    }

}



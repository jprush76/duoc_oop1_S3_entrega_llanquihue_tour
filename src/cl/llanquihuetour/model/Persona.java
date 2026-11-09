package cl.llanquihuetour.model;

import cl.llanquihuetour.exceptions.RutInvalidoException;

/**
 * Clase que representa a una Persona
 * Contiene rut, nombre, email, teléfono y dirección
 */
public class Persona {
    private String rut;
    private String nombre;
    private String email;
    private String telefono;
    private Direccion direccion;

    public Persona(String rut, String nombre, String email, String telefono, Direccion direccion) throws RutInvalidoException {
        this.rut = validarRut(rut);
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // GETTERS
    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public Direccion getDireccion() { return direccion; }

    // SETTERS
    public void setRut(String rut) throws RutInvalidoException { this.rut = validarRut(rut); }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    private String validarRut(String rut) throws RutInvalidoException {
        if (!rut.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException("Formato de Rut no válido");
        }
        return rut;
    }

    @Override
    public String toString() {
        String resultado = "\nPersona\n" + "=======\n" +
                "{ rut='" + rut + "', "  +
                "nombre='" + nombre + "', " +
                "email='" + email + "', " +
                "telefono='" + telefono + "', " +
                "direccion='" + direccion + "'}";
        return resultado;
    }
}

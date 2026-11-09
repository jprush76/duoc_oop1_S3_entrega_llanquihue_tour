package cl.llanquihuetour.model;

/**
 * Clase que representa la dirección de una Persona
 * Contiene calle, número, comuna y region
 */
public class Direccion {
    private String calle;
    private String numero;
    private String comuna;
    private String region;

    public Direccion(String calle, String numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    // GETTERS
    public String getCalle() { return calle; }
    public String getNumero() { return numero; }
    public String getComuna() { return comuna; }
    public String getRegion() { return region; }

    // SETTERS
    public void setCalle(String calle) { this.calle = calle; }
    public void setNumero(String numero) { this.numero = numero; }
    public void setComuna(String comuna) { this.comuna = comuna; }
    public void setRegion(String region) { this.region = region; }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna + ", " + region;
    }
}


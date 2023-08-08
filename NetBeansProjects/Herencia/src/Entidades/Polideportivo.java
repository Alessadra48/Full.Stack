package Entidades;

/**
 *
 * @author Ale y Choy
 */
public class Polideportivo extends Edificio {

    protected String nombre;
    protected String tipoInstalacion;

    //Constructores
    public Polideportivo(String nombre, String tipoInstalacion, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    //Gatters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    //Métodos
    public double calcularSuperficie() {
        double superficie = 2 * (ancho * largo + ancho * alto + largo * alto);
        return superficie;
    }

    public double calcularVolumen() {
        double volumen = ancho * alto * largo;
        return volumen;
    }
    
    public String TipoInstalacion() {
        return tipoInstalacion;
    }
}
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fechaInicio = LocalDate.parse(fechaStringInicio, formatter);

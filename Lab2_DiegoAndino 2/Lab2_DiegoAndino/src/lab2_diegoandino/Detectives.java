//En esta clase se manejaran los detectives

package lab2_diegoandino;

/**
 *
 * @author diegoandino
 */

public class Detectives {
    
    private String nombre;
    private int edad; 
    private String nacionalidad;
    private int anlaborales;
    private int nivel;
    
    //aqui listo mis constructores

    public Detectives(String nombre) {
        this.nombre = nombre;
    } 

    public Detectives(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Detectives(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public Detectives(String nombre, int edad, String nacionalidad, int anlaborales) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.anlaborales = anlaborales;
    }

    public Detectives(String nombre, int edad, String nacionalidad, int anlaborales, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.anlaborales = anlaborales;
        this.nivel = nivel;
    }

    //metodos accesores y mutadores
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAnlaborales() {
        return anlaborales;
    }

    public void setAnlaborales(int anlaborales) {
        this.anlaborales = anlaborales;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    //metodos adminitrativos

    @Override
    public String toString() {
        return "Detectives{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", anlaborales=" + anlaborales + ", nivel=" + nivel + '}';
    }
   
}

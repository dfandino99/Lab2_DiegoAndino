//En esta clase se manejaran los casos

package lab2_diegoandino;

/**
 *
 * @author diegoandino
 */

public class Casos {
   private String lugar;
   private String descripcion;
   private String tipo;
   private String detective;
   private String estado;

   //aqui listo los constructores
   
    public Casos(String lugar) {
        this.lugar = lugar;
    }

    public Casos(String lugar, String descripcion) {
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    public Casos(String lugar, String descripcion, String tipo) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Casos(String lugar, String descripcion, String tipo, String detective) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detective = detective;
    }

    public Casos(String lugar, String descripcion, String tipo, String detective, String estado) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detective = detective;
        this.estado = estado;
    }
   
   //metodos accesores y mutuadores

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetective() {
        return detective;
    }

    public void setDetective(String detective) {
        this.detective = detective;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //metodos administrativos

    @Override
    public String toString() {
        return "Casos{" + "lugar=" + lugar + ", descripcion=" + descripcion + ", tipo=" + tipo + ", detective=" + detective + ", estado=" + estado + '}';
    }
   
}

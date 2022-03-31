/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * una Persona declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author josed
 */
public class Persona extends Servivo{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo    Mascota
     * privadas para solo acceder a ellas por medio 
     * de metodos de la misma clase
     */
    private Mascota mascota;
    /**
     * Constructor vacío
     */
    public Persona() {
    }
    /**
     * Constructor inicializado con las variables
     * @param mascota
     * @param nombre
     * @param edad 
     */
    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "mascota=" + mascota + '}';
    }
       
}

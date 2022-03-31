/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de
 * un Gato declaración de la herencia va a
 * heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author josed
 */
public class Gato extends Mascota{
    /**
     * Constructor vacío
     */
    public Gato() {
    }
    /**
     * Contructor inicializado con las variables
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    
    
   // public void 
            
    //public void 
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+ "Gato{" + '}';
    }
    
    
            
            
}

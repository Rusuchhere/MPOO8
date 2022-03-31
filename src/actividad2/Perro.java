/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * un Perro declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author josed
 */
public class Perro extends Mascota{
    /**
     * Zona de atributos (Encapsulamiento)
     * variable de tipo boolean 
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private boolean colaCortada;
    /**
     * Constructor vacío
     */
    public Perro() {
    }
    /**
     * Constructor inicializado con las variables
     * @param colaCortada
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }

    public boolean isColaCortada() {
        return colaCortada;
    }

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    /**
     * Metodo que muestra una impresión cuando el Perro corre
     */
    public void correr (){
        System.out.println("Corriendo");
    }
    /**
     * Metodo que muestra una impresión cuando el perro
     * corretea al aguien
     */
    public void corretear (){
        System.out.println("Te estoy persiguiendo");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribir el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+ "Perro{" + "colaCortada=" + colaCortada + '}';
    }
    
    
    
    
}

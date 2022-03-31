/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de
 * una Mascota declaración de la herencia va
 * a heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public class Mascota extends Servivo{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena privadas para
     * solo acceder a ellas por medio por medio
     * de metodos de la misma clase.
     */
    private String color;
    private String raza;
    private String colorOjos;
    /**
     * contructor vacío
     */
    public Mascota() {
    }
    /**
     * Constructor inicializado con las variables
     * @param color
     * @param raza
     * @param colorOjos
     * @param nombre
     * @param edad 
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    /**
     * Metodo que imprime un mensaje cuando la mascota duerme
     */
    public void dormir (){
        System.out.println("ZZZzzzzZZZ");
    }
    /**
     * Metodo que imprime un mensaje cuando salta la mascota
     */
    public void saltar (){
        System.out.println("Estoy saltando");
    }
    /**
     * Metodo que imprime cuando la mascota juega
     */
    public void jugar (){
        System.out.println("Estoy jugando");
    }
    /**
     * Sobre carga
     * Modifica o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * un Servivo 
 * @author Duque Rafael
 */
public class Servivo {
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena y entero
     * privadas para solo acceder a ellas 
     * por medio de metodos de la misma clase
     */
    private String nombre;
    private int edad;
    /**
     * Constructor vacío
     */
    public Servivo() {
    }
    /**
     * Constructor inicializado con las variables
     * @param nombre
     * @param edad 
     */
    public Servivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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
    /**
     * Metodo que muestra una impresion cuando el servivo respira 
     */
    public void respirar (){
        System.out.println("Estoy respirando");
        
    }
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Servivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}

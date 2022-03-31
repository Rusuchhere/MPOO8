/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que indica las funciones y metodos de
 * un alumno declaración de la herencia va
 * a heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clases y subclases
 * @author Duque Rafael
 */
public class Alumno extends Persona{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena y entero
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private String carrera;
    private int semestre;
    /**
     * Constructor vacío
     */
    public Alumno() {
    }
    /**
     * Constructor inicializado con las variables
     * @param carrera
     * @param semestre
     * @param mascota
     * @param nombre
     * @param edad 
     */
    public Alumno(String carrera, int semestre, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Metodo que imprime cuando el alumno aprende
     */
    public void aprender (){
        System.out.println("Hola estoy aprendiendo Herencia en java");
    }
    /**
     * Metodo que imprime cuando estudia el alumno
     */
    public void estudiar(){
        System.out.println("Estudiando para mi examen del Lunes");
    }
    /**
     * Metodo que imprime cuando el alumno se da de baja
     */
    public void darseDeBaja(){
        System.out.println("Meteré una baja extemporánea");
    }
    /**
     * Sobrecarga
     * Modifica o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }  
}

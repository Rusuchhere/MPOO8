/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * un profesor declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public class Profesor extends Empleado{
    /**
     * Zona de atributos (Encapsulamiento)
     * variable de tipo entero
     * privada para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private int numAlumnos;
    /**
     * Constructor vacío
     */
    public Profesor() {
    }
    /**
     * Constructor inicializado con las variables 
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param mascota
     * @param nombre
     * @param edad 
     */
    public Profesor(int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    /**
     * Metodo que muestra una impresión al reprobar el profesor a alguien
     */
    public void reprobar (){
        System.out.println("Si obtuviste calificación <=5 estás reprobado");
    }
    /**
     * Metodo que muestra una impresión al pasar a un alumno el profesor
     */
    public void pasarAlumnos (){
        System.out.println("Si obtuviste calificación >=6 estás aprobado");
    }
    /**
     * Metodo que muestra una impresión cuando el profesor explica un tema
     */
    public void explicar (){
        System.out.println("Estoy explicando como instanciar clases");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribir el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }

}

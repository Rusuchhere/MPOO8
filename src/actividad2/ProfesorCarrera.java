/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * un ProfesorCarrera declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public class ProfesorCarrera extends Profesor{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo entero
     * privadas para solo acceder a ellas por medio
     * de metodos de la misma clase
     */
    private int numAsignatura;
    private int grupos;
    /**
     * Constructor vacío
     */
    public ProfesorCarrera() {
    }
    /**
     * Constructor incializado con las variables 
     * @param numAsignatura
     * @param grupos
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param mascota
     * @param nombre
     * @param edad 
     */
    public ProfesorCarrera(int numAsignatura, int grupos, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAsignatura = numAsignatura;
        this.grupos = grupos;
    }

    public int getNumAsignatura() {
        return numAsignatura;
    }

    public void setNumAsignatura(int numAsignatura) {
        this.numAsignatura = numAsignatura;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    
    @Override
    public String toString() {
        return super.toString()+"ProfesorCarrera{" + "numAsignatura=" + numAsignatura + ", grupos=" + grupos + '}';
    } 
}

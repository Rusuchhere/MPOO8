/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de 
 * un profesorAsignatura declaracion de la herencia va 
 * a heredar lo que tiene la clase padre permitiendo 
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public class ProfesorAsignatura extends Profesor{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena, privadas 
     * para solo acceder a ellas por medio 
     * de metodos de la misma clase
     */
    private String nomAsignatura;
    /**
     * Constructor vacío
     */
    public ProfesorAsignatura() {
    }
    /**
     * Constructor inicializado con las variables
     * @param nomAsignatura
     * @param numAlumnos
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param mascota
     * @param nombre
     * @param edad 
     */
    public ProfesorAsignatura(String nomAsignatura, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.nomAsignatura = nomAsignatura;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

     /**
     * sobre carga
     * Modificar o sobreecribir el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"ProfesorAsignatura{" + "nomAsignatura=" + nomAsignatura + '}';
    }
}

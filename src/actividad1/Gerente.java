/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *Clase que indica las funciones y metodos de
 * un Gerente declaración de la herencia va a
 * heredar lo que tiene la clase padre permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author josed
 */
public class Gerente extends Empleado{
    /**
     * Zona de atributos (Encapsulamiento)
     * variable tipo entero, privada para solo acceder a 
     * ella por medio de metodos de la misma clase
     */
    private int presupuesto;
    /**
     * Contructor vacío
     */
    public Gerente() {
    }
    /**
     * Constructor inicializado con las variables
     * @param presupuesto
     * @param nombre
     * @param numEmpleado
     * @param sueldo 
     */
    
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo){
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public void asignarPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+ "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}

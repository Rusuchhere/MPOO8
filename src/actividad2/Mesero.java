/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que indica las funciones y metodos de
 * un Mesero declaración de la herencia va a 
 * heredar lo que tiene de la clase padre permitiendo
 * compartir metodos y datos entre clase y subclase
 * @author Duque Rafael
 */
public class Mesero extends Empleado{
    /**
     * Zona de atributos (Encapsulamiento)
     * variables de tipo cadena y entero
     * rpivadas para solo acceder a ellas por
     * medio de metodos de la misma clase
     */
    private String restaurant;
    private int numMesas;
    private String colorUniforme;
    /**
     * Contructor vacío
     */
    public Mesero() {
    }
    /**
     * Constructr inicializado con las variables
     * @param restaurant
     * @param numMesas
     * @param colorUniforme
     * @param salario
     * @param horaEntrada
     * @param horaSalida
     * @param mascota
     * @param nombre
     * @param edad 
     */
    public Mesero(String restaurant, int numMesas, String colorUniforme, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurant = restaurant;
        this.numMesas = numMesas;
        this.colorUniforme = colorUniforme;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getColorUniforme() {
        return colorUniforme;
    }

    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }
    /**
     * Metodo que muestra el recibimiento del pedido
     * del mesero
     */
    public void recibirPedidos (){
        System.out.println("Hola tomo su orden");
    }
    /**
     * Metodo que muestre cuando el pedido fue entregado
     * por el mesero
     */
    public void darPedidos (){
        System.out.println("Le entrego su comida");
    }
    /**
     * Metodo que muestra cuando recibe propina
     */
    public void recibirPropina (){
        System.out.println("GRACIAS POR SU PROPINA");
    }
    /**
     * Metodo que muestra que el mesero se encuentra en su descanso
     */
    public void tomarUnDescanso (){
        System.out.println("Estoy en mi hora de descanso");
    }
    /**
     * Sobre carga
     * Modificar o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Mesero{" + "restaurant=" + restaurant + ", numMesas=" + numMesas + ", colorUniforme=" + colorUniforme + '}';
    }
     
}

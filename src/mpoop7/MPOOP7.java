/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mesero;
import actividad2.Perro;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;

/**
 * Clase principal
 * @author Duque Rafael 
 */
public class MPOOP7 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado ();
        empleado.setNombre("Joaquin");
        empleado.setNumEmpleado(998877);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        System.out.println(empleado.toString());
        empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
        Gerente gerente = new Gerente ();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(887766);
        gerente.setSueldo(30_000);
        gerente.setPresupuesto(100_000);
        System.out.println(gerente);
        gerente.aumentarSueldo(50);
        System.out.println(gerente);
        
        Gerente gerente2 = new Gerente (1_000_000, "Saul", 113365, 50_000);
        System.out.println(gerente2);
        System.out.println("#############");
        
        Perro perro = new Perro ();
        perro.setNombre("El demian");
        perro.setEdad(2);
        perro.setRaza("Chihuahua");
        perro.setColor("negro");
        perro.setColorOjos("Amarillos");
        perro.setColaCortada(true);
        System.out.println(perro);    
        
        Gato gato = new Gato ("Negro","Bombay","Cafés","Salem",1);
        System.out.println(gato);
        
        System.out.println("########");
        Alumno alumno = new Alumno("Eléctrica",6,perro,"Rafael",21);
        System.out.println(alumno);
        Mesero mesero = new Mesero ("Carajillo",6,"Blanco", 2000f, 3,11,gato,"Eduardo",25);
        System.out.println(mesero);
        ProfesorAsignatura profesorAsignatura = new ProfesorAsignatura("MPOO",30,5000f, 9,3,perro,"Antonio",30);
        System.out.println(profesorAsignatura);
        ProfesorCarrera profesorCarrera = new ProfesorCarrera(3,4,50,10_000f,7,5,gato,"Raúl",55);
        System.out.println(profesorCarrera);
    }
    
}

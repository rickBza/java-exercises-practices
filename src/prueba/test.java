package prueba;
import objetos.Persona;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        Scanner Est = new Scanner(System.in);
        String name ,surname ;
        System.out.print("Ingrese nombre");
        name = Est.next();
        System.out.print("Ingrese apellido");
        surname = Est.next();
        Persona estudiante = new Persona(name,surname);
        System.out.println("Name : "+estudiante.getNombre()+"\n Surname : "+estudiante.getApellido());
    }
}

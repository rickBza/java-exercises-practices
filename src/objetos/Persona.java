package objetos;

public class Persona {
    String nombre;
    String apellido;
    String Id;
    String pais ;
    String correo_electronico ;
    int edad ;
    public Persona(String name ,String surname ){
        nombre = name ;
        apellido = surname ;
    }
    public Persona(String name ,String surname ,String id ,String email,String country ,int age ){
        nombre = name ;
        apellido = surname ;
        Id = id ;
        pais = country ;
        correo_electronico = email ;
        edad = age ;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String surname) {
        this.apellido = surname;
    }
}

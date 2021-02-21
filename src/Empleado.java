import java.util.Scanner;
public class Empleado extends Persona{

    public static Float salario;
    public static String nombre1;
    public static String apellido1;
    public  static long id1=0;

    public Empleado(String nombre, String apellido, long id) {
        super(nombre, apellido, id);

        salario = DataCollection.salario;

        nombre1 = getNombre();
        apellido1= getApllido();
        id1=getId();


    }
    public static void datos (){




    }



}

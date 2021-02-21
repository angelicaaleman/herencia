
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static Persona empleado;

    public static ArrayList<String>listanombre;
    public static ArrayList<String>listaapellido;
    public static ArrayList<Long>listaid;
    public static ArrayList<Float>listaslario;





    public static void menu() {
        Menu milista = new Menu();
        milista.listanombre = new ArrayList();
        milista.listaapellido = new ArrayList();
        milista.listaid = new ArrayList();
        milista.listaslario = new ArrayList();


        milista.leerOpcion();

    }
        public static void leerOpcion()
     {
         Scanner sc = new Scanner(System.in);
         int opcion=0;
         try {

         do{


                 System.out.println("\n Seleccione una opcion ");
                 System.out.println(" [1] Agregar   Empleado");
                 System.out.println(" [2] Modificar Empleado");
                 System.out.println(" [3] Eliminar  Empleados");
                 System.out.println(" [4] Mostrar   Empleados");


                 System.out.println(" [5] Salir ");
                 opcion = sc.nextInt();

                 switch (opcion) {

                     case 1:
                         agregar();
                         break;
                     case 2:
                         modificar();
                         break;
                     case 3:
                         eliminar();
                         break;
                     case 4:
                         mostrar();
                         break;
                 }

         }while (opcion != 5);
         }catch (Exception e){

             System.out.println("Digite una opcion valida o 5 si desea salir");
             leerOpcion();
         }
         }

         public static void modificar()
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("Ingrese el id del empleado a modificar");
             long id = sc.nextLong();

             String valor;

             int indice;
             indice=listaid.indexOf(id);
             if(indice != -1) {
                 int opcion=0;
               try {
                 do {
                   System.out.println("Digite 1 Si desea modificar el nombre");
                   System.out.println("Digite 2 Si desea modificar el apellido");
                   System.out.println("Digite 3 Si desea modificar el id");
                   System.out.println("Digite 4 Si desea modificar el salario");
                   System.out.println("Digite 5 Si desea modificar todo por un nuevo empleado");
                   System.out.println("Digite 6 si desea salir");
                   opcion = sc.nextInt();
                   switch (opcion) {

                       case 1:
                           Scanner leer = new Scanner(System.in);
                           System.out.println("Digite el nuevo nombre");
                            valor = leer.nextLine();
                           listanombre.set(indice, valor);

                           break;
                       case 2:
                           Scanner leer1 = new Scanner(System.in);

                           System.out.println("Digite el nuevo apellido");
                           valor = leer1.nextLine();
                           listaapellido.set(indice, valor);
                           break;
                       case 3:
                           Scanner leer2 = new Scanner(System.in);

                           System.out.println("Digite el nuevo id");
                           long valor5 = leer2.nextInt();
                           listaid.set(indice, valor5);
                           break;
                       case 4:

                           Scanner leer3 = new Scanner(System.in);

                           System.out.println("Digite el nuevo salario");
                           float valor2 = leer3.nextFloat();
                           listaslario.set(indice, valor2);
                           break;
                       case 5:
                           Scanner leer4= new Scanner(System.in);

                           System.out.println("Digite el nuevo nombre");
                           valor = leer4.nextLine();
                           listanombre.set(indice, valor);

                           System.out.println("Digite el nuevo apellido");
                           valor = leer4.nextLine();
                           listaapellido.set(indice, valor);

                           System.out.println("Digite el nuevo id");
                           long valor3 = leer4.nextInt();
                           listaid.set(indice, valor3);

                           System.out.println("Digite el nuevo salario");
                           float valor55= leer4.nextFloat();
                           listaslario.set(indice, valor55);
                           break;

                   }

               }while (opcion != 6);
             }catch (Exception e){

             System.out.println("Digite una opcion valida o 5 si desea salir");

         }
             }else{
                 System.out.println("El dato no se encuentra");
             }

         }

         public static void eliminar()
         {   Scanner sc = new Scanner(System.in);
             System.out.println("Ingrese el id del empleado a eliminar");
             long valor = sc.nextLong();
             int indice;
             indice=listaid.indexOf(valor);
             if(indice != -1)
             {
                 listaid.remove(indice);
                 listaslario.remove(indice);
                 listanombre.remove(indice);
                 listaapellido.remove(indice);
                 System.out.println("Dato eliminado con exito");

             }else{
                 System.out.println("El dato no se encuentra");
             }


         }

         public static void agregar()
         {


         DataCollection.ingreso();


             long valor=Empleado.id1;
             int indice;
             indice=listaid.indexOf(valor);
             if(indice != -1)
             {
                 System.out.println("El ID ya se encuentra registrado");

             }else{
                 listanombre.add(Empleado.nombre1);
                 listaapellido.add(Empleado.apellido1);
                 listaid.add(Empleado.id1);
                 listaslario.add(Empleado.salario);

             }





         }
         public static void mostrar()

         {

          if(!listaid.isEmpty()){

              System.out.println("Elementos de las Lista ");
              for(int i=0;i< listaid.size();i++)
              {
                  System.out.print(listanombre.get(i)+"  ");
                  System.out.println(listaapellido.get(i));

                  System.out.println("El id es: "+listaid.get(i));
                  System.out.println("El salario es: "+listaslario.get(i));


                  System.out.println("***********************");

              }

          }else{                  System.out.println("No existen valores en la lista ");
          }

         }

     }








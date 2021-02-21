import java.util.Scanner;



    public class DataCollection {
   public static Float salario;
        public static void ingreso()  {

            Scanner sc = new Scanner(System.in);

            try {
                String nombre = "";
                String apellido = "";
                long id = 0;



                System.out.println(" Por favor ingrese el nombre del empleado ");
                nombre = sc.nextLine();


                System.out.println(" Por favor ingrese el apellido del empleado  ");
                apellido = sc.nextLine();


                System.out.println("por favor digite el id del empleado");
                id = sc.nextLong();

                System.out.println("por favor digite el salario del empleado");
                salario = sc.nextFloat();


                Persona empleado = new Empleado(nombre, apellido, id);


            }catch (Exception e)
            {
                System.out.println("por favor digite un dato valido");



            }
        }







}

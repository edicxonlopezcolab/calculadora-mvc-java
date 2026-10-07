import java.util.Scanner;

public class InputReader 
{
    public static final Scanner sc = new Scanner(System.in);
    
    public static int leerEntero(String mensaje)
    {
        System.out.println(mensaje);
        while (!sc.hasNextInt()) 
        {
            System.out.println("Digite un numero valido:");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double leerDouble(String mensaje)
    {
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) 
        {
            System.out.println("Digite un numero valido:");
            sc.next();
        }
        return sc.nextDouble();
    }
}

public class CalculadoraView 
{
    public void mostrarMenu()
    {
        String encabezado =("Calculadora");
        System.out.println("\n" + "=".repeat(20));
        System.out.println(encabezado);
        System.out.println("=".repeat(20));
        System.out.println("Menu:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir\n");
    }

    public void mostrarResultado(String operacion, double resultado) 
    {
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }
}

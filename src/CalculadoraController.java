public class CalculadoraController 
{
    private final CalculadoraModel modelo;
    private final CalculadoraView vista;
    
    public CalculadoraController(CalculadoraModel modelo, CalculadoraView vista) 
    {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void iniciar()
    {
        boolean salir = false;
        while (!salir) 
        {
            vista.mostrarMenu();
            int opcion = InputReader.leerEntero("Digite una opcion");
            if (opcion == 5) 
            {
                System.out.println("Chaooo");
                salir = true;
            } 
            else 
            {
                ejecutarCalculadora(opcion);
            }
        }
    }

    public void ejecutarCalculadora(int opcion)
    {
        if (opcion >= 1 && opcion <= 4) 
        {
            double num1 = InputReader.leerDouble("Digite el primer numero:");
            double num2 = InputReader.leerDouble("Digite el segundo numero:");

            switch (opcion) 
            {
                case 1:
                    double suma = modelo.calcularSuma(num1, num2);
                    vista.mostrarResultado("Suma", suma);
                    break;
                case 2:
                    double resta = modelo.calcularResta(num1, num2);
                    vista.mostrarResultado("Resta", resta);
                    break;
                case 3:
                    double mult = modelo.calcularMultiplicacion(num1, num2);
                    vista.mostrarResultado("Multiplicacion", mult);
                    break;
                case 4:
                    if (num2 == 0) 
                    {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } 
                    else 
                    {
                        double div = modelo.calcularDivision(num1, num2);
                        vista.mostrarResultado("Division", div);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        else
        {
            System.out.println("Opcion no valida");
        }       
    }

}

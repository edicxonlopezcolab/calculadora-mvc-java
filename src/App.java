public class App 
{
    public static void main( String[] args )
    {
        CalculadoraView vista = new CalculadoraView();
        CalculadoraModel modelo = new CalculadoraModel();

        CalculadoraController controller = new CalculadoraController(modelo,vista);
        controller.iniciar();
    }
}

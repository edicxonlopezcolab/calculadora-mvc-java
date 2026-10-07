# Calculadora MVC en Java

Calculadora de consola con operaciones básicas (suma, resta, multiplicación y división) que aplica el patrón Modelo-Vista-Controlador.

## Patrón MVC

- **CalculadoraModel**: lógica de cálculo, independiente de la interfaz.
- **CalculadoraView**: muestra menús y resultados por consola.
- **CalculadoraController**: coordina el flujo entre vista y modelo.
- **InputReader**: lectura de la entrada del usuario.
- **App**: punto de entrada; crea y conecta los componentes.

## Ejecución

    javac -d out src/*.java
    java -cp out App

## Autor

Gabriel López · [LinkedIn](https://linkedin.com/in/egabriel-lopez-duque)

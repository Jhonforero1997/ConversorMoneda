import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsumoApi consumoApi = new ConsumoApi();

        try {
            while (true) {
                String menu = """
*********************************************
  Sea bienvenido/a al Conversor de Moneda =]
*********************************************

1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Salir

Elija una opción válida:
*********************************************
""";

                System.out.println(menu);
                int opcion = scanner.nextInt();

                if (opcion == 7) {
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
                    break;
                }

                System.out.print("Ingrese la cantidad a convertir: ");
                double valorAconvertir = scanner.nextDouble();

                String monedaBase = "";
                String monedaDestino = "";

                switch (opcion) {
                    case 1:
                        monedaBase = "USD";
                        monedaDestino = "ARS";
                        break;
                    case 2:
                        monedaBase = "ARS";
                        monedaDestino = "USD";
                        break;
                    case 3:
                        monedaBase = "USD";
                        monedaDestino = "BRL";
                        break;
                    case 4:
                        monedaBase = "BRL";
                        monedaDestino = "USD";
                        break;
                    case 5:
                        monedaBase = "USD";
                        monedaDestino = "COP";
                        break;
                    case 6:
                        monedaBase = "COP";
                        monedaDestino = "USD";
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        continue;
                }

                double tasaDeConversion = consumoApi.getExchangeRate(monedaBase, monedaDestino);
                double resultadoDeLaConversion = tasaDeConversion * valorAconvertir;

                System.out.printf("Tasa de cambio: 1 %s = %.2f %s\n", monedaBase, tasaDeConversion, monedaDestino);
                System.out.printf("Cantidad convertida: %.2f %s\n", resultadoDeLaConversion, monedaDestino);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

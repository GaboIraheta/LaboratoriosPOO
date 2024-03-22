import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        do {
            System.out.println("-- Calculadora --");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("Opcion: ");
            Scanner entrada = new Scanner(System.in);
            int opcion = 0;
            opcion = entrada.nextInt();
            float a, b;
            if(opcion == 1) {
                System.out.println("Ingrese el primer sumando : ");
                a = entrada.nextFloat();
                System.out.println("Ingrese el segundo sumando: ");
                b = entrada.nextFloat();
                float resultado = suma(a, b);
                System.out.println("El resultado de la suma es: " + resultado);
            } else if(opcion == 2) {
                System.out.println("Ingrese el primer numero: ");
                a = entrada.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                b = entrada.nextFloat();
                float resultado = resta(a, b);
                System.out.println("El resultado de la resta es: " + resultado);
            } else if(opcion == 3) {
                System.out.println("Ingrese el primer factor: ");
                a = entrada.nextFloat();
                System.out.println("Ingrese el segundo factor: ");
                b = entrada.nextFloat();
                float resultado = producto(a, b);
                System.out.println("El resultado del producto es: " + resultado);
            } else if(opcion == 4) {
                System.out.println("Ingrese el dividendo: ");
                a = entrada.nextFloat();
                System.out.println("Ingrese el divisor: ");
                b = entrada.nextFloat();
                float resultado = division(a, b);
                System.out.println("El resultado del cociente es: " + resultado);
            } else if(opcion == 5) {
                return;
            }
        } while(true); 
    }

    public static float suma(float a, float b) {
        return a + b;
    }

    public static float resta(float a, float b) {
        return a - b;
    }

    public static float producto(float a, float b) {
        return a * b;
    }

    public static float division(float a, float b) {
        if (b == 0) {
            System.out.println("La division entre cero no esta definida");
            return 0;
        } else {
            return a / b;
        }
    }
}


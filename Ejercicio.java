import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero entero: ");
        int numero3 = scanner.nextInt();

        System.out.println("Ingrese su nombre completo: ");
        scanner.nextLine(); 
        String nombreCompleto = scanner.nextLine();

        System.out.println("Los numeros ingresados son: " + numero1 + ", " + numero2 + ", " + numero3);
        System.out.println("El nombre ingresado es: " + nombreCompleto);
    }
}

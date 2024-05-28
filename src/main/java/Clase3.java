import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su Nombre");
        String nombre=scanner.nextLine();

        System.out.println("Buen dia, su nombre es " +nombre);

        System.out.println("Digite su edad");
        int edad= scanner.nextInt();
        System.out.println("Su edad es " +edad);

        scanner.close();
    }
}

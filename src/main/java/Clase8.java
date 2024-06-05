import java.util.Arrays;
import java.util.List;

public class Clase8 {

    public static void main(String[] args) {
        int contador=1;
        //while

        while (contador<=4){  //Ejecuta o valida condicion
            System.out.println(contador);
            contador++;
        }

        //DO while
        System.out.println("_______________________________________");

        contador=1;

        do {
            System.out.println(contador);
            contador++;
        }while (contador<=4);

        System.out.println("_______________________________________");
        //for

        for (int i=1;i<5;i++){
            System.out.println(i);
        }
        System.out.println("_______________________________________");

        int[] numeros = {1,2,3,4,5,6};

        for (int numero:numeros){
            System.out.print(numero);
        }

        System.out.println("");
        System.out.println("_______________________________________");
        String[] nombre = {"Mauro","Caro","Ani"};

        for (int i=0;i<nombre.length;i++){
            System.out.println(nombre[i]);
        }

        System.out.println("Stream _______________________________________");

        Arrays.stream(nombre).forEach(System.out::println);

        List<String> comidas = List.of("Sushi","Gaseosa","Perros");

        comidas.stream().forEach(System.out::println);
        comidas.forEach(System.out::println);

    }
}

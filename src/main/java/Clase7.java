import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       /* System.out.println("Hola");
        numeros.sort(Integer::compare);
        numeros.stream().forEach(System.out::println);*/
        System.out.println("par");
        numeros.stream().filter(n-> n%2==0).forEach(System.out::println);
        System.out.println("No pares");
        numeros.stream().filter(n-> n%2==1).forEach(System.out::println);

        List<String> palabras = Arrays.asList("java", "lambda", "stream", "code", "example", "api");

  //  palabras.stream().map(p-> p.toUpperCase()).forEach(System.out::println);

   // palabras.stream().filter(p-> p.length()>4).forEach(System.out::println);

    palabras.stream().filter(p-> p.charAt(0)=='l').forEach(System.out::println);

    }


}

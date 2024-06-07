import java.util.List;

public class Clase11 {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> listarPares = numeros.stream().filter(n -> n % 2 == 0).toList();

        listarPares.forEach(System.out::println);

        int count = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(count);
    }

}

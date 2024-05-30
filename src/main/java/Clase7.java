import java.time.LocalDate;

public class Clase7 {

    public static void main(String[] args) {
     /*   sumar(1,2);
        LocalDate.now();

*/
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        int i = 1;
        do {
            System.out.println("Valor de i: " + i);
            i++;
        } while (i <= 5);

          i = 1;
        while (i <= 5) {
            System.out.println("Valor de i: " + i);
            i++;
        }
    }

    private static int sumar(int num1, int num2){
        return num1+num2;
    }

    private int resta(int num1, int num2){
        return num1-num2;
    }

}

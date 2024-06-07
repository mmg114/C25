public class Clase9 {
    public static void main(String[] args) {

        try{
            int a=10;
            int b= 0;

            String c =null;
            c.length();
            System.out.println( a/b);

        }catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Lo anterior fue el error");
        }catch (NullPointerException ex){
            System.out.println(ex);
            System.out.println("Lo anterior fue el error");

        }finally {


        }


        System.out.println("Hola Esto es una prueba.");





    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase6 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] valores ={1,2,3};

        Persona[] personas  = new Persona[2];

        personas[0]= new Persona("Alejandra");
        personas[1]= new Persona("Mauricio");

        List<Persona> peronasList = new ArrayList<>();
        List<String> mercado = List.of("Azucar","Huevos");

        //TODO OTRA CLASE
        Arrays.stream(personas).forEach(persona -> System.out.println(persona.getNombreCompleto()));



    }
}

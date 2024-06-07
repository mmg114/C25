package clase11;

public class Cuadrado implements FiguraGeometrica{

    int lado;

   Cuadrado(){
       this.lado=3;
   }

    @Override
    public int calcularArea() {
       DiaSemana diaSemana = DiaSemana.LUNES;

        return lado*lado;
    }
}

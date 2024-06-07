package clase11;

public class Cuadrado implements FiguraGeometrica{

    int lado;

   Cuadrado(){
       this.lado=3;
   }

    @Override
    public int calcularArea() {
        return lado*lado;
    }
}

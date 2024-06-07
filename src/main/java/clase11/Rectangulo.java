package clase11;

public class Rectangulo implements FiguraGeometrica{

    int largo;
    int ancho;

    Rectangulo(){
        this.ancho=10;
        this.largo=2;
    }

    @Override
    public int calcularArea() {
        return largo*ancho;
    }
}

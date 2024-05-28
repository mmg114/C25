public class Persona {

    public Persona(){

    }

    public Persona(String nombreCompleto){

    }

    private Persona(String id, char edad, char genero, String nombreCompleto, float altura) {
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.nombreCompleto = nombreCompleto;
        this.altura = altura;
    }

    private String id;
    private char edad;
    private char genero;
    private String nombreCompleto;
    private float altura;

    public Persona(String nombreCompleto, char genero) {
        this.genero = genero;
        this.nombreCompleto = nombreCompleto;
    }


    void correr(){

    }
    void trabajar(){

    }
    void comer(){

    }
    void dormir(){

    }
    void estudiar(){

    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}


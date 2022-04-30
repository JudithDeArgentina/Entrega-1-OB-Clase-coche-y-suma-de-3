//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.QuitarPuerta();
        miCoche.PintarColor();
        System.out.println("El total de puertas ahora son: " +miCoche.puertas);
        System.out.println("y su color es : " + miCoche.color);
        
    }

    
}

// esto esta fuera del main, el main es donde se ejecuta el programa
class Coche{

    public  int puertas = 5;
    public String color ="Azul";

    public void AgregarPuerta() {
        this.puertas++;
    }

    public void QuitarPuerta() {
        this.puertas--;
    }

    public void PintarColor() {
        this.color= "Azul";
    }





    public static void main(String[] args) {

        int resultado;
        resultado = suma (15, -17, 7);
        System.out.println("El resultado es: " + resultado);
    }

    public static int suma (int a, int b, int c) {
        return a+b+c;
    }

}

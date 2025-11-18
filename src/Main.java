// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto divisor
        // y se prueba la excepcion
        Divisor divisor = new Divisor();
        System.out.println(divisor.dividir(1,0));
    }
}
// Clase Divisor con el metodo dividir
public class Divisor {
    // Si se intenta dividir entre 0 lanza una excepcion
    public int dividir(int num1, int num2) throws ArithmeticException {
        if(num1==0 || num2==0){
            throw new ArithmeticException();
        }else if(num1==num2){
            return 1;
        }else {
            return num1/num2;
        }
    }
}

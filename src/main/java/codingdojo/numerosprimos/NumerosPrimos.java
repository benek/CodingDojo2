package codingdojo.numerosprimos;

/**
 * @author benek
 *         Date: 12/01/12
 *         Time: 20:57
 *         www.javamexico.org
 */
public class NumerosPrimos {

    public int numeroPrimo(int numeroPrimo){
        int i = 2;
        int primo = 0;
        for (;;){
            if (esPrimo(i)){
                primo++;
            }
            if (primo == numeroPrimo){
                break;
            }
            i++;
        }
        return i;
    }

    private boolean esPrimo(int numero){
        if (numero == 2 || numero == 3){
            return true;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(numero); i++){
                if (numero%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
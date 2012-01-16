package codingdojo.romanos

/**
 * @author benek
 * Date: 12/01/12
 * Time: 22:58
 * www.javamexico.org
 */

class Romanos {

    def romanos = [I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000];

    int romanoArabigo(String romano) {
        int arabigo = 0;
        for (int i = 0; i < romano.length(); i++) {
            arabigo += ((romanos.get(romano[i])) < ((i >= (romano.length() - 1)) ? 0 : romanos.get(romano[i + 1]))) ? -(romanos.get(romano[i])) : (romanos.get(romano[i]));
        };
        return arabigo;
    }

}
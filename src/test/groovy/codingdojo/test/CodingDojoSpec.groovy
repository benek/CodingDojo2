package codingdojo.test;

import spock.lang.Specification
import codingdojo.romanos.Romanos
import codingdojo.numerosprimos.NumerosPrimos
/**
 * @author benek
 * Date: 13/01/12
 * Time: 00:32
 * www.javamexico.org
 */
class CodingDojoSpec extends Specification{

    def "Prueba de obtencion de un numero primo"(){
        given:
            NumerosPrimos numerosPrimos = new NumerosPrimos();
        when:
            int resultado = numerosPrimos.numeroPrimo(10001);
        then:
            resultado == 104743;
    }

    def "Prueba de conversion de numero romano a arabigo"(){
        given:
            Romanos romanos = new Romanos();
        when:
            def conversion = romanos.romanoArabigo(romanoEntrada);
        then:
            conversion == resultadoArabigo;
        where:
            romanoEntrada    |    resultadoArabigo
            "MMXX"           |           2020
            "MCCXXXIV"       |           1234
            "CMXCIX"         |            999
            "MMMDCCCXCIX"    |           3899
            "XVIII"          |             18
            "MCMXCIX"        |           1999
            "XV"             |             15
    }

}

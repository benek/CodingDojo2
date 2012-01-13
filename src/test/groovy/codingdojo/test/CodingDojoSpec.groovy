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

    def "Prueba de conversion de numero romano a arabigo"(){
        given:
            Romanos romanos = new Romanos();
        when:
            def conversion = romanos.romanoArabigo(romanoEntrada);
        then:
            conversion == resultadoArabigo;
        where:
            romanoEntrada << ["MMXX", "MCCXXXIV", "CMXCIX", "MMMDCCCXCIX", "XVIII", "MCMXCIX"];
            resultadoArabigo << [2020, 1234, 999, 3899, 18, 1999];
    }

    def "Prueba de obtencion de un numero primo"(){
        given:
            NumerosPrimos numerosPrimos = new NumerosPrimos();
        when:
            def resultado = numerosPrimos.numeroPrimo(10001);
        then:
            resultado == 104743;
    }

}

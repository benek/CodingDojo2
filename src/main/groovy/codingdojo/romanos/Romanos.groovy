package codingdojo.romanos

/**
 * @author benek
 * Date: 12/01/12
 * Time: 22:58
 * www.javamexico.org
 */

class Romanos{
  int romanoArabigo(String romano){
    def romanos = [I:1,V:5,X:10,L:50,C:100,D:500,M:1000];
      int arabigo = 0, siguiente;
      for (int x = 0; x < romano.length();x++){
        arabigo += ((romanos.get(romano[x])) < ((x >= (romano.length()-1)) ?0: romanos.get(romano[x+1])))? -(romanos.get(romano[x])): (romanos.get(romano[x]));
      };
      return arabigo;
  }
}
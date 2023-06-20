package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  private final Map<Integer, String> roman;

  public Main() {
    roman = new HashMap<>();
    roman.put(1000, "M");
    roman.put(900, "CM");
    roman.put(500, "D");
    roman.put(400, "CD");
    roman.put(1, "I");
    roman.put(4, "IV");
    roman.put(5, "V");
    roman.put(9, "IX");
    roman.put(10, "X");
    roman.put(40, "XL");
    roman.put(50, "L");
    roman.put(90, "XC");
    roman.put(100, "C");
  }

  private String romanNumber = "";

  public static void main(String[] args) {

  }

  public String convertInRomain(int arabicNumber) {

    // j'ordonne les clé de la Map afin de pouvoir boucler dessus dans l'ordre décroissant
    List<Integer> romanKeyOrdered = roman.keySet().stream().sorted(Comparator.reverseOrder()).toList();

    // Je vérifie dans un premier temps si le nombre arabe n'est pas un cas déjà géré par la map des nombres romain
    if (roman.containsKey(arabicNumber)) {
      return roman.get(arabicNumber);
    }

    // Je boucle sur les clé de la map de chiffres romain dans l'ordre décroissant
    for (int indice : romanKeyOrdered) {

      // J'appel la méthode convertToRomanNumber avec le chiffre romain du plus grand au plus petit en indice
      arabicNumber = convertToRomanNumber(arabicNumber, indice);
    }

    return romanNumber;
  }


  private int convertToRomanNumber(int arabicNumber, int indice) {

    /* Je vérifie si le nombre arabe n'est pas déjà présent dans la map de nombre romain.
      Si c'est le cas on stock le nombre romain dans une variable de classe et on retourne directement
      la valeur 0 pour ne plus ajouter de nouveau élément au résultat.
     */
    if (roman.containsKey(arabicNumber)) {
      romanNumber = String.format("%s%s", romanNumber, roman.get(arabicNumber));
      return 0;
    }

    // Je réalise un modulo sur le nombre arabic à partir de l'indice
    int arabicNumberModuloIndice = arabicNumber % indice;

    /* Je vérifie si le modulo est différent du nombre arabe passé en paramétre
      Si ils sont égaux, c'est que l'indice es trop élevé et qu'il faut le diminuer. Donc je retourne le nombre arabe
      directement sans y toucher.
      Si ils ne sont pas égaux alors le chiffre romain correspondant a l'indice doit être utilisé
     */
    if (arabicNumberModuloIndice != arabicNumber) {

      // Je soustrait soustrait le modulo du nombre arabe pour connaitre le ou les nombre(s) romain a ajouter au résultat.
      int arabicNumberMinusModulo = arabicNumber - arabicNumberModuloIndice;

      // Je rajoute au résultat le chiffre romain correspondant à l'indice autant de fois qu'il faut pour atteindre la
      // valeur du modulo.
      for (int i = 0 ; i < arabicNumberMinusModulo ; i += indice) {

        romanNumber = String.format("%s%s", romanNumber, roman.get(indice));
        arabicNumber = arabicNumber - indice;
      }
    }
    return arabicNumber;
  }

}
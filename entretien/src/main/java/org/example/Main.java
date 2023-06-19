package org.example;

public class Main {

  private static final String ONE = "I";
  private static final String FIVE = "V";
  private static final String TEN = "X";
  private static final String FIFTY = "L";
  private static final String  HUNDRED = "C";
  private static final String FIVE_HUNDRED = "D";
  private static final String THOUSAND = "M";

  public static void main(String[] args) {

  }

  public String convertTenToThirteen(int number) {

    if (number > 10 && number <= 13) {
      String number1 = convertI(number - 10);
      return String.format("X%s", number1);
    }

    if (number == 10) {
      return "X";
    }

    return "";
  }

  public String convertFiveToEight(int number) {

    if (number > 5 && number <= 8) {
      String number1 = convertI(number - 5);
      return String.format("V%s", number1);
    }

    if (number == 5) {
      return "V";
    }
    return "";
  }

  public String convertI(int number) {

    if (number > 3) {
      return "";
    }

    String result = "";
    for (int i = 0 ; i < number ; i++) {
      result = String.format("%s%s", result, "I");
    }

    return result;
  }
}
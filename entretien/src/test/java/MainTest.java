import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  private Main main = new Main();



  @Test
  public void testOne() {
    // Given one number
    int number = 1;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "I");
  }

  @Test
  public void testTwo() {
    // Given one number
    int number = 2;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "II");
  }

  @Test
  public void testThree() {
    // Given one number
    int number = 3;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "III");
  }

  @Test
  public void testFive() {
    // Given one number
    int number = 5;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "V");
  }

  @Test
  public void testSix() {
    // Given one number
    int number = 6;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "VI");
  }

  @Test
  public void testSeven() {
    // Given one number
    int number = 7;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "VII");
  }

  @Test
  public void testEight() {
    // Given one number
    int number = 8;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "VIII");
  }

  @Test
  public void testTen() {
    // Given one number
    int number = 10;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "X");
  }

  @Test
  public void testEleven() {
    // Given one number
    int number = 11;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XI");
  }

  @Test
  public void testTwelve() {
    // Given one number
    int number = 12;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XII");
  }

  @Test
  public void testThirteen() {
    // Given one number
    int number = 13;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XIII");
  }

  @Test
  public void testFour() {
    // Given one number
    int number = 4;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "IV");
  }

  @Test
  public void testNine() {
    // Given one number
    int number = 9;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "IX");
  }

  @Test
  public void testSeventeen() {
    // Given one number
    int number = 17;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XVII");
  }

  @Test
  public void testFourteen() {
    // Given one number
    int number = 14;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XIV");
  }

  @Test
  public void testThirtySeventeen() {
    // Given one number
    int number = 30;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XXX");
  }

  @Test
  public void testThirtyEight() {
    // Given one number
    int number = 38;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XXXVIII");
  }

  @Test
  public void testSixtyNine() {
    // Given one number
    int number = 69;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "LXIX");
  }

  @Test
  public void testTwoHundredThirtyEight() {
    // Given one number
    int number = 238;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "CCXXXVIII");
  }

  @Test
  public void testNinetyFive() {
    // Given one number
    int number = 95;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "XCV");
  }

  @Test
  public void testOneThousandNineHundredNinetyNine() {
    // Given one number
    int number = 1999;

    // Then calling #manageI
    String result = main.convertInRomain(number);

    Assert.assertEquals(result, "MCMXCIX");
  }
}

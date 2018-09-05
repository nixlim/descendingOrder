//http://www.codewars.com/kata/descending-order/train/java

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String numToString = Integer.toString(num);
    String [] stringArray = numToString.split("");
    bubbleSort(stringArray);
    String newNumber = String.join ("",stringArray);
    return Integer.parseInt (newNumber);
  }

  private static void bubbleSort(String [] array) {
    int arrayLength = array.length;
    int counter;
    for (int m = arrayLength; m >= 0; m--) {
      for (int i = 0; i < arrayLength - 1; i++) {
        counter = i + 1;
        if (array[i].compareTo (array[counter]) < 0) {
          swapCharacters(i, counter, array);
        }
      }
    }
  }

  private static void swapCharacters (int i, int j, String[] array) {
    String temp;
    temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}

//http://www.codewars.com/kata/descending-order/train/java

import java.util.Arrays; //just for printing it out

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String numToString = Integer.toString(num);
    String [] stringArray = numToString.split("");
    String [] sortedArray = bubbleSort(stringArray);
    System.out.print(Arrays.toString (stringArray));
    System.out.print(Arrays.toString (sortedArray));
    return num;
  }

  private static void bubbleSort(String [] array) {
    int arrayLength = array.length;
    int counter;
    for (int m = arrayLength; m >= 0; m--) {
      for (int i = 0; i < arrayLength - 1; i++) {
        counter = i + 1;
        if (array[i] < array[counter]) {
          swapCharacters(i, counter, array);
        }
      }
    }
  }

  private static void swapCharacters (int i, int j, String[] array) {
    String temp;

  }
}

// Check https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
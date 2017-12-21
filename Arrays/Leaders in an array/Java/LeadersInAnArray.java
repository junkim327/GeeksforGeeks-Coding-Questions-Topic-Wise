package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LeadersInAnArray {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numTestCases = scanner.nextInt();
    for (int i = 0; i < numTestCases; i++) {
      int arraySize = scanner.nextInt();
      List<Integer> intList = new ArrayList<>();
      List<Integer> leaderList = new ArrayList<>();

      int j = 0;
      while (j < arraySize) {
        intList.add(scanner.nextInt());
        j++;
      }

      // Add rightmost element to the leaderList.
      int max = intList.get(arraySize - 1);
      leaderList.add(max);

      // Compare the current max value with the elements in intList
      // from right to left and assign the element value to max value
      // if the element is greater than the max.
      for (int k = arraySize - 2; k >= 0; k--) {
        if (intList.get(k) > max) {
          max = intList.get(k);
          leaderList.add(0, max);
        }
      }

      for (int leader : leaderList) {
        System.out.print(leader + " ");
      }
      System.out.print("\n");
    }
  }
}

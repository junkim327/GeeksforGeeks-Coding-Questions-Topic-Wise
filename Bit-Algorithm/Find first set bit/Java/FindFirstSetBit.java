package com.company;

import java.util.Scanner;

public class FindFirstSetBit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numTestCases = scanner.nextInt();

    for (int i = 0; i < numTestCases; i++) {
      String binaryNum = Integer.toBinaryString(scanner.nextInt());
      // If the number is zero, then just simply print number zero.
      if ("0".equals(binaryNum)) {
        System.out.println(0);
      } else {
        StringBuilder sb = new StringBuilder(binaryNum);
        String reverseBinaryNum = sb.reverse().toString();
        // The bit position starts at position 1 not 0, so
        // we have to add 1 to the index of the first set bit.
        System.out.println(reverseBinaryNum.indexOf('1') + 1);
      }
    }
  }
}

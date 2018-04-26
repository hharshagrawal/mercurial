// Write a function, persistence, that takes in a positive parameter num and returns its multiplicative
// persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
// For example:
//  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//                       // and 4 has only one digit
//  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//                        // 1*2*6 = 12, and finally 1*2 = 2
//  persistence(4) == 0 // because 4 is already a one-digit number


class Persist {
  public static void main(String args[]) {
    System.out.println("39 :" + persistence(39));
    System.out.println("999 :" + persistence(999));
    System.out.println("4 :" + persistence(4));
    System.out.println("173785 :" + persistence(173785));
    System.out.println("331561 :" + persistence(331561));
  }

	public static int persistence(long n) {
    int count = 0;
    long temp, temp2, digit;
    while (n > 9) {
      count += 1;
      temp = n;
      temp2 = 1;
      while (temp > 0) {
         digit = temp % 10;
         if (digit == 0) {
           digit = 1;
         }
         temp2 *= digit;
         temp /= 10;
      }
      n = temp2;
    }
    return count;
  }
}

package DietelChapter6;

public class Exercise2Function {
    public static void main(String[] args) {
        System.out.println(sumDigits(3-2+1));
    }

    public static int power(int first,int second){
        int result = 1;
        for (int count = 0; count < second; count++){
            result *= first;
        }
        return result;
    }

    public static int sumDigits(int number) {
      String output = String.valueOf(number);
      int lengthNumber = output.length();

      int count = 0;
      int sum = 0;

      while (count < lengthNumber){
          int result = number / (power(10,count)) % 10;
          count ++;
          sum += result;
      }
      return sum;
    }

//    123 / 1 % 10 3
//    123 / 10 % 10 2
    //123 / 100 % 10 1
}


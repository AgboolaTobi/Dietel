package mrChibuzo;

public class Decimal {
    public static void main(String[] args) {
        System.out.println(getDecimal(1011));

    }


    public static int toBinary(int decimal) {
        int[] binary = new int[40];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        int i;
        for (i = index - 1; i >= 0; i--) {
            return binary[i];
        }
        return binary[i];
    }
    public static int getDecimal(int binary){
        int decimal = 0;
        int base = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += (int) (temp*Math.pow(2, base));
                binary = binary/10;
                base++;
            }
        }
        return decimal;
    }
}

package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        int square;
        int cube;
        int four;
        System.out.println("N       N2      N3      N4");
        for (int count = 1; count <= 5; count++){
            square = count * count;
            cube = square * count;
            four = cube * count;
            System.out.println(count+"\t\t"+square +"\t\t"+ cube+ "\t\t" + four);
        }
    }
}

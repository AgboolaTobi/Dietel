package DietelChapter5;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println(result(1,100));
    }

    public static long result (int start,int end){
        long sum = 0;
        for (start = 1; start <= end; start++){
            sum += start;
        }
        return sum;
    }
}

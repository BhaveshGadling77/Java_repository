import java.util.Arrays;

public class Arrays_2d_challenge2 {
    public static void main(String[] args) {
        int[] Array = { 10, 20, 30, 90, 50, 60 };

        // int max = Array[5];
        // int min = Array[5];
        // for(int val : Array){
        //
        // if(max<val)
        // max = val;
        //
        // if(min > val)
        // min = val;
        // }
        //
        Arrays.sort(Array);
        int max = Array[Array.length - 1];
        int min = Array[0];
        int span = max - min;

        // System.out.println(val);
        System.out.println("Maximum  : " + max);
        System.out.println("Minimum  : " + min);
        System.out.println("Span  : " + span);

    }
}
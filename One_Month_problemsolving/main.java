package One_Month_problemsolving;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double neg = 0;
        double pos = 0;
        double zero = 0;
        double negres;
        double posres;
        double zerores;
        int len = arr.size();
        for (int j = 0; j < len; j++) {
            if (arr.get(j) < 0) {
                neg++;
            } else if (arr.get(j) > 0) {
                pos++;
            } else {
                zero++;
            }

        }
        System.out.println(posres = pos / len);
        System.out.println(negres = neg / len);
        System.out.println(zerores = zero / len);

    }

}

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

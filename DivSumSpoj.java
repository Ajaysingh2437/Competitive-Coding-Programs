import java.io.*;
import java.util.*;
class DivSumSpoj{
public static void main(String[] args) throws IOException {
        java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String s = r.readLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(s); i++) {
            int input = Integer.parseInt(r.readLine());
            int sum = 1;
            int maxD = (int) Math.sqrt(input);
            if (input > 1 && input <= 500000) {
                for (int y = 2; y <= maxD; y++) {
                    if (input % y == 0) {
                        sum += y;
                        int d = input / y;
                        if (d != y) {
                            sum += d;
                        }
                    }
                }
                output.append(sum + "\n");
            } else {
                output.append("0\n");
            }
        }
        System.out.println(output);
    }
}
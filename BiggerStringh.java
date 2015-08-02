/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gcolor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class BiggerStringh {
 
    public static void main(String[] args) throws IOException {
        final StringBuffer sb = new StringBuffer();
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t = Integer.parseInt(br.readLine()); t > 0; --t){
            final char[] a = br.readLine().toCharArray();
            final int n = a.length;
            int i;
            for(i = n - 2; i >= 0 && a[i] >= a[i+1]; --i){}
            
            if (i < 0){
                sb.append("no answer\n");
                continue;
            }
            
            int minI = i+1;
            for(int j = i+2; j < n; ++j){
                if (a[j] > a[i] && a[j] < a[minI]){
                    minI = j;
                }
            }
            char tx = a[minI];
            a[minI] = a[i];
            a[i] = tx;
            
            Arrays.sort(a, i+1, n);
            
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}

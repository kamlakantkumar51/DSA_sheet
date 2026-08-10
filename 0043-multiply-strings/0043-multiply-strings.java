import java.util.*;
class Solution {
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int ans[] = new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
                int prod = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int p1 = i+j;//tens
                int p2 = i+j+1;//ones
                int sum = prod+ans[p2];
                ans[p2] = sum %10;
                ans[p1] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int digit:ans){
            if(!(sb.length() == 0  && digit == 0)){
                sb.append(digit);
            }
        }
        return sb.toString();
    }
}
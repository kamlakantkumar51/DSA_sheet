class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int reverseno = 0;
        while(n>0){
            int lastdigit = n%10;
            reverseno = reverseno*10 + lastdigit;
            n= n/10;
        }
        if(x==reverseno){
            return true;
        }else{
            return false;
        }
    }
}
//simple hai yaar reverse karke check karlo same hota hia ya nhi
//if number is given negative then its palindrome not possible
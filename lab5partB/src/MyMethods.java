public class MyMethods {

    public static void main(String[] args) throws Exception {
        new MyMethods().runApp();
    }

    //you cannot modify this method
    void runApp(){
        //Test CelToFah
        double degreeCelsius = 37.5;
        double degreeFahrenheit = CelToFah(degreeCelsius);
        System.out.println(degreeCelsius + " in degree Celsius equals " + degreeFahrenheit + " in degree Fahrenheit.");

        //Test isPalindrome
        char[] s1 = {'o', 't','t', 'o'};
        char[] s2 = {'l', 'e','v', 'e', 'l'};
        char[] s3 = {'j', 'a','v', 'a'};
        printPalindromeResult(s1);
        printPalindromeResult(s2);
        printPalindromeResult(s3);

        //Test strToInt
        int num1 = strToInt("12345");
        int num2 = strToInt("60798");
        System.out.println("Sum of " + num1 + " and  " + num2 + " is: " + (num1 + num2));

    }

    //you cannot modify this method
    void printPalindromeResult(char[] s){
        for (int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
        if(isPalindrome((s))){
            System.out.println(" is palindrome.");
        }
        else{
            System.out.println(" is not palindrome.");
        }
    }

    double CelToFah(double Cel){
        return Cel * 9 / 5 + 32;
    }

    boolean isPalindrome(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left<=right){
            if(s[left] != s[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    int strToInt(String s){
        int n = s.length();
        int res = 0;
        for(int i = 0;i<n;i++){
            res = res*10 + (s.charAt(i)- '0');
        }
        return res;
    }
}

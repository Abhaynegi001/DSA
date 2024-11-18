class palindrome{
    public static void main(String[] args){
        String name = "abhhba";
        int rightlength = name.length()-1;
        checkPalindrome(name,0,rightlength);
    }

    public static void checkPalindrome(String name,int left , int right){
        if(left >= right){
            System.out.println("it is a palindrome string");
            return;
        }
        else if(name.charAt(left) != name.charAt(right)){
            System.out.println( "It is not a palindrome");
            return;
        }
        checkPalindrome(name,left+1,right-1);
    }
}
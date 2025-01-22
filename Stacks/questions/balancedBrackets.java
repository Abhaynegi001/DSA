import java.util.Stack;
class balancedBrackets{
    public static void main(String[] args){
        String str = "(()()(";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == '('){    // if string character is open than push in stack.
                st.push('(');
            }
            else{
                if(st.peek()== '('){     // if string character is closed and stack peek element is open than pop the. open element.
                    st.pop();
                }
                else if(st.size() == 0){   // if string charachter is close and stack is empty that means. not balanced brackets.
                    System.out.println("not balance brackets..");
                    return;
                }
            }
        }
        // after loop end...
        if(st.size() == 0){      
            System.out.println("balance brackets..");
        }else{
            System.out.println("not balance brackets..");
        }
    }
}
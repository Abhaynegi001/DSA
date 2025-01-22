import java.util.Stack;

class infixExpression{
    public static void main(String[] args){
        String str = "9-5+3*4/6";       // infix expression ko solve kiya hai.. 2 stacks sa.

        Stack<Integer> val = new Stack<>();       // storing the value.
        Stack<Character> op = new Stack<>();     // storing the operators.

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);      
            int ascii = (int)ch;                // convert character to ascii value
            // '0' -> 48  and '9' -> 57

            if(ascii >= 48 && ascii <= 57){      // if number lies between 0 to 9.  than push in value.
                val.push(ascii-48); 
            }
            else if(op.size() == 0){          // if operator size is zero. than store in operator.. without conditions.
                op.push(ch);
            }
            else{
                if(ch=='-' || ch=='+'){         // this work than by a rule of priority operator..
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);

                    op.pop();
                    // push
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v1*v2);
                        if(op.peek() == '/') val.push(v1/v2);
                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);                    // + , - hai toh.
                }
            }

        }
        // val stack size > 1
        while(val.size() > 1){           // if value is remaining than..  work 
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
        }

        System.out.println("Answer is: "+val.peek());      // answer...

    }
}
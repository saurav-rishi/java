import java.util.*; 
  
class pre
{ 
  
static boolean isOperator(final char x) {
    switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
    }
    return false;
}

static String preToPost(final String pre_exp) {

    final Stack<String> s = new Stack<String>();
    final int length = pre_exp.length();
    for (int i = length - 1; i >= 0; i--) {
        if (isOperator(pre_exp.charAt(i))) {
            final String op1 = s.peek();
            s.pop();
            final String op2 = s.peek();
            s.pop();

            final String temp = op1 + op2 + pre_exp.charAt(i);

            s.push(temp);
        }

        else {

            s.push(pre_exp.charAt(i) + "");
        }
    }

    return s.peek();
}

public static void main(final String args[]) {
    final String pre_exp = "*-A/BC-/AKL";
    System.out.println("Postfix : " + preToPost(pre_exp)); 
} 
}
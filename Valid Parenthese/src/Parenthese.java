import java.util.Stack;

public class Parenthese {
    public static void main(String[] args) {
       // System.out.print(isValid(")("));
        System.out.print(isValid("(()()"));

    }
    public static boolean isValid(String inListString){
        char arr[] = inListString.toCharArray();
        Stack<Character> newArray = new Stack<>();

        for (Character loop: arr){
            if (loop == '{' || loop == '[' || loop == '('){
                newArray.push(loop);
            }
//            else if (loop == ']'){
//                if (newArray.isEmpty() || newArray.peek() != '['){
//                    return false;
//                }
//                newArray.pop();
//            }
            else if (loop == ')'){
                if (newArray.isEmpty())
                    return false;
                }else{
                    newArray.pop();
                }
            }
//            else if (loop == '}'){
//                if (newArray.isEmpty() || newArray.peek() != '{'){
//                    return false;
//                }
//                newArray.pop();
//            }

        if (newArray.isEmpty())
            return true;
        return false;
    }
}

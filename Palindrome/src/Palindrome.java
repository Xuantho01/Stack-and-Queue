import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome<E> {
    Stack<Character> PalindromeInStack = new Stack<>();
    Queue<Character> PalindromeInQueue = new LinkedList<>();
    Stack<Character> PalindromeAfterPop = new Stack<>();

    public void addStirngToStack(String string){
        char[] stringToCheck = string.toCharArray();
        for (int i = 0; i < stringToCheck.length; i++){
            PalindromeInStack.push(stringToCheck[i]);
        }
        System.out.println(PalindromeInStack);
    }
    public void addStringToQueue(String string){
        char[] stringToCheck = string.toCharArray();
        for (int i = 0; i < stringToCheck.length; i++){
            PalindromeInQueue.add(stringToCheck[i]);
        }
        System.out.println(PalindromeInQueue);
    }
    public boolean compareString(){
        int count = 1;
        for (int i = 0; i < PalindromeInQueue.size() + i; i++){
            if (!PalindromeInStack.pop().equals(PalindromeInQueue.remove())){
                count = 0;
//                System.out.print(PalindromeInStack.pop());
////                System.out.print(PalindromeInQueue.remove());
            }
        }
        if (count == 1){
            return true;
        }
        return false;
    }
}

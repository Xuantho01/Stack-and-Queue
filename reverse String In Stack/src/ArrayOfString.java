import java.util.Stack;

public class ArrayOfString<E> {
        Stack<String> ListString = new Stack<>();
        Stack<String> ListStringReverse = new Stack<>();

        public void add(){
            ListString.push("m");
            ListString.push("W");
            ListString.push("o");
            ListString.push("r");
            ListString.push("d");
        }

        public void reverse(){
            int j = ListString.size()-1;
            String tmp;
            for (int i = 0; i <ListString.size() + i; i++ ){
                tmp = ListString.pop();
                ListStringReverse.push(tmp);
            }
            ListString.setSize(0);
        }

    }


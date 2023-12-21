package QueuePalindromes;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class PalinList {
    private Queue<String> queue;
    private Stack<String> stack;
    private String myList;

    public PalinList (String list) {
        myList = list;
        stack = new Stack<String>();
        queue = new LinkedList<String>();

        String[] split = myList.split(" ");
        for (int i = 0; i < split.length; i++) {
            queue.add(split[i]);
            stack.push(split[i]);
        }
    }

        public boolean isPalin() {
            for (int i = 0; i < stack .size(); i++) {
                if (!stack.pop().equals(queue.remove())) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return myList;
        }
    }


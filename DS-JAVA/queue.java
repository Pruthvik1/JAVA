import java.util.Stack;

public class queue {
    public static void main(String[] args) {
        //Queue using Two stacks
        QueueY q1 =new QueueY();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.remove();
        //syso
        //System.out.println(Integer.toString(2));
        }
    
}

class QueueY{
    Stack<Integer> s1 =new Stack<>();
    Stack<Integer> s2 =new Stack<>();
    //empty
    public boolean isEmpty(){
     return s1.isEmpty();
    }
    //push
    public void add(int data ){
        while(!s1.isEmpty()){
            s2.push(s1.pop());

        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());

        }
        System.out.println(data+" insetred");
    }
    //pop
    public void remove(){
        if(isEmpty()){
        System.out.println("empty");
        }
        System.out.println(s1.peek()+" pooped");
        s1.pop();
        }
    
}

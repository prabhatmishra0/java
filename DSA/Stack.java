  
public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stk = new java.util.Stack<> ();
        stk.push(68);
        stk.push(78);
        stk.push(88);
        stk.push(98);
        stk.push(108);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
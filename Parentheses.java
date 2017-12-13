
import java.util.Deque;
import java.util.LinkedList;



public class Parentheses 
{
    
    public static void main(String[] args) 
    {
        Deque<Character> stack = new LinkedList();
        String input = "()(()[()])";
        for (int i = 0; i < input.length() ; i++) {
            char c = input.charAt(i);
            if( c == '(' || c == '[' )
                stack.addFirst(c);
            else if( c == ')' || c == ']' )
            {
                if( stack.isEmpty() ){
                    System.out.println("Nothing to match with !");
                    return ;
                }
                if( ( stack.peek() == '(' && c == ']') || ( stack.peek() == '[' && c == ')') ){
                    System.out.println("Wrong type");
                    return ;
                }
                stack.pop();
            }
        }
        if( stack.isEmpty() )
            System.out.println("Every Symbol matched");
        else
            System.out.println("Some symbols were never matched !");
        
    }
    
}

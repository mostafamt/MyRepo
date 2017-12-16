/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIP
 */
public class Stacktest {

    
    public static Stack removeElement(Stack s,int val)
    {
        Object []array = new Object[s.size()];
        Stack secondStack = new ArrayStack();
        boolean state = true ;
        int L = s.size() ;
        for (int i = 0 ; i < L ; i++)             // copy elements from stack to array
        {
            int x = (int)s.pop();
            if( x == val && state )         // if foung the first $val , don't insert in array .
                state = false ;
            else
                array[i] = x;
            secondStack.push(x);
        }
        
        /* if not found val , return stack as it is */
        if( state )  
        {
            L = secondStack.size();
            for (int i = 0 ; i < L ; i++) 
                s.push( secondStack.pop() );
            return s ;
        }
        /* Again , copy elements from array to stack but without the first element $val , 
           so it stack size will be decreased by one ($val) */
        else
        {
            for (int i = array.length -1 ; i >= 0 ; i--)
            {
                if( array[i] != null )
                    s.push(array[i]);
            }
            return s ;
        }
    }

    
    public static void main(String[]args){
        ArrayStack stack =new ArrayStack();
        stack.push(9);
        stack.push(8);
        stack.push(6);
        stack.push(7);
        stack.printStack();
        System.out.println("top in the stack : "+stack.top());
        System.out.println("stack size = "+stack.size());
        Stack s = removeElement(stack,6);
        System.out.println( s.size() );
        s.printStack();
        
    }
}
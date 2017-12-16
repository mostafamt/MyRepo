


public class ArrayStack <E> implements Stack<E>
{
    public static final int CAPCITY = 1000 ; 
    private E[] data ;
    private int t = -1 ;
    
    public ArrayStack()
    {
        this(CAPCITY);
    }
    
    public ArrayStack(int capcity)
    {
        data=(E[]) new Object [capcity];
    }
    
    public int size()
    {
        return t + 1 ;
    }
        
    public  boolean isEmpty()
    {
        return t == -1 ;
    }
        
    public void push(E e) throws IllegalStateException
    {
        if( size() == data.length )
            throw new IllegalStateException("Stack is full");
        data[++t] = e ;
    }
        
    public E top()
    {
        if(isEmpty())
            return null;
        return data[t];
    }
    
    public E pop()
    {
        if(isEmpty())
            return null;
        E answer =data[t];
        data[t]=null;
        t--;
        return answer;
    }
        
    public void printStack()
    {
        System.out.print("Stack : ");
        for( int i = t ; i >= 0 ; i-- )
        {
            System.out.print( data[i] +" ");
        }
        System.out.print("\n");
    }
        
    public Object peek() 
    {
        return top() ;
    }
    
}
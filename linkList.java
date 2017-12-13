package pkgtry ;

// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
class Link
   {
   public int iData;              // data item
   //public double dData;           // data item
   public Link next;              // next link in list
// -------------------------------------------------------------
   public Link(int id ) // constructor
      {
      iData = id;                 // initialize data
      //dData = dd;                 // ('next' is automatically
      }                           //  set to null)
// -------------------------------------------------------------
   public void displayLink()      // display ourself
      {
      System.out.print( iData +" ");
      }
   }  // end class Link
////////////////////////////////////////////////////////////////
class LinkList
   {
   private Link first;            // ref to first link on list

// -------------------------------------------------------------
   public LinkList()              // constructor
      {
      first = null;               // no links on list yet
      }
// -------------------------------------------------------------
   public boolean isEmpty()       // true if list is empty
      {
      return (first==null);
      }
// -------------------------------------------------------------
                                  // insert at start of list
   public void insertFirst(int id )
      {                           // make new link
      Link newLink = new Link(id);
      newLink.next = first;       // newLink --> old first
      first = newLink;            // first --> newLink
      }
// -------------------------------------------------------------
   public boolean insertAfter( int key , int dd )
   {
       Link current = first ;
       while( current.iData != key )
       {
           current = current.next ;
           if( current == null )
               return false ;
       }
       Link link = new Link(dd);
       link.next = current.next ;
       current.next = link ;
       return true ;
   }
   
// -------------------------------------------------------------
   public Link deleteFirst()      // delete first item
      {                           // (assumes list not empty)
      Link temp = first;          // save reference to link
      first = first.next;         // delete it: first-->old next
      return temp;                // return deleted link
      }
// -------------------------------------------------------------
   public void displayList()
      {
      System.out.print("List (first-->last): ");
      Link current = first;       // start at beginning of list
      while(current != null)      // until end of list,
         {
         current.displayLink();   // print data
         current = current.next;  // move to next link
         }
      System.out.println("");
      }
// -------------------------------------------------------------
   }  // end class LinkList
////////////////////////////////////////////////////////////////
class LinkListApp
   {
   public static void main(String[] args)
      {
      LinkList theList = new LinkList();  // make new list

      theList.insertFirst(22 );      // insert four items
      theList.insertFirst(44 );
      theList.insertFirst(66 );
      theList.insertFirst(88 );
      theList.insertAfter(22, 11);
      theList.displayList();              // display list

      
      }  // end main()
   }  // end class LinkListApp
////////////////////////////////////////////////////////////////
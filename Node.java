import java.util.*;
class Node
{
    int admn_no;
    String name;
    Node next;
    
    void insertnode (Node first, String s)
    {
        Scanner in = new Scanner (System.in);
        if (this.admn_no == 0)
        this.admn_no = 12300;
        int n = 4;
        
        System.out.println ("Enter name: ");
        first.name = in.nextLine();
        first.admn_no = this.admn_no + 1;
        Node last = first;
        
        for (int i = 0; i < n - 1; i++)
        {
            Node x = new Node();
            System.out.println ("Enter name: ");
            x.name = in.nextLine();
            x.admn_no = last.admn_no + 1;
            x.next = null;
            last.next = x;
            last = x;
        }
    }
    
    void printnode (Node first)
    {
        Node last = first;
        
        while (last.next != null)
        {
            System.out.println (first.admn_no);
            System.out.println (first.name);
            last = last.next;
        }
    }
}
import java.io.*;
import java.util.*;

public class Solution {
    static Node head;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            int e = s.nextInt();
            addNode(e);
        }
        if(head!=null)
        {
            Node temp=head;
            while(temp.next!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    static void addNode(int e)
    {
        Node newnode = new Node(e);
        if(head==null)
        head=newnode;
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }
    
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

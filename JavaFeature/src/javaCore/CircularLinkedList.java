package javaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularLinkedList {
	public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String[] s=new String[n+1];
        for(int i=0;i<=n;i++){
            s[i]=sc.nextLine();
        }
        String start=sc.nextLine();
        Node head=new Node();
        head.data=start;
        int po=0;
        for(int i=1;i<=n;i++) {
        	if(s[i].equals(start))
        		po=i;
        }
        List<Node> st=new ArrayList<>();
        for(int i=1;i<=n;i++){
            push(head,s[i]);
            st.add(head);
        }
        st.forEach(e->printList(e));

   }
    static class Node{
       String data;
        Node nextNode;
   }
    static Node push(Node head,String data){
        Node ptr1=new Node();
        Node temp=head;
        ptr1.data=data;
        ptr1.nextNode=head;

        if(head!=null){
            while(temp.nextNode!= head)
                temp=temp.nextNode;
            temp.nextNode=ptr1;
        }else
            ptr1.nextNode=ptr1;

        head=ptr1;

    return head;

   }
   static void printList(Node head){
       Node temp=head;
       if(head!=null){
           do{
               System.out.print(temp.data+" ");
               temp=temp.nextNode;
           }while(temp!=head);
       }
   }
}

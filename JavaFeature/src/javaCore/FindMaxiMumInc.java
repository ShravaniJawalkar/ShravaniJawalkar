package javaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

 class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
  	  this.data=data;
  	  left=null;
  	  right=null;
    }
 }
public class FindMaxiMumInc {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-- >0) {
			String str=br.readLine();
			Node root=builderTree(str);
			System.out.println(longestPath(root));
		}
		
	}

	private static int longestPath(Node root) {
		int[] result=new int[1];
		lcs(root,1,result);
		
		return result[0]==1?-1:result[0];
	}

	private static void lcs(Node root, int currSeq, int[] result) {
		// TODO Auto-generated method stub
		result[0]= Math.max(currSeq, result[0]);
		if(root==null)
			return;
		if(root.left!=null) {
			if(root.left.data==root.data+1)
				lcs(root.left,currSeq+1,result);
			else
				lcs(root.left,1,result);
		}
		if(root.right!=null) {
			if(root.right.data==root.data+1)
				lcs(root.right,currSeq+1,result);
			else
				lcs(root.right,1,result);
		}
		
	}

	private static Node builderTree(String str) {
		// TODO Auto-generated method stub
		if(str.length()==0 || str.charAt(0)=='N')
			return null;
		
		String ip[]=str.split(" ");
		Node root=new Node(Integer.parseInt(ip[0]));
		Queue<Node> que=new LinkedList<>();
		que.add(root);
		int i=1;
		while(que.size()>0 && i<ip.length) {
			Node currNode=que.peek();
			que.remove();
			String curVal=ip[i];
			if(!curVal.equals("N")) {
				currNode.left=new Node(Integer.parseInt(curVal));
				que.add(currNode.left);
			}
			i++;
			if(i>=ip.length)
				break;
			
			curVal=ip[i];
			if(!curVal.equals("N")) {
				currNode.right=new Node(Integer.parseInt(curVal));
				que.add(currNode.right);
			}
			i++;
		}
		
			
			
			
		return root;
	}

}

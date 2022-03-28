package com.example.springhiberjavaConfig.entity.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

public class MinimumDisCu {

	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	
		Node root=binaryTree(a);

	}

	private static Node binaryTree(int[] a) {
	Node root=new Node(a[0]);
	Queue<Node> queue=new LinkedList<>();
	queue.add(root);
	int i=1;
	while(!queue.isEmpty() && i<a.length) {
		Node curNode=queue.peek();
		queue.remove();
		int curVal=a[i];
		if(curVal>root.data) {
			root.right=new Node(curVal);
			queue.add(root.right);
		}else if(curVal<curNode.data) {
			curNode.left=new Node(curVal);
			queue.add(curNode.left);
		}
		i++;
	}
		return root;
	}
}

class Cgf {
	
}
//package com.example.springhiberjavaConfig.entity.java;
//
///* 
// * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
// * Your class should be named CandidateCode.
//*/
//
//import java.io.*;
//import java.util.*;
//
//public class CandidateCode {
//	static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
//
//	public static void main(String args[]) throws Exception {
//
//		// Write code here
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		for (int i = 0; i < n; i++) {
//			tree.add(new ArrayList<>());
//		}
//		for (int i = 0; i < n; i++) {
//			String k = sc.nextLine();
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//
//			addNode(x, y);
//
//		}
//		Node bst = binarySearchTree(tree, n);
//		boolean flag = isBinarySearchTree(bst);
//		if (flag)
//			System.out.println("BST");
//		else
//			System.out.println("BT");
//	}
//
//	private static boolean isBinarySearchTree(Node bst) {
//		// TODO Auto-generated method stub
//		if (bst == null)
//			return false;
//		else if (bst.left == null || bst.right == null)
//			return false;
//		else if (bst.left.data < bst.right.data)
//			return true;
//		else if (bst.left.data > bst.right.data)
//			return false;
//		else
//			return isBinarySearchTree(bst.left) && isBinarySearchTree(bst.right);
//
//	}
//
//	private static void addNode(int x, int y) {
//		tree.get(x).add(y);
//		tree.get(y).add(x);
//
//	}
//
//	public static Node binarySearchTree(ArrayList<ArrayList<Integer>> k, int n) {
//		Node root = null;
//		Queue<Node> queue = new LinkedList<>();
//
//		for (int i = 0; i < k.size(); i++) {
//			if (k.get(i) != null && k.get(i).size() > 0) {
//				root = new Node(i);
//				queue.add(root);
//
//				for (int j = 0; j < k.get(i).size(); j++) {
//					Node currNode = queue.peek();
//					queue.remove();
//					int currVal = k.get(i).get(j);
//					if (currVal != 0) {
//						currNode.left = new Node(currVal);
//						queue.add(currNode.left);
//					}
//					j++;
//					if (j >= k.get(i).size())
//						break;
//					currVal = k.get(i).get(j);
//					if (currVal != 0) {
//						currNode.right = new Node(currVal);
//						queue.add(currNode.right);
//					}
//				}
//
//			}
//
//			
//		}
//		return root;
//	}
//}

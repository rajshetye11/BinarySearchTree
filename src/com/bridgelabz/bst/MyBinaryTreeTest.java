package com.bridgelabz.bst;

public class MyBinaryTreeTest {
	public static void main(String[] args) {

		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(69);
		
		int size = bst.getSize();
		System.out.println(size);
		Assert.assertEquals(3,size);
	}
}

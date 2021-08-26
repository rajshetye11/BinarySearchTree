package com.bridgelabz.bst;

public class MyBinaryTree <K extends Comparable<K>>{

	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
		if(current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left)
									  + this.getSizeRecursive(current.right);
	}
	
	
	public void print() {
		this.getTreeNodes(root);
	}

	private void getTreeNodes(MyBinaryNode<K> root) {
		if(root == null)
			return;
		else {
			getTreeNodes(root.left);
			System.out.println(root.key + " ");
			getTreeNodes(root.right);
		}
	}
	
	private boolean search(MyBinaryNode<K>root, K key) {
		if(root == null)
			return false;
		int compareKey = key.compareTo(root.key);
		if (compareKey == 0) 
			return true;
		if(compareKey < 0 )
			return search(root.left,key);
		else
			return search(root.right, key);
	}
	
	public void searchNode(K key) {
		if(this.search(root, key)) {
			System.out.println(key+" Key Found");
		}else {
			System.out.println(key+" Key Not Found");
		}
	}

}

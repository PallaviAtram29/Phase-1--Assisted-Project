package PracticeProject;
import java.io.*;

public class SinglyLinkedList {
	Node head;
	static class Node;
	{
		int data;
		Node next;
		Node (int d){
			    data = d;
			    next = null;
			    
		}
		
	}
	//method to insert a new node
	{
		public static LinkedList insert(LinkedList , int data)
		{
			//create new node with given data
			Node new node = new Node(data);
			new node.next = null;
			//if the LinkedList is empty then make the new node as head
			if(list.head ==null)
			{
				list.head = new node;
				
			}
			else {
				//else traverse till the last node and insert the new node there
				Node last = list.head;
				while (last.next != null)
				{
					last = last.next;
					 
				}
				return list;                                        main project
				
			}
		}
	}
	

	

}

package PracticeProject;
import java.io.*;
import java.util.*;

import PracticeProject.Sender.ThreadedSend;


public class MultithreadingSynchronization {
 public static void main(String args[]) {
	 Sender snd = new Sender();
	 
	ThreadedSend s1 = new ThreadedSend("hi",snd);
	ThreadedSend s2 = new ThreadedSend("hi",snd);
	 ThreadedSend s11;
	s2.start();
	 s2.start();
	 try {
		 //s1.join();
		 s2.join();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Interrupted");
		 
	 }
 }


	
}
class Sender{
	public void send(String msg) {
		System.out.println(" Sending\t" +msg);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println("Thread interrupted");
			
		}
		System.out.println("\n" +msg +"Sent");
		
	}
	class ThreadedSend extends Thread
	{
		private String msg;
		private Thread t;
		Sender sender;
		ThreadedSend(String m,Sender obj){
			msg = m;
			sender = obj;
			
		}
		public void start() {
			synchronized(sender) {
				sender.send(msg);
			}
		}
	}
	
}
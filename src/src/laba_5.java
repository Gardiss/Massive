package src;
import java.util.Arrays;
import java.util.Scanner;
/**
 * � ������ main ��������� ������
 * ���������� ������� � �������������, � ������ � ��������������� ����������� ������� � ������������ �� ������
 */
public class laba_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Scanner ank = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		System.out.println("������� ������ �������");
		int n = an.nextInt();
		int[] man=new int[n] ;
		for(int i=0;i<n;i++) {
			System.out.println("�������  "+i+"  ������� �������");
			man[i]=in.nextInt();
		}	
		
		System.out.println("���� �� ������ �������� � �������� - �������� ������� Queue, ���� � ��������- ������, �� ������� Stack");
		String answer= scan.nextLine();
		System.out.println("������� ��� ������ ������� � ��������(�����/����������/����� min � max)?");
		String answr= ank.nextLine();
		in.close();
		if (answer.equalsIgnoreCase("Queue")) {
		Queue sam = new Queue(man);
		
		sam.enter();
		switch (answr) {
		case "�����":
	    case "�����":  sam.display();
	             break;
	    case "����������":
	    case "����������":  
	    			sam.sort();
	    			sam.display();
	             break;
	    case "�����":
	    case "�����":   sam.display();
	    				sam.sort();
	    				sam.poisk();
	             break;
	    default: System.out.print("�� ����� ������");
	             break;
	}
		ank.close();
		}
		else if(answer.equalsIgnoreCase("Stack")){
		Stack pam = new Stack(man);
		pam.enter();
		switch (answr) {
		case "�����":
	    case "�����":  pam.display();
	             break;
	    case "����������":
	    case "����������":  
	    			pam.sort();
	    			pam.display();
	             break;
	    case "�����":
	    case "�����":  	pam.display();
	    				pam.sort();
	    				pam.poisk();
	             break;
	    default: System.out.print("�� ����� ������");
	             break;
	}
		ank.close();
		}
		else {
			System.out.println("����� ���������� ������� ���");
		}
	}
}
/**�������� ���������� ��������� ������
 * 
 * @author 112
 *
 */
	interface Structofdata{
		 
	    abstract void display();
	    abstract void enter();
	    abstract void sort();
	    abstract void poisk();
	}
	/**
	 * �������� ������������ ������ Array(������) � ��� ���������� Stack(����) � Queue(�������)
	 * �������� ������� sort( ����������) , display ( ����� � ������� ) , poisk ( ����� min � max ��������� ) ���������� � ������ Array
	 * �������� ������ enter ( ���� )  � ����������� �� ������ ���������� ������ � �������
	 */
	abstract class Array implements Structofdata{

		private int[] mas;
		public Array(int[] mas){

		  this.mas=mas;
		}
		public void sort() {
			Arrays.sort(mas);
		}
		public void display() {
			for(int i=0;i<mas.length;i++) {
				System.out.print(mas[i]+" ");
			}
			System.out.println();
		}
		public void poisk() {
			System.out.print("����������� ������� �������: "+mas[0]+" , ������������ ������� : "+mas[mas.length-1]);
		}
	}
		
	class Queue extends Array implements Structofdata
	{
		private int[] queue;
	public Queue(int[] mas) {
	  super(mas);
	  this.queue=mas;
	}
	
	@Override
	public void enter() {			
		    }
		}	
	
	
		class Stack extends Array implements Structofdata
		{

		private int[] stack;

		public Stack(int[] mas) {

		  super(mas);
		  this.stack=mas;
		}

		public void enter() {			
			
			for (int i = 0; i < stack.length / 2; i++) {
		        int tmp = stack[i];
		        stack[i] = stack[stack.length - i - 1];
		        stack[stack.length - i - 1] = tmp;
		    }
		}	
		}

		 
	      
	




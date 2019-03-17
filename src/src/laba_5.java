package src;
import java.util.Arrays;
import java.util.Scanner;
/**
 * В методе main создается массив
 * Происходит общение с пользователем, и работа с соответствующей реализацией массива в зависисмости от выбора
 */
public class laba_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Scanner ank = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		System.out.println("Введите размер массива");
		int n = an.nextInt();
		int[] man=new int[n] ;
		for(int i=0;i<n;i++) {
			System.out.println("Ваедите  "+i+"  элемент массива");
			man[i]=in.nextInt();
		}	
		
		System.out.println("Если вы хотите работать с массивом - очередью введите Queue, если с массивом- стеком, то введите Stack");
		String answer= scan.nextLine();
		System.out.println("Введите что хотите сделать с массивом(вывод/сортировка/поиск min и max)?");
		String answr= ank.nextLine();
		in.close();
		if (answer.equalsIgnoreCase("Queue")) {
		Queue sam = new Queue(man);
		
		sam.enter();
		switch (answr) {
		case "Вывод":
	    case "вывод":  sam.display();
	             break;
	    case "Сортировка":
	    case "сортировка":  
	    			sam.sort();
	    			sam.display();
	             break;
	    case "Поиск":
	    case "поиск":   sam.display();
	    				sam.sort();
	    				sam.poisk();
	             break;
	    default: System.out.print("Не знаем такого");
	             break;
	}
		ank.close();
		}
		else if(answer.equalsIgnoreCase("Stack")){
		Stack pam = new Stack(man);
		pam.enter();
		switch (answr) {
		case "Вывод":
	    case "вывод":  pam.display();
	             break;
	    case "Сортировка":
	    case "сортировка":  
	    			pam.sort();
	    			pam.display();
	             break;
	    case "Поиск":
	    case "поиск":  	pam.display();
	    				pam.sort();
	    				pam.poisk();
	             break;
	    default: System.out.print("Не знаем такого");
	             break;
	}
		ank.close();
		}
		else {
			System.out.println("Такой реализации массива нет");
		}
	}
}
/**Создание интерфейса структура данных
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
	 * Создание абстрактного класса Array(массив) и его реализаций Stack(стэк) и Queue(очередь)
	 * Описание методов sort( сортировка) , display ( вывод в консоль ) , poisk ( поиск min и max элементов ) содержится в классе Array
	 * Описание метода enter ( ввод )  в зависимости от выбора реализации описан в соответ
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
			System.out.print("Минимальный элемент массива: "+mas[0]+" , Максимальный элемент : "+mas[mas.length-1]);
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

		 
	      
	




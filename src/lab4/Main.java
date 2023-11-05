package lab4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		problema1();
		problema2();
		problema3();
		problema4();
		problema5();
	}
	
	static void problema1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti cuvantul");
		String cuv=scanner.nextLine();
		
		int n=cuv.length();
		if(n%2==0) System.out.print(cuv.charAt(n/2-1) + "" + cuv.charAt(n/2));
		else System.out.println(cuv.charAt(n/2));
	}
	
	static void problema2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti numarul");
		int x=scanner.nextInt();
		scanner.nextLine();
		int s=0;
		while(x>0) {
			s+=x%10;
			x/=10;
		}
		System.out.println("sum is "+ s);
	}
	
	static void problema3() {
		Dog caine1 = new Dog();
		Dog caine2 = new Dog();
		caine1.set("Rex", "Labrador");
		caine2.set("Gia", "Doberman");
		caine1.get();
		caine2.get();
		
	}
	
	static void problema4() {
		Rectangle drept = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("width=");
		int n=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("length=");
		int m=scanner.nextInt();
		scanner.nextLine();
		
		drept.set(n, m);
		
		System.out.println("aria=" + drept.aria());
		System.out.println("perimetru=" + drept.perimetru());
	}
	
	static void problema5() {
		Scanner scanner = new Scanner(System.in);
		
		Person p1 = new Person();
		p1.setName("Andrei");
		p1.setEmail("andrei.popa@gmail.com");
		System.out.println("nume p1="+p1.getName());
		System.out.println("email p1="+p1.getEmail()+"\n");
		
		Student p2 = new Student();
		p2.setName("Marcel");
		p2.setEmail("marcel.ion@gmail.com");
		System.out.println("nume p2="+p2.getName());
		System.out.println("nume p2="+p2.getName());

		Profesor p3 = new Profesor();
		p3.setName("Rozeta");
		p3.setEmail("rozeta.ruptureanu@gmail.com");
		System.out.println("nume p3="+p3.getName());
		System.out.println("nume p3="+p3.getName());
	}
}

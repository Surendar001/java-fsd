package abc;
class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i"+i);
		}
	}
}
class B extends Thread{
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j"+j);
		}
	}
}
public class ExtendThreadClass {

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		obj1.start();
		obj2.start();

	}

}


// Runnable method

package xyz;
class A implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i"+i);
		}
	}
}
class B implements Runnable{
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j"+j);
		}
	}
}
public class ImplementsRunnable {

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread (obj2);
		t1.start();
		t2.start();

	}

}



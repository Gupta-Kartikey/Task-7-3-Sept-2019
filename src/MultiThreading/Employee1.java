package MultiThreading;

public class Employee1 implements Runnable {
	private String ename;
	private int eno=0;
	private int basicSal=0;
	
	public Employee1(String ename, int eno, int basicSal) {
		super();
		this.ename = ename;
		this.eno = eno;
		this.basicSal = basicSal;
	}
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1("Kartikey",1,1234456);
		Employee1 e2=new Employee1("Akansha",2,3475867);
		Employee1 e3=new Employee1("Handay",3,4366743);
		
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e2);
		Thread t3=new Thread(e3);
		t1.start();
		t2.start();
		t3.start();
	}
	public void processSal(int BaseSal,String ename){
		
		double hra=0.0;
	    double da=0.0;
		double ca=0.0;
		
		hra=(BaseSal*0.1)+BaseSal;
		System.out.println("HRA of "+ename+ " is :- "+hra);
		da=(BaseSal*0.25)+BaseSal;
		System.out.println("DA of "+ename+ " is :- "+da);
		ca=(BaseSal*0.1)+BaseSal;
		System.out.println("CA of "+ename+ " is :- "+ca);
	}
	@Override
	public void run() {
		this.processSal(basicSal,ename);
	}
	

}

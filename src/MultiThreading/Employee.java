package MultiThreading;

public class Employee extends Thread {
	private String ename;
	private int eno=0;
	private  int BasicSal=0;
	
	public Employee(String ename, int eno, int basicSal) {
		super();
		this.ename = ename;
		this.eno = eno;
		this.BasicSal = basicSal;
	}
	public void run(){
		this.processSal(BasicSal,ename);
		
	}
	public void main(String[] args) {
		Employee e1=new Employee("Kartikey",1,1234456);
		Employee e2=new Employee("Akansha",2,3475867);
		Employee e3=new Employee("Handay",3,4366743);
		e1.start();
		e2.start();
		e3.start();

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

}

package harika;

public class EmployeeMain {

	public static void main(String[] args) {
				
		Employee e[]= new Employee[5];
		e[0]=new Employee(01,"shree",1000.0);
		e[1]=new Employee(02,"caps",2000.0);
		e[2]=new Employee(03,"hari",1500.0);
		Manager m1=new Manager(04,"ram");

		m1.addManagedEmployee(e[0]);
		Manager m2=new Manager(05,"krish");
		m2.addManagedEmployee(e[1]);
		m2.addManagedEmployee(e[2]);
		Employee[] me=new Employee[10];
		me=m1.getManagedEmployees();
		System.out.println("managed employees are :");
		for(int i=0;i<me.length;i++) {
			System.out.println("id:"+me[i].getId()+"Name:"+me[i].getName()+"Balance:"+me[i].getBalance());
		}
		
		EmployeeMain m=new EmployeeMain();
		m.print(e);
	}
	void print(Employee[] emp) {
		for(int i=0;i<6;i++) {
			System.out.println("id="+emp[i].getId()+"name="+emp[i].getName()+"salary="+emp[i].getBalance());
		}
	}
}

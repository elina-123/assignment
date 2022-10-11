package pro1;
//super keyword  reference variable which refer immediately parent class
//3 usage of super keyword
//1   refer immediate parent class instance variable
	class shape{//parent class
 String name="cicle";//data member of parent class 
	}
 class Size extends shape{//child class method
	 String name="Tringle";//data member of child class
	 void print() {//child class method
		 System.out.println(name);
	 System.out.println(super.name);//super.age
	 }}
 class superKeyword{
	 public static void main(String args[]) {
		 Size obj= new Size();
		 obj.print();
	 }
 }
 

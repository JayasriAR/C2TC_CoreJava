package com.cg.day5.heirachical;

public class Mainhier {
	public static void main(String[] args) {
		//calling dad method
		
		Daughter1 ob1 = new Daughter1();
		ob1.dad();
		ob1.sis();
		ob1.setName("Ram");
		ob1.setNam1("Anu");
		Daughter2 ob = new Daughter2();
		ob.dad(); //access father
		ob.me();
		ob.setNam2("jay");
		System.out.println("Father name is "+ob1.getName()+" Elder Daughter name is "+ob1.getNam1()+" Younger Daughter name is "+ob.getNam2());
	}

}
           
           /*  Hierarchical inheritance  
            *         Father
            *        /      \
            *       /        \
            *  Daughter1   Daughter2
            * 
            * */
            
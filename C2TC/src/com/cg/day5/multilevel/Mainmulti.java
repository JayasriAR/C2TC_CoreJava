package com.cg.day5.multilevel;

public class Mainmulti {
	public static void main(String[] args) {
	       Area a = new Area();
	       a.setCountry("India");
	       a.setState("TN");
	       a.setArea("Villupuram");
	       //access private values using setter
	       //multilevel inheritance
	       System.out.println("Country : "+a.getCountry()+", State : "+a.getState()+", Area : "+a.getArea());
		}

}

/*Multilevel inheritance
 *                   Country --> Parent class
 *                      |
 *                    State  --> Child for country & parent for area
 *                      |
 *                     Area  --> Child for state and country 
 *     object of Area can used to inherit the properties of both state and country
 * */
 
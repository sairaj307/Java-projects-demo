/**
 //pojo POJO stands for Plain Old Java Object
 */
package com.example.oopConcepts;

/**
 * @author SAi
 *
 */
/**
 * 
 */

public class OopsConceptDemo {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		private int serialNum;
		private String name;
		private int age;
		int num;
		
		public int getSerialNum(){
			return serialNum;
		}
		public void setSerialNum (int serialNum) { 
			this.serialNum = serialNum;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public int getAge(){
		return age;
		}
		public void setAge (int age) { 
			this.age=age;
		}
		

		@Override
		public String toString() {
		return "OopsConcept Demo [Serial Number=" + serialNum+", name="+name+", age="+age + "]";
		}


		public static void main(String args[]) { 
			//System.out.println(num); 
			OopsConceptDemo obj= new OopsConceptDemo(); 
			System.out.println(obj.serialNum);
			System.out.println(obj.name);
			//System.out.println(obj.num);
		}
		
}


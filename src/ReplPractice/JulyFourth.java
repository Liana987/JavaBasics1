package ReplPractice;

public class JulyFourth {
	 public abstract class A {
		 abstract void m1();	
		 }
		 public class B extends A {
		  void m1(){
		   System.out.println("m1 without parameters");
		    System.out.println("m1 method with parameter");
		  }
		 }
		 public static class Main {
		 public static void main(String[] args) {
		 B b = new B();
		  b.m1();
		   }
		 }}

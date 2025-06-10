package com.OOPS;

class Parent {
	public void methodOne() {
		System.out.println("method one");
	}
}

class Child extends Parent {
	public void methodTwo() {
		System.out.println("method two ");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		 Parent P=new Parent();
        P.methodOne();
       // P.methodTwo();// compile time error //by using parent reference child method cannot call
       
        Child C=new Child();
           C.methodOne();//
           C.methodTwo();// by using child reference both parent and child method can call
       
//            Parent P=new Child();//by using parent reference we can hold child object but cannot call child specific method
          P.methodOne();//fine
          //P.methodTwo();//error
       
//            Child C=new Parent();//child reference cannot used to hold parent objects
        
        }
	}



package com.Polymorphism;

class DemoMethodoverloading {
    public void m1()
    {
        System.out.println("no arguments");
      }
    public void m1(int i)
    {
        System.out.println("one int  arguments");
        System.out.println(i);
    }

    public void m1(double  d )
    {
        System.out.println("double arguments");
        System.out.println(d);
    }
    public void m1(String s){
        System.out.println("String arguments");
        System.out.println(s);
    }

      public static void main(String[]args){
      
}
}

package com.proftelran.org.lesson4;

public class ChildOne extends MiddleChild{
  @Override
 public void printGreetings() {
      System.out.println("Hello I am child one");
   }


    public ChildOne() {
    }

    @Override
    public void printWishes() {
        super.printWishes();
    }
}

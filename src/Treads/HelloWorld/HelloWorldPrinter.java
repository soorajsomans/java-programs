package Treads.HelloWorld;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello From "+Thread.currentThread().getName());
    }
}


package Treads.HelloWorld;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter h1 =new HelloWorldPrinter();
        Thread t = new Thread(h1);
        t.setName("Hello-World-Thread");
        t.start();
    }
}

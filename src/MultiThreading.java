class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello Threading");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hi Threading");
            try {
                Thread.sleep(10); //TO Make the thread to wait for sometime while executing
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args){
        B obj1 = new B();
        A obj2 = new A();
        obj2.setPriority(10); //Set high priority for faster process
        obj1.start();
        obj2.start();
    }
}

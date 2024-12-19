class MyThread extends Thread{
public MyThread(String name){
super(name);
start();
}
public void run(){
for(int i=1;i<=5;i++){
System.out.println("Child Thread "+i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println("Child Thread Interrupted");
}
}
}
}
public class TestMyThread{
public static void main(String[] args){
MyThread mt1= new MyThread("Child Thread");
for(int i=1;i<=5;i++){
System.out.println("Main Thread: "+i);
try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println("Main Thread Interrupted");
}
}
}
}
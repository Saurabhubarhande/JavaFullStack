class TestRunnable1 implements Runnable{

public void run(){
System.out.println(Thread.currentThread().getName());
}

public static void main (String args[]){
System.out.println(Thread.currentThread().getName());
TestRunnable1 t1=new TestRunnable1();

Thread tt1=new Thread(t1);

Thread tt2=new Thread(t1);
tt1.setPriority(10);
tt1.start();
tt2.start();
}
}


package test2;

class FirstThread implements Runnable{
public void run(){
System.out.println("Thread calls run()");
for(int i=0;i<=10;i++){
System.out.println("First thread value --> "+i);
}
}

}


class SecondThread implements Runnable{
public void run(){
System.out.println("Thread calls run()");
for(int i=11;i<=20;i++){
System.out.println("Second thread value --> "+i);
}
}

}

class UseThread{
public static void main(String[]args){
FirstThread f1 = new FirstThread();
Thread tt1 = new Thread(f1);
tt1.setName("First thread");
try {
	tt1.join();
}
catch (Exception e) {
	// TODO: handle exception
	System.out.println("Some error is occured");
}

tt1.start();

SecondThread f2 = new SecondThread();
Thread tt2 = new Thread(f2);
tt1.setName("Second thread");
tt2.start();

}
}






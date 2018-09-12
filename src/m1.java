 class MyThread extends Thread 
 {
	public void run()
	{
		System.out.println("A");
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("a");
		}
		System.out.println("B");
	}
	

}
 class main
 {
	 public static void main(String[] args)
	 {
		 MyThread t=new MyThread();
		
		 t.start();
		 t.interrupt();
		 Thread.interrupted();
		 boolean b= t.isInterrupted();
		 System.out.println(b);
		//System.out.println(b);
		 
	 }
 }

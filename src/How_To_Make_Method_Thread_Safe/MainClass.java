package How_To_Make_Method_Thread_Safe;

public class MainClass extends Thread
{
	public static void main(String[] args) 
	{
		ThreadClass t1 = new ThreadClass("Thread 1") ;
		t1.start();

		
		ThreadClass t2 = new ThreadClass("Thread 2") ;
		t2.start();
	}
}

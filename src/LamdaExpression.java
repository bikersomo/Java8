
public class LamdaExpression {

	public static void main(String[] args) {

		/**
		 * 
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable");
				
			}
		};
		
		new Thread(runnable).start();
		// Java 8 
		
		//()->{}
		
		Runnable runnableLamda=()->System.out.println("Inside Runnable 2");
		
		
		new Thread(runnableLamda).start();
		
		
		new Thread(()->System.out.println("Inside Runnable 3")).start();
	}

}

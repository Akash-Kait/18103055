public class ANS2 extends Thread {

	static int max = 0, num = 0;
	int start;
	
	public ANS2(int start) {
		this.start = start;
	}

	public static void main(String[] args) {

		ANS2 t1 = new ANS2(1);
		ANS2 t2 = new ANS2(10001);
		ANS2 t3 = new ANS2(20001); 
		ANS2 t4 = new ANS2(30001); 
		ANS2 t5 = new ANS2(40001); 
		ANS2 t6 = new ANS2(50001); 
		ANS2 t7 = new ANS2(60001); 
		ANS2 t8 = new ANS2(70001);
		ANS2 t9 = new ANS2(80001); 
		ANS2 t10 = new ANS2(90001);

		long start = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();


		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
		} 
		catch(Exception e){}

		long end = System.currentTimeMillis();
		System.out.println("Performed with 10 threads.\n");
		System.out.println("Answer: " + num + "\nNumber of divisors = " + max);
		System.out.println("Total time elapsed = " + (end-start)/1000.00 + " seconds.");
	}

	public void run() {
		
		int div=0;
		
		for(int i=start; i<this.start+10000; i++) {
			
			div=0;
			for(int j=1; j<=i; j++) {

				if(i%j==0) {
				
					div+=1;
				}
			}

			if(div>max) {

				synchronized(this) {
					
					max = div;
					num = i;
				}
			}
		}
	}
}
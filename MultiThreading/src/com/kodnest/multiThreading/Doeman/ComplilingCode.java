package com.kodnest.multiThreading.Doeman;

public class ComplilingCode extends Thread {
	@Override
	public void run() {
		for(;;)
		{
			System.out.println("Compiling code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
	}
}


public class printeven extends Thread{
	public void run() {
		for(int i =0; i<=1000;i++) {
			if(i%2 == 0) {
				if(i!=10 && i!=100 && i!=1000) {
					System.out.print(" "+i);
				}
			}
		}
	}

}

public class factorialnumbers implements Runnable {
	public void run() {
		long fact = 1;
		System.out.println("t2started");
		for(int i = 1; i<= 20; i++) {
			for(int j= 1; j<=i ; j++) {
				fact = fact* j;
			}
			System.out.println(fact);
			fact = 1;
		}
	}

}

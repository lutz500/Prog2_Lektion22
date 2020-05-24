package YinYangThreads;

public class YinYangAnoym {

	public static void main(String[] args) {
		Thread t1=new Thread()	{
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
						System.out.println("Yin");
					}catch(Exception e) {
						e.printStackTrace();
					}

				}
			}
		};
		Thread t2=new Thread()	{
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
						System.out.println("Yang");
					}catch(Exception e) {
						e.printStackTrace();
					}

				}
			}
		};
		t1.start();
		t2.start();
	}

}

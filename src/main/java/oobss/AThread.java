package oobss;

/**
 * Created by clarkzhao on 2017/3/10.
 */
public class AThread extends Thread {

    public AThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        }
    }
}

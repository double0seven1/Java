package Thread;

public class PandCThread1 implements Runnable {

    private PandC pand;

    
    public PandCThread1(PandC pand) {
        this.pand = pand;
    }


    @Override
    public void run() {
        while (true) {
            pand.Sub();
        }
    }
}

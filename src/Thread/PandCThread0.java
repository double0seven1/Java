package Thread;

public class PandCThread0 implements Runnable {

    private PandC pand;
    
    public PandCThread0(PandC pand) {
        this.pand = pand;
    }

    @Override
    public void run() {
        while (true) {
            pand.Add();
        }
    }
    
}

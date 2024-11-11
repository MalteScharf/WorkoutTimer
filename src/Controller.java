import java.util.concurrent.TimeUnit;

public class Controller {
    void print(){
        System.out.println("Test");
    }

    public void countdown(int input) throws InterruptedException {
        int i = input;
        while (i>0){
            System.out.println(i);
            i--;
            TimeUnit.SECONDS.sleep(1);
        }

        if (i==0) System.out.println("Done");

    }

}

import java.awt.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
        controller.countdown(3);
        View view = new View();
        view.buildFrame();

    }
}

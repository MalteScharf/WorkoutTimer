import java.awt.*;
import java.awt.event.*;

public class BaseFrame extends Frame {
    public BaseFrame() {
        // local Class
        class ClosingObserver extends WindowAdapter{
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }

        addWindowListener(new ClosingObserver());
        setSize(300,400);
        setLocationRelativeTo(null);

    }
}

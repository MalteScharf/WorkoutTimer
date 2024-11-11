import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    public static void main(String[] args){
        View view = new View();
        view.buildFrame();
    }
    public void buildFrame(){

        Frame f = new BaseFrame();

        Panel panel=new Panel();
        panel.setBounds(80,80,100  ,100);
        panel.setBackground(Color.gray);



        Button startButton = new Button("Start");
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Controller controller = new Controller();
                try {
                    controller.countdown(3);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        Button stoppButton = new Button("Stopp");

        TextField text = new TextField("Countdown Value");

        panel.add(startButton);
        panel.add(stoppButton);
        panel.add(text);

        f.add(panel);
        f.setVisible(true);


    }

}

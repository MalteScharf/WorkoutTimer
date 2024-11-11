import java.awt.*;

public class View {

    public void buildFrame(){
        Frame f = new BaseFrame();

        Panel panel=new Panel();
        panel.setBounds(100,80,200,200);
        panel.setBackground(Color.gray);



        Button startButton = new Button("Start");
        Button stoppButton = new Button("Stopp");
        //startButton.setPreferredSize(100, 100);
        panel.add(startButton);
        panel.add(stoppButton);

        f.add(panel);
        f.setVisible(true);


    }

}

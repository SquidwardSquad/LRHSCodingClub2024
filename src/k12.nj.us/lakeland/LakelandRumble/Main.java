import java.awt.*;
import javax.swing.JFrame;

public class Main {

    public static JFrame window;

    public static void main(String[] args) {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Test Window");

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public void input()
    {

    }

    public void update()
    {

    }

    public void render()
    {
      
    }
  }
import java.awt.*;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    
    //Sprites and backgrounds etc
    //GUI elements


    public GamePanel()
    {
        //Init all JPanel attributes
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        //add key listener
        setFocusable(true);
    }

    @Override
    public void run()
    {
        input();
        update();
        render();
    }

    private void input()
    {

    }

    private void update()
    {

    }

    private void render()
    {

    }

}

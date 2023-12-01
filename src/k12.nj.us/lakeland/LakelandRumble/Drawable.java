import java.awt.*;

public interface Drawable {
    public Image createImage(String file);
    public void draw(Graphics2D g2d);
}
import javax.swing.*;
import java.awt.*;

public abstract class Sprite implements Drawable, Collidable{
    protected int x, y, width, height;
    protected Image image;
    protected Rectangle collisionBox;

    public Sprite(int x, int y, int width, int height, String imageFile) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        image = createImage(imageFile);
        collisionBox = createCollisionBox(x, y, width, height);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Must be overridden in child class
    public abstract void move();

    @Override
    public Image createImage(String file) {
        Image tempImg;
        ImageIcon tempIcon = new ImageIcon(file);
        tempImg = tempIcon.getImage();

        return tempImg;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.drawImage(image, x, y, null);
    }

    @Override
    public Rectangle createCollisionBox(int x, int y, int width, int height) {
        return new Rectangle(x, y, width, height);
    }

    @Override
    public Rectangle getCollisionBox() {
        return collisionBox;
    }

}

import java.awt.*;

public interface Collidable {
    public Rectangle createCollisionBox(int x, int y, int width, int height);
    public Rectangle getCollisionBox();
}

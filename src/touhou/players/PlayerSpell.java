package touhou.players;

import tklibs.SpriteUtils;
import touhou.bases.Constraints;
import touhou.bases.Vector2D;
import touhou.inputs.InputManager;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by huynq on 8/2/17.
 */
public class PlayerSpell {
    private Vector2D position;
    private BufferedImage image;
    private static final float SPEED_BULLET = 5;
    private Constraints constraints;


    public PlayerSpell(Vector2D position){
        this.position = position;
        image = SpriteUtils.loadImage("assets/images/player-spells/a/1.png");
        constraints = new Constraints(0,720,0,364);
    }

    public void run(){
        this.position.y -= SPEED_BULLET;
        if (constraints != null) {
            constraints.make(position);
        }

    }

    public void render(Graphics2D g2d){
        g2d.drawImage(image, (int) position.x, (int) position.y, null);
    }

}

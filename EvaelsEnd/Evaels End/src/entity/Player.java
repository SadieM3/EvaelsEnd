package entity;

import EvaelsEnd.gamePanel;
import EvaelsEnd.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;


public class Player extends Entity {
    gamePanel gp;
    KeyHandler keyH;


    public Player(gamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues(){
        x = 100;
        y = 100;
        speed = 2;
        direction = "down";
    }

    public void getPlayerImage(){
        try{
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/Up1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/Up2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/Down1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/Down2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/Left1.png"));
            left2= ImageIO.read(getClass().getResourceAsStream("/player/Left2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/Right1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/Right2.png"));


        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void update(){

        if (keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true){
            if (keyH.upPressed == true){
                direction = "up";
                y -= speed;
            }
            else if (keyH.downPressed == true){
                direction = "down";
                y += speed;
            }
            else if (keyH.leftPressed == true){
                direction = "left";
                x -= speed;
            }
            else if (keyH.rightPressed == true){
                direction = "right";
                x += speed;
            }

            spriteCounter++;
            if(spriteCounter > 15){
                if(spriteNum == 1){
                    spriteNum = 2;
                }
                else if (spriteNum == 2){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
    }

    public void draw(Graphics2D g2){
        BufferedImage image = null;
        if (direction == "up"){
            if (spriteNum == 1){
                image = up1;
            }
            else if (spriteNum == 2){
                image = up2;

            }
        }
        else if (direction == "down"){
            if (spriteNum == 1){
                image = down1;
            }
            else if (spriteNum == 2){
                image = down2;
            }
        }
        else if (direction == "left"){
            if (spriteNum == 1){
                image = left1;
            }
            else if (spriteNum == 2){
                image = left2;
            }
        }
        else if (direction == "right"){
            if (spriteNum == 1){
                image = right1;
            }
            else if (spriteNum == 2){
                image = right2;
            }
        }

        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}

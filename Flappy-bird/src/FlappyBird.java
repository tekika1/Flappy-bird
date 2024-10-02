import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;



public class FlappyBird extends JPanel implements ActionListener{

    int boardWidth = 360;
    int boardHeight = 640;

    //Images

    Image backGroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    // Bird variables 

    int birdX = boardWidth/8;
    int birdY = boardHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img) {
            this.img =img;
        }

    }
// game logic
    Bird bird;
    int velocityY= -9;
    int gravity = 1;

    Timer gameLoop;
    

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));


        //assigns images to their variables and loads them 

        backGroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        bird = new Bird(birdImg);

        //  game timer
        gameLoop = new Timer(1000/144,this);
        gameLoop.start();


}


public void paintComponent( Graphics g){
    super.paintComponent(g);
    draw(g);

}

public void draw(Graphics g){
    //System.out.println(1);  test if draw command repeats 
    //background of game
    g.drawImage(backGroundImg,0,0,boardWidth,boardHeight,null); // draw always starts from the top left corner then to the bottom right
    g.drawImage(birdImg,bird.x,bird.y,bird.width,bird.height,null);
}

public void move(){
    //bird
    velocityY += gravity;
    bird.y += velocityY;

    bird.y = Math.max(bird.y,0);


}

@Override
public void actionPerformed(ActionEvent e) {
    move();
    repaint();
    
}

    
}

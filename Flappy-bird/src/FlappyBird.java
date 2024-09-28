import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;



public class FlappyBird extends JPanel{

    int boardWidth = 360;
    int boardHeight = 640;

    //Images

    Image backGroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;
    

    

    FlappyBird(){
        setPreferredSize(new Dimension(boardWidth,boardHeight));


        //assigns images to their variables and loads them 

        backGroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();


}


public void paintComponent( Graphics g){
    super.paintComponent(g);
    draw(g);

}

public void draw(Graphics g){
    //background of game
    g.drawImage(backGroundImg,0,0,boardWidth,boardHeight,null);
}

    
}

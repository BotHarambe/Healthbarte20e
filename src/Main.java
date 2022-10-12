import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello world!");
        Friend aFriend = new Friend();
        Friend myFriend = new Friend("Aleks");
        Friend falseFriend = new Friend("William", false);
        System.out.println("aFriend has " + aFriend.getHp());
        System.out.println("how much damage?");
        int damage = myScanner.nextInt();

        aFriend.hit(damage);
        System.out.println("aFriend has " + aFriend.getHp());

        drawWindow();
    }

     /*
    This method draws a frame on which a canvas (panel) is attached. The panel is then used to draw figurres on.
    In this case the figure is a rectangle
*/

    public static void drawWindow() {
        JFrame frame = new JFrame("Healthbar"); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        Healthbar healthbar = new Healthbar(); //Create the canvas
        healthbar.setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
    }


}
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Game {
    Friend myFriend;
    Healthbar healthbar;
    public void Start() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello world");
        myFriend = new Friend("Aleks");
        drawWindow();
        gethit();
    }

        public void drawWindow() {
            JFrame frame = new JFrame("Healthbar");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            healthbar = new Healthbar(myFriend);
            healthbar.setPreferredSize(new Dimension(600, 300));
            frame.getContentPane().add(healthbar);
            frame.pack();
            frame.setVisible(true);
        }
        public void gethit() {
            Scanner myScanner = new Scanner(System.in);
            String ans = "";
            while (myFriend.getHp() > 0) {
                System.out.println("fight");
                ans = myScanner.next();
                if (ans.equals("y")) {
                    myFriend.hit(10);
                    healthbar.repaint();
                }
            }
        }
    }





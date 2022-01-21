package dcit_23_bsit_1_1_project_nila_final;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 650, 355);
        g.setColor(new Color(0, 255, 9));
        g.fillOval(-60, -500, 700, 1300);
        g.setColor(new Color(0, 212, 9));
        g.fillOval(-110, -300, 700, 800);
        g.setColor(new Color(0, 144, 6));
        g.fillOval(-150, -300, 700, 750);
        g.setColor(new Color(55, 55, 55));
        g.fillOval(-180, -300, 700, 700);
        g.setFont(new Font("Arial Black", Font.BOLD, 60));
        g.setColor(new Color(67, 242, 120));
        g.drawString("A", 35, 80);
        g.drawString("T", 35, 140);
        g.drawString("M", 30, 200);
        g.setColor(Color.WHITE);
        g.drawString("UTOMATED", 82, 80);
        g.drawString("ELLER", 82, 140);
        g.drawString("ACHINE", 92, 200);
        g.fillRect(35, 220, 400, 4);
        g.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        g.drawString("© NOMMEL ISANAR LAVAPIE AMOLAT 2019", 35, 250);
        g.setFont(new Font("Trebuchet MS", Font.ITALIC, 10));
        g.drawString("DCIT 23 - MR. CYRIL DAVE M. FLOR", 35, 270);
        g.setFont(new Font("Trebuchet MS", Font.ITALIC, 10));
        g.drawString("BACHELOR OF SCIENCE IN INFORMATION TECHNOLOGY 1-1", 35, 280);
        g.setFont(new Font("Consolas MS", Font.BOLD, 11));
        g.drawString("Last Update: 7th of May 2019", 35, 320);
    }
}

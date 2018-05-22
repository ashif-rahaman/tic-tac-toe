
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ashif
 */
public class HomeFrame extends JFrame implements ActionListener {

    public static Button b1 = new Button("");
    public static Button b2 = new Button("");
    public static Button b3 = new Button("");
    public static Button b4 = new Button("");
    public static Button b5 = new Button("");
    public static Button b6 = new Button("");
    public static Button b7 = new Button("");
    public static Button b8 = new Button("");
    public static Button b9 = new Button("");

    String label;
    String message;
    int click;

    boolean gameOver;

    public HomeFrame() {

        super("My Application");
        setSize(800, 600);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 3));
//        c.add(username);
//        c.add(password);
//        c.add(btnOne);
//
//        btnOne.addActionListener(this);

        b1.setActionCommand("b1");
        b2.setActionCommand("b2");
        b3.setActionCommand("b3");
        b4.setActionCommand("b4");
        b5.setActionCommand("b5");
        b6.setActionCommand("b6");
        b7.setActionCommand("b7");
        b8.setActionCommand("b8");
        b9.setActionCommand("b9");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);
        c.add(b9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        setVisible(true);

        this.click = 0;
        this.message = "";
        this.gameOver = false;

    }

    public static void main(String[] args) {

        new HomeFrame();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        label = ae.getActionCommand();
        switch (label) {
            case "b1":
                if ("".equals(b1.getLabel())) {

                    if (click == 0) {
                        b1.setLabel("0");
                        click = 1;
                    } else {
                        b1.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn1() || checkRow1() || checkCrossLeftDown()) {

                    message = "'" + b1.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b2":

                if ("".equals(b2.getLabel())) {

                    if (click == 0) {
                        b2.setLabel("0");
                        click = 1;
                    } else {
                        b2.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn2() || checkRow1()) {

                    message = "'" + b2.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b3":
                if ("".equals(b3.getLabel())) {

                    if (click == 0) {
                        b3.setLabel("0");
                        click = 1;
                    } else {
                        b3.setLabel("X");
                        click = 0;
                    }
                    
                }

                if (checkCloumn3() || checkRow1() || checkCrossRightDown()) {

                    message = "'" + b3.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b4":

                if ("".equals(b4.getLabel())) {

                    if (click == 0) {
                        b4.setLabel("0");
                        click = 1;
                    } else {
                        b4.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn1() || checkRow2()) {

                    message = "'" + b4.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b5":

                if ("".equals(b5.getLabel())) {

                    if (click == 0) {
                        b5.setLabel("0");
                        click = 1;
                    } else {
                        b5.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn2() || checkRow2() || checkCrossLeftDown() || checkCrossRightDown()) {

                    message = "'" + b5.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b6":

                if ("".equals(b6.getLabel())) {

                    if (click == 0) {
                        b6.setLabel("0");
                        click = 1;
                    } else {
                        b6.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn3() || checkRow2()) {

                    message = "'" + b6.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b7":

                if ("".equals(b7.getLabel())) {

                    if (click == 0) {
                        b7.setLabel("0");
                        click = 1;
                    } else {
                        b7.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn1() || checkRow3() || checkCrossRightDown()) {

                    message = "'" + b7.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b8":

                if ("".equals(b8.getLabel())) {

                    if (click == 0) {
                        b8.setLabel("0");
                        click = 1;
                    } else {
                        b8.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn2() || checkRow3()) {

                    message = "'" + b8.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            case "b9":

                if ("".equals(b9.getLabel())) {

                    if (click == 0) {
                        b9.setLabel("0");
                        click = 1;
                    } else {
                        b9.setLabel("X");
                        click = 0;
                    }

                }

                if (checkCloumn3() || checkRow3() || checkCrossLeftDown()) {

                    message = "'" + b9.getLabel() + "' won the match";
                    JOptionPane.showMessageDialog(null, message);
                    gameOver = true;
                }

                break;

            default:
                break;
        }

        if (gameOver) {

            int i = JOptionPane.showConfirmDialog(null, "Play again?");

            if (i == 0) {

                b1.setLabel("");
                b2.setLabel("");
                b3.setLabel("");
                b4.setLabel("");
                b5.setLabel("");
                b6.setLabel("");
                b7.setLabel("");
                b8.setLabel("");
                b9.setLabel("");

                this.click = 0;
                this.message = "";
                this.gameOver = false;
            } else{
                
                System.exit(0);
            }

        }

    }

    public static boolean checkRow1() {

        if (!(b1.getLabel().equals("") || b2.getLabel().equals("") || b3.getLabel().equals(""))) {

            return (b1.getLabel().equals(b2.getLabel()) && b1.getLabel().equals(b3.getLabel()));
        } else {

            return false;
        }

    }

    public static boolean checkRow2() {

        if (!(b4.getLabel().equals("") || b5.getLabel().equals("") || b6.getLabel().equals(""))) {

            return (b4.getLabel().equals(b5.getLabel()) && b4.getLabel().equals(b5.getLabel()));
        } else {

            return false;
        }
    }

    public static boolean checkRow3() {

        if (!(b7.getLabel().equals("") || b8.getLabel().equals("") || b9.getLabel().equals(""))) {

            return (b7.getLabel().equals(b8.getLabel()) && b7.getLabel().equals(b9.getLabel()));
        } else {

            return false;
        }
    }

    public static boolean checkCloumn1() {

        if (!(b1.getLabel().equals("") || b4.getLabel().equals("") || b7.getLabel().equals(""))) {

            return (b1.getLabel().equals(b4.getLabel()) && b1.getLabel().equals(b7.getLabel()));
        } else {

            return false;
        }

    }

    public static boolean checkCloumn2() {

        if (!(b2.getLabel().equals("") || b5.getLabel().equals("") || b8.getLabel().equals(""))) {

            return (b2.getLabel().equals(b5.getLabel()) && b2.getLabel().equals(b8.getLabel()));
        } else {

            return false;
        }
    }

    public static boolean checkCloumn3() {

        if (!(b3.getLabel().equals("") || b6.getLabel().equals("") || b9.getLabel().equals(""))) {

            return (b3.getLabel().equals(b6.getLabel()) && b3.getLabel().equals(b9.getLabel()));
        } else {

            return false;
        }
    }

    public static boolean checkCrossLeftDown() {

        if (!(b1.getLabel().equals("") || b5.getLabel().equals("") || b9.getLabel().equals(""))) {

            return (b1.getLabel().equals(b5.getLabel()) && b1.getLabel().equals(b9.getLabel()));
        } else {

            return false;
        }

    }

    public static boolean checkCrossRightDown() {

        if (!(b3.getLabel().equals("") || b5.getLabel().equals("") || b7.getLabel().equals(""))) {

            return (b3.getLabel().equals(b5.getLabel()) && b3.getLabel().equals(b7.getLabel()));
        } else {

            return false;
        }
    }
}

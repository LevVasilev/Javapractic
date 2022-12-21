
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;

public class Task2 extends JFrame  {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String backgroundImage;
    String animationImage = "C:/Users/Лев/OneDrive/Рабочий стол/Figures";
    int method;

    Task2() {
        super("Some shapes");
        setSize(this.WINDOW_WIDTH, this.WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout((LayoutManager)null);
        setDefaultCloseOperation(3);
        setVisible(true);
        this.method = 0;
        Button but = new Button("Start animation");
        but.setSize(150, 90);
        but.setLocation(0, 0);
        but.addActionListener(
                new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                method = 1;
                                setTitle("Animation");
                                setSize(WINDOW_WIDTH+1,WINDOW_HEIGHT);
                                setSize(WINDOW_WIDTH-1,WINDOW_HEIGHT);
                            }
                        }
            );
        add(but);
    }

    void setBackgroundImage(String path) {
        this.backgroundImage = this.backgroundImage;
    }

    public void setAnimationImage(String animationImage) {
        this.animationImage = animationImage;
    }

    void randomShapes(int shapes, Graphics2D g) {
        for(int i = 0; i < shapes; ++i) {
            int choise = (int)(Math.random() * 7.0);
            switch (choise) {
                case 1:
                    g.setColor(new Color((int)(Math.random() * 1.6777216E7)));
                    g.fillOval((int)(Math.random() * (double)this.WINDOW_WIDTH), (int)(Math.random() * (double)this.WINDOW_HEIGHT), (int)(Math.random() * 200.0), (int)(Math.random() * 200.0));
                    break;
                case 2:
                    g.setColor(new Color((int)(Math.random() * 1.6777216E7)));
                    g.fillRect((int)(Math.random() * (double)this.WINDOW_WIDTH), (int)(Math.random() * (double)this.WINDOW_HEIGHT), (int)(Math.random() * 200.0), (int)(Math.random() * 200.0));
                case 3:
                default:
                    break;
                case 4:
                    g.setColor(new Color((int)(Math.random() * 1.6777216E7)));
                    g.drawArc((int)(Math.random() * (double)this.WINDOW_WIDTH), (int)(Math.random() * (double)this.WINDOW_HEIGHT), (int)(Math.random() * (double)this.WINDOW_WIDTH), (int)(Math.random() * (double)this.WINDOW_HEIGHT), (int)(Math.random() * 360.0), (int)(Math.random() * 360.0));
                    break;
                case 5:
                    g.setColor(new Color((int)(Math.random() * 1.6777216E7)));
                    g.fillRoundRect((int)(Math.random() * (double)this.WINDOW_WIDTH), (int)(Math.random() * (double)this.WINDOW_HEIGHT), (int)(Math.random() * 200.0), (int)(Math.random() * 200.0), (int)(Math.random() * 200.0), (int)(Math.random() * 200.0));
                    break;
                case 6:
                    g.setColor(new Color((int)(Math.random() * 1.6777216E7)));
                    g.fillOval((int)(Math.random() * (double)this.WINDOW_WIDTH), (int)(Math.random() * (double)this.WINDOW_HEIGHT), 100, 100);
            }
        }

    }

    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D)g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.backgroundImage);
        g.drawImage(img, 0, 0, this.WINDOW_WIDTH, this.WINDOW_HEIGHT, this);
        switch (this.method) {
            case 0:
                this.randomShapes(20, g);
                break;
            case 1:
                this.animate(this.animationImage, g);
        }

    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        File[] var4 = dir.listFiles();
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            File file = var4[var6];
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, this.WINDOW_WIDTH, this.WINDOW_HEIGHT, this);

            try {
                Thread.sleep(300L);
            } catch (InterruptedException var10) {
            }
        }

    }

    public static void main(String[] args) {
        Task2 app = new Task2();
        if (args.length == 1) {
            app.setBackgroundImage(args[0]);
        } else if (args.length == 2) {
            app.setBackgroundImage(args[0]);
            app.setAnimationImage(args[1]);
        } else {
            System.out.println("[!]Background image path is empty");
        }

    }
}

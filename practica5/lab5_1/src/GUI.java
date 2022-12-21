
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel;
    private JPanel panel1;
    private JLabel label1 = new JLabel("Result 0 X 0");
    private JLabel label2 = new JLabel("Last scorer:");
    private JLabel label3 = new JLabel("Winner: DRAW");
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private int counter1;
    private int counter2;
    private enum Actions{
        Milan,
        Madrid
    }

    public GUI() {
        this.button1.addActionListener(this);
        this.button1.setActionCommand(Actions.Milan.name());
        this.button2.addActionListener(this);
        this.button2.setActionCommand(Actions.Madrid.name());
        this.panel = new JPanel();
        this.panel.setBorder(BorderFactory.createEmptyBorder(50, 20, 10, 20));
        this.panel.setLayout(new GridLayout(1, 0));
        this.panel.add(this.button1);
        this.panel.add(this.button2);
        this.panel1 = new JPanel();
        this.panel1.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 10));
        this.panel1.setLayout(new GridLayout(3, 0));
        this.panel1.add(this.label1);
        this.panel1.add(this.label2);
        this.panel1.add(this.label3);
        this.frame.add(this.panel, "Center");
        this.frame.add(this.panel1, "North");
        this.frame.setDefaultCloseOperation(3);
        this.frame.setTitle("task1");
        this.frame.pack();
        this.frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand() == "Milan") {
            ++this.counter1;
            this.label1.setText("Result " + this.counter1 + " X " + this.counter2);
            this.label2.setText("Last scorer: AC Milan");
            if (this.counter1 > this.counter2) {
                this.label3.setText("Winner: AC Milan");
            } else if (this.counter1 < this.counter2) {
                this.label3.setText("Winner: Madrid");
            } else {
                this.label3.setText("Winner: Draw");
            }
        } else if (event.getActionCommand() == "Madrid") {
            ++this.counter2;
            this.label1.setText("Result " + this.counter1 + " X " + this.counter2);
            this.label2.setText("Last scorer: Madrid");
            if (this.counter1 > this.counter2) {
                this.label3.setText("Winner: Milan");
            } else if (this.counter1 < this.counter2) {
                this.label3.setText("Winner: Madrid");
            } else {
                this.label3.setText("Winner: Draw");
            }
        }

    }
}

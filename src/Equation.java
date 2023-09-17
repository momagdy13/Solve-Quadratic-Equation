import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class Equation extends JFrame {
    private JTextField aField;
    private JTextField bField;
    private JTextField cField;
    private JTextField valueX;
    private JTextField valueX2;
    private JButton calculateButton;
    private JPanel Equation;
    private JButton x2V;
    private JButton acButton;
    DecimalFormat format = new DecimalFormat("0.###############");



    public static void main(String[] args) {
        new Equation();
    }

    public Equation() {
        setContentPane(Equation);
        setTitle("Solve Equation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(600, 400);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = Integer.parseInt(cField.getText());


                Double x1 = (Double) ((-b +Math.sqrt(b*b - 4 *a*c))/2*a);
                valueX2.setText(format.format(x1));
                if (x1 <-100 || x1>100 || x1==0){
                    valueX2.setText("Infinity");
                }



            }
        });
        x2V.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = Integer.parseInt(cField.getText());
                Double x2 = (Double) ((-b -Math.sqrt(b*b - 4 *a*c))/2*a);
                valueX.setText(format.format(x2));
                if (x2 <-100 || x2>100 || x2==0){
                    valueX.setText("Infinity");
                }
            }
        });
        acButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aField.setText("");
                bField.setText("");
                cField.setText("");
                valueX2.setText("");
                valueX.setText("");
            }
        });
    }
}

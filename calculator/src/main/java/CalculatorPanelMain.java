import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/04.
 */
public class CalculatorPanelMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame calculator = new JFrame();
            calculator.setTitle("CalculatorPanelTesting");
            calculator.setSize(400, 300);
            calculator.setLocation(500, 400);
            calculator.setVisible(true);
            calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calculator.add(new CalculatorPanel());
        });
    }
}

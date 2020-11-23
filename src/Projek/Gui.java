import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui {
    public Gui() {
        JFrame frame = new JFrame();
        TicTacToe ticTacToe = new TicTacToe();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(3, 3));

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                final JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setName(string);
                button.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ticTacToe.buttonClicked(button);
                            ticTacToe.gameRules(button);
                        }
                    });
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(button);
            }

        }

        frame.add(panel);
        frame.setSize(400,400);
        frame.setVisible(true);




    }
}
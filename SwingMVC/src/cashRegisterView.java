import javax.swing.*;
import java.awt.*;
import java.math.*;

/*
cashRegisterView uses Swing components to visually display the scanned products and their
running subtotal.
*/

public class cashRegisterView {
    // Swing GUI component variable initalization
    private JFrame frame;
    private JTextArea displayArea;
    private JLabel subtotalLabel;

    public cashRegisterView() {
        // Creating display frame and internal text area
        frame = new JFrame("Cash Register Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(450, 200);
        frame.setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        subtotalLabel = new JLabel("Subtotal: $0.00");
        subtotalLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Scroll functionality if list gets long
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(subtotalLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    // Function to update display area based on the items scanned into the "items" product array
    public void updateDisplay(java.util.List<String> items, BigDecimal subtotal) {
        displayArea.setText("");
        for (String item : items) {
            displayArea.append(item + "\n");
        }
        subtotalLabel.setText("Subtotal: $" + subtotal);
    }
}
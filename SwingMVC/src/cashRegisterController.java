import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
cashRegisterController updates the display and handles scan button clicks by combining the
functionality of the model, view, and scanner classes.
*/

public class cashRegisterController {
    private cashRegisterModel model;
    private cashRegisterView view;
    private Scanner scanner;

    public cashRegisterController(cashRegisterModel model, cashRegisterView view, Scanner scanner) {
        this.model = model;
        this.view = view;
        this.scanner = scanner;
        initController();
    }

    // Adds an action listener to the Scan button in the scanner. Every time the
    // button is pressed, handleScan() is activated.
    private void initController() {
        scanner.getScanButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleScan();
            }
        });
    }

    // Retrieves the last UPC code read from the text file. Adds the code's item
    // to the model and refreshes the UI.
    private void handleScan() {
        scanner.generateUPC();
        String upc = scanner.getLastUPC();

        if (upc != null) {
            model.addItem(upc);
            view.updateDisplay(model.getScannedItems(), model.getSubtotal());
        }
    }

}

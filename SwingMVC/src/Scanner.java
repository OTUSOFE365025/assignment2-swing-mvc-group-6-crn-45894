import java.awt.BorderLayout;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Scanner {
    
    private JFrame frame;
    private JPanel scannerPanel;
    private JButton scanButton;
    private List<String> upcList = new ArrayList<>();
    private Random rand = new Random();
	private String lastUPC;

    public Scanner() {
        frame = new JFrame("Scanner");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150, 100);
        frame.setLocation(300, 50);

        scanButton = new JButton("Scan");
        scannerPanel = new JPanel();
        scannerPanel.add(scanButton);
        frame.getContentPane().add(scannerPanel);
        frame.setVisible(true);

        loadUPCs("assignment2-swing-mvc-group-6-crn-45894-master/SwingMVC/src/sampleProducts.txt");
		
    }

    // Method to read UPC codes from a specified file and store them in upcList.
    private void loadUPCs(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                if (tokens.length > 0) {
                    upcList.add(tokens[0]);
                }
            }
            System.out.println("Loaded " + upcList.size() + " UPCs.");
        } catch (IOException e) {
            System.out.println("Error loading UPC file: " + e.getMessage());
        }
    }

    // Method to choose a random code from upcList and store it in lastUPC for access
	public int generateUPC() {
		if (upcList.isEmpty()) {
			System.out.println("No UPC codes loaded.");
			return -1;
		}
		lastUPC = upcList.get(rand.nextInt(upcList.size()));
		System.out.println("Scanned UPC: " + lastUPC);
		return Integer.parseInt(lastUPC);
	}

    // Method to let the controller access the most recently scanned UPC code.
	public String getLastUPC() {
    	return lastUPC;
	}

    public JFrame getFrame() { return frame; }
    public JPanel getScannerPanel() { return scannerPanel; }
    public JButton getScanButton() { return scanButton; }
}

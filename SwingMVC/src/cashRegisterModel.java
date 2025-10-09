import java.io.*;
import java.util.*;
import java.math.*;

/*
cashRegisterModel loads product data from a text file and stores scanned items along with
their associated prices. It also calculates the overall subtotal as items are continuously
scanned.
*/

public class cashRegisterModel {
    // Variables holding product names, prices, an array for scanned items, and the running total.
    private Map<String, String> productNames = new HashMap<>();
    private Map<String, BigDecimal> productPrices = new HashMap<>();
    private List<String> scannedItems = new ArrayList<>();
    private BigDecimal subtotal = BigDecimal.ZERO;

    // Constructor to load products from a specified file.
    public cashRegisterModel(String fileName) {
        loadProducts(fileName);
    }

    // Method to read product codes, names, and prices from the specified file.
    private void loadProducts(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                if (tokens.length >= 3) {
                    String upc = tokens[0];
                    String name = tokens[1];
                    String priceStr = tokens[tokens.length - 1].replace("$", "");
                    BigDecimal price = new BigDecimal(priceStr);
                    productNames.put(upc, name);
                    productPrices.put(upc, price);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading product file: " + e.getMessage());
        }
    }

    // Method to add the price of a scanned item to the running subtotal.
    public void addItem(String upc) {
        String name = productNames.get(upc);
        BigDecimal price = productPrices.get(upc);
        scannedItems.add(name + " - $" + price);
        subtotal = subtotal.add(price);
    }

    // Methods to return all scanned items and the overall subtotal.
    public List<String> getScannedItems() {
        return scannedItems;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }
}

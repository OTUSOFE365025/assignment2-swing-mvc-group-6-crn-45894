/*
Main method to initialize model, view and scanner objects and run the program.
*/

public class cashRegisterMain {
    public static void main(String[] args) {
        cashRegisterModel model = new cashRegisterModel("assignment2-swing-mvc-group-6-crn-45894-master/SwingMVC/src/sampleProducts.txt");
        cashRegisterView view = new cashRegisterView();
        Scanner scanner = new Scanner();
        new cashRegisterController(model, view, scanner);
    }
}

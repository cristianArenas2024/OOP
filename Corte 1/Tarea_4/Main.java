public class Main {
    public static void main(String[] args) {
      
        Visual visual = new Visual();
        

        Operations operations = new Operations();

       
        CalculatorController controller = new CalculatorController(visual, operations);

       
        visual.setVisible(true);
    }
}

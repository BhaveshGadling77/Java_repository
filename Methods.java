public class Methods {

    // ANSI escape codes for colors
    private static final String RESET = "\033[0m";  // Reset color
    private static final String RED = "\033[31m";   // Red
    private static final String GREEN = "\033[32m"; // Green
    private static final String YELLOW = "\033[33m";// Yellow
    private static final String BLUE = "\033[34m";  // Blue
    private static final String MAGENTA = "\033[35m";// Magenta
    private static final String CYAN = "\033[36m";  // Cyan

    // Example data for elements (Atomic Number, Symbol, Mass Number)
    private static final Object[][] PERIODIC_TABLE = {
        {1, "H", 1.008}, {2, "He", 4.0026}, 
        {3, "Li", 6.94}, {4, "Be", 9.0122}, 
        {5, "B", 10.81}, {6, "C", 12.01}, 
        {7, "N", 14.01}, {8, "O", 16.00}, 
        {9, "F", 18.998}, {10, "Ne", 20.180}, 
        // Add more elements here
    };

    public static void main(String[] args) {
        printPeriodicTable();
    }

    private static void printPeriodicTable() {
        System.out.printf("%-5s %-5s %-10s\n", "No", "Symbol", "Mass Number");
        for (Object[] element : PERIODIC_TABLE) {
            int atomicNumber = (int) element[0];
            String symbol = (String) element[1];
            double massNumber = (double) element[2];
            String color = getElementColor(symbol);

            System.out.printf("%s%2d%s %-5s %-10.3f\n", color, atomicNumber, RESET, symbol, massNumber);
        }
    }

    private static String getElementColor(String symbol) {
        switch (symbol) {
            case "H":
                return RED;
            case "He":
                return GREEN;
            case "Li":
                return YELLOW;
            case "Be":
                return BLUE;
            case "B":
                return MAGENTA;
            case "C":
                return CYAN;
            // Add more cases as needed
            default:
                return RESET; // Default color for unspecified elements
        }
    }
}
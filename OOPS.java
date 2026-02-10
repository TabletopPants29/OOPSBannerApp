    public class OOPS {
    public static void main(String[] args) {
        // UC2: OOPS ASCII Art Banner using manual string concatenation
        // 7-line grid with asterisks and spaces
        // Each letter is manually concatenated with proper spacing
        
        // Line 1: Top of letters
        String line1 = "  ***    " + "  ***    " + " ****  " + "  ****  ";
        
        // Line 2: Second line
        String line2 = " *   *   " + " *   *   " + "*   *  " + " *      ";
        
        // Line 3: Third line
        String line3 = "*     *  " + "*     *  " + "****   " + " ****   ";
        
        // Line 4: Fourth line (middle)
        String line4 = "*     *  " + "*     *  " + "*      " + "     *  ";
        
        // Line 5: Fifth line
        String line5 = "*     *  " + "*     *  " + "*      " + "     *  ";
        
        // Line 6: Sixth line
        String line6 = " *   *   " + " *   *   " + "*      " + " *   *  ";
        
        // Line 7: Bottom of letters
        String line7 = "  ***    " + "  ***    " + "*      " + "  ***   ";
        
        // Sequential print statements to display the banner
        System.out.println("OOPS Banner in ASCII Art:");
        System.out.println();
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}

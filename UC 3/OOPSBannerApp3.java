public class OOPSBannerApp3 {
    public static void main(String[] args) {
        // UC3: OOPS ASCII Art Banner using String.join() for better memory efficiency
        // Refactored from UC2 to avoid creating multiple intermediate String objects
        // String.join() is more memory-efficient than the + operator for concatenation

        // Line 1: Top of letters
        // Using String.join() with empty delimiter to concatenate letter parts
        String line1 = String.join("", "  ***    ", "  ***    ", " ****  ", "  ****  ");

        // Line 2: Second line
        String line2 = String.join("", " *   *   ", " *   *   ", "*   *  ", " *      ");

        // Line 3: Third line
        String line3 = String.join("", "*     *  ", "*     *  ", "****   ", " ****   ");

        // Line 4: Fourth line (middle)
        String line4 = String.join("", "*     *  ", "*     *  ", "*      ", "     *  ");

        // Line 5: Fifth line
        String line5 = String.join("", "*     *  ", "*     *  ", "*      ", "     *  ");

        // Line 6: Sixth line
        String line6 = String.join("", " *   *   ", " *   *   ", "*      ", " *   *  ");

        // Line 7: Bottom of letters
        String line7 = String.join("", "  ***    ", "  ***    ", "*      ", "  ***   ");

        // Sequential print statements to display the banner
        System.out.println("OOPS Banner in ASCII Art (UC3 - String.join()):");
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

public class OOPSBannerAPP {
    public static void main(String[] args) {
        // UC4: OOPS ASCII Art Banner using String Arrays and Loops
        // This approach improves upon UC3 by:
        // - Storing all banner lines in a centralized String array
        // - Using an enhanced for-loop to print lines (no repetitive print statements)
        // - Achieving better modularity and code reusability

        // Create array to store all 7 banner lines
        String[] bannerLines = new String[7];

        // Populate each line using String.join() for memory efficiency
        // Line 0: Top of letters
        bannerLines[0] = String.join("", "  ***    ", "  ***    ", " ****  ", "  ****  ");

        // Line 1: Second line
        bannerLines[1] = String.join("", " *   *   ", " *   *   ", "*   *  ", " *      ");

        // Line 2: Third line
        bannerLines[2] = String.join("", "*     *  ", "*     *  ", "****   ", " ****   ");

        // Line 3: Fourth line (middle)
        bannerLines[3] = String.join("", "*     *  ", "*     *  ", "*      ", "     *  ");

        // Line 4: Fifth line
        bannerLines[4] = String.join("", "*     *  ", "*     *  ", "*      ", "     *  ");

        // Line 5: Sixth line
        bannerLines[5] = String.join("", " *   *   ", " *   *   ", "*      ", " *   *  ");

        // Line 6: Bottom of letters
        bannerLines[6] = String.join("", "  ***    ", "  ***    ", "*      ", "  ***   ");

        // Print banner header
        System.out.println("OOPS Banner in ASCII Art (UC4 - Arrays & Loops):");
        System.out.println();

        // Use enhanced for-loop to iterate and print each line
        // This replaces the 7 individual System.out.println() statements from UC3
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

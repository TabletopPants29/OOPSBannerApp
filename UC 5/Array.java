public class Array {
    public static void main(String[] args) {
        // UC5: OOPS ASCII Art Banner - Combined Array Declaration & Initialization with
        // String.join()
        //
        // Key Concept: Array declaration and initialization in a single statement.
        // UC4 approach (two separate steps):
        // String[] bannerLines = new String[7]; // Step 1: declare
        // bannerLines[0] = String.join(...); // Step 2: populate each element
        //
        // UC5 approach (single combined statement):
        // String[] bannerLines = { // Declare AND initialize together
        // String.join(...), // Element 0 assigned inline
        // String.join(...), // Element 1 assigned inline
        // ...
        // };
        //
        // Benefits:
        // - Eliminates separate population statements (more concise)
        // - Improves readability - all data visible at declaration point
        // - Maintains the modularity & loop-printing benefits from UC4

        // Combined array declaration + initialization using String.join() per element
        String[] bannerLines = {
                String.join("", "  ***    ", "  ***    ", " ****  ", "  ****  "), // Line 0: Top
                String.join("", " *   *   ", " *   *   ", "*   *  ", " *      "), // Line 1
                String.join("", "*     *  ", "*     *  ", "****   ", " ****   "), // Line 2
                String.join("", "*     *  ", "*     *  ", "*      ", "     *  "), // Line 3: Middle
                String.join("", "*     *  ", "*     *  ", "*      ", "     *  "), // Line 4
                String.join("", " *   *   ", " *   *   ", "*      ", " *   *  "), // Line 5
                String.join("", "  ***    ", "  ***    ", "*      ", "  ***   ") // Line 6: Bottom
        };

        // Print banner header
        System.out.println("OOPS Banner in ASCII Art (UC5 - Combined Array Init with String.join()):");
        System.out.println();

        // Enhanced for-loop to iterate and print each banner line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

public class Static {

    // -----------------------------------------------------------------------
    // UC6: OOPS ASCII Art Banner - Static Helper Methods
    //
    // Key Concept: Static Methods
    // A static method belongs to the CLASS itself, not to any object instance.
    // It can be called directly using the class name (or just the method name
    // from within the same class) without creating an object.
    //
    // Syntax: static <returnType> <methodName>(<params>) { ... }
    //
    // Design:
    // - Each letter (O, P, S) gets its own static helper method.
    // - Each method takes a line number (0–6) and returns that row's string.
    // - main() calls these helpers inline during array initialization,
    // combining UC5's concise syntax with UC6's modular structure.
    //
    // Benefits over UC5:
    // - DRY: The two O's in "OOPS" share ONE method — change once, affects both.
    // - Readable: Each method name documents what it builds.
    // - Extensible: Adding a new letter = adding one new method.
    // -----------------------------------------------------------------------

    // --- Helper: returns one row of the letter 'O' ---
    static String getO(int line) {
        switch (line) {
            case 0:
                return "  ***    ";
            case 1:
                return " *   *   ";
            case 2:
                return "*     *  ";
            case 3:
                return "*     *  ";
            case 4:
                return "*     *  ";
            case 5:
                return " *   *   ";
            case 6:
                return "  ***    ";
            default:
                return "         ";
        }
    }

    // --- Helper: returns one row of the letter 'P' ---
    static String getP(int line) {
        switch (line) {
            case 0:
                return " ****  ";
            case 1:
                return "*   *  ";
            case 2:
                return "****   ";
            case 3:
                return "*      ";
            case 4:
                return "*      ";
            case 5:
                return "*      ";
            case 6:
                return "*      ";
            default:
                return "       ";
        }
    }

    // --- Helper: returns one row of the letter 'S' ---
    static String getS(int line) {
        switch (line) {
            case 0:
                return "  ****  ";
            case 1:
                return " *      ";
            case 2:
                return " ****   ";
            case 3:
                return "     *  ";
            case 4:
                return "     *  ";
            case 5:
                return " *   *  ";
            case 6:
                return "  ***   ";
            default:
                return "        ";
        }
    }

    public static void main(String[] args) {
        // Combined array declaration + initialization using static helper methods.
        // Each element is built by joining the four character columns: O O P S
        // The two O's call the same getO() method — DRY in action!
        String[] bannerLines = {
                String.join("", getO(0), getO(0), getP(0), getS(0)), // Line 0
                String.join("", getO(1), getO(1), getP(1), getS(1)), // Line 1
                String.join("", getO(2), getO(2), getP(2), getS(2)), // Line 2
                String.join("", getO(3), getO(3), getP(3), getS(3)), // Line 3
                String.join("", getO(4), getO(4), getP(4), getS(4)), // Line 4
                String.join("", getO(5), getO(5), getP(5), getS(5)), // Line 5
                String.join("", getO(6), getO(6), getP(6), getS(6)) // Line 6
        };

        // Print banner header
        System.out.println("OOPS Banner in ASCII Art (UC6 - Static Helper Methods):");
        System.out.println();

        // Enhanced for-loop to display each banner line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

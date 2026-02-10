import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAap {

    // Class to store character patterns and handle banner logic
    static class Banner {
        private Map<Character, String[]> patterns;

        public Banner() {
            patterns = new HashMap<>();
            initPatterns();
        }

        // Modular function to initialize patterns
        private void initPatterns() {
            // Pattern for 'O'
            patterns.put('O', new String[] {
                    "  ***  ",
                    " *   * ",
                    " *   * ",
                    " *   * ",
                    "  ***  "
            });

            // Pattern for 'P'
            patterns.put('P', new String[] {
                    " ****  ",
                    " *   * ",
                    " ****  ",
                    " *     ",
                    " *     "
            });

            // Pattern for 'S'
            patterns.put('S', new String[] {
                    "  **** ",
                    " *     ",
                    "  ***  ",
                    "     * ",
                    " ****  "
            });
        }

        // Modular function to print the banner
        public void printBanner(String text) {
            if (text == null || text.isEmpty())
                return;

            text = text.toUpperCase();
            int height = 5; // Height of the character patterns

            for (int row = 0; row < height; row++) {
                for (char c : text.toCharArray()) {
                    if (Character.isWhitespace(c)) {
                        System.out.print("     ");
                    } else {
                        String[] pattern = patterns.get(c);
                        if (pattern != null && row < pattern.length) {
                            System.out.print(pattern[row] + "  ");
                        } else {
                            System.out.print("?????  "); // Fallback
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Using the Class and methodology to display OOPS
        Banner banner = new Banner();
        System.out.println("Displaying OOPS in Banner Format:");
        banner.printBanner("OOPS");
    }
}

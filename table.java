public class table {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 7, 6, 5, 5 };
        String[][] data = {
                { "Phuti", "sekwadi", "hey" },
                { "kea", "Mangoale", "hey" },
                { "try", "Michel", "hey" },
                { "cee", "Captain", "hey" },
        };

        System.out.println("--------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s |\n", "Names", "surname", "Akere");
        System.out.println("--------------------------------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-10s | ", data[i][j]);
                // System.out.print(data[i][j]);
            }
            System.out.println();
        }
    }
}
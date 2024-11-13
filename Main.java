public class Main {
    public static void main(String[] args) {
        int matrix[][] = {{4, 2}, {1, 7}, {2, 5}, {1, 2}, {3, 1}, {4, 1}, {5, 4}};
        System.out.print("Before Sorting: ");
        printArray(matrix);
        sort2DArray(matrix);
        System.out.print("After Sorting: ");
        printArray(matrix);
    }

    public static void printArray(int m[][]) {
        System.out.print("[");
        for (int i = 0; i < m.length; i++) {
            System.out.print("[" + m[i][0] + ", " + m[i][1] + "]");
            if (i != m.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void sort2DArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                if (array[j][0] < array[i][0] || (array[j][0] == array[i][0] && array[j][1] < array[i][1])) {
                    int[] temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {

        double[][] table = {{25, -3, 5},
                {30, -2, 5},
                {10, 1, 0},
                {6, 3, -8},
                {0, -6, -5}};

        double[] result = new double[2];
        double[][] table_result;

        Simplex S = new Simplex(table);
        table_result = S.calculate(result);
        System.out.println("Simplex table: ");
        System.out.println();

        for (double[] doubles : table_result) {
            for (int j = 0; j < table_result[0].length; j++)
                System.out.print(doubles[j] + " \t");
            System.out.println();
        }


        System.out.println();
        System.out.println("Solution:");
        System.out.println();
        System.out.println("X[1] = " + result[0]);
        System.out.println("X[2] = " + result[1]);
    }


}

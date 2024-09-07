public class soal7
{
    public static void main(String[] args)
    {
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        //Two Dimensional Arrays yang dimasukkan dengan setiap 3 array 1 dimensi
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
                thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
                sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
                ninthArray};
        //Three Dimensional Array yang berisi 3 array 2 dimensi
        int[][][] threeDimensionalArray = {twoDimensionalArray1,
                twoDimensionalArray2, twoDimensionalArray3};


        // Memakai looping untuk mengakses setiap isi dari threeDimensionalArray
        // Looping pertama untuk iterasi setiap array 2 dimensi di dalam
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            // untuk penanda awal dari setiap array
            System.out.print("{");
            // setelah terfilter oleh loopig pertama, disini akan mengiterasi setiap array 1 dimensi
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                System.out.print("{");
                // mengakses setiap elemen dalam array 1 dimensi
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print(threeDimensionalArray[i][j][k]);
                    if (k < threeDimensionalArray[i][j].length - 1) {
                        System.out.print(" ");
                    }
                }
                // penutup array
                System.out.print("}");
                if (j < threeDimensionalArray[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("}");
        }
    }
}

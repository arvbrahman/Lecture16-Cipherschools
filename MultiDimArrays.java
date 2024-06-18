public class MultiDimArrays {

    public static void main(String[] args) {
        int rows = 5;
        int cols= 3;
        int arr[][]= new int[rows][cols];  //Array creation expression

        for (int i = 0; i < arr.length; i++) {  // i -->for rows
            for (int j = 0; j < arr[0].length; j++) { // j --> for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(); //leaving a line as one row printing completes
        }

        System.out.println("**********************************");
        // Array initializiers list
        // we want to create the following array
        // 1 2 3 
        // 4 5 6
        // 7 8 9
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr2.length; i++) {  // i -->for rows
            for (int j = 0; j < arr2[0].length; j++) { // j --> for columns
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(); //leaving a line as one row printing completes
        }

    }
}
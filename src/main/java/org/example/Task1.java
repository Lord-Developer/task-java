package org.example;

public class Task1 {
    public static void main(String[] args) {


        int mat[][] = {
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0 } };
        System.out.println(minMoves(mat));
    }

    public static int minMoves(int mat[][]) {
        if(mat == null || mat.length == 0)return 0;
        if(mat.length != mat[0].length)return 0;

        int n = mat.length;
        // matritsiyani markazi
        int indI = n / 2, indJ = n / 2;

        // 1 ni pozitsiyasini topish
        int oneI = 0, oneJ = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    oneI = i;
                    oneJ = j;
                    break;
                }
            }
        }
        return (Math.abs(indI - oneI) + Math.abs(indJ - oneJ));
    }
}
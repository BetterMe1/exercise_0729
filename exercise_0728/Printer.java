package exercise.exercise_0728;

/*
顺时针打印矩阵
 */
import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4,5},
                       {6,7,8,9,10},
                       {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                };
        System.out.println(Arrays.toString(clockwisePrint(mat,mat.length,mat[0].length)));
    }
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        int[] result = new int[n*m];
        int index = 0;
        int l = 0;
        int r = m-1;
        int u = 0;
        int d = n-1;
        while(l<r && u<d){
            for(int j=l; j<=r; j++){
                result[index] = mat[u][j];
                index++;
            }
            for(int i=u+1; i<d; i++){
                result[index] = mat[i][r];
                index++;
            }
            for(int j=r; j>=l; j--){
                result[index] = mat[d][j];
                index++;
            }
            for(int i=d-1; i>u; i--){
                result[index] = mat[i][l];
                index++;
            }
            l++;
            r--;
            u++;
            d--;
        }
        if(u==d){
            for(int j=l; j<=r; j++){
                result[index] = mat[u][j];
                index++;
            }
        }else if(l==r){
            for(int i=u; i<=d; i++){
                result[index] = mat[i][r];
                index++;
            }
        }
        return result;
    }
}
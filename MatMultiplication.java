import java.util.*;
public class MatMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] A=new int[100][100];
        int[][] B=new int [100][100];
        int ra,ca,rb,cb;
        System.out.print("No.of Rows of A : ");
        ra=sc.nextInt();
        System.out.print("No.of Rows of B : ");
        rb=sc.nextInt();
        System.out.print("No.of Columns of A : ");
        ca=sc.nextInt();
        System.out.print("No.of Columns of B : ");
        cb=sc.nextInt();
        if(ca==rb){
            System.out.println("Enter the elements of A ");
            for(int i=0;i<ra;i++){
                for(int j=0;j<ca;j++){
                    A[i][j]=sc.nextInt();
                }
            }System.out.println("Enter the elements of B ");
            for(int i=0;i<rb;i++){
                for(int j=0;j<cb;j++){
                    B[i][j]=sc.nextInt();
                }
            }int[][] C=new int [100][100];
            for(int i=0;i<ra;i++){
                for(int j=0;j<cb;j++){
                    C[i][j]=0;
                    for(int k=0;k<ca;k++){
                        C[i][j]+=(A[i][k]*B[k][j]);
                    }
                }
            }System.out.println("Matrix C");
            for(int i=0;i<ra;i++){
                for(int j=0;j<cb;j++){
                    System.out.print(C[i][j]+"  ");
                }System.out.println();
            }
        }else{
            System.out.println("Multiplication not possible");
        }
    }
}

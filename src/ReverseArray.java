import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int num=scanner.nextInt();
        int i=0;
        int [] arrA=new int[num];
        System.out.println("Nhập vào các phần tử của mảng: ");
        while (i<arrA.length) {
            arrA[i] =scanner.nextInt();
            i++;
        }
        //In mảng đã nhập
        System.out.print("Mảng đã cho là: ");
//        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j=0;j<arrA.length;j++){
            System.out.print(arrA[j]+"\t");
        }
        //Đảo ngược mảng
        for (int k=0;k<arrA.length/2;k++){
            int n=arrA[k];
            arrA[k]=arrA[arrA.length-1-k];
            arrA[arrA.length-1-k]=n;
        }
        //In mảng sau khi đảo ngược
        System.out.print("\nMảng sau khi đã đảo ngược là: ");
//        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j=0;j<arrA.length;j++){
            System.out.print(arrA[j]+"\t");
        }
    }
}

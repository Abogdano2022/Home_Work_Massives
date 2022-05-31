import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int [] arr1 = new int [3];
    arr1[0] = 1;
    arr1[1] = 2;
    arr1[2] = 3;

    for (int a = 0; a < arr1.length; a++) {
        if (a != arr1.length-1)
        System.out.print(arr1[a] + ", ");
        else
            System.out.println(arr1[a]);
    }
    System.out.println();
    System.out.println("___________");

    float[] arr2 = {1.57f, 7.654f, 9.986f};

        for (int i=0; i< arr2.length; i++) {
        if (i != arr2.length-1)
        System.out.print(arr2[i] + ", ");

    else
            System.out.print(arr2[i]);}

        System.out.println();
        System.out.println("___________");
        int[] arr3 = {7,8,9,10};
        for (int b = 0; b < arr3.length; b++) {
            if (b != arr3.length-1)
                System.out.print(arr3[b] + ", ");
            else
                System.out.print(arr3[b]);
    }
        System.out.println();
        for (int c = arr1.length-1; c >= 0; c --) {
            if(c != 0)
                    System.out.print(arr1[c] + ", ");
            else
                System.out.print(arr1[c]);
        }
        System.out.println();
        for (int d = arr2.length-1; d >= 0; d --){
            if (d != 0)
                System.out.print(arr2[d] + ", ");
            else
                System.out.print(arr2[d]);
        }
        System.out.println();
        for (int e = arr3.length-1; e >= 0; e--) {
            if (e != 0)
                System.out.print(arr3[e] + ", ");
            else
                System.out.print(arr3[e]);
        }
        System.out.println();
        for (int b = 0; b < arr3.length; b++){
            if(arr3[b]%2 == 1) {
                arr3[b]+=1;
            }
            {
                if (b != arr3.length-1)
                    System.out.print(arr3[b] + ", ");
                else
                    System.out.print(arr3[b]);
            }
        }
    }

}
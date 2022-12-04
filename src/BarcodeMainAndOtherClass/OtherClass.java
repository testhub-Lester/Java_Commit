package BarcodeMainAndOtherClass;

import java.util.*;
public class OtherClass {
    
    public static void program(){
        Scanner indexScan = new Scanner(System.in);
        Scanner inputScan = new Scanner(System.in);
        
        ArrayList product = new ArrayList();
        ArrayList barcode = new ArrayList();

        System.out.println("Input Index: ");
        int indexVar = indexScan.nextInt();
        
        for (int x = 0; x < indexVar; x++){
            System.out.println("Input Product Name [" + x+1 + "]");
            product.add(inputScan.nextLine());
            System.out.println("Input Product Barcode [" + x+1 + "]");
            barcode.add(inputScan.nextLine());
            System.out.println();
            System.out.println("Search:");
            String search = inputScan.nextLine();
            int var = barcode.indexOf(search);
            String output = product.get(var).toString();
            System.out.println("Product Name: " + output + " Barcode: " + search);
        }
    }
}

package invoicefothardwarestore;

import java.util.Scanner;

public class InvoiceTest {

     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         Invoice invoice=new Invoice("no details","no details",0,0.0);
       
         System.out.println("enter the part number: ");
         String partNumber=input.nextLine();
         invoice.setPartNumber(partNumber);
         
         System.out.println("enter the part description: ");
         String partDescription=input.nextLine();
         invoice.setPartDescription(partDescription);
         
         System.out.println("enter the quantity of items being purchased: ");
         int quantityOfItemsBeingPurchased=input.nextInt();
         invoice.setQuantityOfItems(quantityOfItemsBeingPurchased);
         
         System.out.println("enter the price per item: ");
         double pricePerItem=input.nextDouble();
         invoice.setPricePerItem(pricePerItem);
       
         System.out.printf("invoice -> part number: %s.\t",invoice.getPartNumber());
         System.out.printf("part description: %s. \t",invoice.getPartDescription());
         System.out.printf("quantity of items being puchased: %d\t",invoice.getQuantityOfItems());
         System.out.printf("price per item: %.2f.\t",invoice.getPricePerItem());
         System.out.printf("invoice amount: %.2f.\n",invoice.getInvoiceAmount());
       
    }
    
}

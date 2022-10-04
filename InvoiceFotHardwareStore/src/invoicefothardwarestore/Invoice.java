package invoicefothardwarestore;

public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantityOfItems;
    private double pricePerItem;
    
    public Invoice(String partNumber,String partDescription,int quantityOfItems,double pricePerItem){
        
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        
        if(quantityOfItems>=0){
            this.quantityOfItems=quantityOfItems;
        }
        else{
            this.quantityOfItems=0;
        }
        
        if(pricePerItem>=0.0){
            this.pricePerItem=pricePerItem;
        }
        else{
            this.pricePerItem=0.0;
        }
        
    }
    
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }
    
    public void setPartDescription(String partDescription){
        this.partDescription=partDescription;
    }
    public String getPartDescription(){
        return partDescription;
    }
    
    public void setQuantityOfItems(int quantityOfItems){
        if(quantityOfItems>=0){
            this.quantityOfItems=quantityOfItems;
        }
        else{
            this.quantityOfItems=0;
        }
    }
    public int getQuantityOfItems(){
        return quantityOfItems;
    }
    
    public void setPricePerItem(double pricePerItem){
        if(pricePerItem>=0.0){
            this.pricePerItem=pricePerItem;
        }
        else{
            this.pricePerItem=0.0;
        }
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    public double getInvoiceAmount(){
        return pricePerItem*quantityOfItems;
    }
    
}

import java.text.NumberFormat;
public class SalesFun { 
  public static double calculateSalesTotal ( double amount, double discountRate, double taxRate ) { 
    double discount = amount * discountRate; 
    double total = amount - discount; 
    double tax = total * taxRate; 
    double taxedTotal = tax + total; 
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(); 
    System.out.println ( "Subtotal : " + numberFormat.format ( amount ) ); 
    System.out.println ( "Discount : " + numberFormat.format ( discount ) ); 
    System.out.println ( "Total : " + numberFormat.format ( total ) ); 
    System.out.println ( "Tax : " + numberFormat.format ( tax ) ); 
    System.out.println ( "Tax+Total: " + numberFormat.format ( taxedTotal ) ); 
    return taxedTotal;
  } 
}

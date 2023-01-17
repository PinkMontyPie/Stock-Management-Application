package UI;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data implements java.io.Serializable{
    private String name;
    private String Price;
    private String Stock;
 
    public String getname() {
            return name;
        }

    public void setname(String ASname) {
            this.name = ASname;
        }

    public String getprice() {
            double Money = Double.parseDouble(Price);
            Locale Thai = new Locale("th", "TH");
            NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Thai);
            return dollarFormat.format(Money);
        }

    public void setprice(String Price) {
            this.Price = Price;
        }

    public String getstock() {
            return Stock;
        }

    public void setstock(String Stock) {
            this.Stock = Stock;
        }
    
    public String getdate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);
        return formattedDate;        
    }
    
}
public class ProfitLoss{

    static int costPrice = 7000;
    static int sellingPrice =1000;
    static  double profit_Loss ;

    public static void main(String[] args){  

    
    if(sellingPrice>costPrice)

   {
 
     profit_Loss = (sellingPrice-costPrice)/100;
     System.out.println("profit : "+profit_Loss +"%");
   }

     else if(costPrice>sellingPrice)

   { 
     profit_Loss = (sellingPrice-costPrice)/100;
     System.out.println("loss : "+profit_Loss +"%");
     
   }

}
}
       
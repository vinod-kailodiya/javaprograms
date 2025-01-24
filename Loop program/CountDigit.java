class contDigit
{
 public static void main(String[] args){

    int a = 12345;
    
   int count = 0; 
    
    for(; a!=0;){
    
    a=a%10;
     
    count = (count+1);

 System.out.println(a);
 
 }
}
}  
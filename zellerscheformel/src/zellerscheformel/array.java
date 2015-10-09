package zellerscheformel;

public class array {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int [] iaMayArray = {2,3,2,5,3,2};
        
        for (int i = 0; i < iaMayArray.length;i++)
        {
            String strDarstellung = "";
            
            for (int n = 0; n < iaMayArray[i]; ++n) {
                strDarstellung = strDarstellung + "x";
                
            }
            System.out.println(i+ " = " + strDarstellung);
            
            
        }
            
        
    }
}
 
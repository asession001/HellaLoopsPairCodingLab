package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int num = 5; //will multiply up to 5 
        String table=""; //empty string to hold the chart 
        for(int i= 1; i<= num; i++) { //rows 
            for(int j=1; j<=num; j++) {//numbers 
                int product= i*j; //first iteration= 1*1, second it=2*2
                if(product!=25){ //only does first 4 rows 
                    table=table+String.format ("%2d |",product);//formatting }
          
                } else{ //at the 25 mark 
                   table=table+String.format ("%2d |\n",product);//formatting
                }
       }
      
         table=table+"\n";//new line after row  
          
          }
         return table;
    }

        

    public static String getLargeMultiplicationTable() {
        int num = 10; //will multiply up to 5 
        String table=""; //empty string to hold the chart 
        for(int i= 1; i<= num; i++) { //rows 
            for(int j=1; j<=num; j++) {//numbers 
                int product= i*j; //first iteration= 1*1, second it=2*2
                if(product!=100){ //only does first 4 rows 
                    table=table+String.format ("%2d |",product);//formatting }
          
                } else{ //at the 25 mark 
                   table=table+String.format ("%2d |\n",product);//formatting
                }
       }
      
         table=table+"\n";//new line after row 
          
          }
         return table;
    }

    public static String getMultiplicationTable(int num) {
        //int num = 5; //will multiply up to 5 
        String table=""; //empty string to hold the chart 
        for(int i= 1; i<= num; i++) { //rows 
            for(int j=1; j<=num; j++) {//numbers 
                int product= i*j; //first iteration= 1*1, second it=2*2
                int lastProduct= (i*num)+(j*num); //the last product in the table 
                if(product!=lastProduct){ //only does first 4 rows 
                    table=table+String.format ("%2d |",product);//formatting }
          
                } else{ //at the 25 mark 
                   table=table+String.format ("%2d |\n",product);//formatting
                }
       }
      
         table=table+"\n";//new line after row 
          
          }
         return table;
    }
}

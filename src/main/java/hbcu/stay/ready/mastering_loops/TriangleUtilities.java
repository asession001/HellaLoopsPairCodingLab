package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String row="";
        String star="*";
        for(int i=0;i<numberOfRows-1;i++){ //9 rows 
            //row 
            for(int j=0;j<i+1;j++){
                //number of stars
                row=row+star; //add the stars to the row 
            }

            row=row+"\n";   //make a new line at the end of the row            
            
        }
        return row;
    }

  
    public static String getRow(int numberOfStars) {
        String row="";
        String star="*";
        for(int i=0;i<numberOfStars;i++){
            row=row+star;
        }
        return row;

        
    }

    public static String getSmallTriangle(int numberOfRows) {

        String row="";
        String star="*";
        for(int i=0;i<numberOfRows-1;i++){ //9 rows 
            //row 
            for(int j=0;j<i+1;j++){
                //number of stars
                row=row+star; //add the stars to the row 
            }

            row=row+"\n";   //make a new line at the end of the row           
            
        }
        return row;
    }

    public static String getLargeTriangle(int numberOfRows) {
        
        String row="";
        String star="*";
        for(int i=0;i<numberOfRows-1;i++){ //9 rows 
            //row 
            for(int j=0;j<i+1;j++){
                //number of stars
                row=row+star; //add the stars to the row 
            }

            row=row+"\n";   //make a new line at the end of the row           
                
        }
        return row;
        
    }
}
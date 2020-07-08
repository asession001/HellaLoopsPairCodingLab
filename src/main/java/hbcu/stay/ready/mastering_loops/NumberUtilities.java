package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenStr=""; //string to add the numbers to

        for (int i=start+1;i<stop;i++){
            if(i%2==0){ //if even
                String num=Integer.toString(i);//change to a string
                evenStr=evenStr+num;//add it to the evens string 
            }else{
                //do nothing  
            }
        }       
         return evenStr;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddStr=""; //string to add the numbers to

        for (int i=start;i<stop;i++){
            if(i%2==1){ //if odd
                String num=Integer.toString(i);//change to a string
                oddStr=oddStr+num;//add it to the evens string 
            }else{
                //do nothing 
            }
        }       
         return oddStr;
    }
        


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareString=""; 
        int square=0;  
        for (int i=start;i<stop;i++){
            if(i%5==0){
                square=(int) Math.pow(i, 2); //square the number i
                String num=Integer.toString(square); //change the int square to a string num
                squareString=squareString+num; //concatenate the string of nums 
                
            }else{
                //do nothing
            }
        }
        return squareString;
    }

    public static String getRange(int stop) {
        // * Given an integer, `stop`, return a `String` concatenation of all integers between `0` up to and not including `stop`.
        //Sample Output =012345678910
        String rangeString=""; //string to add the numbers to 
        for (int i=0;i<stop;i++){
            String num=Integer.toString(i);//change to a string
            rangeString=rangeString+num;//add it to the evens string 
        }

        
        return rangeString;
    }

    public static String getRange(int start, int stop) {
        String rangeString=""; //string to add the numbers to 
        for (int i=start;i<stop;i++){
            String num=Integer.toString(i);//change to a string
            rangeString=rangeString+num;//add it to the evens string 
        }
        return rangeString;
    }


    public static String getRange(int start, int stop, int step) {
        String rangeString=""; //string to add the numbers to
         for (int i=start;i<stop;i=i+step){
            String num=Integer.toString(i);//change to a string
            rangeString=rangeString+num;//add it to the evens string 
        }
        return rangeString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String squareString=""; 
        int square=0;  
        for (int i=start;i<stop;i=i+step){
            if(i%5==0){
                square=(int) Math.pow(i, exponent); //square the number i
                String num=Integer.toString(square); //change the int square to a string num
                squareString=squareString+num; //concatenate the string of nums 
                
            }else{
                //do nothing
            }
        
        }
        return squareString;
    }
}
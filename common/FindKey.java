public class FindKey {

    public static int findKey() {
        int input1 = 2345;
        int input2 = 3452;
        int input3 = 2345;
    
        
        int thousands1 = (input1 / 1000) % 10;
        int thousands2 = (input2 / 1000) % 10;
        int thousands3 = (input3 / 1000) % 10;
        
        // Extract hundreds place digits
        int hundreds1 = (input1 / 100) % 10;
        int hundreds2 = (input2 / 100) % 10;
        int hundreds3 = (input3 / 100) % 10;
        
        // Extract tens place digits
        int tens1 = (input1 / 10) % 10;
        int tens2 = (input2 / 10) % 10;
        int tens3 = (input3 / 10) % 10;
        
        // Extract ones place digits
        int ones1 = input1 % 10;
        int ones2 = input2 % 10;
        int ones3 = input3 % 10;
        // Extract digits from each position
      

        int thousands = Math.max(thousands1, Math.max(thousands2, thousands3));
        int hundreds = Math.max(hundreds1, Math.max(hundreds2, hundreds3));
        int tens = Math.max(tens1, Math.max(tens2, tens3));
        int ones = Math.max(ones1, Math.max(ones2, ones3));

        // Calculate the Key
        int key = thousands + hundreds + tens + ones;

        return key;
    }


    public static void main(String[] args) {
      FindKey fk = new FindKey();
        fk.findKey();   
    }
}

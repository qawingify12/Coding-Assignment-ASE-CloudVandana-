import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral
            int currentValue = romanValues.get(s.charAt(i));
            
            // Check if the next Roman numeral exists and its value is greater than the current Roman numeral
            if (i+1 < s.length() && romanValues.get(s.charAt(i+1)) > currentValue) {
                // Subtract the current value from the result (e.g. IV = 5 - 1 = 4)
                result -= currentValue;
            } else {
                // Add the current value to the result (e.g. VI = 5 + 1 = 6)
                result += currentValue;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanInput = scanner.nextLine();
        
        int intValue = romanToInt(romanInput.toUpperCase());
        System.out.println("The integer value is: " + intValue);
    }
}
package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: " + pw + " Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: " + pw + " Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
        pw = "abcdefghij" ;
        PasswordStrength result2 = PasswordValidator.validate("abcdefghij");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: " + pw + " All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: " + pw + " Expected WEAK but got " + result2);
        }

        pw = "ABBbb12343" ;
        PasswordStrength result3 = PasswordValidator.validate("ABBBB1234");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: " + pw + " Lowercase or uppercase with digits password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: " + pw + " Expected MEDIUM but got " + result3);
        }
        
        pw = "_ABdjdj36541" ;
        PasswordStrength result4 = PasswordValidator.validate("ABdjdj36541");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: " + pw + " Lowercase with uppercase and digits password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: " + pw + " Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
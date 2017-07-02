class SubstringsOfString {
 
    public static void main(String[] args) {
        System.out.println("\n Result = "
                + findMe(" findMe", "Can you findMe from this String?"));
    }
 
    public static boolean findMe(String subString, String mainString) {
        boolean foundme = false;
        int max = mainString.length() - subString.length();
 
        // Using Strings "contains()" Method
        System.out.println(mainString.contains(subString) ? "SubString Found.."
                : "Substring Not Found..");
 
        checkrecusion: for (int i = 0; i <= max; i++) {
            int n = subString.length();
 
            int j = i;
            int k = 0;
 
            while (n-- != 0) {
                if (mainString.charAt(j++) != subString.charAt(k++)) {
                    continue checkrecusion;
                }
            }
            foundme = true;
            break checkrecusion;
        } 
        System.out
        .println(foundme ? " Result: Yes, Match Found.."
                : " Result:  Nope - No Match Found.."); 
        return foundme;
         

    }
}
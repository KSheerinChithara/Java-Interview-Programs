public class sumofdigitsstring {
    public static void main(String[] args)
    {
        String a= "12042023sheerin";
        char ch;
        int sum=0;
        for(int i=0;i<a.length();i++)
        {
            ch = a.charAt(i);
            if(Character.isDigit(ch))
            {
                sum=sum+Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);
    }
}

/*
Output:
14
Algorithm:
1. Create a string with numbers
2.Initialise sum as 0
3.Use for loop to iterate the String and initialise each character in the String using the String method. String.charAt(i);
2.use Character method for finding whether the character isDigit or not
3.Use Character method "getNumericValue(ch)" to get the interger value
4. perform the sum operation

 */

package KellyFang;

public class KFangLib {

    public static boolean isFibonacci(int num)             //input for this method will be an integer, output will be true or false; purpose of this method is to determine if it is in the Fibonacci series.
    {
        int first = 1;
        int second  = 1;

        while ((first<num)&&(second<num))                  //The loop will go on until the variable first or second is equal to or greater than num
        {
            second = first + second;                       //This loop recreates the Fibonacci series by adding two numbers to get a sum, then adding the sum to the previous number and so on
            first = first + second;                        //For example, in the first loop second will become 1+1 = 2 and first will become 2 +1 = 3. In the second loop, second will become 3+2 = 5 and first will become 5+3=8
        }

        if ((first == num)||(second == num))               //When the loop terminates, the method will compare num to second or first, both which are Fibonacci numbers
        {
            return true;                                   //num is a fibonacci number if it is equal to first or second, which are the fibonacci numbers equal to or greater than num
        }

        else                                               //num is not a fibonacci number if it is not equal to first or second
        {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {    //Method takes a string and returns true or false. Purpose is to determine if it is a palindrome or not
        String backwards = "";                          //A new String variable is created to store str backwards.
        for (int i=str.length(); i>0; i--)              //The loop lasts for the entire length of the string and starts from the last letter
        {
            backwards = backwards + str.substring(i-1, i); //It takes the letter of the index and appends it to the new string variable, then the index decrements one
        }
        if (str.equals(backwards))                       //A palindrome is a word that is the same spelled backwards as it is forwards. We compare the new string variable that stores str backwards to the original str
        {
            return true;                                 //If they are the same, that means str is a palindrome since it is the same spelled backwards
        }
        else
        {
            return false;                                //If they are different, that means str is not a palindrome because it is not the same spelled backwards
        }
    }


    public static int sumUpTo(int num)                  //input for this string is an integer and returns an integer. Purpose is to add up all consecutive numbers up to the integer.
    {
        int i = 0;                                      //int i serves as an index
        int sum = 0;                                    //this integer variable stores the sum that we are returning; it is initialized to zero

        while (i < num+1)                               //this loop makes sure that all integers up to the number are added; we use num+1 so the loop breaks after adding num
        {
            sum = sum + i;                              //the purpose of this loop is to add the integer to the variable sum
            i++;                                        //the index will increment to get the next integer added to sum
        }
        return sum;
    }

    public static String datestr(String str)            //Method takes a string the the form mm/dd/yyyy and return is in dd-mm-yyyy
    {
        String date = str.substring(3,5);               //This method heavily takes advantage of the form on str. The date of mm/dd/yyyy, is from indexes 3 to 4. We take the substring from indexes (3,5) because the last index is not included. The substring is stored in a String variable date
        String month = str.substring(0,2);              //The month of mm/dd/yyyy is from index 0-1 so we take the substring from (0,2) and store it in a String variable month
        String year = str.substring(6,10);              //The year of mm/dd/yyyy is from index 6-9 so we take the substring from (6,10) and store it in a String variable year
        String result = date+"-"+month+"-"+year;        //Now to put all the parts into dd-mm-yyyy form by creating a new String variable, result, and append date, then add "-", then append month, then add "-" and finally append year
        return result;                                  //Return the new String variable result
    }

    public static String cutOut(String mainString, String subString)        //Method takes a long string and a shorter one, returning the first string without the first occurence of the second in the first.
    {
        String newString = "";                                              //A new String variable is created to store the mainString without the occurence of the subString
        int lengthSub = subString.length();                                 //we use the length of the subString to know which index of the mainString, the second part will begin
        int firstOccurence = mainString.indexOf(subString);                 //the indexOf of a substring will give the index of the first occurence of subString in mainString

        newString = mainString.substring(0,firstOccurence) + mainString.substring(firstOccurence+lengthSub);        //the newString will store the first part of mainString up to before subString appears and the second part of mainString after subString in the mainString ends.

        return newString;                                                    //the newString is returned
    }
}
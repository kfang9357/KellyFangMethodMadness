package KellyFang;

public class KFangLib {

    public static boolean isFibonacci(int num)             //input for this method will be an integer, output will be true or false; purpose of this method is to determine if it is in the Fibonacci series.
    {
        int first = 1;
        int second  = 1;

        while ((first<num)&&(second<num))                  //this loop 
        {
            second = first + second;
            first = first + second;
        }

        if ((first == num)||(second == num))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        String backwards = "";
        for (int i=str.length(); i>0; i--)
        {
            backwards = backwards + str.substring(i-1, i);
        }
        if (str.equals(backwards))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static int sumUpTo(int num)
    {
        int i = 0;
        int sum = 0;

        while (i < num+1)
        {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public static String datestr(String str)
    {
        String date = str.substring(3,5);
        String month = str.substring(0,2);
        String year = str.substring(6,10);
        String result = date+"-"+month+"-"+year;
        return result;
    }

    public static String cutOut(String mainString, String subString)
    {
        String newString = "";
        int lengthSub = subString.length();
        int firstOccurence = mainString.indexOf(subString);

        newString = mainString.substring(0,firstOccurence) + mainString.substring(firstOccurence+lengthSub);

        return newString;
    }
}
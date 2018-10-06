package KellyFang;

public class KFangLib {

    public static boolean isFibonacci(int num)
    {
        int first = 1;
        int second  = 1;

        while ((first<num)&&(second<num))
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

   /* public static int leastCommonMultiple(int num1, int num2, int num3) //incomplete
    {
        int lcm = 0;
        if ((num1%num2 == 0)&&(num1%num3 == 0)) {
            lcm = num1;
        }
        else if ((num2%num1 == 0)&&(num2%num3 == 0)) {
            lcm = num2;
        }
        else if ((num3%num1 == 0)&&(num3%num2 == 0)) {
            lcm = num3;
        }
        return lcm;
    }**/
    public static int stringUnion(String str1, String str2, String str3)
    {
        int length1 = str1.length();
        int length2 = str2.length();
        int length3 = str3.length();
        int count = 0;



    }
}
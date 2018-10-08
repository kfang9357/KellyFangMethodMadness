package KellyFang;

import static KellyFang.KFangLib.*;

class testFile {

    public static void main(String[] args) {
        System.out.println(KFangLib.isFibonacci(5));                                        //5 is in the fibonacci series: 1+1=2, 2+3=5. True should be returned
        System.out.println(KFangLib.isFibonacci(10));                                       //10 is not in the fibonacci series, false should be returned

        System.out.println(KFangLib.isPalindrome("mom"));                                    //mom backwards is mom so true should be returned
        System.out.println(KFangLib.isPalindrome("mother"));                                 //mother backwards is rehtom so false should be returned

        System.out.println(KFangLib.sumUpTo(3));                                            //sum of the consecutive numbers up to 3 are 0+1+2+3=6
        System.out.println(KFangLib.sumUpTo(5));                                            //sum of the consecutive numbers up to 5 are 0+1+2+3+4+5=15

        System.out.println(KFangLib.datestr("06/22/2002"));                                      //the date rearranged is 22-06-2002
        System.out.println(KFangLib.datestr("04/24/2004"));                                      //the date rearranged is 25-04-2004

        System.out.println(KFangLib.cutOut("catcatcat", "cat"));              //the new string is catcat, it takes away the first cat
        System.out.println(KFangLib.cutOut("central dogma","dog"));           //the new string is central ma, the dog in the middle of the string is removed

    }
}
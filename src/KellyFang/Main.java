package KellyFang;

import static KellyFang.KFangLib.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(KFangLib.isFibonacci(5));
        System.out.println(KFangLib.isFibonacci(10));

        System.out.println(KFangLib.isPalindrome("mom"));
        System.out.println(KFangLib.isPalindrome("mother"));

        System.out.println(KFangLib.sumUpTo(3));
        System.out.println(KFangLib.sumUpTo(5));

        System.out.println(KFangLib.datestr("06/22/2002"));
        System.out.println(KFangLib.datestr("04/24/2004"));

        System.out.println(KFangLib.cutOut("catcatcat", "cat"));
        System.out.println(KFangLib.cutOut("central dogma","dog"));

    }
}
package amer.alaa.mohamed.exceptions;

import javax.security.auth.login.AccountLockedException;
import java.io.File;
import java.io.FileNotFoundException;

public class DaysCount {

    /*
    * RunTime Exception could be written in the methods body but it could not be
    * reporting in the header of the function ==> [العيلة اللي معاها رخصة]
    * But other exception must be reported in the header of functions
    * Exception is the parent of runTimeException ==> See documentation
    *
    * You have Error ==> [ملهاش حل عند المبرمج زي الرامات لما تخلص هتعمل اي مافيش]
    *
    *[و لكن ال exception العادي بيكون ليه حل ممكن انك نعالجه زي المسار تبع الملف مش موجود]
    *
    *   jfs[لما تخلي الدالة ترمي استثناء معين روح اعمله  تعريف في رأس الدالة ]f
    *
    * [بمجرد ما الدالة تقابل اول رمية مش هتكمل وهتقف ]
    *
    * */

    //                               This is a child of RunTimeException[not required reporting ] , You have to report the secon
    int getMonthDaysCount (int month , int year) throws IndexOutOfBoundsException ,AccountLockedException{
        if(year<1950){
            throw new AccountLockedException();
        }
        int x=10;
        int y=0;
        if(y !=0){
            int result=x/y;
        }else {
//            throw new ArithmeticException();
        }

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(year % 4==0){
                    return 30;
                }else{
                    return 28;
                }

            default:
                throw new IndexOutOfBoundsException();
        }
    }


    //Here you could report your exception or not
    public int divisionByZero(int x , int y) throws ArithmeticException{
        if(y!=0){
            return x/y;
        }else {
            throw new ArithmeticException();
        }
    }

    // so here you need to [have to | Must ] report the Exception in the header of your function
    public void fileNotFount() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    
}

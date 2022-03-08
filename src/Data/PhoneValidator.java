
package Data;

public class PhoneValidator {
    private static final String Phone = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
     public boolean checkPhone(String str){
         boolean kt = str.matches(Phone);
         return kt;
     }
}

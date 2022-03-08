
package Data;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


//thong bao rong Jtextfield
public class DataValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb,String erroMessage){
        if(field.getText().equals("")){
            sb.append(erroMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
    }
    // thông báo rỗng JpassWordfield
      public static void validateEmpty(JPasswordField field, StringBuilder sb,String erroMessage){
        String passWord = new String(field.getPassword());
          if(passWord.equals("")){
            sb.append(erroMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
    }
      public static void validateEmpty(ButtonGroup field, StringBuilder sb,String erroMessage){
          if(field.getSelection() == null){
            sb.append(erroMessage).append("\n");
        }
    }

}

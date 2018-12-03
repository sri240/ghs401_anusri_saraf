
import javax.swing.JOptionPane;

public class InputOutput
{
    public static void main(){



        //comment, compiler does not read this
        //comments are for humans
        //a window that asks for name of user

        String password = JOptionPane.showInputDialog("Please enter your password: ");
        
        if(password=="meow"){
            System.out.println("access grant");
        }
        else{
            System.out.println("nah");
        }
        
    }
}



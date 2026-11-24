import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInputValidationForm extends JFrame{

    private JLabel usrInput;
    private JTextField txtField;
    private JButton testButton;
    private JLabel rspLabel;
    private JPanel panelMain;

    public UserInputValidationForm() {

        setTitle("My User Input Validation GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,200);
        setContentPane(panelMain);

        // complete implementation
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = txtField.getText();
                if(str.length() < 5 || str.length() > 20)
                    rspLabel.setText("Response: Test failed");
            }
        });
    }

    public static void main(String []args){
        new UserInputValidationForm();
    }
}

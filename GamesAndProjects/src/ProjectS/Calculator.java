
package ProjectS;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Calculator extends JFrame {

private double tempNumbers1 = 0;
private double tempNumbers2 = 0;
private byte function = -1;
private final JTextField resultJText;

public Calculator() {

    JButton[] numberButtons = new JButton[10];

    for ( int i = 9; i >= 0; i--) {
        numberButtons[i] = new JButton(Integer.toString(i));
        numberButtons[i].setBackground(Color.blue);
        numberButtons[i].setForeground(Color.yellow);
    }

    JButton enterButton     = new JButton("Enter");
    JButton cButton         = new JButton("C");
    JButton multiplyButton  = new JButton("*");
    JButton divideButton    = new JButton("/");
    JButton addButton       = new JButton("+");
    JButton substractButton = new JButton("-");


    resultJText = new JTextField();
        resultJText.setPreferredSize(new Dimension(160, 20));
        resultJText.setBackground(Color.gray);
        resultJText.setEnabled(false);
        resultJText.setHorizontalAlignment(4);
        resultJText.setDisabledTextColor(Color.BLACK);


    JPanel motherPanel = new JPanel();
        motherPanel.setLayout(new BoxLayout(motherPanel, BoxLayout.Y_AXIS));

    JPanel textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(160, 20));
        textPanel.add(resultJText);

    JPanel numberButtonsPanel = new JPanel();
        numberButtonsPanel.setPreferredSize(new Dimension(160, 100));

        for(int i = 9; i>=0; i--) {
            numberButtonsPanel.add(numberButtons[i]);
        }

    JPanel functionButtonPanel = new JPanel();
        functionButtonPanel.setPreferredSize(new Dimension(160, 35));
        functionButtonPanel.add(enterButton);
        functionButtonPanel.add(cButton);
        functionButtonPanel.add(multiplyButton);
        functionButtonPanel.add(divideButton);
        functionButtonPanel.add(addButton);
        functionButtonPanel.add(substractButton);

    numberButtonsAction[] numberButtonActions = new numberButtonsAction[10];
    for ( int i = 0; i < 10; i++ ) {
        numberButtonActions[i] = new numberButtonsAction(numberButtons[i]);
        numberButtons[i].addActionListener(numberButtonActions[i]);
    }

    EnterButton enter = new EnterButton();
        enterButton.addActionListener(enter);

    CButton c = new CButton();
        cButton.addActionListener(c);

    MultiplyButton multiply = new MultiplyButton();
        multiplyButton.addActionListener(multiply);

    DivideButton divide = new DivideButton();
        divideButton.addActionListener(divide);

    AddButton add = new AddButton();
        addButton.addActionListener(add);

    SubtractButton subtract = new SubtractButton();
        substractButton.addActionListener(subtract);

    motherPanel.add(textPanel);
    motherPanel.add(numberButtonsPanel);
    motherPanel.add(functionButtonPanel);
    add(motherPanel);

    setTitle("ButtonTest");
    setSize(400, 400);
    setLocationByPlatform(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    functionButtonPanel.setBackground(Color.blue);
    

}

private class numberButtonsAction implements ActionListener {

    private final String c;

    public numberButtonsAction(JButton a) {
        this.c = a.getText();
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if (!resultJText.getText().equals("0.0")) {
            resultJText.setText(resultJText.getText() + c);
        } else {
            resultJText.setText("");
            actionPerformed(e);
        }
    }
}

private class EnterButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        tempNumbers2 = Double.parseDouble(resultJText.getText());

        switch (function) {
            case 0:
                resultJText.setText(Double.toString((Math.round((tempNumbers1 / tempNumbers2) * 100)) / 100));
                break;
            case 1:
                resultJText.setText(Double.toString(tempNumbers1 * tempNumbers2));
                break;
            case 2:
                resultJText.setText(Double.toString(tempNumbers2 + tempNumbers1));
                break;
            case 3:
                resultJText.setText(Double.toString(tempNumbers1 - tempNumbers2));
                break;
            default:
                resultJText.setText(String.valueOf(tempNumbers1));
                break;
        }
            tempNumbers1 = Double.parseDouble(resultJText.getText());
    }


}

private class CButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        resultJText.setText("");
        tempNumbers1 = 0;
        tempNumbers2 = 0;

        function = -1;
    }


}

private class DivideButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 0;
    }

}

private class MultiplyButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 1;
    }


}


private class AddButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 2;
    }

}

private class SubtractButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tempNumbers1 == 0) {
            tempNumbers1 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        } else {
            tempNumbers2 = Double.parseDouble(resultJText.getText());
            resultJText.setText("");
        }
        function = 3;
    }

    }
}
class tbc {
    public static void main(String[] args) {
        Calculator ob = new Calculator();
    }
}


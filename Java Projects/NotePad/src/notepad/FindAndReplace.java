package notepad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FindAndReplace extends JDialog implements ActionListener {

    JTextField searchText, replaceText;
    JCheckBox cbCase, cbWhole;
    JRadioButton up, down;
    JLabel statusinfo;
    JFrame owner;
    boolean foundone, isreplace;
    JPanel north, center, south;

    public FindAndReplace(JFrame owner, boolean isreplace) {
        super(owner, true);
        this.isreplace = isreplace;
        north = new JPanel();
        center = new JPanel();
        south = new JPanel();
        if (isreplace) {
            setTitle("Find And Replace");
        } else {
            setTitle("Find");
            setFindPanel(north);
        }
        addComponent(center);
        statusinfo = new JLabel("Status info: ");
        south.add(statusinfo);
        addWindowListener(new WindowAdapter() {
            public void windowclosing(WindowEvent e) {
                dispose();
            }
        });
        getContentPane().add(north, BorderLayout.NORTH);
        getContentPane().add(center, BorderLayout.CENTER);
        getContentPane().add(south, BorderLayout.SOUTH);
        pack();
        setResizable(false);
        setVisible(true);

    }

    public void setFindPanel(JPanel north) {
        final JButton next = new JButton("Find Next");
        next.addActionListener(this);
        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.setForeground(Color.black);
        next.setBackground(Color.pink);
        next.setEnabled(false);
        searchText = new JTextField(15);
        searchText.setForeground(Color.blue);
        searchText.setFont(new Font("Arial", Font.BOLD, 12));
        searchText.addActionListener(this);
        searchText.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                boolean state = (searchText.getDocument().getLength() > 0);
                next.setEnabled(state);
                foundone = false;
            }
        });
        if (searchText.getText().length() > 0) {
            next.setEnabled(true);
        }
        north.add(new JLabel("Find Word:"));
        north.add(searchText);
        north.add(next);
    }

    public void addComponent(JPanel center) {
        JPanel east = new JPanel();
        JPanel west = new JPanel();
        center.setLayout(new GridLayout(1, 2));
        east.setLayout(new GridLayout(2, 1));
        west.setLayout(new GridLayout(2, 1));
        cbCase = new JCheckBox("Match Case", true);
        cbWhole = new JCheckBox("Match Word", true);
        ButtonGroup group = new ButtonGroup();
        up = new JRadioButton("Search up", false);
        down = new JRadioButton("Search down", true);
        group.add(up);
        group.add(down);
        east.add(cbCase);
        east.add(cbWhole);
        east.setBorder(BorderFactory.createTitledBorder("Search Options: "));
        west.add(up);
        west.add(down);
        west.setBorder(BorderFactory.createTitledBorder("Search Directional: "));
        center.add(east);
        center.add(west);
    }

    public int search(String text, String word, int caret) {
        boolean found = false;
        int all = text.length();
        int check = word.length();
        if (isSearchDown()) {
            int add = 0;
            for (int i = caret + 1; i < (all - check); i++) {
                String temp = text.substring(i, (i + check));
                if (temp.equals(word)) {
                    if (wholeWordisSelected()) {
                        if (checkforwhileWord(check, text, add, caret)) {
                            caret = i;
                            found = true;
                            break;
                        }
                    } else {  // not whole world
                        caret = i;
                        found = true;
                        break;
                    }
                }
            }
        } else {
            int add = caret;
            for (int i = caret - 1; i < check; i--) {
                add--;
                String temp = text.substring(i - check, i);
                if (temp.equals(word)) {
                    if (wholeWordisSelected()) {
                        if (checkforwhileWord(check, text, add, caret)) {
                            caret = i;
                            found = true;
                            break;
                        }
                    } else {  // not whole world
                        caret = i;
                        found = true;
                        break;
                    }
                }
            }
        }
        NotePad.getArea().setCaretPosition(0);
        if (found) {
            NotePad.getArea().requestFocus();
            if (isSearchDown()) {
                NotePad.getArea().select(caret, caret + check);
            } else {
                NotePad.getArea().select(caret - check, caret);
            }
            foundone = true;
            return caret;
        }
        return -1;
    }

    public String getWord() {
        if (caseNotSelected()) {
            return NotePad.getArea().getText().toLowerCase();
        }
        return NotePad.getArea().getText();
    }

    public boolean caseNotSelected() {
        return !cbCase.isSelected();
    }

    public String getAllText() {
        if (caseNotSelected()) {
            return searchText.getText().toLowerCase();
        }
        return searchText.getText();
    }

    public void process() {
        if (isreplace) {
            statusinfo.setText("Replacing : " + searchText.getText());
        } else {
            statusinfo.setText("Seacrching : " + searchText.getText());
        }
        int caret = NotePad.getArea().getCaretPosition();
        String word = getWord();
        String text = getAllText();
        caret = search(text, word, caret);
        if (caret < 0) {
            endResult(false, 0);
        }
    }

    private void endResult(boolean isReplaceAll, int tally) {
        String Message = "";
        if (isReplaceAll) {

        } else {
            String str = "";
            if (isSearchDown()) {
                str = "Search Down";
            } else {
                str = "Search Up";
            }
            if (foundone && !isreplace) {
                Message = "End of" + str + "for" + searchText.getText();
            } else if (foundone && isreplace) {
                Message = "End of Replac" + searchText.getText() + "with"
                        + replaceText.getText();
            }
        }
        statusinfo.setText(Message);
    }

    public boolean isSearchDown() {
        return down.isSelected();
    }

    public boolean checkforwhileWord(int check, String text, int add, int caret) {
        int offsetleft = (caret + add) - 1;
        int offsetright = (caret + add) + check;
        if (offsetleft < 0 || offsetright > text.length()) {
            return true;
        }
        return (!Character.isLetterOrDigit(text.charAt(offsetleft))
                && !Character.isLetterOrDigit(text.charAt(offsetright)));
    }

    public boolean wholeWordisSelected() {
        return cbWhole.isSelected();
    }

    public void setFindAndreplacePanel() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(replaceText)) {
            validate();
        }
        process();
    }
}

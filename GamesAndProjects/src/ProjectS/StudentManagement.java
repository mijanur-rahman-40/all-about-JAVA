package ProjectS;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentManagement extends JFrame implements ActionListener {

    Container c;
    JTable table;
    DefaultTableModel model;
    JLabel Title, FirstName, LastName, Gpa, phone, Data;
    JTextField F_N_T_F, L_N_T_F, GPA_T_F, PHONE_T_F;
    JButton ADD_button, UPDATE_button, DELETE_button, CLEAR_button;
    Font fon1, fon2;
    String[] colums = {"First Name", "Last Name", "GPA", "Phone Number"};
    String[] rows = new String[4];

    JScrollPane pane;

    StudentManagement() {
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);

        fon1 = new Font("Arial", Font.BOLD, 22);
        fon2 = new Font("Arial", Font.BOLD, 18);

        Title = new JLabel();
        Title.setText("||||||____STUDENT  REGISTRATION____||||||");
        Title.setBounds(60, 10, 500, 50);
        Title.setForeground(Color.blue);
        Title.setFont(fon1);
        c.add(Title);

        FirstName = new JLabel();
        FirstName.setText("First Name");
        FirstName.setBounds(20, 55, 100, 50);
        FirstName.setForeground(Color.black);
        FirstName.setFont(fon2);
        c.add(FirstName);

        LastName = new JLabel();
        LastName.setText("Last Name");
        LastName.setBounds(20, 100, 100, 50);
        LastName.setForeground(Color.black);
        LastName.setFont(fon2);
        c.add(LastName);

        Gpa = new JLabel();
        Gpa.setText("GPA");
        Gpa.setBounds(20, 145, 70, 50);
        Gpa.setForeground(Color.black);
        Gpa.setFont(fon2);
        c.add(Gpa);

        phone = new JLabel();
        phone.setText("Phone Number");
        phone.setBounds(20, 190, 135, 50);
        phone.setForeground(Color.black);
        phone.setFont(fon2);
        c.add(phone);

        Data = new JLabel();
        Data.setText("Data Table : ");
        Data.setBounds(20, 245, 130, 50);
        Data.setForeground(Color.blue);
        Data.setFont(fon1);
        c.add(Data);

        F_N_T_F = new JTextField();
        F_N_T_F.setBounds(160, 70, 210, 25);
        F_N_T_F.setForeground(Color.red);
        F_N_T_F.setFont(fon2);
        c.add(F_N_T_F);

        L_N_T_F = new JTextField();
        L_N_T_F.setBounds(160, 115, 210, 25);
        L_N_T_F.setForeground(Color.red);
        L_N_T_F.setFont(fon2);
        c.add(L_N_T_F);

        GPA_T_F = new JTextField();
        GPA_T_F.setBounds(160, 160, 210, 25);
        GPA_T_F.setForeground(Color.red);
        GPA_T_F.setFont(fon2);
        c.add(GPA_T_F);

        PHONE_T_F = new JTextField();
        PHONE_T_F.setBounds(160, 203, 210, 25);
        PHONE_T_F.setForeground(Color.red);
        PHONE_T_F.setFont(fon2);
        c.add(PHONE_T_F);

        ADD_button = new JButton("Add");
        ADD_button.setBounds(430, 69, 100, 25);
        ADD_button.setFont(fon2);
        ADD_button.setBackground(Color.black);
        ADD_button.setForeground(Color.YELLOW);
        c.add(ADD_button);

        UPDATE_button = new JButton("Update");
        UPDATE_button.setBounds(430, 114, 100, 25);
        UPDATE_button.setFont(fon2);
        UPDATE_button.setBackground(Color.black);
        UPDATE_button.setForeground(Color.YELLOW);
        c.add(UPDATE_button);

        DELETE_button = new JButton("Delete");
        DELETE_button.setBounds(430, 159, 100, 25);
        DELETE_button.setFont(fon2);
        DELETE_button.setBackground(Color.black);
        DELETE_button.setForeground(Color.YELLOW);
        c.add(DELETE_button);

        CLEAR_button = new JButton("Clear");
        CLEAR_button.setBounds(430, 202, 100, 25);
        CLEAR_button.setFont(fon2);
        CLEAR_button.setBackground(Color.black);
        CLEAR_button.setForeground(Color.YELLOW);
        c.add(CLEAR_button);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        table.setModel(model);

        table.setForeground(Color.blue);
        table.setBackground(Color.white);
        table.setRowHeight(30);
        table.setFont(fon2);
        table.setSelectionBackground(Color.green);

        pane = new JScrollPane(table);
        pane.setBounds(20, 298, 545, 239);
        c.add(pane);

        ADD_button.addActionListener(this);
        DELETE_button.addActionListener(this);
        CLEAR_button.addActionListener(this);
        UPDATE_button.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int rownum = table.getSelectedRow();

                String firstname = model.getValueAt(rownum, 0).toString();
                String lastname = model.getValueAt(rownum, 1).toString();
                String gpa = model.getValueAt(rownum, 2).toString();
                String phonenum = model.getValueAt(rownum, 3).toString();

                F_N_T_F.setText(firstname);
                L_N_T_F.setText(lastname);
                GPA_T_F.setText(gpa);
                PHONE_T_F.setText(phonenum);

            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" StudentManagement ");
        setBounds(100, 90, 600, 595);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ADD_button) {

            rows[0] = F_N_T_F.getText();
            rows[1] = L_N_T_F.getText();
            rows[2] = GPA_T_F.getText();
            rows[3] = PHONE_T_F.getText();

            model.addRow(rows);

        } else if (e.getSource() == CLEAR_button) {

            F_N_T_F.setText(null);
            L_N_T_F.setText(null);
            GPA_T_F.setText(null);
            PHONE_T_F.setText(null);

        } else if (e.getSource() == DELETE_button) {

            int numberOfRow = table.getSelectedRow();
            if (numberOfRow >= 0) {
                model.removeRow(numberOfRow);
            } else {
                JOptionPane.showMessageDialog(null, "No Row Has Been Selected Or No Row Exist.");
            }
        } else if (e.getSource() == UPDATE_button) {

            int rownumber = table.getSelectedRow();

            String First_name = F_N_T_F.getText();
            String Last_name = L_N_T_F.getText();
            String gpa = GPA_T_F.getText();
            String phonenumber = PHONE_T_F.getText();

            model.setValueAt(First_name, rownumber, 0);
            model.setValueAt(Last_name, rownumber, 1);
            model.setValueAt(gpa, rownumber, 2);
            model.setValueAt(phonenumber, rownumber, 3);

        }

    }

    public static void main(String[] args) {
        StudentManagement kd = new StudentManagement();
    }

}

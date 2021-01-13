package notepad;

import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.StringTokenizer;

public class NotePad extends JFrame {

    static JTextArea area;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuHelp;
    JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemExit, itemCopy,
            itemCut, itemPaste, itemFontColor, itemFind, itemReplace;
    ImageIcon NewIcon, SaveAsIcon, SaveIcon, OpenIcon, ExitIcon,
            CopyIcon, CutIcon, PasteIcon, FindIcon, ReplaceIcon;
    String filename;
    JFileChooser jc;
    String fileContent;
    UndoManager undo;
    UndoAction undoAction;
    RedoAction redoAction;
    JCheckBoxMenuItem wordWrap;
    String findnext;
    int fnext = 1;
   // public static NotePad frmMain = new NotePad();

    public NotePad() {
        initComponents();
        itemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });
        itemSaveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAs();
            }
        });
        itemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });
        itemNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNew();
            }
        });
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        itemCut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.cut();
            }
        });
        itemCopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.copy();
            }
        });
        itemPaste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.paste();
            }
        });
        area.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {

                undo.addEdit(e.getEdit());
                undoAction.update();
                redoAction.update();
            }
        });

        wordWrap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wordWrap.isSelected()) {
                    area.setLineWrap(true);
                    area.setWrapStyleWord(true);
                } else {
                    area.setLineWrap(false);
                    area.setWrapStyleWord(false);
                }
            }
        });
        itemFontColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(rootPane, "Choose font color", Color.black);
                area.setForeground(c);
            }
        });
        itemFind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FindAndReplace(null, false);
            }
        });
    }

    public void initComponents() {
        area = new JTextArea();
        getContentPane().add(area);
        getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);

        //Menu bar
        menuBar = new JMenuBar();

        //Undo and Redo
        undo = new UndoManager();
        ImageIcon iconUndo = new ImageIcon("src/Undo.png");
        ImageIcon iconRedo = new ImageIcon("src/Redo.png");

        undoAction = new UndoAction(iconUndo);
        redoAction = new RedoAction(iconRedo);

        //JFileChooser
        jc = new JFileChooser();

        //Menu
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        menuHelp = new JMenu("Help");
        menuFormat = new JMenu("Format");

        //Add Icon for Filemenu 
        NewIcon = new ImageIcon("src/New.png");
        OpenIcon = new ImageIcon("src/Open.png");
        SaveIcon = new ImageIcon("src/Save.png");
        SaveAsIcon = new ImageIcon("src/Save as.png");
        
        //add Icon for Editmenu
        CopyIcon = new ImageIcon("src/Copy.png");
        CutIcon = new ImageIcon("src/Cut.png");
        PasteIcon = new ImageIcon("src/Paste.png");
        
        //add Icon for format
        FindIcon = new ImageIcon("src/Find.png");
        ReplaceIcon = new ImageIcon("src/Replace.png");

        //Menu Item
        itemNew = new JMenuItem("New", NewIcon);
        itemOpen = new JMenuItem("Open", OpenIcon);
        itemSave = new JMenuItem("Save", SaveIcon);
        itemSaveAs = new JMenuItem("SaveAs", SaveAsIcon);
        itemExit = new JMenuItem("Exit");

        itemCut = new JMenuItem("Cut", CutIcon);
        itemCopy = new JMenuItem("Copy", CopyIcon);
        itemPaste = new JMenuItem("Paste", PasteIcon);

        wordWrap = new JCheckBoxMenuItem("WordWrap");
        itemFontColor = new JMenuItem("Font Color");

        itemFind = new JMenuItem("Find", FindIcon);
        itemReplace = new JMenuItem("Replace", ReplaceIcon);

        //Adding Shortcut
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        //Add Menu Item
        //file menu
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemSaveAs);
        menuFile.addSeparator();
        menuFile.add(itemExit);

        //edit menu
        menuEdit.add(undoAction);
        menuEdit.add(redoAction);
        menuEdit.add(itemCut);
        menuEdit.add(itemCopy);
        menuEdit.add(itemPaste);
        menuEdit.addSeparator();
        menuEdit.add(itemFind);
        menuEdit.add(itemReplace);

        //formet menu
        menuFormat.add(wordWrap);
        menuFormat.add(itemFontColor);

        //Add Menu item Menu Bar
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuFormat);
        menuBar.add(menuHelp);

        //Add menuBar to frame
        setJMenuBar(menuBar);

        area.setFont(new Font("Arial", Font.PLAIN, 20));
        setTitle("Untitled NotePad");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void save() {
        PrintWriter print = null;
        try {
            if (filename == null) {
                saveAs();
            } else {
                print = new PrintWriter(new FileWriter(filename));
                String s = area.getText();
                StringTokenizer st = new StringTokenizer(s, System.getProperty("line.separator"));
                while (st.hasMoreElements()) {
                    print.println(st.nextToken());
                }
                JOptionPane.showMessageDialog(rootPane, "File Saved");
                fileContent = area.getText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (print != null) {
                print.close();
            }
        }
    }

    public void saveAs() {
        PrintWriter print = null;
        int retval = -1;
        try {
            if (filename == null) {
                retval = jc.showSaveDialog(this);
                if (retval == JFileChooser.APPROVE_OPTION) {
                    print = new PrintWriter(new FileWriter(jc.getSelectedFile()));
                }
                String s = area.getText();
                StringTokenizer st = new StringTokenizer(s, System.getProperty("line.separator"));
                while (st.hasMoreElements()) {
                    print.println(st.nextToken());
                }
                fileContent = area.getText();
                JOptionPane.showMessageDialog(rootPane, "File Saved");
                filename = jc.getSelectedFile().getName();
                setTitle(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            print.close();
        }
    }

    public void open() {
        try {
            int retvalue = jc.showOpenDialog(this);
            if (retvalue == JFileChooser.APPROVE_OPTION) {
                area.setText(null);
                Reader in = new FileReader(jc.getSelectedFile());
                char[] buff = new char[10000000];
                int nch;
                while ((nch = in.read(buff, 0, buff.length)) != -1) {
                    area.append(new String(buff, 0, nch));
                }
            }
            filename = jc.getSelectedFile().getName();
            setTitle(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openNew() {
        if (!area.getText().equals("") && !area.getText().equals(fileContent)) {
            if (filename == null) {
                int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to save the changes?");
                if (option == 0) {
                    saveAs();
                } else if (option == 2) {

                } else {
                    clear();
                }
            } else {
                int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to save the changes?");

                if (option == 0) {
                    save();
                    clear();
                } else if (option == 2) {

                } else {
                    clear();
                }
            }
        }
    }

    public void clear() {
        area.setText(null);
        setTitle("Untitled Notepad");
        filename = null;
        fileContent = null;
    }

    class UndoAction extends AbstractAction {

        public UndoAction(ImageIcon UndoIcon) {
            super("Undo", UndoIcon);
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                undo.undo();
            } catch (CannotUndoException ex) {
                ex.printStackTrace();
            }
            update();
            redoAction.update();
        }

        protected void update() {
            if (undo.canUndo()) {
                setEnabled(true);
                putValue(Action.NAME, "Undo");
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Undo");
            }
        }
    }

    class RedoAction extends AbstractAction {

        public RedoAction(ImageIcon RedoIcon) {
            super("Redo", RedoIcon);
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                undo.redo();
            } catch (CannotRedoException ex) {
                ex.printStackTrace();
            }
            update();
            undoAction.update();
        }

        protected void update() {
            if (undo.canRedo()) {
                setEnabled(true);
                putValue(Action.NAME, "Redo");
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Redo");
            }
        }

    }

    public static JTextArea getArea() {
        return area;
    }

    public static void main(String[] args) {
        new NotePad();
    }
}

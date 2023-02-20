package texteditor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;


public class textEditorGUI extends javax.swing.JFrame {

    String filename;
    //global variable to save clipboard
    Clipboard clipboard = getToolkit().getSystemClipboard();
    
    // load images after scaling pngs
    ImageIcon imageLogoh = scaleImage("resources/logoh.png", 32);
    ImageIcon imageLogo = scaleImage("resources/logo.png", 32);
    
    ImageIcon imageCloseh = scaleImage("resources/closeh.png", 24);
    ImageIcon imageClose = scaleImage("resources/close.png", 24);
    // global variable to move the undecorated jframe
    int xMouse;
    int yMouse;
    
    
    public textEditorGUI() {
        initComponents();
        // set the frame icon
        setIconImage(Toolkit.getDefaultToolkit().getImage("resources/logo.png"));
        //makes the frame have rounded borders
         Shape roundedRectangle = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20);

        // set the shape of the frame
        setShape(roundedRectangle);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JPopupMenu();
        itemNew = new javax.swing.JMenuItem();
        itemOpen = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        itemClose = new javax.swing.JMenuItem();
        subMenu = new javax.swing.JPopupMenu();
        itemCut1 = new javax.swing.JMenuItem();
        itemCopy1 = new javax.swing.JMenuItem();
        itemPaste1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        navigation = new javax.swing.JPanel();
        title = new javax.swing.JLabel()
        ;
        btnClose = new javax.swing.JLabel();

        mainMenu.setBackground(new java.awt.Color(44, 47, 51));
        mainMenu.setForeground(new java.awt.Color(255, 255, 255));
        mainMenu.setMinimumSize(new java.awt.Dimension(2, 16));

        itemNew.setBackground(new java.awt.Color(44, 47, 51));
        itemNew.setForeground(new java.awt.Color(255, 255, 255));
        itemNew.setText("New");
        itemNew.setBorderPainted(false);
        itemNew.setMinimumSize(new java.awt.Dimension(0, 16));
        itemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewActionPerformed(evt);
            }
        });
        mainMenu.add(itemNew);

        itemOpen.setBackground(new java.awt.Color(44, 47, 51));
        itemOpen.setForeground(new java.awt.Color(255, 255, 255));
        itemOpen.setText("Open");
        itemOpen.setBorderPainted(false);
        itemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenActionPerformed(evt);
            }
        });
        mainMenu.add(itemOpen);

        itemSave.setBackground(new java.awt.Color(44, 47, 51));
        itemSave.setForeground(new java.awt.Color(255, 255, 255));
        itemSave.setText("Save");
        itemSave.setBorderPainted(false);
        itemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveActionPerformed(evt);
            }
        });
        mainMenu.add(itemSave);

        itemClose.setBackground(new java.awt.Color(44, 47, 51));
        itemClose.setForeground(new java.awt.Color(255, 255, 255));
        itemClose.setText("Exit");
        itemClose.setBorderPainted(false);
        itemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCloseActionPerformed(evt);
            }
        });
        mainMenu.add(itemClose);

        subMenu.setBackground(new java.awt.Color(44, 47, 51));
        subMenu.setForeground(new java.awt.Color(255, 255, 255));

        itemCut1.setBackground(new java.awt.Color(44, 47, 51));
        itemCut1.setForeground(new java.awt.Color(255, 255, 255));
        itemCut1.setText("Cut");
        itemCut1.setBorderPainted(false);
        itemCut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCut1ActionPerformed(evt);
            }
        });
        subMenu.add(itemCut1);

        itemCopy1.setBackground(new java.awt.Color(44, 47, 51));
        itemCopy1.setForeground(new java.awt.Color(255, 255, 255));
        itemCopy1.setText("Copy");
        itemCopy1.setBorderPainted(false);
        itemCopy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCopy1ActionPerformed(evt);
            }
        });
        subMenu.add(itemCopy1);

        itemPaste1.setBackground(new java.awt.Color(44, 47, 51));
        itemPaste1.setForeground(new java.awt.Color(255, 255, 255));
        itemPaste1.setText("Paste");
        itemPaste1.setEnabled(false);
        itemPaste1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPaste1ActionPerformed(evt);
            }
        });
        subMenu.add(itemPaste1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 39, 42));
        setUndecorated(true);
        setResizable(false);

        body.setBackground(new java.awt.Color(44, 47, 51));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(54, 57, 65));
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setViewportView(null);

        textArea.setBackground(new java.awt.Color(54, 57, 65));
        textArea.setColumns(20);
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setTabSize(0);
        textArea.setWrapStyleWord(true);
        textArea.setAlignmentX(0.0F);
        textArea.setAlignmentY(0.0F);
        textArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 57, 65), 10, true));
        textArea.setMargin(new java.awt.Insets(5, 10, 5, 10));
        textArea.setSelectionColor(new java.awt.Color(114, 137, 218));
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textAreaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        ModernScrollBarUI ui = new ModernScrollBarUI();
        ModernScrollBarUI ui2 = new ModernScrollBarUI();

        verticalScrollBar.setUI(ui2);
        verticalScrollBar.setPreferredSize(new Dimension(8,8));
        verticalScrollBar.setForeground(new Color(212, 0, 255));
        JScrollBar HorizontalScrollBar = jScrollPane1.getHorizontalScrollBar();

        HorizontalScrollBar.setUI(ui);
        HorizontalScrollBar.setPreferredSize(new Dimension(8,8));
        HorizontalScrollBar.setForeground(new Color(212, 0, 255));

        HorizontalScrollBar.setBackground(new Color(54,57,65));
        verticalScrollBar.setBackground(new Color(54,57,65));

        navigation.setBackground(new java.awt.Color(44, 47, 51));
        navigation.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        navigation.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                navigationMouseDragged(evt);
            }
        });
        navigation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                navigationMousePressed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setIcon(imageLogo);
        title.setText("Scribble");
        title.setToolTipText("Click to open menu");
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titleMouseReleased(evt);
            }
        });

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout navigationLayout = new javax.swing.GroupLayout(navigation);
        navigation.setLayout(navigationLayout);
        navigationLayout.setHorizontalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navigationLayout.setVerticalGroup(
            navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClose.setIcon(imageClose);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewActionPerformed
        // TODO add your handling code here:
        newFile();
    }//GEN-LAST:event_itemNewActionPerformed

    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_itemOpenActionPerformed

    private void itemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveActionPerformed
        // TODO add your handling code here:
        saveFile();
    }//GEN-LAST:event_itemSaveActionPerformed

    private void itemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCloseActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_itemCloseActionPerformed

    private void itemCut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCut1ActionPerformed
        // TODO add your handling code here:
        cutItem();
    }//GEN-LAST:event_itemCut1ActionPerformed

    private void itemCopy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCopy1ActionPerformed
        // TODO add your handling code here:
        copyItem();
    }//GEN-LAST:event_itemCopy1ActionPerformed

    private void itemPaste1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPaste1ActionPerformed
        // TODO add your handling code here:
        pasteItem();
    }//GEN-LAST:event_itemPaste1ActionPerformed

    private void textAreaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            subMenu.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_textAreaMouseReleased

    private void titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseClicked
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            mainMenu.show(this,title.getX(),title.getY());
        }
    }//GEN-LAST:event_titleMouseClicked

    private void titleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseEntered
        // TODO add your handling code here:
        title.setIcon(imageLogoh);
        title.setForeground(new java.awt.Color(155, 155, 155));
    }//GEN-LAST:event_titleMouseEntered

    private void titleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseExited
        // TODO add your handling code here:
        title.setIcon(imageLogo); 
        title.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_titleMouseExited

    private void titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMousePressed
        // TODO add your handling code here:
            mainMenu.show(this,title.getX(),title.getY()+20);
    }//GEN-LAST:event_titleMousePressed

    private void titleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            mainMenu.show(this,title.getX(),title.getY());
        }
    }//GEN-LAST:event_titleMouseReleased

    private void navigationMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navigationMouseDragged
        // TODO add your handling code here:
        // move the jframe according to mouse drag lcoation
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y-yMouse);
    }//GEN-LAST:event_navigationMouseDragged

    private void navigationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navigationMousePressed
        // TODO add your handling code here:
        // get mouse location on application
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_navigationMousePressed

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:
        btnClose.setIcon(imageCloseh);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
        btnClose.setIcon(imageClose);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMousePressed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGUI().setVisible(true);
            }
        });
    }
    public void openFile() {
     // creates a pop up menu object
    JFileChooser fileChooser = new JFileChooser();
    // sets the filter so users can only choose txt files
    fileChooser.setFileFilter(new FileNameExtensionFilter("Text documents (*.txt)", "txt"));
    
    int result = fileChooser.showOpenDialog(textEditorGUI.this);
    if (result == JFileChooser.APPROVE_OPTION) {
        String filename = fileChooser.getSelectedFile().getPath();
        try {
            String fileContents = Files.readString(Paths.get(filename));
            textArea.setText(fileContents);
        } catch (IOException e) {
            String errorMessage = "An error occurred while reading the file.";
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.print(errorMessage);
        }
    }
}
     
     public void newFile(){
         // resets the file
     textArea.setText("");
        setTitle(filename);
}
     public void saveFile() {
         //saves the file as a text file
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileFilter(new FileNameExtensionFilter("Text documents (*.txt)", "txt"));
    int result = fileChooser.showSaveDialog(textEditorGUI.this);
    if (result == JFileChooser.APPROVE_OPTION) {
        String filename = fileChooser.getSelectedFile().getPath();
        if (!filename.endsWith(".txt")) {
            filename += ".txt";
        }
        setTitle(filename);
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(textArea.getText());
            fileWriter.close();
        } catch (IOException e) {
            String errorMessage = "An error occurred while saving the file.";
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            System.out.print(errorMessage);
        }
    }
}
     
     public void pasteItem(){
          try{
        Transferable pasteText = clipboard.getContents(textEditorGUI.this);
        String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);        
        textArea.replaceRange(sel, textArea.getSelectionStart(), textArea.getSelectionEnd());
        }catch(Exception e){
            System.out.println("Didnt Work");
        }
     }
     
     public void copyItem(){
         String copyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection,copySelection);
     }
     public void cutItem(){
         String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
     }
     
     public ImageIcon scaleImage(String location, int size) {
    BufferedImage img = null;
    try {
        img = ImageIO.read(new File(location));
        int width = img.getWidth();
        int height = img.getHeight();
        int newWidth = size;
        int newHeight = size;
        if (width > height) {
            newHeight = (int) (((double) size / width) * height);
        } else {
            newWidth = (int) (((double) size / height) * width);
        }
        Image dimg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(dimg);
    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }
}
     
     
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel btnClose;
    private javax.swing.JMenuItem itemClose;
    private javax.swing.JMenuItem itemCopy1;
    private javax.swing.JMenuItem itemCut1;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemPaste1;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu mainMenu;
    private javax.swing.JPanel navigation;
    private javax.swing.JPopupMenu subMenu;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

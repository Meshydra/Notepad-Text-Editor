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
    Clipboard clipboard = getToolkit().getSystemClipboard();
    
    ImageIcon imageLogoh = scaleImage("resources/logoh.png", 32);
    ImageIcon imageLogo = scaleImage("resources/logo.png", 32);
    
    ImageIcon imageCloseh = scaleImage("resources/closeh.png", 24);
    ImageIcon imageClose = scaleImage("resources/close.png", 24);
    
    int xMouse;
    int yMouse;
    
    
    public textEditorGUI() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("resources/logo.png"));
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel()
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

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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

        jPanel2.setBackground(new java.awt.Color(44, 47, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(imageLogo);
        jLabel1.setText("Scribble");
        jLabel1.setToolTipText("Click to open menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        btnClose.setText("jLabel2");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClose.setIcon(imageClose);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            mainMenu.show(this,jLabel1.getX(),jLabel1.getY());
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setIcon(imageLogoh);
        jLabel1.setForeground(new java.awt.Color(155, 155, 155));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setIcon(imageLogo); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
            mainMenu.show(this,jLabel1.getX(),jLabel1.getY()+20);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            mainMenu.show(this,jLabel1.getX(),jLabel1.getY());
        }
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x- xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

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
    JFileChooser fileChooser = new JFileChooser();
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
     textArea.setText("");
        setTitle(filename);
}
     public void saveFile() {
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
    private javax.swing.JLabel btnClose;
    private javax.swing.JMenuItem itemClose;
    private javax.swing.JMenuItem itemCopy1;
    private javax.swing.JMenuItem itemCut1;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemPaste1;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu mainMenu;
    private javax.swing.JPopupMenu subMenu;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}

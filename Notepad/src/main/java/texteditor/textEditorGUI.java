package texteditor;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import javax.swing.BorderFactory;


public class textEditorGUI extends javax.swing.JFrame {

    String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();
    public textEditorGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itemNew = new javax.swing.JMenuItem();
        itemOpen = new javax.swing.JMenuItem();
        itemSave = new javax.swing.JMenuItem();
        itemClose = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        itemCut = new javax.swing.JMenuItem();
        itemCopy = new javax.swing.JMenuItem();
        itemPaste = new javax.swing.JMenuItem();
        menuFile1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 39, 42));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(670, 500));

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));

        textArea.setBackground(new java.awt.Color(54, 57, 65));
        textArea.setColumns(20);
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setTabSize(0);
        textArea.setWrapStyleWord(true);
        textArea.setAlignmentX(0.0F);
        textArea.setAlignmentY(0.0F);
        textArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 47, 51), 0, true));
        textArea.setSelectionColor(new java.awt.Color(114, 137, 218));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        textArea.setBorder(BorderFactory.createLineBorder(new java.awt.Color(44, 47, 51)));

        jMenuBar1.setBackground(new java.awt.Color(44, 47, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        menuFile.setBackground(new java.awt.Color(44, 47, 51));
        menuFile.setForeground(new java.awt.Color(255, 255, 255));
        menuFile.setText("File");
        menuFile.setBorderPainted(false);

        itemNew.setBackground(new java.awt.Color(44, 47, 51));
        itemNew.setForeground(new java.awt.Color(255, 255, 255));
        itemNew.setText("New");
        itemNew.setBorderPainted(false);
        itemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewActionPerformed(evt);
            }
        });
        menuFile.add(itemNew);

        itemOpen.setBackground(new java.awt.Color(44, 47, 51));
        itemOpen.setForeground(new java.awt.Color(255, 255, 255));
        itemOpen.setText("Open");
        itemOpen.setBorderPainted(false);
        itemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOpenActionPerformed(evt);
            }
        });
        menuFile.add(itemOpen);

        itemSave.setBackground(new java.awt.Color(44, 47, 51));
        itemSave.setForeground(new java.awt.Color(255, 255, 255));
        itemSave.setText("Save");
        itemSave.setBorderPainted(false);
        itemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSaveActionPerformed(evt);
            }
        });
        menuFile.add(itemSave);

        itemClose.setBackground(new java.awt.Color(44, 47, 51));
        itemClose.setForeground(new java.awt.Color(255, 255, 255));
        itemClose.setText("Exit");
        itemClose.setBorderPainted(false);
        itemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCloseActionPerformed(evt);
            }
        });
        menuFile.add(itemClose);

        jMenuBar1.add(menuFile);

        menuEdit.setBackground(new java.awt.Color(44, 47, 51));
        menuEdit.setForeground(new java.awt.Color(255, 255, 255));
        menuEdit.setText("Edit");
        menuEdit.setBorderPainted(false);

        itemCut.setBackground(new java.awt.Color(44, 47, 51));
        itemCut.setForeground(new java.awt.Color(255, 255, 255));
        itemCut.setText("Cut");
        itemCut.setBorderPainted(false);
        itemCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCutActionPerformed(evt);
            }
        });
        menuEdit.add(itemCut);

        itemCopy.setBackground(new java.awt.Color(44, 47, 51));
        itemCopy.setForeground(new java.awt.Color(255, 255, 255));
        itemCopy.setText("Copy");
        itemCopy.setBorderPainted(false);
        itemCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCopyActionPerformed(evt);
            }
        });
        menuEdit.add(itemCopy);

        itemPaste.setBackground(new java.awt.Color(44, 47, 51));
        itemPaste.setForeground(new java.awt.Color(255, 255, 255));
        itemPaste.setText("Paste");
        itemPaste.setEnabled(false);
        itemPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPasteActionPerformed(evt);
            }
        });
        menuEdit.add(itemPaste);

        jMenuBar1.add(menuEdit);

        menuFile1.setBackground(new java.awt.Color(44, 47, 51));
        menuFile1.setForeground(new java.awt.Color(255, 255, 255));
        menuFile1.setText("File");
        menuFile1.setBorderPainted(false);
        jMenuBar1.add(menuFile1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        textArea.setBorder(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_itemNewActionPerformed

    private void itemPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPasteActionPerformed
        // TODO add your handling code here:
        try{
        Transferable pasteText = clipboard.getContents(textEditorGUI.this);
        String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);        
        textArea.replaceRange(sel, textArea.getSelectionStart(), textArea.getSelectionEnd());
        }catch(Exception e){
            System.out.println("Didnt Work");
        }
    }//GEN-LAST:event_itemPasteActionPerformed

    private void itemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOpenActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(textEditorGUI.this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null){
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try{
            BufferedReader reader = new  BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line;
            line = null;
            while((line = reader.readLine())!=null){
                sb.append(line).append("\n");
                textArea.setText(sb.toString());
             }
            reader.close();
        }catch(IOException e){
            System.out.println("File Not Found");
        }
    }//GEN-LAST:event_itemOpenActionPerformed

    private void itemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSaveActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(textEditorGUI.this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);
        if(fileDialog.getFile() != null){
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try{
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(textArea.getText());
            setTitle(filename);
            fileWriter.close();
        }catch(IOException e){
            
            System.out.println("File Not Found");
        }
        
    }//GEN-LAST:event_itemSaveActionPerformed

    private void itemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_itemCloseActionPerformed

    private void itemCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCutActionPerformed
        // TODO add your handling code here:
        String cutString = textArea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
        
    }//GEN-LAST:event_itemCutActionPerformed

    private void itemCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCopyActionPerformed
        // TODO add your handling code here:
        String copyText = textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection,copySelection);
        
    }//GEN-LAST:event_itemCopyActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textEditorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemClose;
    private javax.swing.JMenuItem itemCopy;
    private javax.swing.JMenuItem itemCut;
    private javax.swing.JMenuItem itemNew;
    private javax.swing.JMenuItem itemOpen;
    private javax.swing.JMenuItem itemPaste;
    private javax.swing.JMenuItem itemSave;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuFile1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}


package texteditor;

import javax.swing.JFrame;

public class Notepad {

    public static void main(String[] args) {
        textEditorGUI obj = new textEditorGUI();
        obj.setTitle("Scribble");    
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

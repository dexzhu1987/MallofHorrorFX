package View;

import java.io.OutputStream;
import java.io.PrintStream;
import javafx.scene.control.TextArea;

class TextAreaPrintStream extends PrintStream {


 private TextArea status;


         public TextAreaPrintStream(TextArea area, OutputStream out) {
        super(out);
        status = area;
         }


           public void println(String string) {
        	status.appendText(string+"\n");
            }


           public void print(String string) {
        	status.appendText(string);
           }
}

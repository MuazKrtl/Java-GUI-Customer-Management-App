/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Muaz
 */
public class Gui_exam {

    

    /**
     * @param args the command line arguments
     */
    public static final Object[][] objects = new Object[50][7];
    public static int index = 0;
    public static String updatedIndex = "";
    public static String deletedIndex = "";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Table table = new Table();
        table.setVisible(true);
        table.pack();
        table.setLocationRelativeTo(null);
    }
    
}

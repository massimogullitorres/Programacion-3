import javax.swing.JOptionPane;


public class Box {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Como te llamas?");
        JOptionPane.showMessageDialog(null , "Hola "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Que edad tienes?"));
        JOptionPane.showMessageDialog(null , "Tienes "+age);
    }

}

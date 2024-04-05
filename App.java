import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {

    String x, y, op;
    x = JOptionPane.showInputDialog("INFORME UM NÚMERO: ");
    float x1 = Float.parseFloat(x);
    op = JOptionPane.showInputDialog("INFORME O OPERADOR: ");
    y = JOptionPane.showInputDialog("INFORME O SEGUNDO NÚMERO: ");
    float y1 = Float.parseFloat(y);

    if (op.equals("+")) {
      System.out.println(x1 + y1);
    } else {
      if (op.equals("-")) {
        System.out.println(x + " - " + y + " = " + (x1 - y1));
      } else {
        if (op.equals("*")) {
          System.out.println(x + " * " + y + " = " + (x1 * y1));
        } else {
          if (op.equals("/")) {
            System.out.println(x + " / " + y + " = " + (x1 / y1));
          }
        }
      }
    }
  }
}

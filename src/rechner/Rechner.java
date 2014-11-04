/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rechner;

/**
 *
 * @author Shark
 */
public class Rechner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user1=new User();
        ICalculator calc=new Addierer();

double x=user1.eingegebenData();
double y=user1.eingegebenNextData();
calc.setErgebnisAdd(x,y);
System.out.println(calc.getErgebnisAdd());

    }
}

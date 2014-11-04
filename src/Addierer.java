/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shark
 */
 class Addierer implements ICalculator{
    double ergebnisAdd;
    public Addierer(){
		
	}
    public double getErgebnisAdd() {
		
		return ergebnisAdd;
	}

	public void setErgebnisAdd(double zahl,double zweitezahl) {
		ergebnisAdd = zahl+zweitezahl;
	}
}

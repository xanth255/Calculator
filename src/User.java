/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shark
 */
import java.util.*;

public class User {

	double data;
	double nextdata;
	Scanner scan;


public User(){
	
	 scan=new Scanner(System.in);
	
	
}

public void eingebenData(){
 System.out.println("Tippen Sie eine Zahl ein");	
	data=scan.nextDouble();
}
public void eingebenNextData(){
System.out.println("Tippen Sie eine weitere Zahl ein");
nextdata=scan.nextDouble();
}
 public double eingegebenData(){
	 return data;
 }
 public double eingegebenNextData(){
	 return nextdata;
 }
}
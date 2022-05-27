package dominos.toppings;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Pizza {

public static void main(String[] args) {
	
	System.out.println("Mr/Mrs. Base of the pizza is standard");
	
	int Base = 2;
	
	
	Scanner toppingtypes=new Scanner(System.in);
	
	System.out.println("Choose your toppings: Types are Tomatoes, Corn, Mushrooms");
	
	System.out.println("Tomato Qty($):");
	
	int tomatoQty = toppingtypes.nextInt();
	//for (char tomatoresult : char.tomatoQty) {
		
	
	System.out.println("Corn  Qty($):");
	int cornQty = toppingtypes.nextInt();
	
	System.out.println("mushroom Qty ($):");
	
	int mushQty=toppingtypes.nextInt();
	
	
     int tomato=10;
	int corn=20;
	int mushroom=30;


    int tomatoPrice=Base+(tomato*tomatoQty);
    int cornPrice=Base+(corn*cornQty);		
    int mushPrice=Base+(mushroom*mushQty);
			

    System.out.println("Grand Total:"+(tomatoPrice+cornPrice+mushPrice));





}}





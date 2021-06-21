/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSP2;

import java.util.ArrayList;


public class Bird {
    
	public static void main(String[] args) {
		ArrayList<Bird> birdList = new ArrayList<Bird>();
		    birdList.add(new Bird());
		    birdList.add(new Crow());
		    birdList.add(new Avestruz());
		    letTheBirdsFly( birdList );
	}
	
	public static void letTheBirdsFly(ArrayList<Bird> birdlist){
		for(Bird b : birdlist){
			b.fly();
		}
		
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCP2;


public class Graphics {
    public void drawShape(Shape s) {
 		if (s.m_type==1)
 			drawRectangle((Rectangle)s);
 		else if (s.m_type==2)
 			drawCircle((Circle)s);
 	}
 	public void drawCircle(Circle r) {
 		//Implementation code goes here
 	}
 	public void drawRectangle(Rectangle r) {
 		//Implementation code goes here
 	}
}

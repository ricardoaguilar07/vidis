package ui.model.impl;

import javax.media.opengl.GL;
import javax.swing.JOptionPane;

import ui.events.GuiMouseEvent;
import ui.model.structure.AGuiContainer;

import com.sun.opengl.util.GLUT;


public class TextGuiContainer extends AGuiContainer {

	private String text;
	
	private void renderStrokeString(GL gl, int font, String string, double contwith) {
        GLUT glut = new GLUT();
        gl.glEnable(GL.GL_LINE_SMOOTH);
        gl.glColor3d(1, 0, 0);
        gl.glLineWidth(2.0f);

		// Center Our Text On The Screen
        float strwidth = glut.glutStrokeLength(font, string);
       
        double scale = contwith / strwidth;
        gl.glTranslated(0, contwith / 2d, 0); //FIXME y offset
        gl.glScaled(scale, -scale, 1);
        // Render The Text
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            glut.glutStrokeCharacter(font, c);
        }
    }
	
	@Override
	public void renderContainer(GL gl) {
		renderStrokeString(gl, GLUT.STROKE_ROMAN, text, getWidth());
		
	}
	
	public void setText(String txt){
		this.text = txt;
	}
	
	@Override
	protected void onClick( GuiMouseEvent e ) {
		JOptionPane.showMessageDialog(null, "you clicked on an TextGuiContainer!");
	}

}
package com.github.crafterchen2.toolbox.utilities.logogen;

import com.github.crafterchen2.toolbox.component.SimpleImagePainter;
import com.github.crafterchen2.toolbox.utilities.DualColor;
import com.github.crafterchen2.toolbox.Utility;

import javax.swing.*;
import java.awt.*;

//Classes {
public class LogoGenerator extends JPanel implements Utility {
	
	//private final SimpleImagePainter zoomedDisplay;
	//private final SimpleImagePainter actualDisplay;
	//private final
	
	private DualColor color;
	
	public LogoGenerator(){
		reset();
	}
	
	//Overrides {
	@Override
	public boolean canReset() {
		return true;
	}
	
	@Override
	public void resetCode() {
	
	}
	
	@Override
	public String getUtilitiyName() {
		return null;
	}
	
	@Override
	public Component getComponent() {
		return null;
	}
	
	@Override
	public Component createNewInstance() {
		return null;
	}
	//} Overrides
}
//} Classes

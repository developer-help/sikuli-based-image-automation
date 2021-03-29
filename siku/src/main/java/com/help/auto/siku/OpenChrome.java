package com.help.auto.siku;

import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OpenChrome {
	
	public void open() throws FindFailed, InterruptedException {
		
		Screen s = new Screen();
		Pattern windows = new Pattern(OpenChrome.class.getResource("../../../../windows.PNG"));
		Pattern run = new Pattern(OpenChrome.class.getResource("../../../../Run.PNG"));
		Pattern okie = new Pattern(OpenChrome.class.getResource("../../../../Okie.PNG"));
			
		s.rightClick(windows);
		s.click(run.similar((float)0.8));
		s.wait((double)2);
		s.type("chrome");
//		s.keyDown(KeyEvent.VK_ENTER);
//		s.keyUp(KeyEvent.VK_ENTER);
		s.click(okie.similar((float)0.8));
		
	}

}

package com.blog.demo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class BaseDemo {
	protected Display display;
	protected Shell shell;
    	
	protected BaseDemo(String title, int width, int height) {
		display = Display.getDefault();
	    shell = new Shell(display); // �������ڶ���
	    shell.setText(title);
	    shell.setSize(width, height); // ���ô��ڴ�С		

		createPartition(shell);
		
		shell.open(); // �򿪴���
	    shell.layout(); // ���в���

	    while (!shell.isDisposed()) {
	        if (!display.readAndDispatch()) {
	        	display.sleep();
	        }
	    }
	    dispose();
	    display.dispose();
	}
	
	protected abstract void createPartition(Shell shell);
	
	protected void dispose() {		
	}
	
}

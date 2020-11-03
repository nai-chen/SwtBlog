package com.blog.demo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class BaseDemo {
	protected Display display;
	protected Shell shell;
    	
	protected BaseDemo(String title, int width, int height) {
		display = Display.getDefault();
	    shell = new Shell(display); // 创建窗口对象
	    shell.setText(title);
	    shell.setSize(width, height); // 设置窗口大小		

		createPartition(shell);
		
		shell.open(); // 打开窗口
	    shell.layout(); // 进行布局

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

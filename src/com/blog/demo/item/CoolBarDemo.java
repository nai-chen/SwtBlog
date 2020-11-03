package com.blog.demo.item;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.CoolItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103385575
 */
public class CoolBarDemo extends BaseDemo {
	private Image image;
	protected CoolBarDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		image = new Image(display, CoolBarDemo.class.getResourceAsStream("demo.gif"));

		CoolBar coolBar = new CoolBar(shell, SWT.NONE);
		coolBar.setBounds(0, 0, 290, 30);

		CoolItem coolItem1 = new CoolItem(coolBar, SWT.PUSH);
		Button button1 = new Button(coolBar, SWT.NONE);
		button1.setImage(image);
		button1.setSize(25, 25);
		coolItem1.setControl(button1);
		coolItem1.setSize(coolItem1.computeSize(25, 25));

		CoolItem coolItem2 = new CoolItem(coolBar, SWT.PUSH);
		Button button2 = new Button(coolBar, SWT.NONE);
		button2.setImage(image);
		button2.setSize(25, 25);
		coolItem2.setControl(button2);
		coolItem2.setSize(coolItem2.computeSize(25, 25));

		CoolItem coolItem3 = new CoolItem(coolBar, SWT.PUSH);
		Combo combo = new Combo(coolBar, SWT.DROP_DOWN);
		combo.add("Tom");
		combo.add("Mike");
		combo.setSize(60, 25);
		coolItem3.setControl(combo);
		coolItem3.setSize(coolItem2.computeSize(60, 25));

		CoolItem coolItem4 = new CoolItem(coolBar, SWT.PUSH);
		ToolBar toolBar = new ToolBar(coolBar, SWT.HORIZONTAL);
		ToolItem toolItem1 = new ToolItem(toolBar, SWT.PUSH);
		toolItem1.setText("item 1");
		toolItem1.setToolTipText("item 1 tips");

		ToolItem toolItem2 = new ToolItem(toolBar, SWT.CHECK);
		toolItem2.setText("item 2");
		toolItem2.setToolTipText("item 2 tips");

		toolBar.setBounds(0, 0, 100, 30);
		coolItem4.setControl(toolBar);
		toolBar.pack();
		coolItem4.setSize(coolItem2.computeSize(toolBar.getSize().x, toolBar.getSize().y));

		new CoolItem(coolBar, SWT.PUSH);	
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}
	
	public static void main(String[] args) {
		new CoolBarDemo("CoolBar Demo", 300, 240);
	}

}

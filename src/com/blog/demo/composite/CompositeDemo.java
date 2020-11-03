package com.blog.demo.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386360
 */
public class CompositeDemo extends BaseDemo {

	protected CompositeDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		Composite comp1 = new Composite(shell, SWT.BORDER);
		comp1.setBounds(10, 10, 250, 40);
		Button radioButton1 = new Button(comp1, SWT.RADIO);
		radioButton1.setText("Radio Button1");
		radioButton1.setBounds(10, 10, 100, 20);
		Button radioButton2 = new Button(comp1, SWT.RADIO);
		radioButton2.setText("Radio Button2");
		radioButton2.setBounds(120, 10, 100, 20);

		// 不具备排他性的Radio
		Composite comp2 = new Composite(shell, SWT.BORDER|SWT.NO_RADIO_GROUP);
		comp2.setBounds(10, 60, 250, 40);
		Button radioButton3 = new Button(comp2, SWT.RADIO);
		radioButton3.setText("Radio Button3");
		radioButton3.setBounds(10, 10, 100, 20);
		Button radioButton4 = new Button(comp2, SWT.RADIO);
		radioButton4.setText("Radio Button4");
		radioButton4.setBounds(120, 10, 100, 20);
	}
	
	public static void main(String[] args) {
		new CompositeDemo("Composite Demo", 300, 150);
	}

}

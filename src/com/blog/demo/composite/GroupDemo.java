package com.blog.demo.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386360
 */
public class GroupDemo extends BaseDemo {

	protected GroupDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
	    Group group = new Group(shell, SWT.NONE);
	    group.setBounds(10, 10, 160, 80);
	    group.setText("This a Group");

	    Button radioButton1 = new Button(group, SWT.RADIO);
	    radioButton1.setText("Radio Button1");
	    radioButton1.setBounds(10, 25, 100, 20);
	    Button radioButton2 = new Button(group, SWT.RADIO);
	    radioButton2.setText("Radio Button2");
	    radioButton2.setBounds(10, 50, 100, 20);
	}

	public static void main(String[] args) {
		new GroupDemo("Group Demo", 200, 140);
	}

}

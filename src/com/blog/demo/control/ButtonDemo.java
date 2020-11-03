package com.blog.demo.control;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103383267
 */
public class ButtonDemo extends BaseDemo {
	private Image image;
	
	protected ButtonDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		image = new Image(display, ButtonDemo.class
		        .getResourceAsStream("demo.gif"));

		// 普通按钮
		Button button = new Button(shell, SWT.RIGHT_TO_LEFT);
		button.setImage(image);
		button.setText("Push Button");
		button.setBounds(20, 10, 150, 25);

		// 复选按钮
		Button checkButton = new Button(shell, SWT.CHECK);
		checkButton.setImage(image);
		checkButton.setText("Check Button");
		checkButton.setBounds(20, 45, 150, 20);

		// 单选按钮
		Button radioButton = new Button(shell, SWT.RADIO);
		radioButton.setImage(image);
		radioButton.setText("Radio Button");
		radioButton.setBounds(20, 70, 150, 20);

		// 切换按钮
		Button toggleButton = new Button(shell, SWT.TOGGLE);
		toggleButton.setImage(image);
		toggleButton.setText("Toggle Button");
		toggleButton.setBounds(20, 95, 150, 25);
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}

	public static void main(String[] args) {
		new ButtonDemo("Button Demo", 200, 170);
	}
	
}

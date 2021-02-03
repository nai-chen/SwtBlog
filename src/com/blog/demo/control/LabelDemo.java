package com.blog.demo.control;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103383267
 */
public class LabelDemo extends BaseDemo {
	private Image image;
	
	protected LabelDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		image = new Image(display, LabelDemo.class
		        .getResourceAsStream("demo.gif"));

		// 图片
		Label label = new Label(shell, SWT.BORDER);
		label.setImage(image);
		label.setBounds(10, 10, 30, 30);

		// 文本
		Label textLabel = new Label(shell, SWT.NONE);
		textLabel.setText("label");
		textLabel.setBounds(50, 10, 60, 30);

		// 水平分割线
		Label horizontalLabel = new Label(shell, 
		        SWT.HORIZONTAL | SWT.SEPARATOR | SWT.BORDER);
		horizontalLabel.setBounds(10, 50, 120, 20);

		// 垂直分割线
		Label verticalLabel = new Label(shell,
		        SWT.VERTICAL | SWT.SEPARATOR);
		verticalLabel.setBounds(150, 10, 20, 70);
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}

	public static void main(String[] args) {
		new LabelDemo("Label Demo", 200, 150);
	}
	
}

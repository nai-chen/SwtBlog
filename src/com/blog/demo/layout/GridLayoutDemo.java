package com.blog.demo.layout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103398506
 */
public class GridLayoutDemo extends BaseDemo {

	protected GridLayoutDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		GridLayout shellLayout = new GridLayout();
		shellLayout.numColumns = 2;
		shell.setLayout(shellLayout);

		Label label1 = new Label(shell, SWT.NONE);
		label1.setText("UserName:");

		Text text1 = new Text(shell, SWT.BORDER);
		GridData gdText1 = new GridData(SWT.FILL, SWT.CENTER, true, false);
		text1.setLayoutData(gdText1);

		Label label2 = new Label(shell, SWT.NONE);
		label2.setText("Password:");

		Text text2 = new Text(shell, SWT.BORDER);
		GridData gdText2 = new GridData(SWT.FILL, SWT.CENTER, true, false);
		text2.setLayoutData(gdText2);

		Label label3 = new Label(shell, SWT.NONE);
		label3.setText("Label3");

		Button button1 = new Button(shell, SWT.NONE);
		button1.setText("button1");
		// 占据两行
		GridData gdButton1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 2);
		button1.setLayoutData(gdButton1);

		Button button2 = new Button(shell, SWT.NONE);
		button2.setText("button2");
		GridData gdButton2 = new GridData(80, 20);
		button2.setLayoutData(gdButton2);

		Button button3 = new Button(shell, SWT.NONE);
		button3.setText("button3");
		// 占据两列
		GridData gdButton3 = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		button3.setLayoutData(gdButton3);
	}

	public static void main(String[] args) {
		new GridLayoutDemo("GridLayout Demo", 300, 200);
	}

}

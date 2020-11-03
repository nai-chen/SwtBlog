package com.blog.demo.layout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103398506
 */
public class FillLayoutDemo extends BaseDemo {

	protected FillLayoutDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		FillLayout shellLayout = new FillLayout(SWT.VERTICAL);
		shell.setLayout(shellLayout);

		Composite comp = new Composite(shell, SWT.BORDER);
		FillLayout compLayout = new FillLayout(SWT.HORIZONTAL);
		compLayout.marginHeight = 5;
		compLayout.marginWidth = 10;
		compLayout.spacing = 20;
		comp.setLayout(compLayout);

		// 水平显示三个按钮
		Button btn1 = new Button(comp, SWT.NONE);
		btn1.setText("Button1");

		Button btn2 = new Button(comp, SWT.NONE);
		btn2.setText("Button2");

		Button btn3 = new Button(comp, SWT.NONE);
		btn3.setText("Button3");

		Button btn4 = new Button(shell, SWT.NONE);
		btn4.setText("Button4");
	}

	public static void main(String[] args) {
		new FillLayoutDemo("FillLayout", 250, 150);
	}

}

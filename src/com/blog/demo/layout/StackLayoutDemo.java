package com.blog.demo.layout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103398506
 */
public class StackLayoutDemo extends BaseDemo {

	protected StackLayoutDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		GridLayout shellLayout = new GridLayout();
		shellLayout.numColumns = 2;
		shell.setLayout(shellLayout);

		Composite comp = new Composite(shell, SWT.NONE);
		GridData gdComp = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		comp.setLayoutData(gdComp);

		Button button1 = new Button(shell, SWT.NONE);
		GridData gdButton1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		button1.setText("Button1");
		button1.setLayoutData(gdButton1);

		Button button2 = new Button(shell, SWT.NONE);
		GridData gdButton2 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		button2.setText("Button2");
		button2.setLayoutData(gdButton2);

		StackLayout compLayout = new StackLayout();
		comp.setLayout(compLayout);

		Button button3 = new Button(comp, SWT.NONE);
		button3.setText("Button3");

		Button button4 = new Button(comp, SWT.NONE);
		button4.setText("Button4");
		compLayout.topControl = button3;

		button1.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        compLayout.topControl = button3;
		        comp.layout();
		    }
		});
		button2.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        compLayout.topControl = button4;
		        comp.layout();
		    }
		});
	}

	public static void main(String[] args) {
		new StackLayoutDemo("StackLayout", 300, 250);
	}

}

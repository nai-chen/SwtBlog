package com.blog.demo.layout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103398506
 */
public class RowLayoutDemo extends BaseDemo {

	protected RowLayoutDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		Button normalButton = new Button(shell, SWT.NONE);
		normalButton.setText("Normal");
		normalButton.setBounds(10, 10, 150, 25);
		normalButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	create("Normal Demo", new RowLayout());
		    }
		});

		Button fillButton = new Button(shell, SWT.NONE);
		fillButton.setText("Fill Demo");
		fillButton.setBounds(10, 45, 150, 25);
		fillButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	RowLayout layout = new RowLayout();
		    	layout.fill = true;
		    	create("Fill Demo", layout);
		    }
		});

		Button justifyButton = new Button(shell, SWT.NONE);
		justifyButton.setText("justify");
		justifyButton.setBounds(10, 80, 150, 25);
		justifyButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	RowLayout layout = new RowLayout();
		    	layout.justify = true;
		    	create("Justify Demo", layout);
		    }
		});

		Button wrapButton = new Button(shell, SWT.NONE);
		wrapButton.setText("wrap");
		wrapButton.setBounds(10, 115, 150, 25);
		wrapButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	RowLayout layout = new RowLayout();
		    	layout.wrap = false;
		    	create("Wrap Demo", layout);
		    }
		});
		
		Button packButton = new Button(shell, SWT.NONE);
		packButton.setText("pack");
		packButton.setBounds(10, 150, 150, 25);
		packButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	RowLayout layout = new RowLayout();
		    	layout.pack = false;
		    	create("Pack Demo", layout);
		    }
		});
	}
	
	private void create(String title, RowLayout rowLayout) {				
		Shell newShell = new Shell(shell, SWT.SHELL_TRIM);
		newShell.setText(title);
		newShell.setLayout(rowLayout);
		newShell.setSize(250, 150);

		Button button1 = new Button(newShell, SWT.NONE);
		button1.setLayoutData(new RowData(80, 50));
		button1.setText("Button1");

		Button button2 = new Button(newShell, SWT.NONE);
		button2.setLayoutData(new RowData(50, 120));
		button2.setText("Button2");

		Button button3 = new Button(newShell, SWT.NONE);
		button3.setLayoutData(new RowData(70, 50));
		button3.setText("Button3");
		newShell.open();
	}

	public static void main(String[] args) {
		new RowLayoutDemo("RowLayout", 200, 220);
	}

}

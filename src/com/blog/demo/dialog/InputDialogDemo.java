package com.blog.demo.dialog;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386143
 */
public class InputDialogDemo extends BaseDemo {

	protected InputDialogDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		Button inputButton = new Button(shell, SWT.NONE);
		inputButton.setText("Input Dialog");
		inputButton.setBounds(10, 10, 150, 25);
		inputButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        InputDialog dialog = new InputDialog(shell, "输入", "3 + 5 = ?", "", null);
		        int result = dialog.open();
		        if (result == InputDialog.OK) {
		            System.out.println(dialog.getValue());
		        }
		    }
		});
	}

	public static void main(String[] args) {
		new InputDialogDemo("InputDialog Demo", 200, 120);
	}
	
}

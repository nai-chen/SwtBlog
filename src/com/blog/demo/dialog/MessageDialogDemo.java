package com.blog.demo.dialog;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386143
 */
public class MessageDialogDemo extends BaseDemo {

	protected MessageDialogDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		Button confirmButton = new Button(shell, SWT.NONE);
		confirmButton.setText("Confirm Dialog");
		confirmButton.setBounds(10, 10, 150, 25);
		confirmButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 打开Confirm对话框，可选择OK或Cancel
		        boolean result = MessageDialog.openConfirm(shell,
		            "MessageDialog", "Confirm Dialog");
		        System.out.println(result);
		    }
		});

		Button errorButton = new Button(shell, SWT.NONE);
		errorButton.setText("Error Dialog");
		errorButton.setBounds(10, 45, 150, 25);
		errorButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 打开Error对话框
		        MessageDialog.openError(shell, "MessageDialog", "Error Dialog");
		    }
		});

		Button infoButton = new Button(shell, SWT.NONE);
		infoButton.setText("Info Dialog");
		infoButton.setBounds(10, 80, 150, 25);
		infoButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 打开Information对话框
		        MessageDialog.openInformation(shell, "MessageDialog", "Info Dialog");
		    }
		});

		Button questionButton = new Button(shell, SWT.NONE);
		questionButton.setText("Qurstion Dialog");
		questionButton.setBounds(10, 115, 150, 25);
		questionButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 打开Question对话框，可选择Yes或No
		        boolean result = MessageDialog.openQuestion(shell,
		            "MessageDialog", "Qurstion Dialog");
		        System.out.println(result);
		    }
		});

		Button warningButton = new Button(shell, SWT.NONE);
		warningButton.setText("Warning Dialog");
		warningButton.setBounds(10, 150, 150, 25);
		warningButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 打开Warning对话框
		        MessageDialog.openWarning(shell, "MessageDialog", "Warning Dialog");
		    }
		});

	}
	
	public static void main(String[] args) {
		new MessageDialogDemo("MessageDialog Demo", 200, 220);
	}
}

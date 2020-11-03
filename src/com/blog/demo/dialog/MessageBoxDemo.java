package com.blog.demo.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386143
 */
public class MessageBoxDemo extends BaseDemo {

	protected MessageBoxDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		Button defaultButton = new Button(shell, SWT.NONE);
		defaultButton.setText("MessageBox");
		defaultButton.setBounds(10, 10, 150, 25);
		defaultButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 普通消息对话框，默认显示确认按钮
		        MessageBox mb = new MessageBox(shell, SWT.ICON_SEARCH);
		        mb.setText("MessageBox");
		        mb.setMessage("MessageBox open, MessageBox open!");
		        mb.open();
		    }
		});

		Button okOrCancelButton = new Button(shell, SWT.NONE);
		okOrCancelButton.setText("Ok|Cancel");
		okOrCancelButton.setBounds(10, 45, 150, 25);
		okOrCancelButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        //  显示错误图标，确认和取消按钮
		        MessageBox mb = new MessageBox(shell,
		            SWT.ICON_ERROR | SWT.OK | SWT.CANCEL);
		        mb.setText("Error");
		        mb.setMessage("A error occur!");
		        mb.open();
		    }
		});

		Button yesOrNoButton = new Button(shell, SWT.NONE);
		yesOrNoButton.setText("yes|no");
		yesOrNoButton.setBounds(10, 80, 150, 25);
		yesOrNoButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 显示提示图标，是、否和取消三个按钮
		        MessageBox mb = new MessageBox(shell,
		            SWT.ICON_INFORMATION | SWT.YES | SWT.NO | SWT.CANCEL);
		        mb.setText("Information");
		        mb.setMessage("You got a message!");
		        mb.open();
		    }
		});

		Button retryButton = new Button(shell, SWT.NONE);
		retryButton.setText("Retry");
		retryButton.setBounds(10, 115, 150, 25);
		retryButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 显示问题图标，终止、重试和忽略按钮
		        MessageBox mb = new MessageBox(shell,
		            SWT.ICON_QUESTION | SWT.ABORT | SWT.RETRY | SWT.IGNORE);
		        mb.setText("Question");
		        mb.setMessage("Do you want to try again?");
		        int result = mb.open();
		        if (result == SWT.ABORT) {
		            System.out.println("ABORT Pressed");
		        } else if (result == SWT.RETRY) {
		            System.out.println("RETRY Pressed");
		        } else if (result == SWT.IGNORE) {
		            System.out.println("IGNORE Pressed");
		        } else {
		            System.out.println(result + " Pressed");
		        }
		    }
		});
	}
	
	public static void main(String[] args) {
		new MessageBoxDemo("MessageBox Demo", 200, 200);
	}

}

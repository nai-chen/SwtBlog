package com.blog.demo.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386360
 */
public class ShellDemo extends BaseDemo {

	protected ShellDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		Button trimButton = new Button(shell, SWT.NONE);
		trimButton.setText("trim");
		trimButton.setBounds(10, 10, 80, 30);
		trimButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 窗口默认显示
		        Shell s = new Shell(shell, SWT.SHELL_TRIM);
		        // 监听窗口动作
		        s.addShellListener(new ShellListener() {					
		            @Override
		            public void shellIconified(ShellEvent e) {
		                System.out.println("min");
		            }

		            @Override
		            public void shellDeiconified(ShellEvent e) {
		                System.out.println("max");
		            }

		            @Override
		            public void shellDeactivated(ShellEvent e) {
		                System.out.println("deactivate");
		            }

		            @Override
		            public void shellClosed(ShellEvent e) {
		                System.out.println("close");
		            }

		            @Override
		            public void shellActivated(ShellEvent e) {
		                System.out.println("activate");
		            }
		        });
		        s.setText("Trim Demo");
		        s.setSize(200, 150);
		        s.open();
		    }
		});

		Button closeButton = new Button(shell, SWT.NONE);
		closeButton.setText("close");
		closeButton.setBounds(100, 10, 80, 30);
		closeButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 只显示关闭按钮
		        Shell s = new Shell(shell, SWT.CLOSE | SWT.PRIMARY_MODAL);
		        s.setText("CLOSE Demo");
		        s.setSize(200, 150);
		        s.open();
		    }
		});

		Button minButton = new Button(shell, SWT.NONE);
		minButton.setText("min");
		minButton.setBounds(190, 10, 80, 30);
		minButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 显示最小关闭按钮
		        Shell s = new Shell(shell, SWT.MIN);
		        s.setText("MIN Demo");
		        s.setSize(200, 150);
		        s.open();
		    }
		});

		Button dialogButton = new Button(shell, SWT.NONE);
		dialogButton.setText("dialog");
		dialogButton.setBounds(10, 50, 80, 30);
		dialogButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 对话框按钮
		        Shell s = new Shell(shell, SWT.DIALOG_TRIM);
		        s.setText("Dialog Demo");
		        s.setSize(200, 150);
		        s.open();
		    }
		});
	}
	
	public static void main(String[] args) {	
		new ShellDemo("Shell Demo", 300, 140);
	}

}

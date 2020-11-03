package com.blog.demo.senior;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

public class ProgressBarDemo extends BaseDemo {
	private int selection;

	protected ProgressBarDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 10;
		shell.setLayout(layout);
		 
		ProgressBar pb1 = new ProgressBar(shell, SWT.SMOOTH);
		pb1.setMaximum(20);
		pb1.setSelection(10);
		 
		GridData gdPb1 = new GridData(SWT.FILL, SWT.CENTER, true, false);
		pb1.setLayoutData(gdPb1);
		 
		ProgressBar pb2 = new ProgressBar(shell, SWT.INDETERMINATE);
		GridData gdPb2 = new GridData(SWT.FILL, SWT.CENTER, true, false);
		pb2.setLayoutData(gdPb2);
		 
		new Thread() {
			public void run() {
				selection = 1;
				while(!pb1.isDisposed()) {
					display.asyncExec(new Runnable() {
						@Override
						public void run() {
							pb1.setSelection(selection++%20);							
						}
					});
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		}.start();
	}

	public static void main(String[] args) {
		new ProgressBarDemo("ProgressBar Demo", 200, 100);
	}

}

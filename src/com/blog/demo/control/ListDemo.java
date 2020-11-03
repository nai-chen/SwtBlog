package com.blog.demo.control;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103383267
 */
public class ListDemo extends BaseDemo {

	protected ListDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		final List list = new List(shell, SWT.BORDER | SWT.MULTI);
		list.setBounds(10,  10, 160, 110);
		list.add("Tom");
		list.add("Mike");
		list.add("Peter");
		list.add("Lily");

		list.addSelectionListener(new SelectionListener() {			

		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        int[] selection = list.getSelectionIndices();
		        for (int index : selection) {
		            System.out.println("widgetSelected index = " + index);
		        }
		    }

		    @Override
		    public void widgetDefaultSelected(SelectionEvent e) {
		        int[] selection = list.getSelectionIndices();
		        for (int index : selection) {
		            System.out.println("widgetDefaultSelected index = " + index);
		        }

		    }
		});
	}

	public static void main(String[] args) {
		new ListDemo("List Demo", 200, 170);
	}
	
}

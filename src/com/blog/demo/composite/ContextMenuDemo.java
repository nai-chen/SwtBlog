package com.blog.demo.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386360
 */
public class ContextMenuDemo extends BaseDemo {

	protected ContextMenuDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		Group group1 = new Group(shell, SWT.NONE);
		group1.setBounds(10, 10, 120, 180);
		Menu menu1 = new Menu(shell, SWT.POP_UP);
		group1.setMenu(menu1);
		MenuItem checkItem1 = new MenuItem(menu1, SWT.CHECK);
		checkItem1.setText("Check Item1");
		MenuItem checkItem2 = new MenuItem(menu1, SWT.CHECK);
		checkItem2.setText("Check Item2");
		checkItem2.setSelection(true);

		Group group2 = new Group(shell, SWT.NONE);
		group2.setBounds(150, 10, 120, 180);
		Menu menu2 = new Menu(shell, SWT.POP_UP);
		group2.setMenu(menu2);
		MenuItem radioItem1 = new MenuItem(menu2, SWT.RADIO);
		radioItem1.setText("Radio Item1");
		MenuItem radioItem2 = new MenuItem(menu2, SWT.RADIO);
		radioItem2.setText("Radio Item2");
		radioItem2.setSelection(true);
		MenuItem radioItem3 = new MenuItem(menu2, SWT.RADIO);
		radioItem3.setText("Radio Item3");
	}

	public static void main(String[] args) {
		new ContextMenuDemo("ContextMenu Dmeo", 300, 250);

	}

}

package com.blog.demo.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386360
 */
public class CursorDemo extends BaseDemo {
	private Cursor cursor1, cursor2;

	protected CursorDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		Group group1 = new Group(shell, SWT.NONE);
	    group1.setBounds(10, 10, 250, 80);
	    group1.setText("group1");

	    // 设置鼠标样式
	    Group group2 = new Group(shell, SWT.NONE);
	    group2.setBounds(10, 100, 250, 80);
	    group2.setText("group2");
	    cursor1 = new Cursor(display, SWT.CURSOR_CROSS);
	    group2.setCursor(cursor1);

	    // 自定义图片作为鼠标样式
	    Group group3 = new Group(shell, SWT.NONE);
	    group3.setBounds(10, 190, 250, 80);
	    group3.setText("group3");
	    ImageData imageData = new ImageData(CursorDemo.class.getResourceAsStream("demo.gif"));
	    cursor2 = new Cursor(display, imageData, 0, 0);
	    group3.setCursor(cursor2);
	}

	public static void main(String[] args) {
		new CursorDemo("Cursor Demo", 300, 320);
	}

}

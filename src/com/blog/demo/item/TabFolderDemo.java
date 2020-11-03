package com.blog.demo.item;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103385575
 */
public class TabFolderDemo extends BaseDemo {
	private Image image;

	protected TabFolderDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		image = new Image(display, TabFolderDemo.class.getResourceAsStream("demo.gif"));

		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(10, 10, 250, 190);
		tabFolder.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        System.out.println(tabFolder.getSelectionIndex());
		    }
		});

		TabItem tabItem1 = new TabItem(tabFolder, SWT.NONE);
		tabItem1.setText("tab1");
		tabItem1.setImage(image);
		Button button = new Button(tabFolder, SWT.PUSH);
		button.setText("button");
		tabItem1.setControl(button);

		TabItem tabItem2 = new TabItem(tabFolder, SWT.NONE);
		tabItem2.setText("tab2");
		Label label = new Label(tabFolder, SWT.PUSH);
		label.setText("label");
		tabItem2.setControl(label);

		TabItem tabItem3 = new TabItem(tabFolder, SWT.NONE);
		tabItem3.setText("tab3");
		Text text = new Text(tabFolder, SWT.NONE);
		text.setText("text");
		tabItem3.setControl(text);
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}

	public static void main(String[] args) {
		new TabFolderDemo("TabFolder Demo", 300, 250);
	}
	
}

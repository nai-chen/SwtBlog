package com.blog.demo.item;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103385575
 */
public class MenuDemo extends BaseDemo {
	private Image image;

	protected MenuDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		image = new Image(display, MenuDemo.class.getResourceAsStream("demo.gif"));

		// 菜单栏
		Menu bar = new Menu(shell, SWT.BAR);
		shell.setMenuBar(bar);

		// File菜单项
		MenuItem fileMenuItem = new MenuItem(bar, SWT.CASCADE);
		fileMenuItem.setText("file");

		Menu fileMenu = new Menu(fileMenuItem);
		fileMenuItem.setMenu(fileMenu);

		// File菜单项 - New菜单项
		MenuItem newMenuItem = new MenuItem(fileMenu, SWT.CASCADE);
		newMenuItem.setText("New");
		newMenuItem.setImage(image);

		Menu newMenu = new Menu(newMenuItem);
		newMenuItem.setMenu(newMenu);

		// File菜单项 - New菜单项 - Project菜单项 
		MenuItem projectMenuItem = new MenuItem(newMenu, SWT.PUSH);
		projectMenuItem.setText("Project");

		// File菜单项 - New菜单项 - Class菜单项
		MenuItem classMenuItem = new MenuItem(newMenu, SWT.PUSH);
		classMenuItem.setText("Class");		

		// File菜单项 - Open菜单项
		MenuItem openMenuItem = new MenuItem(fileMenu, SWT.PUSH);
		openMenuItem.setText("Open");
		openMenuItem.addSelectionListener(new SelectionAdapter() {		
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        System.out.println("Open Item");
		    }
		});

		new MenuItem(fileMenu, SWT.SEPARATOR);

		// File菜单项 - Close菜单项
		MenuItem closeMenuItem = new MenuItem(fileMenu, SWT.PUSH);
		closeMenuItem.setText("Close");
		closeMenuItem.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        shell.dispose();
		    }
		});

		// Edit菜单项
		MenuItem editMenuItem = new MenuItem(bar, SWT.CASCADE);
		editMenuItem.setText("Edit");
		Menu editMenu = new Menu(editMenuItem);
		editMenuItem.setMenu(editMenu);

		// 多选菜单项
		MenuItem checkItem1MenuItem = new MenuItem(editMenu, SWT.CHECK);
		checkItem1MenuItem.setText("Check Item1");
		checkItem1MenuItem.setSelection(true);

		MenuItem checkItem2MenuItem = new MenuItem(editMenu, SWT.CHECK);
		checkItem2MenuItem.setText("Check Item2");

		new MenuItem(editMenu, SWT.SEPARATOR);

		// 单选菜单项
		MenuItem radioItem1MenuItem = new MenuItem(editMenu, SWT.RADIO);
		radioItem1MenuItem.setText("Radio Item1");
		radioItem1MenuItem.setSelection(true);

		MenuItem radioItem2MenuItem = new MenuItem(editMenu, SWT.RADIO);
		radioItem2MenuItem.setText("Radio Item2");

		MenuItem radioItem3MenuItem = new MenuItem(editMenu, SWT.RADIO);
		radioItem3MenuItem.setText("Radio Item3");		
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}
	
	public static void main(String[] args) {
		new MenuDemo("Menu Demo", 400, 300);
	}
	
}

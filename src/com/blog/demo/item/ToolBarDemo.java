package com.blog.demo.item;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103385575
 */
public class ToolBarDemo extends BaseDemo {
	private Image image;
	
	protected ToolBarDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		image = new Image(display, ToolBarDemo.class.getResourceAsStream("demo.gif"));

		// 水平工具栏
		ToolBar horizontalToolBar = new ToolBar(shell, SWT.HORIZONTAL | SWT.WRAP);
		horizontalToolBar.setBounds(0, 0, 200, 90);

		ToolItem toolItem1 = new ToolItem(horizontalToolBar, SWT.PUSH);
		toolItem1.setText("item 1");
		toolItem1.setImage(image);
		toolItem1.setToolTipText("item 1 tips");
		toolItem1.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        System.out.println("item 1 selected");
		    }
		});

		// 多选工具栏
		ToolItem toolItem2 = new ToolItem(horizontalToolBar, SWT.CHECK);
		toolItem2.setText("item 2");
		toolItem2.setImage(image);
		toolItem2.setToolTipText("item 2 tips");

		// 单选工具栏
		ToolItem toolItem3 = new ToolItem(horizontalToolBar, SWT.RADIO);
		toolItem3.setText("item 3");
		toolItem3.setImage(image);
		toolItem3.setToolTipText("item 3 tips");

		ToolItem toolItem4 = new ToolItem(horizontalToolBar, SWT.RADIO);
		toolItem4.setText("item 4");
		toolItem4.setImage(image);
		toolItem4.setToolTipText("item 4 tips");

		// 添加文本控件
		ToolItem toolItem5 = new ToolItem(horizontalToolBar, SWT.SEPARATOR);
		Text text = new Text(horizontalToolBar, SWT.BORDER);
		text.setSize(120, 20);
		toolItem5.setControl(text);
		toolItem5.setWidth(120);

		// 垂直工具栏
		ToolBar verticalToolBar = new ToolBar(shell, SWT.VERTICAL | SWT.RIGHT);
		verticalToolBar.setBounds(0, 100, 80, 80);

		ToolItem toolItem6 = new ToolItem(verticalToolBar, SWT.PUSH);
		toolItem6.setText("item 6");
		toolItem6.setImage(image);
		toolItem6.setToolTipText("item 6 tips");

		new ToolItem(verticalToolBar, SWT.SEPARATOR);

		ToolItem toolItem7 = new ToolItem(verticalToolBar, SWT.PUSH);
		toolItem7.setText("item 7");
		toolItem7.setImage(image);
		toolItem7.setToolTipText("item 7 tips");
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}
	
	public static void main(String[] args) {
		new ToolBarDemo("ToolBar Demo", 220, 200);
	}
	
}

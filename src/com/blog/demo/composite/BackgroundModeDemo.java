package com.blog.demo.composite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386360
 */
public class BackgroundModeDemo extends BaseDemo {
	private Color color;

	protected BackgroundModeDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		color = display.getSystemColor(SWT.COLOR_BLUE);

		// 指定蓝色背景
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(10, 10, 260, 90);
		composite.setBackground(color);

		Text text = new Text(composite, SWT.NONE);
		text.setText("text");
		text.setBounds(10, 10, 240, 30);

		Label label = new Label(composite, SWT.NONE);
		label.setText("Label");
		label.setBounds(10, 50, 240, 30);

		Group group = new Group(shell, SWT.NONE);
		group.setText("Background Mode");
		group.setBounds(10, 110, 260, 90);

		Button radioButton1 = new Button(group, SWT.RADIO);
		radioButton1.setText("INHERIT_NONE");
		radioButton1.setSelection(true);
		radioButton1.setBounds(10, 25, 200, 20);
		radioButton1.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	// 默认情况下，Text和Label都显示各自背景色
		        composite.setBackgroundMode(SWT.INHERIT_NONE);
		    }
		});

		Button radioButton2 = new Button(group, SWT.RADIO);
		radioButton2.setText("INHERIT_DEFAULT");
		radioButton2.setBounds(10, 45, 200, 20);
		radioButton2.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	// Text显示各自背景色，Label显示容器背景色
		        composite.setBackgroundMode(SWT.INHERIT_DEFAULT);
		    }
		});

		Button radioButton3 = new Button(group, SWT.RADIO);
		radioButton3.setText("INHERIT_FORCE");
		radioButton3.setBounds(10, 65, 200, 20);
		radioButton3.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		    	// Text和Label都显示容器背景色
		        composite.setBackgroundMode(SWT.INHERIT_FORCE);
		    }
		});
	}
	
	@Override
	protected void dispose() {
		if (color != null) {
		    color.dispose();
		}
	}

	public static void main(String[] args) {
		new BackgroundModeDemo("BackgroundMode Demo", 300, 250);
	}

}

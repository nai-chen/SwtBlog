package com.blog.demo.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386143
 */
public class ColorDialogDemo extends BaseDemo {
	private Color color;

	protected ColorDialogDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		final Button colorButton = new Button(shell, SWT.NONE);
		colorButton.setText("Color Dialog");
		colorButton.setBounds(10, 10, 150, 25);
		colorButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 颜色对话框，返回RGB
		        ColorDialog dialog = new ColorDialog(shell);
		        RGB rgb = dialog.open();
		        if (rgb != null) {
		            System.out.println(rgb.red + ":" + rgb.green + ":" + rgb.blue);

		            Color newColor = new Color(display, rgb);
		            shell.setBackground(newColor);

		            if (color != null) {
		            	color.dispose();
		            }
	                color = newColor;
	            }
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
		new ColorDialogDemo("ColorDialog Demo", 200, 120);
	}
	
}

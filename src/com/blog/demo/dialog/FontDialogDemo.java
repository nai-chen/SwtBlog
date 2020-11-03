package com.blog.demo.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386143
 */
public class FontDialogDemo extends BaseDemo {
	private Font font;

	protected FontDialogDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		final Button fontButton = new Button(shell, SWT.NONE);
		fontButton.setText("Font Dialog");
		fontButton.setBounds(10, 10, 150, 25);
		fontButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 字体对话框，返回FontData
		        FontDialog dialog = new FontDialog(shell);
		        FontData fd = dialog.open();
		        if (fd != null) {
		            Font newFont = new Font(display, fd);
		            fontButton.setFont(newFont);

		            if (font != null) {
		            	font.dispose();
		            }
	                font = newFont;
	            }
	        }
	    });
	}
	
	@Override
	protected void dispose() {
		if (font != null) {
			font.dispose();
		}
	}
	
	public static void main(String[] args) {
		new FontDialogDemo("FontDialog Demo", 200, 120);
	}
	
}

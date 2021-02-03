package com.blog.demo.senior;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

public class StyleTextDemo extends BaseDemo {
	
	private Font font;
	private Color redColor, yellowColor;

	protected StyleTextDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		shell.setLayout(new FillLayout());
		StyledText text = new StyledText(shell, SWT.NONE);
		text.setText("Hello SWT and JFace!");

		// 设置字体和下划线
		font = new Font(display, "Courier New", 16, SWT.ITALIC);
		StyleRange range1 = new StyleRange();
		range1.start = 0;
		range1.length = 5;
		range1.font = font;
		range1.underline = true;
		text.setStyleRange(range1);

		// 设置删除线和文字位置
		StyleRange range2 = new StyleRange();
		range2.start = 6;
		range2.length = 7;
		range2.strikeout = true;
		range2.rise = 10;
		text.setStyleRange(range2);

		// 设置字体颜色和背景色
		redColor = display.getSystemColor(SWT.COLOR_RED);
		yellowColor = display.getSystemColor(SWT.COLOR_YELLOW);
		StyleRange range3 = new StyleRange();
		range3.start = 14;
		range3.length = 5;
		range3.foreground = redColor;
		range3.background = yellowColor;
		text.setStyleRange(range3);
		text.setStyleRange(range3);
	}
	
	@Override
	protected void dispose() {
		font.dispose();
		redColor.dispose();
		yellowColor.dispose();
	}

	public static void main(String[] args) {
		new StyleTextDemo("StyleText Demo", 200, 100);
	}

}

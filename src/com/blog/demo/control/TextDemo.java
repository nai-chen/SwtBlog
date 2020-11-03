package com.blog.demo.control;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103383267
 */
public class TextDemo extends BaseDemo {	
	
	protected TextDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		// 普通文本
		Text normalText = new Text(shell, SWT.BORDER);
		normalText.setBounds(10, 10, 112, 20);
		normalText.setText("text");

		// 密码文本
		Text passwordText = new Text(shell, SWT.PASSWORD | SWT.BORDER);
		passwordText.setBounds(10, 40, 112, 20);
		passwordText.setText("text");

		// 只读文本
		Text readonlyText = new Text(shell, SWT.READ_ONLY | SWT.BORDER);
		readonlyText.setBounds(10, 70, 112, 20);
		readonlyText.setText("text");

		// 无边框文本
		Text borderlessText = new Text(shell, SWT.NONE);
		borderlessText.setText("text");
		borderlessText.setBounds(10, 100, 112, 20);

		// 文本显示滚动条
		Text multiLineText = new Text(shell,
		        SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		multiLineText.setBounds(10, 130, 112, 60);

		// 可换行文本
		Text wrapText = new Text(shell, SWT.BORDER |
		        SWT.V_SCROLL | SWT.H_SCROLL | SWT.WRAP);
		wrapText.setBounds(10, 200, 112, 50);

		Text eventText = new Text(shell, SWT.BORDER);
		eventText.setBounds(10, 260, 112, 20);
		// 监听文本修改
		eventText.addVerifyListener(new VerifyListener() {
		    @Override
		    public void verifyText(VerifyEvent e) {
		        if (e.text.length() > 0) {
		            System.out.println(e.text);
		            char c = e.text.charAt(0);
		            if (c <= 'f' && c >= 'a') { // [a-f]变大写
		                e.text = e.text.toUpperCase();
		            } else if (c <= '9' && c >= '0') { // 0-9禁止输入
		                e.doit = false;
		            }
		        }
		    }
		});
		eventText.addModifyListener(new ModifyListener() {			
		    @Override
		    public void modifyText(ModifyEvent e) {
		        System.out.println(e.widget);
		    }
		});
	}

	public static void main(String[] args) {
		new TextDemo("Text Demo", 200, 330);
	}
	
}

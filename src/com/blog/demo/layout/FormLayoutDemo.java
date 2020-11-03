package com.blog.demo.layout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103398506
 */
public class FormLayoutDemo extends BaseDemo {

	protected FormLayoutDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		FormLayout shellLayout = new FormLayout();
		shell.setLayout(shellLayout);

		Button button1 = new Button(shell, SWT.NONE);
		button1.setText("button1");

		FormData fdButton1 = new FormData();
		fdButton1.left = new FormAttachment(20); // ��������ȵ�20%
		fdButton1.top = new FormAttachment(10, 15); // �������߶ȵ�10%��������15px
		fdButton1.right = new FormAttachment(1, 2, 0); // ��������ȵ�1/2
		fdButton1.bottom = new FormAttachment(2, 5, 0); // �������߶ȶȵ�2/5
		button1.setLayoutData(fdButton1);

		Button button2 = new Button(shell, SWT.NONE);
		button2.setText("button2");

		FormData fdButton2 = new FormData();
		fdButton2.left = new FormAttachment(button1, 0, SWT.RIGHT); // button1���ұ�
		fdButton2.top = new FormAttachment(button1, 10, SWT.BOTTOM); // button1���±ߣ�����10px
		button2.setLayoutData(fdButton2);
	}

	public static void main(String[] args) {
		new FormLayoutDemo("FormLayout Demo", 300, 200);
	}

}

package com.blog.demo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/* 
 * https://blog.csdn.net/chennai1101/article/details/103382784
 */
public class HelloSWT {

    public static void main(String[] args) {
        Display display = Display.getDefault();
        Shell shell = new Shell(display); // �������ڶ���
        shell.setText("Hello SWT");
        shell.setSize(200, 150); // ���ô��ڴ�С

        shell.open(); // �򿪴���
        shell.layout(); // ���в���

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }

}
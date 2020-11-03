package com.blog.demo;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/* 
 * https://blog.csdn.net/chennai1101/article/details/103382784
 */
public class HelloSWT {

    public static void main(String[] args) {
        Display display = Display.getDefault();
        Shell shell = new Shell(display); // 创建窗口对象
        shell.setText("Hello SWT");
        shell.setSize(200, 150); // 设置窗口大小

        shell.open(); // 打开窗口
        shell.layout(); // 进行布局

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }

}
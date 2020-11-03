package com.blog.demo.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103386143
 */
public class FileDialogDemo extends BaseDemo {

	protected FileDialogDemo(String title, int width, int height) {
		super(title, width, height);
	}
	
	@Override
	protected void createPartition(Shell shell) {
		Button openButton = new Button(shell, SWT.NONE);
		openButton.setText("Open");
		openButton.setBounds(10, 10, 150, 25);
		openButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 文件对话框，设置文件目录、文件类型和文件格式
		        FileDialog dialog = new FileDialog(shell);
		        dialog.setFilterPath("C:\\");
		        dialog.setFilterNames(new String[]{"Java Files", "Class Files", "All Files"});
		        dialog.setFilterExtensions(new String[]{"*.java", "*.class", "*.*"});
		        String result = dialog.open();
		        System.out.println(result);
		    }
		});

		Button multiButton = new Button(shell, SWT.NONE);
		multiButton.setText("Multi");
		multiButton.setBounds(10, 45, 150, 25);
		multiButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 文件对话框，可打开多个文件
		        FileDialog dialog = new FileDialog(shell, SWT.MULTI);
		        String result = dialog.open();
		        if (result != null) {
		            for (String fileName : dialog.getFileNames()) {
		                System.out.println(fileName);
		            }
		        }
		    }
		});

		Button saveButton = new Button(shell, SWT.NONE);
		saveButton.setText("Save");
		saveButton.setBounds(10, 80, 150, 25);
		saveButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 文件保存对话框，设置文件保存目录
		        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		        dialog.setFilterPath("d:\\");
		        String result = dialog.open();
		        System.out.println(result);
		    }
		});

		Button dirButton = new Button(shell, SWT.NONE);
		dirButton.setText("Directory");
		dirButton.setBounds(10, 115, 150, 25);
		dirButton.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // 文件夹对话框
		        DirectoryDialog dialog = new DirectoryDialog(shell);
		        dialog.setFilterPath("d:\\");
		        String result = dialog.open();
		        System.out.println(result);
		    }
		});
	}

	public static void main(String[] args) {
		new FileDialogDemo("FileDialog Demo", 200, 200);
	}
	
}

package com.blog.demo.viewer;

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class ListViewerDemo extends BaseDemo {

	protected ListViewerDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
	   shell.setLayout(new FillLayout());

	    ListViewer listViewer = new ListViewer(shell, SWT.BORDER);
	    listViewer.setContentProvider(new ListContentProvider());
	    listViewer.setLabelProvider(new ListLabelProvider());

	    ModelList modelList = new ModelList();
	    listViewer.setInput(modelList);

	    modelList.addObject(new Student("Tome"));
	    modelList.addObject(new Student("Jack"));
	    modelList.addObject(new Student("Lily"));
	    modelList.addObject(new Student("Mike"));
	}

	public static void main(String[] args) {
		new ListViewerDemo("ListViewerDemo", 200, 160);
	}

}

package com.blog.demo.viewer;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class TreeViewerDemo extends BaseDemo {

	protected TreeViewerDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
	    shell.setLayout(new FillLayout());

	    TreeViewer treeViewer = new TreeViewer(shell, SWT.BORDER);
	    treeViewer.setContentProvider(new TreeContentProvider());
	    treeViewer.setLabelProvider(new TreeLabelProvider());

	    /* 设置树的头部
	      Tree tree = treeViewer.getTree();
	      TreeColumn col1 = new TreeColumn(tree, SWT.NONE);
	      col1.setText("Teacher");
	      col1.setWidth(80);
	      TreeColumn col2 = new TreeColumn(tree, SWT.NONE);
	      col2.setText("Student");
	      col2.setWidth(80);
	      tree.setHeaderVisible(true);
	      tree.setLinesVisible(true);
	    */

	    ModelList modelList = new ModelList();
	    treeViewer.setInput(modelList);

	    Teacher t1 = new Teacher("Mike");
	    t1.addStudent(new Student("Jack", 18, t1));
	    t1.addStudent(new Student("Lily", 26, t1));
	    t1.addStudent(new Student("Tom", 20, t1));
	    modelList.addObject(t1);

	    Teacher t2 = new Teacher("Lily");
	    t2.addStudent(new Student("Tom", 23, t2));
	    t2.addStudent(new Student("Jack", 29, t2));
	    modelList.addObject(t2);

	    treeViewer.expandAll();
	}
	
	public static void main(String[] args) {
		new TreeViewerDemo("TreeViewer Demo", 250, 250);
	}

}

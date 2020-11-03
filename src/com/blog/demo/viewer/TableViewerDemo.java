package com.blog.demo.viewer;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class TableViewerDemo extends BaseDemo {
	private Image image;

	protected TableViewerDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
	    image = new Image(display, TableViewerDemo.class.getResourceAsStream("demo.gif"));
		
	    shell.setLayout(new FillLayout());
	 
	    TableViewer tableViewer = new TableViewer(shell,
	            SWT.BORDER|SWT.CHECK|SWT.FULL_SELECTION|SWT.MULTI);
	    tableViewer.setContentProvider(new ListContentProvider());
	    tableViewer.setLabelProvider(new TableLabelProvider());

	    Table table = tableViewer.getTable();
	    TableColumn column1 = new TableColumn(table, SWT.NONE);
	    column1.setText("name");
	    column1.setImage(image);
	    column1.setWidth(120);
	    TableColumn column2 = new TableColumn(table, SWT.NONE);
	    column2.setWidth(80);
	    column2.setText("age");
	    column2.setImage(image);
	    table.setHeaderVisible(true);
	    table.setLinesVisible(true);

	    ModelList modelList = new ModelList();
	    tableViewer.setInput(modelList);

	    modelList.addObject(new Student("Tome", 24));
	    modelList.addObject(new Student("Jack", 19));
	    modelList.addObject(new Student("Lily", 30));
	    modelList.addObject(new Student("Mike", 41));
	}
	
	@Override
	protected void dispose() {
		image.dispose();
	}

	public static void main(String[] args) {
		new TableViewerDemo("TableViewer Demo", 250, 200);
	}

}

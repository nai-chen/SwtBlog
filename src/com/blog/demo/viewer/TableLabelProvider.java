package com.blog.demo.viewer;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class TableLabelProvider implements ITableLabelProvider {
    private Image image;

    public TableLabelProvider() {
        image = new Image(Display.getDefault(), 
            TableLabelProvider.class.getResourceAsStream("demo.gif"));
    }

    @Override
    public void addListener(ILabelProviderListener listener) {
    }

    @Override
    public void dispose() {
        image.dispose();
    }

    @Override
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    @Override
    public void removeListener(ILabelProviderListener listener) {
    }

    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        if (columnIndex == 0) {
            return image;
        }
        return null;
    }

    @Override
    public String getColumnText(Object element, int columnIndex) {
        if (element instanceof Student) {
            Student stud = (Student) element;
            if (columnIndex == 0) {
                return stud.getName();
            } else if (columnIndex == 1) {
                return Integer.toString(stud.getAge());
            }
        }
        return null;
    }

}

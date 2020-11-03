package com.blog.demo.viewer;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class TreeLabelProvider implements ITableLabelProvider, ILabelProvider {

    @Override
    public void addListener(ILabelProviderListener listener) {
    }

    @Override
    public void dispose() {
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
        return null;
    }

    @Override
    public String getColumnText(Object element, int columnIndex) {
        if (element instanceof Student) {
            if (columnIndex == 1) {
                return ((Student) element).getName();
            }
        } else if (element instanceof Teacher) {
            if (columnIndex == 0) {
                return ((Teacher) element).getName();
            }
        }
        return null;
    }

    @Override
    public Image getImage(Object element) {
        return null;
    }

    @Override
    public String getText(Object element) {
        if (element instanceof Student) {
            return ((Student) element).getName();
        } else if (element instanceof Teacher) {
            return ((Teacher) element).getName();
        }
        return null;
    }

}

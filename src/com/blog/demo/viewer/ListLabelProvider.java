package com.blog.demo.viewer;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class ListLabelProvider implements ILabelProvider {

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
    public Image getImage(Object element) {
        return null;
    }

    @Override
    public String getText(Object element) {
        if (element instanceof Student)
            return ((Student) element).getName();
        return null;
    }
    
}

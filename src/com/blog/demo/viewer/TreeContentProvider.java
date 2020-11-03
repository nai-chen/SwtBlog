package com.blog.demo.viewer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class TreeContentProvider implements ITreeContentProvider, PropertyChangeListener {
    private Viewer viewer;

    @Override
    public Object[] getElements(Object inputElement) {
        if (inputElement instanceof ModelList) {
            return ((ModelList) inputElement).getElements();
        }
        return new Object[0];
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof Teacher) {
            return ((Teacher) parentElement).getStudents().toArray();
        }
        return new Object[0];
    }

    @Override
    public Object getParent(Object element) {
        if (element instanceof Student) {
            return ((Student) element).getTeacher();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof Teacher) {
            return !((Teacher) element).getStudents().isEmpty();
        }
        return false;
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        this.viewer = viewer;
        if (oldInput instanceof ModelList) {
            ((ModelList) oldInput).removePropertyChangeListener(this);
        }

        if (newInput instanceof ModelList) {
            ((ModelList) newInput).addPropertyChangeListener(this);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (ModelList.PROPERTY_NAME_ADD.equals(evt.getPropertyName())) {
            viewer.refresh();
        } else if (ModelList.PROPERTY_NAME_REMOVE.equals(evt.getPropertyName())) {
            viewer.refresh();
        }
    }
}

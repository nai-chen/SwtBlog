package com.blog.demo.viewer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ListContentProvider implements IStructuredContentProvider, PropertyChangeListener {

    private Viewer viewer;

    @Override
    public Object[] getElements(Object inputElement) {
        if (inputElement instanceof ModelList) {
            return ((ModelList)inputElement).getElements();
        }
        return new Object[0];
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

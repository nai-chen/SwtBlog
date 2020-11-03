package com.blog.demo.viewer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class ModelList {
    public final static String PROPERTY_NAME_ADD 	= "add";
    public final static String PROPERTY_NAME_REMOVE = "remove";

    private List<Object> mData = new ArrayList<Object>();
    private PropertyChangeSupport mSupport = new PropertyChangeSupport(this);

    public void addObject(Object data) {
        if (mData.add(data)) {
            mSupport.firePropertyChange(PROPERTY_NAME_ADD, null, data);
        }
    }

    public void removeObject(Object data) {
        if (mData.remove(data)) {
            mSupport.firePropertyChange(PROPERTY_NAME_REMOVE, data, null);
        }
    }

    public Object[] getElements() {
        return mData.toArray();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        mSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        mSupport.removePropertyChangeListener(listener);
    }
}

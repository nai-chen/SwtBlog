package com.blog.demo.control;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Shell;

import com.blog.demo.BaseDemo;

/*
 * https://blog.csdn.net/chennai1101/article/details/103383267
 */
public class ComboDemo extends BaseDemo {

	protected ComboDemo(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	protected void createPartition(Shell shell) {
		Combo combo = new Combo(shell, SWT.READ_ONLY);
		combo.setBounds(10, 10, 80, 110);
		combo.add("Tom");
		combo.add("Mike");
		combo.add("Peter");
		combo.add("Lily");

		final Combo simpleCombo = new Combo(shell, SWT.SIMPLE);
		simpleCombo.setBounds(100, 10, 80, 110);
		simpleCombo.add("Tom");
		simpleCombo.add("Mike");
		simpleCombo.add("Peter");
		simpleCombo.add("Lily");

		simpleCombo.addModifyListener(new ModifyListener() {			
		    @Override
		    public void modifyText(ModifyEvent e) {
		        System.out.println(simpleCombo.getText());
		    }
		});
	}

	public static void main(String[] args) {
		new ComboDemo("Demo title", 210, 170);
	}
	
}

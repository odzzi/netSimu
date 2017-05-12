package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainWin extends JFrame {
	public MainWin(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize((int)(size.getWidth()*0.618), (int)(size.getHeight()*0.618));
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		this.addJMenuBar();
		this.addJToolBar();
		this.addJContentPanel();
		this.addJStatusBar();
		
	}

	private void addJStatusBar() {
		// TODO Auto-generated method stub
		
	}

	private void addJContentPanel() {
		// TODO Auto-generated method stub
		
	}

	private void addJToolBar() {
		// TODO Auto-generated method stub
		
	}

	private void addJMenuBar() {
		// TODO Auto-generated method stub
		
	}
}
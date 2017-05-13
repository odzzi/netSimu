package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

/**
 * 
 * @author billy0920
 * @mail billy.wuweibin@gmail.com
 * @date 2017-05-12
 *
 */
public class MainWin extends JFrame {
	private static final long serialVersionUID = 3310153924711298805L;
	private ImageIcon logo = null;
	public MainWin(String title) {
		super(title);
		
		try {
			String strIon = "/icons/netFomula.png";
			logo = new ImageIcon(ImageIO.read(this.getClass().getResource(strIon)));
			super.setIconImage(logo.getImage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu view = new JMenu("View");
		JMenu action = new JMenu("Action");
		JMenu help = new JMenu("Help");
		mb.add(file);
		mb.add(view);
		mb.add(action);
		mb.add(help);
		file.add(new AbstractAction("New"){

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		file.addSeparator();
		file.add(new AbstractAction("Exit"){

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				Exit();
			}
			
		});
		
		this.setJMenuBar(mb);
	}
	private void Exit() {
		if(JOptionPane.showConfirmDialog(null, 
				"Are you sure to EXIT?", 
				"Exit", 
				JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE,
				logo) == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}
}
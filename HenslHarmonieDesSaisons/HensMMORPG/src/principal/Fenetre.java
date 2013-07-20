package principal;

	import java.awt.BorderLayout;
	import java.awt.Color;
	 
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	 
	 
	public class Fenetre extends JFrame {
	        
	        private JPanel container = new JPanel();
	        private JCheckBox check1 = new JCheckBox("Case 1");
	        private JCheckBox check2 = new JCheckBox("Case 2");
	        private JLabel label = new JLabel("Une ComboBox");
	        
	        public Fenetre(){
	        
	        this.setTitle("Animation");
	        this.setSize(300, 300);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	 
	        container.setBackground(Color.white);
	        container.setLayout(new BorderLayout());
	               
	        JPanel top = new JPanel();
	        top.add(check1);
	        top.add(check2);
	        
	        container.add(top, BorderLayout.NORTH);
	        this.setContentPane(container);
	        this.setVisible(true);            
	        }       
	}


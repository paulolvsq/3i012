package repertoire.IHM;

import javax.swing.JLabel;

public class ConcreteComposantG extends JLabel implements Observer {
	
	private int nb = 0;
	
	public ConcreteComposantG() {
		super();
		String label = String.valueOf(nb);
		super.setText(label);
		super.setVisible(true);
		
	}
	@Override
	public void update(int nb) {
		this.nb = nb;
		String label = String.valueOf(nb);
		super.setText(label);
	}
	
	public int getNb() {
		return nb;
	}
}

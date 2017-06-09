package br.pro.hashi.ensino.desagil.lucianogic.model;

import javax.swing.JCheckBox;

public  abstract class Ponte extends Gate {

private Gate gate;
private JCheckBox[] inBoxes;
private OrGate   orRight;
private HalfGate halfRight;

	
public Ponte(){
	
	super(2,2);
	this.gate = gate;
	
	orRight = new OrGate();
	halfRight = new HalfGate();

		if(orRight.read() == true) {
			inBoxes[0].setSelected(gate.read(1));
}
		if(halfRight.read() == true){
			inBoxes[1].setSelected(gate.read(0));
}
}
}
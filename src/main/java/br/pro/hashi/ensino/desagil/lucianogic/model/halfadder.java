package br.pro.hashi.ensino.desagil.lucianogic.model;

public class halfadder extends Gate {
		
	private XorGate xorTop;  
	private AndGate andBottom;
	
public halfadder() {
	super(2, 2); // (Número de entrada,Número de saída)

	name = "HALF";

	xorTop = new XorGate();  

	andBottom = new AndGate();
}
			
			
	@Override
	public boolean doRead(int index) {
		if(index == 0){
			return xorTop.read();
}       else {
			return andBottom.read();
}
}

	@Override
	protected void doConnect(Emitter emitter, int index) {
		
		switch(index) {
		
		case 0:
			xorTop.connect(emitter, 0);
			andBottom.connect(emitter, 0);
			break;
		case 1:
			xorTop.connect(emitter, 1);
			andBottom.connect(emitter, 1);
			break;
}
}
}

			

			
			


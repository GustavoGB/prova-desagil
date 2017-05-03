package br.pro.hashi.ensino.desagil.lucianogic.model;

public class HalfGate extends Gate {

	private NandGate nandTop;
	private NandGate nandBottom;
	private NandGate nandRight;
	private NandGate nandLeft;
	private NandGate nandBottomBottom;
	
public HalfGate(){
	super(2,2);
	name = "HALF";
			
	nandTop = new NandGate();
	nandBottom = new NandGate();
	nandRight = new NandGate();
	nandLeft = new NandGate();
	nandBottomBottom = new NandGate();
	
	nandLeft.connect(nandTop,1);
	nandLeft.connect(nandBottom, 0);
	nandLeft.connect(nandBottomBottom, 0);
	nandLeft.connect(nandBottomBottom, 1);
	
	nandTop.connect(nandRight, 0);
	nandBottom.connect(nandRight, 1);
	
	
	
	
}
	@Override
	public boolean doRead(int index) {
		if(index == 0){
			return nandRight.read();
}       else {
			return nandBottomBottom.read();
}
}	@Override
	protected void doConnect(Emitter emitter, int index) {
		
		switch(index) {
		
		case 0:
			nandLeft.connect(emitter, 0);
			nandTop.connect(emitter, 0);
			break;
		case 1:
			nandLeft.connect(emitter, 1);
			nandBottom.connect(emitter, 1);
			break;
}
}
}



	


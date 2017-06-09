package br.pro.hashi.ensino.desagil.lucianogic.model;

public class FullGate extends Gate {
	
	private HalfGate halfLeft;
	private OrGate   orRight;
	private HalfGate halfRight;
	
	
	public FullGate(){
		super(3,2);
		name = "FULL";
				
		halfLeft = new HalfGate();
		orRight = new OrGate();
		halfRight = new HalfGate();
		
		//Conexões das portas
		halfRight.connect(halfLeft,1);
		orRight.connect(halfRight, 0);
		orRight.connect(halfLeft, 1);
}

	
	@Override
	public boolean doRead(int index) {
		if(index == 0){
			return halfRight.read();
}       else {
			return orRight.read();
}
		
}	@Override
	protected void doConnect(Emitter emitter, int index) {
		
		switch(index) {
		
		case 0:
			halfRight.connect(emitter, 0);
			break;
		case 1:
			halfLeft.connect(emitter, 0);
			break;
		case 2:
			halfLeft.connect(emitter, 1);			
			break;
}
}
}
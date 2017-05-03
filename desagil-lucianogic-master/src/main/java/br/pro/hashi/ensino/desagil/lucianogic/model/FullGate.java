package br.pro.hashi.ensino.desagil.lucianogic.model;

public class FullGate extends Gate {
	
	private HalfGate Halfleft;
	private HalfGate Halftop;
	private HalfGate Halfright;
	
	
	public FullGate(){
		super(3,2);
		name = "FULL";
				
		Halfleft = new HalfGate();
		Halftop = new HalfGate();
		Halfright = new HalfGate();
		
		//Conexões das portas
		Halfleft.connect(Halftop,1);
		Halftop.connect(Halfright, 0);
}

	
	@Override
	public boolean doRead(int index) {
		if(index == 0){
			return Halftop.read();
}       else {
			return Halfright.read();
}
		
}	@Override
	protected void doConnect(Emitter emitter, int index) {
		
		switch(index) {
		
		case 0:
			Halftop.connect(emitter, 0);
			break;
		case 1:
			Halfleft.connect(emitter, 0);
			break;
		case 2:
			Halfleft.connect(emitter, 1);			
			break;
}
}
}

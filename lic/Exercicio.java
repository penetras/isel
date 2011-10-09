import isel.leic.usbio.*;

public class Exercicio {

	private static int D2 = 0x01; //Blink
	private static int D3 = 0x02; //Ascend
	
	public static int estadoAnterior=0;

	public static void main(String[] args){
		
		long timePassed = System.currentTimeMillis();
		int Passado=(UsbPort.in() & 0x01);
		
		while( (UsbPort.in() & 0x02) == 0)
		{
			if(System.currentTimeMillis() - timePassed > 1000)
			{
			
			estadoAnterior = estadoAnterior ^ D2;
			UsbPort.out(estadoAnterior);
			timePassed = System.currentTimeMillis();
			
			}
			
			if ( (UsbPort.in() & 0x01) != Passado)
			{
				if (Passado == 0)
				{
					estadoAnterior = estadoAnterior ^ D3;
					UsbPort.out(estadoAnterior);
				}
			}
	
			Passado = UsbPort.in();
			
		}	
	}
}

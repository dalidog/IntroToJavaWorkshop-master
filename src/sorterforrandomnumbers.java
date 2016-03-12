import javax.swing.JOptionPane;

public class sorterforrandomnumbers {
	public static void main(String[] args) {
		String butt=JOptionPane.showInputDialog(null, "type in a random #");
		String doublebutt=JOptionPane.showInputDialog(null, "type in another random #");
		String triplebutt=JOptionPane.showInputDialog(null, "type in a 3rd random #");
		int poo1=Integer.parseInt(butt);
		int poo2=Integer.parseInt(doublebutt);
		int poo3=Integer.parseInt(triplebutt);
		int temppoo;
		if( poo1>poo2)
		{
			temppoo=poo1;
			poo1=poo2;
			poo2=temppoo;
		}
		if( poo2>poo3)
		{
			temppoo=poo2;
			poo2=poo3;
			poo3=temppoo;
		}
		JOptionPane.showMessageDialog(null, poo1 + " "+ poo2 + " " + poo3);
	}
	
				}



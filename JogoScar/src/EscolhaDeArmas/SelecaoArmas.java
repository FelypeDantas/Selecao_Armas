package EscolhaDeArmas;

import java.util.Random;

import javax.swing.JOptionPane;


public class SelecaoArmas {
	
	
	
  public static void main(String[] args) {
	  new SelecaoArmas();
	  String Arma;
	  int i = 0;
	  
	  Random gerador = new Random();
	  
	  i = gerador.nextInt(6);
	  
	  switch(i) {
	  
	  case 0: Arma = "Dead King";
	          JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
	          break;
	  case 1: Arma = "Thunderbolt";
	          JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
	          break;
	  case 2: Arma = "Dark Mether";
	          JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
	          break;
	  case 3: Arma = "Dama de Rosa";
              JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
              break;
	  case 4: Arma = "Foice das noites escuras";
              JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
              break; 
	  case 5: Arma = "Lâmina Torta da Fênix Celestial";
              JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
              break; 
	  case 6: Arma = "Blood Queen";
              JOptionPane.showMessageDialog(null,"A sua arma será: " + Arma);
              break; 
      default:  JOptionPane.showMessageDialog(null,"A sua arma é inexistente, terá que conquista-las ");
	  }
  }
}

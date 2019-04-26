package no.hvl.dat102;

public class Hoyde {

	public <T> int hentHoyde(BinaerTreNode<T> node){
		
		if (node == null)  {
			return -1;
		} else {
			int vDybde = hentHoyde(node.getVenstre());
			int hDybde = hentHoyde (node.getHoyre());
			
			if(vDybde > hDybde)
				return (vDybde +1);
			else
				return (hDybde +1);
		}
		
		
		
	}
}

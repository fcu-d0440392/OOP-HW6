package fcu.iecs.oop.pokemon;

public class Pokemon {

	private String name;
	private PokemonType type;
	private int CP;
	
	Pokemon(String Name, PokemonType Type, int cp){
		name = Name;
		type = Type;
		CP = cp;
	}
	public String getname(){
		return name;
	}
	public PokemonType gettype(){
		return type;
	}
	public int getCP(){
		return CP;
	}
	public void setCP(int cp){
		CP = cp;
	}

}

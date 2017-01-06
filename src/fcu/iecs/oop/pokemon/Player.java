package fcu.iecs.oop.pokemon;

public class Player {
	
	private String PlayerName;
	private Pokemon[] pokemons;
	private int level = 1;
	
	public Player(String playername){
		this.PlayerName = playername;
	}
	public String getPlayername(){
		return PlayerName;
	}
	public Pokemon[] getPokemon(){
		return pokemons;
	}
	public int getlevel(){
		return level;
	}
	public void setPlayername(String name){
		PlayerName = name;
	}
	public void setPokemons(Pokemon[] pokemons){
		this.pokemons = pokemons;
	}
	public void setLevel(int num){
		this.level = num;
	}

}

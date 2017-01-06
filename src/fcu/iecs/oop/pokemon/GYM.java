package fcu.iecs.oop.pokemon;

public class GYM {
	public static Player fight(Player... players)
	{
		Player winner,p1=null,p2=null;
		int w1=0,w2=0,i=0,round=0;
		
		for(Player p:players)
		{
			if(i==0)
				p1 = p;
			else
				p2 = p;
			i++;
		}
		
		while(w1!=2 && w2!=2)
		{
			if( (p1.getPokemon()[round].gettype()==PokemonType.FIRE && p2.getPokemon()[round].gettype()==PokemonType.GRASS) || (p1.getPokemon()[round].gettype()==PokemonType.GRASS && p2.getPokemon()[round].gettype()==PokemonType.WATER) || (p1.getPokemon()[round].gettype()==PokemonType.WATER && p2.getPokemon()[round].gettype()==PokemonType.FIRE) )
				w1++;
			else if( (p2.getPokemon()[round].gettype()==PokemonType.FIRE && p1.getPokemon()[round].gettype()==PokemonType.GRASS) || (p2.getPokemon()[round].gettype()==PokemonType.GRASS && p1.getPokemon()[round].gettype()==PokemonType.WATER) || (p2.getPokemon()[round].gettype()==PokemonType.WATER && p1.getPokemon()[round].gettype()==PokemonType.FIRE) )
				w2++;
			else
			{
				if(p1.getPokemon()[round].getCP()>p2.getPokemon()[round].getCP())
					w1++;
				else if(p2.getPokemon()[round].getCP()>p1.getPokemon()[round].getCP())
					w2++;
				else
				{
					if((int) (Math.random()*2)==0)
						w1++;
					else
						w2++;
				}
			}
			
			round = w1+w2;
		}
		
		winner = w1>w2?p1:p2;
		winner.setLevel(winner.getlevel()+1);
		System.out.println("Winner is "+winner.getPlayername()+", and his/her level becomes "+winner.getlevel()+".");
		
		return winner;
	}
}
package fr.schawnndev.utils;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class Vie {

	Player plaayer = null;
	int vie = 0;
	public HashMap<Player, Integer> playerVies = new HashMap<Player, Integer>();

	public Vie(Player player) {
		this.plaayer = player;
	}

	public void addPlayer() {
		this.playerVies.put(plaayer, this.vie);
	}

	public void removePlayer() {
		this.playerVies.remove(plaayer);
	}
	
	public void addVie(int vies){
		int i = this.playerVies.get(plaayer) + vies;
		this.playerVies.put(plaayer, i);
	}
	
	public void removeOne(){
		int i=0;
		if(this.playerVies.get(plaayer) != 0){
			i = this.playerVies.get(plaayer) - 1;
			this.playerVies.put(plaayer, i);
		}
	}

	public int get() {
		return this.playerVies.get(plaayer);
	}

	public boolean containsPlayer() {
		if (this.playerVies.containsKey(this.plaayer))
			return true;
		return false;
	}
	
}

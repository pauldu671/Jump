package fr.schawnndev;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.schawnndev.utils.Vie;

public class Events implements Listener {

	Main pl;

	public Events(Main plugin) {
		pl = plugin;
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e){
		Block block = e.getTo().getBlock();
		if(e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.GOLD_PLATE){
			Vie vie = new Vie(e.getPlayer(), 10);
			Main.playerVies.put(e.getPlayer(), vie);
		}
	}
	
	
	

}
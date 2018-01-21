eaglAPI.tileRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bte.objects.eaglAPI.tile.TileEntityBase;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileRegistry {
	ArrayList<TileEntityBase> TILES;
	
	String modIn;
	
	/**
	 * Standard Constructor
	 * @param modid
	 * @param amount Specifies the amount of tile entities your mod will add
	 */
	public TileRegistry(String modid, int amount) {
	 modIn=modid;
	 TILES = new ArrayList<>(amount);
	}
	
	void addTE(TileEntityBase tile){
		TILES.add(tile);
	}
	
	public void register() {
		for(TileEntityBase tile : TILES) {
			GameRegistry.registerTileEntity(tile.getClass(), modIn + ":" + tile.name);
		}
	}

}

package eaglAPI;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
/**
 * A Block With Tile Entity
 * Is Abstract
 * @author ewanarends
 */
public abstract class BlockWithTileEntity extends BlockBase implements ITileEntityProvider{

	public BlockWithTileEntity(String name, Material materialIn, CreativeTabs tab, int harvestlevel) {
		super(name, materialIn, tab, harvestlevel);
	}
	
	@Override
	public boolean hasTileEntity() {
		return createTileEntity() != null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return createTileEntity();
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return createTileEntity();
	}
	
	public abstract TileEntity createTileEntity();

}

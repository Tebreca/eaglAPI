package eaglAPI.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public abstract class TileEntityBase extends TileEntity {

	public String name;
	
	public TileEntityBase(String name) {
		this.name = name;
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setString("name", name);
		return super.writeToNBT(writeCapabilities(compound));
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		name = compound.getString("name");
		super.readFromNBT(readCapabilities(compound));
	}

	protected abstract NBTTagCompound readCapabilities(NBTTagCompound compound);
	
	protected abstract NBTTagCompound writeCapabilities(NBTTagCompound compound);
}

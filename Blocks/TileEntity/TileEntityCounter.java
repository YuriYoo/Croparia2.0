package com.croparia.mod.Blocks.TileEntity;

import com.croparia.mod.Reference;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCounter extends TileEntity {

	public int counter = 0;
	public boolean goodRitual = false;

	public void more() {counter++;}
	public int getCounter(){return counter;}
	public void less() {counter--;}
	public void reset() {counter = 0;}
	public void resetAll() {counter = 0; goodRitual = false;}
	public void say() {System.out.print(this.counter);}
}

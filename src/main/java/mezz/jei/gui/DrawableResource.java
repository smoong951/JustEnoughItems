package mezz.jei.gui;

import mezz.jei.api.gui.IDrawable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class DrawableResource extends Gui implements IDrawable {

	@Nonnull
	private final ResourceLocation resourceLocation;
	private final int u;
	private final int v;
	private final int width;
	private final int height;

	public DrawableResource(@Nonnull ResourceLocation resourceLocation, int u, int v, int width, int height) {
		this.resourceLocation = resourceLocation;

		this.u = u;
		this.v = v;
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	public void draw(@Nonnull Minecraft minecraft) {
		minecraft.getTextureManager().bindTexture(resourceLocation);
		this.drawTexturedModalRect(0, 0, u, v, width, height);
	}

}
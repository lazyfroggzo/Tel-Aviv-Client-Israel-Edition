package ru.levin.util.render.providers;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public final class ResourceProvider {
	public static final ShaderProgramKey TEXTURE_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("texture"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey RECTANGLE_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("rectangle"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey BLUR_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("blur"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey RECTANGLE_BORDER_SHADER_KEY = new ShaderProgramKey(getShaderIdentifier("border"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
	public static final ShaderProgramKey GLASS_SHADER_KEY = new ShaderProgramKey(getGlass("data"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY);

	public static final Identifier firefly = Identifier.of("telaviv", "images/particles/firefly.png");
	public static final Identifier bloom = Identifier.of("telaviv", "images/particles/bloom.png");
	public static final Identifier snowflake = Identifier.of("telaviv", "images/particles/snowflake.png");
	public static final Identifier dollar = Identifier.of("telaviv", "images/particles/dollar.png");
	public static final Identifier heart = Identifier.of("telaviv", "images/particles/heart.png");
	public static final Identifier star = Identifier.of("telaviv", "images/particles/star.png");
	public static final Identifier spark = Identifier.of("telaviv", "images/particles/spark.png");
	public static final Identifier crown = Identifier.of("telaviv", "images/particles/crown.png");
	public static final Identifier lightning = Identifier.of("telaviv", "images/particles/lightning.png");
	public static final Identifier line = Identifier.of("telaviv", "images/particles/line.png");
	public static final Identifier point = Identifier.of("telaviv", "images/particles/point.png");
	public static final Identifier rhombus = Identifier.of("telaviv", "images/particles/rhombus.png");


	public static final Identifier marker = Identifier.of("telaviv", "images/targetesp/target.png");
	public static final Identifier marker2 = Identifier.of("telaviv", "images/targetesp/target2.png");


	public static final Identifier CUSTOM_CAPE = Identifier.of("telaviv", "cape/cape.png");
	public static final Identifier CUSTOM_ELYTRA = Identifier.of("telaviv", "cape/elytra.png");

	public static final Identifier container = Identifier.of("telaviv", "images/hud/container.png");

	public static final Identifier color_image = Identifier.of("telaviv", "images/gui/pick.png");


	private static Identifier getGlass(String name) {
		return Identifier.of("telaviv", "core/glass/" + name);
	}
	private static Identifier getShaderIdentifier(String name) {
		return Identifier.of("telaviv", "core/" + name);
	}
}
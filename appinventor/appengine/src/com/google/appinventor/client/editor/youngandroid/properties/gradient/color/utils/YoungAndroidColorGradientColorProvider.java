package com.google.appinventor.client.editor.youngandroid.properties.gradient.color.utils;

import static com.google.appinventor.client.Ode.MESSAGES;

import com.google.appinventor.client.widgets.properties.ColorChoicePropertyEditor.Color;

public abstract class YoungAndroidColorGradientColorProvider {

	public static final String HEX_DEFAULT = "&H000000";
	public static final String HEX_INDIGO = "&HFF3f51b5";
	public static final String HEX_MD_BLUE = "&HFF2196f3";
	public static final String HEX_MD_LIGHT_BLUE = "&HFF03a9f4";
	public static final String HEX_MD_CYAN = "&HFF00bcd4";
	public static final String HEX_MD_TEAL = "&HFF009688";
	public static final String HEX_MD_GREEN = "&HFF4cb050";
	public static final String HEX_MD_LIGHT_GREEN = "&HFF8bc34a";
	public static final String HEX_MD_LIME = "&HFFcddc39";
	public static final String HEX_MD_YELLOW = "&HFFffff3b";
	public static final String HEX_MD_AMBER = "&HFFffc107";
	public static final String HEX_MD_ORANGE = "&HFFff9800";
	public static final String HEX_MD_DEEP_ORANGE = "&HFFff5722";
	public static final String HEX_MD_RED = "&HFFf44336";
	public static final String HEX_MD_PINK = "&HFFe91e63";
	public static final String HEX_MD_PURPLE = "&HFF9c8bb0";
	public static final String HEX_MD_DEEP_PURPLE = "&HFF673ab7";
	public static final String HEX_MD_BLUE_GREY = "&HFF607d8b";
	public static final String HEX_MD_BROWN = "&HFF795548";
	public static final String HEX_MD_GREY = "&HFF9e9e9e";
	public static final String HEX_MD_BLACK = "&HFF212121";
	public static final String HEX_WHITE = "&HFFffffff";
	
	
	public static final String PROPERTY_NAME_BACKGROUNDCOLOR = "BackgroundColor";
	public static final String PROPERTY_NAME_BACKGROUNDCOLOR_GRADIENT = "BackgroundColorGradient";

	public static final String PROPERTY_NAME_TEXTCOLOR = "TextColor";
	public static final String PROPERTY_NAME_TEXTCOLOR_GRADIENT = "TextColorGradient";
	
	public static final String PROPERTY_NAME_ITEM_BACKGROUNDCOLOR = "ItemBackgroundColor";
	public static final String PROPERTY_NAME_ITEM_BACKGROUNDCOLOR_GRADIENT = "ItemBackgroundColorGradient";
	
	public static final String PROPERTY_NAME_ITEM_TEXT_COLOR = "ItemTextColor";
	public static final String PROPERTY_NAME_ITEM_TEXT_COLOR_GRADIENT = "ItemTextColorGradient";
	
	public static final String PROPERTY_NAME_SELECTION_COLOR = "SelectionColor";
	public static final String PROPERTY_NAME_SELECTION_COLOR_GRADIENT = "SelectionColorGradient";
	
	public static final String PROPERTY_NAME_COLOR_LEFT = "ColorLeft";
	public static final String PROPERTY_NAME_COLOR_LEFT_GRADIENT = "ColorLeftGradient";
	
	public static final String PROPERTY_NAME_COLOR_RIGHT = "ColorRight";
	public static final String PROPERTY_NAME_COLOR_RIGHT_GRADIENT = "ColorRightGradient";
	
	public static final String PROPERTY_PAINT_COLOR = "PaintColor";
	public static final String PROPERTY_PAINT_COLOR_GRADIENT = "PaintColorGradient";
	
	public static final Color[] INDIGO_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdIndigo1Color(), Color.ALPHA_OPAQUE, "c5cae9"),
			new Color(MESSAGES.mdIndigo2Color(), Color.ALPHA_OPAQUE, "303f9f"),
			new Color(MESSAGES.mdIndigo3Color(), Color.ALPHA_OPAQUE, "536dfe")

	};

	public static final Color[] BLUE_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdBlue1Color(), Color.ALPHA_OPAQUE, "bbdefb"),
			new Color(MESSAGES.mdBlue2Color(), Color.ALPHA_OPAQUE, "1976d2"),
			new Color(MESSAGES.mdBlue3Color(), Color.ALPHA_OPAQUE, "448aff")

	};

	public static final Color[] LIGHT_BLUE_GRADIENT = {
			new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdLightBlue1Color(), Color.ALPHA_OPAQUE, "b3e5fc"),
			new Color(MESSAGES.mdLightBlue2Color(), Color.ALPHA_OPAQUE, "0288d1"),
			new Color(MESSAGES.mdLightBlue3Color(), Color.ALPHA_OPAQUE, "40c4ff")

	};

	public static final Color[] CYAN_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdCyan1Color(), Color.ALPHA_OPAQUE, "b2ebf2"),
			new Color(MESSAGES.mdCyan2Color(), Color.ALPHA_OPAQUE, "0097a7"),
			new Color(MESSAGES.mdCyan3Color(), Color.ALPHA_OPAQUE, "18ffff")

	};

	public static final Color[] TEAL_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdTeal1Color(), Color.ALPHA_OPAQUE, "b2dfdb"),
			new Color(MESSAGES.mdTeal2Color(), Color.ALPHA_OPAQUE, "00796b"),
			new Color(MESSAGES.mdTeal3Color(), Color.ALPHA_OPAQUE, "64ffda")

	};

	public static final Color[] GREEN_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdGreen1Color(), Color.ALPHA_OPAQUE, "c8e6c9"),
			new Color(MESSAGES.mdGreen2Color(), Color.ALPHA_OPAQUE, "388e3c"),
			new Color(MESSAGES.mdGreen3Color(), Color.ALPHA_OPAQUE, "69f0ae")

	};

	public static final Color[] LIGHT_GREEN_GRADIENT = {
			new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdLightGreen1Color(), Color.ALPHA_OPAQUE, "dcedc8"),
			new Color(MESSAGES.mdLightGreen2Color(), Color.ALPHA_OPAQUE, "689f38"),
			new Color(MESSAGES.mdLightGreen3Color(), Color.ALPHA_OPAQUE, "b2ff59")

	};

	public static final Color[] LIME_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdLime1Color(), Color.ALPHA_OPAQUE, "f0f4c3"),
			new Color(MESSAGES.mdLime2Color(), Color.ALPHA_OPAQUE, "afb42b"),
			new Color(MESSAGES.mdLime3Color(), Color.ALPHA_OPAQUE, "eeff41")

	};

	public static final Color[] YELLOW_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdYellow1Color(), Color.ALPHA_OPAQUE, "fff9c4"),
			new Color(MESSAGES.mdYellow2Color(), Color.ALPHA_OPAQUE, "fbc02d"),
			new Color(MESSAGES.mdYellow3Color(), Color.ALPHA_OPAQUE, "ffff00")

	};

	public static final Color[] AMBER_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdAmber1Color(), Color.ALPHA_OPAQUE, "ffecb3"),
			new Color(MESSAGES.mdAmber2Color(), Color.ALPHA_OPAQUE, "ffa000"),
			new Color(MESSAGES.mdAmber3Color(), Color.ALPHA_OPAQUE, "ffd73f")

	};

	public static final Color[] ORANGE_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdOrange1Color(), Color.ALPHA_OPAQUE, "ffe0b2"),
			new Color(MESSAGES.mdOrange2Color(), Color.ALPHA_OPAQUE, "f57c00"),
			new Color(MESSAGES.mdOrange3Color(), Color.ALPHA_OPAQUE, "ffab40")

	};

	public static final Color[] DEEP_ORANGE_GRADIENT = {
			new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdDeepOrange1Color(), Color.ALPHA_OPAQUE, "ffccbc"),
			new Color(MESSAGES.mdDeepOrange2Color(), Color.ALPHA_OPAQUE, "e64a19"),
			new Color(MESSAGES.mdDeepOrange3Color(), Color.ALPHA_OPAQUE, "ff6e40")

	};

	public static final Color[] RED_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdRed1Color(), Color.ALPHA_OPAQUE, "ffcdd2"),
			new Color(MESSAGES.mdRed2Color(), Color.ALPHA_OPAQUE, "d32f2f"),
			new Color(MESSAGES.mdRed3Color(), Color.ALPHA_OPAQUE, "ff5252")

	};

	public static final Color[] PINK_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdPink1Color(), Color.ALPHA_OPAQUE, "f8bbcd"),
			new Color(MESSAGES.mdPink2Color(), Color.ALPHA_OPAQUE, "c2185b"),
			new Color(MESSAGES.mdPink3Color(), Color.ALPHA_OPAQUE, "ff4081")

	};

	public static final Color[] PURPLE_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdPurple1Color(), Color.ALPHA_OPAQUE, "e1bee7"),
			new Color(MESSAGES.mdPurple2Color(), Color.ALPHA_OPAQUE, "7b1fa2"),
			new Color(MESSAGES.mdPink3Color(), Color.ALPHA_OPAQUE, "e03dfb")

	};

	public static final Color[] DEEP_PURPLE_GRADIENT = {new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdDeepPurple1Color(), Color.ALPHA_OPAQUE, "d1c4e9"),
			new Color(MESSAGES.mdDeepOrange2Color(), Color.ALPHA_OPAQUE, "512da8"),
			new Color(MESSAGES.mdDeepOrange3Color(), Color.ALPHA_OPAQUE, "7b4dff")

	};

	public static final Color[] BLUE_GREY_GRADIENT = {new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdBlueGrey1Color(), Color.ALPHA_OPAQUE, "cfd8dc"),
			new Color(MESSAGES.mdBlueGrey2Color(), Color.ALPHA_OPAQUE, "455a64")

	};

	public static final Color[] BROWN_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdBrown1Color(), Color.ALPHA_OPAQUE, "d7ccc8"),
			new Color(MESSAGES.mdBrown2Color(), Color.ALPHA_OPAQUE, "5d4037")

	};

	public static final Color[] GREY_GRADIENT = { new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000"),
			new Color(MESSAGES.mdGrey1Color(), Color.ALPHA_OPAQUE, "f5f5f5"),
			new Color(MESSAGES.mdGreen2Color(), Color.ALPHA_OPAQUE, "bdbdbd"),
			new Color(MESSAGES.mdGreen3Color(), Color.ALPHA_OPAQUE, "767676")

	};
	
	public static final Color[] DEFAULT_GRADIENT = {
			new Color(MESSAGES.defaultColor(), Color.ALPHA_TRANSPARENT, "000000")
	};
}

package com.luxactive.pgwt.showcase.css;

/**
 * Android style aggregation of resources for simpler access
 * 
 * @author Andrei
 *
 */
public class Resources {

	public static void ensureInjected() {
		Css.INSTANCE.mainLayout_style().ensureInjected();
		Css.INSTANCE.paper_button_style().ensureInjected();
		Css.INSTANCE.paper_card_style().ensureInjected();
		Css.INSTANCE.paper_icon_button_style().ensureInjected();
		Css.INSTANCE.paper_input_style().ensureInjected();
		Css.INSTANCE.paper_radio_button_style().ensureInjected();
	}

	public static MainLayout mainLayout_style = Css.INSTANCE.mainLayout_style();
	public static Paper_Button paper_button_style = Css.INSTANCE.paper_button_style();
	public static Paper_Card paper_card_style = Css.INSTANCE.paper_card_style();
	public static Paper_Icon_Button paper_icon_button_style = Css.INSTANCE.paper_icon_button_style();
	public static Paper_Input paper_input_style = Css.INSTANCE.paper_input_style();
	public static Paper_Radio_Button paper_radio_button = Css.INSTANCE.paper_radio_button_style();

}

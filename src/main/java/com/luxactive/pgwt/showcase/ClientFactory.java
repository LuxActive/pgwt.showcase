package com.luxactive.pgwt.showcase;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;
import com.luxactive.pgwt.showcase.paper_button.PaperButtonPlace;
import com.luxactive.pgwt.showcase.paper_card.PaperCardPlace;
import com.luxactive.pgwt.showcase.paper_icon_button.PaperIconButtonPlace;
import com.luxactive.pgwt.showcase.paper_input.PaperInputPlace;
import com.luxactive.pgwt.showcase.paper_radio_button.PaperRadioButtonPlace;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	ActivityManager getActivityManager();

	AcceptsOneWidget getContentPanel();

	/**
	 * used by the historyMapper
	 */
	PaperButtonPlace.Tokenizer getPaperButtonTokenizer();

	PaperCardPlace.Tokenizer getPaperCardTokenizer();

	PaperIconButtonPlace.Tokenizer getPaperIconButtonTokenizer();
	
	PaperInputPlace.Tokenizer getPaperInputTokenizer();
	
	PaperRadioButtonPlace.Tokenizer getPaperRadioButtonPlaceTokenizer();
}

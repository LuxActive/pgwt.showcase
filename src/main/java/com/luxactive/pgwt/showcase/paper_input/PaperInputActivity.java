package com.luxactive.pgwt.showcase.paper_input;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.luxactive.pgwt.showcase.ClientFactory;
import com.luxactive.pgwt.showcase.basic.BasicActivity;

public class PaperInputActivity extends BasicActivity {

	public PaperInputActivity(PaperInputPlace place, ClientFactory clientFactory) {
		super(place, clientFactory);
	}

	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		containerWidget.setWidget(new PaperInputView());
	}
}

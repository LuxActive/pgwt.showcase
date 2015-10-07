package com.luxactive.pgwt.showcase.basic;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.luxactive.pgwt.showcase.ClientFactory;

public abstract class BasicActivity extends AbstractActivity {

	protected ClientFactory clientFactory;

	public BasicActivity(Place place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	public abstract void start(AcceptsOneWidget panel, EventBus eventBus);

}

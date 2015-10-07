package com.luxactive.pgwt.showcase;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.luxactive.pgwt.showcase.basic.MainLayout;
import com.luxactive.pgwt.showcase.css.Resources;
import com.luxactive.pgwt.showcase.paper_button.PaperButtonPlace;
import com.luxactive.pgwt.showcase.paper_card.PaperCardPlace;
import com.luxactive.pgwt.showcase.paper_icon_button.PaperIconButtonPlace;
import com.luxactive.pgwt.showcase.paper_input.PaperInputPlace;

public class ClientFactoryImpl implements ClientFactory {

	/**
	 * shell for the app - includes LoginWidget - processes the credentials
	 */
	private MainLayout mainLayout = new MainLayout();

	/**
	 * default start point in application - if nothing is in url
	 */
	private Place defaultPlace = new PaperButtonPlace("");

	/**
	 * for app's global events
	 */
	private static final EventBus eventBus = new SimpleEventBus();

	/**
	 * place's directory
	 */
	private final ActivityMapper activityMapper = new ApplicationActivityMapper(this);

	/**
	 * place's director (internal flagger|flagman for places)
	 */
	private final ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);

	/**
	 * URL tokenizer directory
	 */
	private final ApplicationPlaceHistoryMapper historyMapper = GWT.create(ApplicationPlaceHistoryMapper.class);

	/**
	 * URL tokenizer's director (URL event flagger|flagman)
	 */
	private final PlaceHistoryHandler placeHistoryHandler;

	/**
	 * app place's director (internal flagger|flagman) (not deprecated if your
	 * seeing it)
	 */
	private final PlaceController placeController = new PlaceController(eventBus);

	public ClientFactoryImpl() {
		Resources.ensureInjected();

		RootPanel.get().add(mainLayout);

		activityManager.setDisplay(mainLayout.getContentPanel());

		// tell the historyMapper there are tokenizers (below) to use in here.
		historyMapper.setFactory(this);

		placeHistoryHandler = new PlaceHistoryHandler(historyMapper);
		placeHistoryHandler.register(placeController, eventBus, defaultPlace);

		// the loginWidget needs all the stuff setup to fetch userData - inits
		// credentials process
		mainLayout.setClientFactory(this);

		// Goes to the place represented on URL else default place
		placeHistoryHandler.handleCurrentHistory();
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public ActivityManager getActivityManager() {
		return activityManager;
	}

	public AcceptsOneWidget getContentPanel() {
		return mainLayout.getContentPanel();
	}

	/***
	 * Used by the HistoryMapper { @link ApplicationPlaceHistoryMapper } Picked
	 * up by the historyMapper when needed. this way, I can send in objects like
	 * the requestFactory into them and use it otherwise, the HistoryMapper runs
	 * decoupled with this here we can push objects into it.
	 */
	@Override
	public PaperButtonPlace.Tokenizer getPaperButtonTokenizer() {
		return new PaperButtonPlace.Tokenizer();
	}

	@Override
	public PaperCardPlace.Tokenizer getPaperCardTokenizer() {
		return new PaperCardPlace.Tokenizer();
	}

	@Override
	public PaperIconButtonPlace.Tokenizer getPaperIconButtonTokenizer() {
		return new PaperIconButtonPlace.Tokenizer();
	}
	
	@Override
	public PaperInputPlace.Tokenizer getPaperInputTokenizer() {
		return new PaperInputPlace.Tokenizer();
	}

}

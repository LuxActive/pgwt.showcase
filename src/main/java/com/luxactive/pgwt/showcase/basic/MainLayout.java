package com.luxactive.pgwt.showcase.basic;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.luxactive.pgwt.basic.Event;
import com.luxactive.pgwt.basic.EventListener;
import com.luxactive.pgwt.paper_button.PaperButton;
import com.luxactive.pgwt.paper_drawer_panel.IPaperDrawerPanel;
import com.luxactive.pgwt.paper_icon_button.PaperIconButton;
import com.luxactive.pgwt.showcase.ClientFactory;
import com.luxactive.pgwt.showcase.paper_button.PaperButtonPlace;
import com.luxactive.pgwt.showcase.paper_card.PaperCardPlace;
import com.luxactive.pgwt.showcase.paper_icon_button.PaperIconButtonPlace;
import com.luxactive.pgwt.showcase.paper_input.PaperInputPlace;
import com.luxactive.pgwt.showcase.paper_radio_button.PaperRadioButtonPlace;

public class MainLayout extends Composite {
	private static LayoutUiBinder uiBinder = GWT.create(LayoutUiBinder.class);

	interface LayoutUiBinder extends UiBinder<Widget, MainLayout> {
	}

	private ClientFactory clientFactory;

	@UiField
	SimplePanel content;
	@UiField
	PaperIconButton menuButton;
	@UiField
	IPaperDrawerPanel drawer;
	@UiField
	PaperButton paper_button;
	@UiField
	PaperButton paper_card;
	@UiField
	PaperButton paper_icon_button;
	@UiField
	PaperButton paper_input;
	@UiField
	PaperButton paper_radio_button;

	public MainLayout() {
		initWidget(uiBinder.createAndBindUi(this));

		menuButton.setVisible(drawer.getNarrow());

		menuButton.addClickEventListener(new EventListener() {
			@Override
			public void handleEvent(Event event) {
				drawer.togglePanel();
			}
		});

		drawer.addEventListener("paper-responsive-change", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				menuButton.setVisible(drawer.getNarrow());
			}
		});

		paper_button.addClickEventListener(new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperButtonPlace(""));
			}
		});
		paper_card.addClickEventListener(new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperCardPlace(""));
			}
		});
		paper_icon_button.addClickEventListener(new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperIconButtonPlace(""));
			}
		});
		paper_input.addClickEventListener(new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperInputPlace(""));
			}
		});
		
		paper_radio_button.addClickEventListener(new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperRadioButtonPlace(""));
			}
		});

	}

	public AcceptsOneWidget getContentPanel() {
		return content;
	}

	public void setClientFactory(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

}

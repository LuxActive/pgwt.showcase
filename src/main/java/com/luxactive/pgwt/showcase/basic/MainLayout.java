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

	public MainLayout() {
		initWidget(uiBinder.createAndBindUi(this));

		menuButton.setVisible(drawer.getNarrow());

		menuButton.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				drawer.togglePanel();
			}
		});

		drawer.addEventListener("paper-responsive-change", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				GWT.log(drawer.getNarrow() + "");
				menuButton.setVisible(drawer.getNarrow());
			}
		});

		paper_button.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperButtonPlace(""));
			}
		});
		paper_card.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperCardPlace(""));
			}
		});
		paper_icon_button.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperIconButtonPlace(""));
			}
		});
		paper_input.addEventListener("click", new EventListener() {
			@Override
			public void handleEvent(Event event) {
				clientFactory.getPlaceController().goTo(new PaperInputPlace(""));
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

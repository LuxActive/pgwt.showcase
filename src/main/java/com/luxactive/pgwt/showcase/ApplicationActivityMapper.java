package com.luxactive.pgwt.showcase;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.luxactive.pgwt.showcase.paper_button.PaperButtonActivity;
import com.luxactive.pgwt.showcase.paper_button.PaperButtonPlace;
import com.luxactive.pgwt.showcase.paper_card.PaperCardActivity;
import com.luxactive.pgwt.showcase.paper_card.PaperCardPlace;
import com.luxactive.pgwt.showcase.paper_icon_button.PaperIconButtonActivity;
import com.luxactive.pgwt.showcase.paper_icon_button.PaperIconButtonPlace;
import com.luxactive.pgwt.showcase.paper_input.PaperInputActivity;
import com.luxactive.pgwt.showcase.paper_input.PaperInputPlace;

public class ApplicationActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;

	/**
	 * AppActivityMapper associates each Place with its corresponding
	 * {@link Activity}
	 * 
	 * @param clientFactory
	 *            Factory to be passed to activities
	 * @param walleteditview
	 * @param walletlistview
	 * @param signinview
	 */
	public ApplicationActivityMapper(ClientFactory clientFactory) {
		super();

		this.clientFactory = clientFactory;
	}

	/**
	 * Map each Place to its corresponding Activity.
	 */
	@Override
	public Activity getActivity(Place place) {
		Activity activity = null;

		if (place instanceof PaperButtonPlace) {
			activity = new PaperButtonActivity((PaperButtonPlace) place, clientFactory);
		} else if (place instanceof PaperCardPlace) {
			activity = new PaperCardActivity((PaperCardPlace) place, clientFactory);
		} else if (place instanceof PaperIconButtonPlace) {
			activity = new PaperIconButtonActivity((PaperIconButtonPlace) place, clientFactory);
		} else if (place instanceof PaperInputPlace) {
			activity = new PaperInputActivity((PaperInputPlace) place, clientFactory);
		}

		return activity;
	}

}

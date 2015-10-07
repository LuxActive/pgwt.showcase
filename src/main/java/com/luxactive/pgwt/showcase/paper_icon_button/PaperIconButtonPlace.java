package com.luxactive.pgwt.showcase.paper_icon_button;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class PaperIconButtonPlace extends Place {

	/**
	 * I'm not really using the tokenizer here, but good for example
	 */
	@Prefix("paper_icon_button")
	public static class Tokenizer implements PlaceTokenizer<PaperIconButtonPlace> {

		public Tokenizer() {
		}

		@Override
		public String getToken(PaperIconButtonPlace place) {
			String token = place.getToken();
			return token;
		}

		@Override
		public PaperIconButtonPlace getPlace(String token) {
			return new PaperIconButtonPlace(token);
		}

	}

	private String token;

	public PaperIconButtonPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}

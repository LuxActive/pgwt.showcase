package com.luxactive.pgwt.showcase.paper_input;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class PaperInputPlace extends Place {

	/**
	 * I'm not really using the tokenizer here, but good for example
	 */
	@Prefix("paper_input")
	public static class Tokenizer implements PlaceTokenizer<PaperInputPlace> {

		public Tokenizer() {
		}

		@Override
		public String getToken(PaperInputPlace place) {
			String token = place.getToken();
			return token;
		}

		@Override
		public PaperInputPlace getPlace(String token) {
			return new PaperInputPlace(token);
		}

	}

	private String token;

	public PaperInputPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}

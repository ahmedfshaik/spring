package edu.home.proxy;

public class Instrumentalist implements Performer {
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void perform() throws PerformanceException {
		instrument.play();
	}

	public void partice() throws PerformanceException {
		instrument.play();

	}
}

package edu.home.proxy.advisor;

public class Instrumentalist3 implements Performer3 {
	private Instrument3 instrument;

	public void setInstrument(Instrument3 instrument) {
		this.instrument = instrument;
	}

	public Instrument3 getInstrument() {
		return instrument;
	}

	// @Override
	public void perform() throws PerformanceException3 {
		instrument.play();
	}

	// @Override
	public void partice() throws PerformanceException3 {
		instrument.play();

	}
}

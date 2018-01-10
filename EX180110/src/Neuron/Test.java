package Neuron;

class Neuron {
	private double w1;
	private double w2;
	private double x1;
	private double x2;
	private double b = 0.0;

	public boolean getNode() {
		return ((b + w1 * x1 + w2 * x2) <= 0);
	}

	public void setWeight(double[] w) {
		if (w.length == 2) {
			w1 = w[0];
			w2 = w[1];
		} else {
			System.out.println("가중치 인자가 부족합니다.");
		}
	}

	public void setBias(double b) {
		this.b = b;
	}

}

public class Test {

}

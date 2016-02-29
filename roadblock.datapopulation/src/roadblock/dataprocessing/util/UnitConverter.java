package roadblock.dataprocessing.util;

import roadblock.emf.ibl.Ibl.ConcentrationUnit;
import roadblock.emf.ibl.Ibl.RateConcentrationUnit;
import roadblock.emf.ibl.Ibl.RateTimeUnit;
import roadblock.emf.ibl.Ibl.RateUnit;
import roadblock.emf.ibl.Ibl.TimeUnit;

public class UnitConverter {

	private static UnitConverter instance;

	public static UnitConverter getInstance() {

		if (instance == null) {
			instance = new UnitConverter();
		}

		return instance;
	}

	public double getBaseConcentration(double amount, ConcentrationUnit unit) {

		double newAmount = amount;

		if (unit != ConcentrationUnit.MOLECULE) {

			double v = 1e-15;
			double n = 6e23;
			double weight = 1;

			switch (unit) {
			case M:
				weight = 1;
				break;
			case MM:
				weight = 1e-3;
				break;
			case UM:
				weight = 1e-6;
				break;
			case NM:
				weight = 1e-9;
				break;
			case PM:
				weight = 1e-12;
				break;
			case FM:
				weight = 1e-15;
				break;
			default:
				weight = 1;
				break;
			}

			newAmount = amount * weight * v * n;
		}

		return newAmount;
	}

	public int getBaseTime(int amount, TimeUnit unit) {

		int newAmount = amount;

		if (unit == TimeUnit.MINUTE) {
			newAmount = amount * 60;
		}

		return newAmount;
	}

	public Double getBaseRate(Double amount, RateUnit unit) {

		Double newAmount = amount;

		if (amount != null) {
			if (unit.getRateTimeUnit() == RateTimeUnit.PER_MINUTE) {
				newAmount = newAmount / 60;
			}

			if (unit.getRateConcentrationUnit() != RateConcentrationUnit.PER_MOLECULE) {

				double v = 1e-15;
				double n = 6.02214179e23;
				double weight = 1;

				switch (unit.getRateConcentrationUnit()) {
				case PER_M:
					weight = 1;
					break;
				case PER_MM:
					weight = 1e-3;
					break;
				case PER_UM:
					weight = 1e-6;
					break;
				case PER_NM:
					weight = 1e-9;
					break;
				case PER_PM:
					weight = 1e-12;
					break;
				case PER_FM:
					weight = 1e-15;
					break;
				default:
					weight = 1;
					break;
				}

				newAmount = newAmount / v / n / weight;
			}
		}

		return newAmount;
	}

	private UnitConverter() {
	}
}

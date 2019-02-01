package ivan.polovyi.PriceCheckerScreen.model.animation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.scene.control.Labeled;
import javafx.util.Duration;

public class TextIncrementTransition extends Transition {

	private Labeled UIcontrol;
	private BigDecimal start, end;

	public TextIncrementTransition(Labeled UIcontrol, BigDecimal priceStickerValueBD,
			BigDecimal pricestickerPricePlus1ValueBD, Duration duration) {
		this.UIcontrol = UIcontrol;
		this.start = priceStickerValueBD;
		this.end = pricestickerPricePlus1ValueBD;
		setCycleDuration(duration);
		setInterpolator(Interpolator.LINEAR);

	}

	@Override
	protected void interpolate(double frac) {

		ArrayList<String> progretion = new ArrayList<String>();
		BigDecimal difference = end.subtract(start);

		for (BigDecimal i = difference; i.compareTo(BigDecimal.ZERO) > 0; i = i.subtract(new BigDecimal(0.01))) {
			progretion.add(i.add(start).setScale(2, RoundingMode.HALF_EVEN).toString());

		}

		final int progretionSize = progretion.size() - 1;
		final int n = Math.round(progretionSize * (float) frac);

		if (!progretion.get(n).equals(progretion.get(0))) {
			UIcontrol.setText(progretion.get(progretionSize - n));
		}

	}
}
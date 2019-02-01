package ivan.polovyi.PriceCheckerScreen.model.animation;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.scene.control.Labeled;
import javafx.util.Duration;

public class TextTypingTransition extends Transition {

	private Labeled UIcontrol;
	private String content;

	public TextTypingTransition(Labeled UIcontrol, String content, Duration duration) {
		this.UIcontrol = UIcontrol;
		this.content = content;
		setCycleDuration(duration);
		setInterpolator(Interpolator.LINEAR);

	}

	@Override
	protected void interpolate(double frac) {
		final int length = content.length();
		final int n = Math.round(length * (float) frac);
		UIcontrol.setText(content.substring(0, n));
	}
}
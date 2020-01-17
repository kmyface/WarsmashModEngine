package com.etheller.warsmash.viewer5.handlers.mdx;

import com.etheller.warsmash.parsers.mdlx.timeline.Timeline;
import com.etheller.warsmash.util.RenderMathUtils;

public class ScalarSd extends Sd<float[]> {

	public ScalarSd(final MdxModel model, final Timeline<float[]> timeline) {
		super(model, timeline, SdArrayDescriptor.FLOAT_ARRAY);
	}

	@Override
	protected float[] convertDefaultValue(final float[] defaultValue) {
		return defaultValue;
	}

	@Override
	protected void copy(final float[] out, final float[] value) {
		out[0] = value[0];
	}

	@Override
	protected void interpolate(final float[] out, final float[][] values, final float[][] inTans,
			final float[][] outTans, final int start, final int end, final float t) {
		final float startValue = values[start][0];

		switch (this.interpolationType) {
		case 0:
			out[0] = startValue;
			break;
		case 1:
			out[0] = RenderMathUtils.lerp(startValue, values[end][0], t);
			break;
		case 2:
			out[0] = RenderMathUtils.hermite(startValue, outTans[start][0], inTans[end][0], values[end][0], t);
			break;
		case 3:
			out[0] = RenderMathUtils.bezier(startValue, outTans[start][0], inTans[end][0], values[end][0], t);
			break;
		}

	}

}

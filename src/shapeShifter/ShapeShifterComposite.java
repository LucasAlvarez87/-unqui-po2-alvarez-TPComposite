package shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterComposite implements IShapeShifter {
	
	private List<IShapeShifter> shapeShifters;
	
	public ShapeShifterComposite() {
		this.shapeShifters = new ArrayList<IShapeShifter>();
	}

	@Override
	public IShapeShifter compose(IShapeShifter ishapeShifter) {
		ShapeShifterComposite newShapeShifter = new ShapeShifterComposite();
		newShapeShifter.addShapeShifter(ishapeShifter);
		newShapeShifter.addShapeShifter(this);
		return newShapeShifter;
	}

	@Override
	public Integer deepest() {
		Integer deepest = 1;
		for (IShapeShifter iShapeShifter : shapeShifters) {
			deepest += iShapeShifter.deepest();
		}
		return deepest;
	}

	@Override
	public IShapeShifter flat() {
		ShapeShifterComposite newShape = new ShapeShifterComposite();
		List<Integer> values = this.values();
		for (Integer value : values) {
			newShape.addShapeShifter(new ShapeShifterHoja(value));
		}
		return newShape;
	}

	@Override
	public List<Integer> values() {
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (IShapeShifter iShapeShifter : shapeShifters) {
			values.addAll(iShapeShifter.values());
		}
		return values;
	}
	
	public void addShapeShifter(IShapeShifter iShapeShifter) {
		this.shapeShifters.add(iShapeShifter);
	}

	
}


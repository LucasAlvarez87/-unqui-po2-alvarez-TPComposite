package shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterHoja implements IShapeShifter {
	
private Integer value;
	
	public ShapeShifterHoja(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}
	

	@Override
	public Integer deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(this.getValue());
		return values;
	}

	@Override
	public IShapeShifter compose(IShapeShifter ishapeShifter) {
		ShapeShifterComposite newShape = new ShapeShifterComposite();
		newShape.addShapeShifter(this);
		newShape.addShapeShifter(ishapeShifter);
		return newShape;
	}
}

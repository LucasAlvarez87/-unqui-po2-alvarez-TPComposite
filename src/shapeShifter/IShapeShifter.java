package shapeShifter;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose (IShapeShifter ss);
	
	public Integer deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
	
}

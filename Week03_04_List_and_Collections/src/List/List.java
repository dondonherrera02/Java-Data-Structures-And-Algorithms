package List;

import java.util.Arrays;

public class List implements IList {
	
	private int[] data;
	private int size = 0;
	private static final int DEFAULT_SIZE = 5;
	private int maxSize = DEFAULT_SIZE;
	
	public List() {
		this.size = 0;
		data = new int[maxSize];
	}
	
	private void resizeCapacity() {
		int newSize = maxSize * 2;
		data = Arrays.copyOf(data, newSize);
		maxSize = newSize;
	}
	
	@Override
	public void add(int value) {
		
		if(size == maxSize) {
			resizeCapacity();
		}else {
			data[size] = value;
			size++;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public int indexof(int value) {
		for(int i = 0; i < size; i++) {
			if (value == data[i])
				return i;
		}
		
		return 0;
	}

	@Override
	public int get(int index) {
		
		if(index >= 0 && index < size) {
			return data[index];
		}
		
		return -1;
	}

	@Override
	public int remove(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

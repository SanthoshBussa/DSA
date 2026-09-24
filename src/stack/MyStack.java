package stack;
import java.util.EmptyStackException;
import java.util.StringJoiner;
public class MyStack<T> {
	
	private T[] arr ;
	private int size;

	public MyStack() {
		arr = (T[]) new Object[10];
	}
	
	public MyStack(int initialCapacity) {
		if(initialCapacity>0){
			arr = (T[]) new Object[initialCapacity];
			return;
		}
			throw new IllegalArgumentException("Stack capacity can not be "+initialCapacity);
	}

	public void push(T e) {
		if(size==arr.length) resize();
		arr[size++] = e;
	}
	
	public T pop() {
		if (isEmpty()) throw new EmptyStackException();
		T e = arr[size - 1];
		arr[size - 1] = null;
		size--;
		return e;
	}

	public T peek() {
		if (isEmpty()) throw new EmptyStackException();
		return arr[size-1];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	@Override
	public String toString() {
		if(size==0) return "[]";
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for(int i =0; i<size-1; i++) {
			sj.add(arr[i]+"");
		}
		return sj.toString();
	}
	
	private void resize() {
		T[] newArr =(T[]) new Object[arr.length*2];
		for(int i = 0; i<size; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
}


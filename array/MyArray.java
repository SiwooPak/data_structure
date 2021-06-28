package array;

public class MyArray {
	int[] arr; // int형의 배열 생
	int count; // 요소의 갯수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		arr = new int[ARRAY_SIZE];
	}
	
	// 메서도 오버라이딩
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		arr = new int[size];
	}
	
	// array 요소 추가
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		arr[count++] = num;
		
	}
		
	// array 중간 요소 추가
	public void insertElement(int position, int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		// 매개변수 position의 숫자가 0보다 작거나 요소의갯수보다 큰 경우
		if(position < 0 || position > count) {
			System.out.println("insert error");
		}
		
		// position 뒤에 인덱스들 한칸씩 이동
		for(int i=count-1; i>=position; i--) {
			arr[i+1] = arr[i];
		}
		
		// 배열의 인덱스의 num 할당
		arr[position] = num;
		// 갯수 증가
		count++;
	}
	
	// 요소 제거
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		
		if(position < 0 || position > count) {
			System.out.println("remove error");
		}
		
		ret = arr[position];
		
		for(int i=position; i<count-1; i++) {
			arr[i] = arr[i+1];
		}
		
		count--;
		return ret;
	}
	
	// 사이즈 확인
    int getSize() { return count; }
	
	
	// 배열이 비어있는지 확인
	private boolean isEmpty() {
		return count == 0;
	}
	
	// 해당 인덱스의 요소 가져오기
	public int getElement(int position) {
		if(position < 0 || position > count-1) {
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		
		return arr[position];
	}
	
	// array의 모든 요소 출력
	public void printAll() {
		if(count == 0) return;
		
		for(int element: arr) {
			if(element != 0) System.out.println(element);
		}
	}
	
	public void removeAll() {
		for(int i=0; i<count; i++) {
			arr[i] = 0;
		}
		count = 0;
	}
	
}

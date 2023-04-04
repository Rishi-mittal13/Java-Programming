/*5
E 1 1
E 2 1
E 1 2
D
D */
import java.util.*;

public class _22_HoodiesAtCodingBlock {

	protected int size;

	protected int front;
	protected int[] data;

	public _22_HoodiesAtCodingBlock() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public _22_HoodiesAtCodingBlock(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void hoodies(int q) throws Exception{ 
        _22_HoodiesAtCodingBlock q1 = new _22_HoodiesAtCodingBlock(q);
        _22_HoodiesAtCodingBlock q2 = new _22_HoodiesAtCodingBlock(q);
        _22_HoodiesAtCodingBlock q3 = new _22_HoodiesAtCodingBlock(q);
        _22_HoodiesAtCodingBlock q4 = new _22_HoodiesAtCodingBlock(q);
        _22_HoodiesAtCodingBlock course = new _22_HoodiesAtCodingBlock(q);
        for(int i = 0 ; i<q ; i++){
            String opr = scn.next();
            if(opr.equals("E")){
                int crs = scn.nextInt();
                int student = scn.nextInt();
                if(crs==1) {
                    if(q1.isEmpty()) course.enqueue(1);
                    q1.enqueue(student);
                }
                else if(crs==2){
                    if(q2.isEmpty()) course.enqueue(2);
                    q2.enqueue(student);
                }
                else if(crs==3) {
                    if(q3.isEmpty()) course.enqueue(3);
                    q3.enqueue(student);
                }
                else if(crs==4) {
                    if(q4.isEmpty()) course.enqueue(4);
                    q4.enqueue(student);
                }
            }
            else{
                int first = course.getFront();
                if(first == 1){
                    System.out.println(first+ " "+ q1.dequeue()) ;
                    if(q1.isEmpty()) course.dequeue();
                }
                else if(first == 2){
                    System.out.println(first+ " "+ q2.dequeue()) ;
                    if(q2.isEmpty()) course.dequeue();
                }
                else if(first == 3){
                    System.out.println(first+ " "+ q3.dequeue()) ;
                    if(q3.isEmpty()) course.dequeue();
                }
                else if(first == 4){
                    System.out.println(first+ " "+ q4.dequeue()) ;
                    if(q4.isEmpty()) course.dequeue();
                }
            }
        }
	
	


	
} 


	static Scanner scn = new Scanner(System.in);
	

	public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        
        hoodies(n);
	}

}

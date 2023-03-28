/*5
5 4 2 3 1
5 2 1 4 3  // 7 */

import java.util.*;
public class _14_ImportanceOfTime {

	protected int size;
	protected int front;
	protected int[] data;

	public _14_ImportanceOfTime() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public _14_ImportanceOfTime(int cap) {
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

	public void enQueue(int item) throws Exception {
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
		// throw new Exception("Main is full");
		// }
		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int deQueue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");
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

	
    public static int ImpofTime(_14_ImportanceOfTime q,int[] orig_order) throws Exception{
		// 5
		// 5 4 2 3 1
		// 5 2 1 4 3  //7

		int count  = 0 , i = 0;
		int n = orig_order.length ;
		while(i<n){
			if(orig_order[i]==q.getFront()){
				q.deQueue();
				count++;
				i++;
			}
			else{
				int elm = q.deQueue();
				q.enQueue(elm);
				count++;
			}
		}
	return count;
    } 

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		_14_ImportanceOfTime q = new _14_ImportanceOfTime();
		int n = scn.nextInt();
		int[] process = new int[n];
		for (int i = 0; i < n; i++) {
			q.enQueue(scn.nextInt());
		}
		for(int i = 0;i < n;i++){
		
		    process[i] = scn.nextInt();
		}
		System.out.print(ImpofTime(q,process));
	}

}




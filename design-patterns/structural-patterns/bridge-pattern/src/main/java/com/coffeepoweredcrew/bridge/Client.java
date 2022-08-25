package com.coffeepoweredcrew.bridge;

public class Client {

	public static void main(String[] args) {

		FifoCollection<Integer> fifo = new Queue<>(new SinglyLinkedList<>());

		fifo.offer(10);
		fifo.offer(44);
		fifo.offer(203);
		fifo.offer(13);

		System.out.println(fifo.poll());
		System.out.println(fifo.poll());
		System.out.println(fifo.poll());
		System.out.println(fifo.poll());
		//null
		System.out.println(fifo.poll());

	}

}

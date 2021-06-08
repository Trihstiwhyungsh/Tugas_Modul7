
package queue_tugas;
public class antrian_tugasApp {
    public static void main(String[] args) {
        antrian_tugas Antrian = new antrian_tugas (10);
        Antrian.enqueue(40); //memasukkan data kedalam antrian
        Antrian.display(); //menampilkan data antrian
        Antrian.enqueue(33); 
        Antrian.display();
        System.out.println("nilai yang paling depan = "+Antrian.peek());
        Antrian.enqueue(60); 
        Antrian.display();
        System.out.println("yang diambil dari antrian = "+Antrian.dequeue());
        Antrian.display();
        System.out.println("yang diambil dari antrian = "+Antrian.dequeue());
        Antrian.display();
        Antrian.enqueue(54); 
        Antrian.display();
        System.out.println("nilai yang paling depan = "+Antrian.peek());
    }
}




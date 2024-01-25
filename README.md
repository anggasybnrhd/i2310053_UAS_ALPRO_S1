// jawaban terlampir dala berkas README.md yg tertulis dengan html

# JAWABAN UAS


## 1. perbedaan interpreter dan compiler

  ### a. Interpreter:
- Proses langsung: Menerjemahkan dan menjalankan baris kode satu per satu tanpa file eksekusi terpisah.
- Kecepatan eksekusi: Lebih lambat karena penerjemahan dan eksekusi bersamaan.
- Kode sumber terlihat: Kode sumber dapat diakses karena tidak ada tahap kompilasi.
- Mudah debugging: Kesalahan dapat dideteksi saat kode dieksekusi.
- Contoh bahasa: Python, JavaScript, Ruby.
  ### b. Compiler:
- Pembuatan file eksekusi: Menerjemahkan kode sumber menjadi kode mesin sebelum dijalankan, menghasilkan file eksekusi terpisah.
- Kecepatan eksekusi: Lebih cepat karena tidak ada proses interpretasi saat eksekusi.
- Kode sumber dikompilasi: Tidak dapat langsung dibaca karena dikompilasi ke dalam bahasa mesin.
- Proses kompilasi: Memerlukan waktu tambahan sebelum program dapat dijalankan.
- Contoh bahasa: C, C++, Java.


 ## 2 perbedaan prosedur dan fungsi
   ### a. Prosedur:
- Mengembalikan Nilai:Prosedur biasanya tidak mengembalikan nilai. Mereka digunakan untuk melakukan tindakan atau operasi tertentu tanpa menghasilkan nilai balik.
- Tujuan: Prosedur sering digunakan untuk mengelompokkan serangkaian pernyataan atau tindakan yang harus dilakukan secara bersamaan atau berulang.
- Pemanggilan:Prosedur dipanggil dalam program ketika tindakan tertentu perlu dilakukan. Mereka dapat dipanggil dari berbagai bagian dalam program.
  contoh pada hitung luas segitiga.java
   ### b. Fungsi
- Mengembalikan Nilai:Fungsi mengembalikan nilai setelah dieksekusi. Nilai ini bisa berupa tipe data apapun, seperti integer, string, boolean, atau bahkan tipe data yang kompleks.
- Tujuan: Fungsi digunakan untuk menghitung nilai atau hasil berdasarkan input yang diberikan dan mengembalikan hasil tersebut ke pemanggil.
- Pemanggilan: Fungsi dipanggil ketika nilai yang dihasilkan perlu digunakan di tempat lain dalam program. Mereka juga dapat dipanggil dari berbagai bagian dalam program.


## 3. perbedaan kelas dan objek
  ### a. kelas/class
adalah Program kompleks menggunakan paket dan kelas. Setiap kelas memiliki constructor sebagai cetak biru, yang menginisialisasi objek saat dibuat. Kelas adalah blueprint yang menggabungkan fungsi, prosedur, dan variabel. Analogi dengan membangun rumah: setiap kelas adalah cetak biru yang mendefinisikan struktur, properti, dan perilaku objek, mirip dengan model rumah yang berbeda untuk jumlah kamar yang berbeda.
- Blueprint atau Template:Kelas adalah blueprint atau template untuk membuat objek. Ini mendefinisikan atribut (variabel) dan metode (fungsi) yang dimiliki oleh objek yang akan dibuat dari kelas tersebut.
- Abstraksi:Kelas memungkinkan kita untuk memodelkan sesuatu dari dunia nyata atau konsep yang lebih kompleks menjadi entitas yang lebih terstruktur dan dapat dimengerti.
- Penggunaan Berkali-kali: Kita dapat membuat banyak objek berbeda dari satu kelas. Setiap objek dapat memiliki nilai atributnya sendiri, tetapi memiliki struktur dan perilaku yang sama seperti kelas induknya.
  ### b. objek/object
Objek adalah instansi dari sebuah kelas, mirip dengan sebuah rumah yang dibangun dari cetak biru. Dengan cetak biru yang sama, kita dapat membuat banyak rumah dengan tipe yang sama tanpa perlu membuat cetak biru baru. Begitu pula dengan objek dan kelas, di mana kita dapat membuat banyak objek dari satu kelas yang sama. Sebagai contoh, mengecat pintu sebuah rumah tipe 2 kamar tidur merupakan salah satu instance objek dari rumah tersebut.
- instance dari Kelas:Objek adalah instance yang nyata dari kelas. Setiap objek adalah representasi konkret dari kelas tertentu dengan nilai-nilai unik untuk atributnya sendiri.
- Memiliki State dan Behavior Sendiri:Objek memiliki atribut yang mewakili state atau keadaannya, serta metode yang mendefinisikan perilakunya atau apa yang dapat dilakukannya.
- Digunakan dalam Program:Objek digunakan dalam program untuk merepresentasikan entitas atau konsep dari dunia nyata yang ingin dimodelkan.
 - contoh perbedaan pada python
```
# Contoh definisi kelas Mobil
class Mobil:
    def __init__(self, merek, model, warna):
        self.merek = merek
        self.model = model
        self.warna = warna
    
    def informasi(self):
        print("Merek:", self.merek)
        print("Model:", self.model)
        print("Warna:", self.warna)

# Membuat objek dari kelas Mobil
mobil1 = Mobil("Toyota", "Avanza", "Hitam")
mobil2 = Mobil("Honda", "Civic", "Putih")

# Memanggil metode informasi() untuk objek
mobil1.informasi()
mobil2.informasi()
```

## 4. perbedaan array dan arraylist
  ### a. Array:
- Tipe Data Statis: Ukuran tetap yang ditentukan saat deklarasi dan tidak dapat diubah.
- Tipe Data Primitif atau Objek: Dapat berisi tipe data primitif atau objek.
- Fungsionalitas Terbatas: Terbatas dalam penambahan atau penghapusan elemen.
- Menggunakan Operator []: Akses elemen menggunakan indeks dan operator [].
- Tidak Fleksibel: Ukuran tetap dan tidak dapat diubah setelah deklarasi.
  ### b. ArrayList:
- Tipe Data Dinamis: Ukuran dapat berubah secara dinamis selama runtime.
- Hanya Bisa Objek: Hanya dapat berisi objek, bukan tipe data primitif.
- Fungsionalitas Lebih Kaya: Menyediakan metode untuk penambahan, penghapusan, pencarian, dan pengurutan elemen.
- Menggunakan Metode: Akses elemen dilakukan dengan metode seperti get() dan set().
- Fleksibel: Ukuran dapat berubah sesuai kebutuhan.
 - contoh perbedaanya pada java
```
// Contoh Array
int[] arr = new int[5]; // Mendeklarasikan array dengan ukuran 5
arr[0] = 1; // Mengisi elemen array
arr[1] = 2;
int length = arr.length; // Mendapatkan panjang array (5)

// Contoh ArrayList
ArrayList<Integer> arrayList = new ArrayList<>(); // Mendeklarasikan ArrayList kosong
arrayList.add(1); // Menambahkan elemen ke ArrayList
arrayList.add(2);
int size = arrayList.size(); // Mendapatkan ukuran ArrayList (2)
```

## 5. berapakah nilai x pada program berikut ini ;
x = y = [1, 9, 3, 2],
y[3] = 4,
x[2] = 9,
print(x) 

<img width="1433" alt="Jepretan Layar 2024-01-25 pukul 19 48 22" src="https://github.com/anggasybnrhd/i2310053_UAS_ALPRO_S1/assets/50766782/abb6229f-de46-4aa1-b6d7-9d060cd9275c">


jawabannya ialah
[1, 9, 9, 4]

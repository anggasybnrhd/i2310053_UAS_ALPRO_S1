<!DOCTYPE html>

<head>
    <title>Contoh HTML Sederhana</title>

</head>
<body>
    <ol>


        <li><h3>perbedaan interpreter dan compiler </h3><br>
            <h4>a. Interpreter: <br></h4>
        - Proses langsung: Menerjemahkan dan menjalankan baris kode satu per satu tanpa file eksekusi terpisah <br>
        - Kecepatan eksekusi: Lebih lambat karena penerjemahan dan eksekusi bersamaan. <br>
        - Kode sumber terlihat: Kode sumber dapat diakses karena tidak ada tahap kompilasi. <br>
        - Mudah debugging: Kesalahan dapat dideteksi saat kode dieksekusi. <br>
        - Contoh bahasa: Python, JavaScript, Ruby. <br>
            <h4>b. Compiler: <br></h4>
        - Pembuatan file eksekusi: Menerjemahkan kode sumber menjadi kode mesin sebelum dijalankan, menghasilkan file eksekusi terpisah. <br>
        - Kecepatan eksekusi: Lebih cepat karena tidak ada proses interpretasi saat eksekusi. <br>
        - Kode sumber dikompilasi: Tidak dapat langsung dibaca karena dikompilasi ke dalam bahasa mesin. <br>
        - Proses kompilasi: Memerlukan waktu tambahan sebelum program dapat dijalankan. <br>
        - Contoh bahasa: C, C++, Java. <br></li>


        <li><h3>perbedaan prosedur dan fungsi </h3> <br>
            <h4>a. Prosedur: <br></h4> 
        - Mengembalikan Nilai:Prosedur biasanya tidak mengembalikan nilai. Mereka digunakan untuk melakukan tindakan atau operasi tertentu tanpa menghasilkan nilai balik. <br>
        - Tujuan: Prosedur sering digunakan untuk mengelompokkan serangkaian pernyataan atau tindakan yang harus dilakukan secara bersamaan atau berulang. <br>
        - Pemanggilan:Prosedur dipanggil dalam program ketika tindakan tertentu perlu dilakukan. Mereka dapat dipanggil dari berbagai bagian dalam program. <br>
        contoh pada hitung luas segitiga.java <br>
            <h4>b. Fungsi <br></h4>
        - Mengembalikan Nilai:Fungsi mengembalikan nilai setelah dieksekusi. Nilai ini bisa berupa tipe data apapun, seperti integer, string, boolean, atau bahkan tipe data yang kompleks. <br>
        - Tujuan: Fungsi digunakan untuk menghitung nilai atau hasil berdasarkan input yang diberikan dan mengembalikan hasil tersebut ke pemanggil. <br>
        - Pemanggilan: Fungsi dipanggil ketika nilai yang dihasilkan perlu digunakan di tempat lain dalam program. Mereka juga dapat dipanggil dari berbagai bagian dalam program. <br> 
        </li>


        <li><h3>perbedaan kelas dan objek <br></h3> 
            <h4>a. kelas/class</h4> <br>
        adalah Program kompleks menggunakan paket dan kelas. Setiap kelas memiliki constructor sebagai cetak biru, yang menginisialisasi objek saat dibuat. Kelas adalah blueprint yang menggabungkan fungsi, prosedur, dan variabel. Analogi dengan membangun rumah: setiap kelas adalah cetak biru yang mendefinisikan struktur, properti, dan perilaku objek, mirip dengan model rumah yang berbeda untuk jumlah kamar yang berbeda. <br>
        - Blueprint atau Template:Kelas adalah blueprint atau template untuk membuat objek. Ini mendefinisikan atribut (variabel) dan metode (fungsi) yang dimiliki oleh objek yang akan dibuat dari kelas tersebut. <br>
        - Abstraksi:Kelas memungkinkan kita untuk memodelkan sesuatu dari dunia nyata atau konsep yang lebih kompleks menjadi entitas yang lebih terstruktur dan dapat dimengerti. <br>
        - Penggunaan Berkali-kali: Kita dapat membuat banyak objek berbeda dari satu kelas. Setiap objek dapat memiliki nilai atributnya sendiri, tetapi memiliki struktur dan perilaku yang sama seperti kelas induknya. <br>
            <h4>b. objek/object <br></h4>
        - Objek adalah instansi dari sebuah kelas, mirip dengan sebuah rumah yang dibangun dari cetak biru. Dengan cetak biru yang sama, kita dapat membuat banyak rumah dengan tipe yang sama tanpa perlu membuat cetak biru baru. Begitu pula dengan objek dan kelas, di mana kita dapat membuat banyak objek dari satu kelas yang sama. Sebagai contoh, mengecat pintu sebuah rumah tipe 2 kamar tidur merupakan salah satu instance objek dari rumah tersebut. <br>
        - instance dari Kelas:Objek adalah instance yang nyata dari kelas. Setiap objek adalah representasi konkret dari kelas tertentu dengan nilai-nilai unik untuk atributnya sendiri. <br>
        - Memiliki State dan Behavior Sendiri:Objek memiliki atribut yang mewakili state atau keadaannya, serta metode yang mendefinisikan perilakunya atau apa yang dapat dilakukannya. <br>
        - Digunakan dalam Program:Objek digunakan dalam program untuk merepresentasikan entitas atau konsep dari dunia nyata yang ingin dimodelkan. <br>
        - contoh perbedaan pada python <br>
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
        </li>



        <li> <h3> perbedaan array dan arraylist</h3><br>
            <h4>a. Array:</h4> <br>
        - Tipe Data Statis: Ukuran tetap yang ditentukan saat deklarasi dan tidak dapat diubah. <br>
        - Tipe Data Primitif atau Objek: Dapat berisi tipe data primitif atau objek. <br>
        - Fungsionalitas Terbatas: Terbatas dalam penambahan atau penghapusan elemen. <br>
        - Menggunakan Operator []: Akses elemen menggunakan indeks dan operator []. <br>
        - Tidak Fleksibel: Ukuran tetap dan tidak dapat diubah setelah deklarasi. <br>
            <h4>b. ArrayList:</h4> <br>
        - Tipe Data Dinamis: Ukuran dapat berubah secara dinamis selama runtime. <br>
        - Hanya Bisa Objek: Hanya dapat berisi objek, bukan tipe data primitif. <br>
        - Fungsionalitas Lebih Kaya: Menyediakan metode untuk penambahan, penghapusan, pencarian, dan pengurutan elemen. <br>
        - Menggunakan Metode: Akses elemen dilakukan dengan metode seperti get() dan set(). <br>
        - Fleksibel: Ukuran dapat berubah sesuai kebutuhan. <br>
        - contoh perbedaanya pada java <br>
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
        </li>


        <li><script>
            var X = [];
            var Y = [1, 9, 3, 2];
            Y[3] = 4;
            X[2] = 9;
            document.write("X = [" + X.join('') + "]");
        </script> 

        
            </li>
        </li>

        
    </ol>
    
</body>
</html>



hasil no 7
<img width="1433" alt="Jepretan Layar 2024-01-25 pukul 22 11 18" src="https://github.com/anggasybnrhd/i2310053_UAS_ALPRO_S1/assets/50766782/1d77bddc-2dc2-4ab2-bfaf-cc3cca1c51aa">


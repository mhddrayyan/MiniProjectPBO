# Mini Project: Program Data Mahasiswa

Program Java berbasis console untuk menginput, menampilkan, dan mengecek status kelulusan data mahasiswa. Project ini dibuat sebagai tugas yang menggabungkan seluruh materi Minggu 3 & 4.

## Deskripsi

Program meminta pengguna memasukkan data 3 mahasiswa (nama, NIM, dan nilai). Setiap data disimpan dalam sebuah object `Mahasiswa`, lalu program menampilkan data tersebut beserta status kelulusannya dan menghitung rata-rata nilai.

## Fitur

- Input data mahasiswa melalui keyboard menggunakan `Scanner`
- Menyimpan minimal 3 object mahasiswa dalam array
- Menampilkan data mahasiswa (`tampilkanData()`)
- Mengecek status kelulusan (`cekKelulusan()`)
- Menghitung rata-rata nilai seluruh mahasiswa

## Struktur Class

### Class `Mahasiswa`

| Attribute | Tipe Data | Keterangan |
|---|---|---|
| `nama` | `String` | Nama mahasiswa |
| `NIM` | `String` | Nomor induk mahasiswa |
| `nilai` | `double` | Nilai mahasiswa |

| Method | Fungsi |
|---|---|
| `tampilkanData()` | Menampilkan nama, NIM, dan nilai |
| `cekKelulusan()` | Menampilkan status kelulusan berdasarkan nilai |

### Aturan Kelulusan

| Nilai | Status |
|---|---|
| >= 75 | LULUS |
| 60 - 74 | PERLU REMEDIAL |
| < 60 | TIDAK LULUS |

## Komponen yang Digunakan

| Komponen | Penerapan |
|---|---|
| Variable | `jumlah`, `total`, `nama`, `nim`, `nilai` |
| Data type | `int`, `double`, `String`, array `Mahasiswa[]` |
| Scanner | `nextLine()` dan `nextDouble()` untuk input |
| if / else | Penentuan status pada `cekKelulusan()` |
| Loop | `for` dan `for-each` untuk input, tampil data, dan hitung rata-rata |
| Class | `Mahasiswa` dan `Main` |
| Object | `new Mahasiswa(...)` sebanyak 3 object |
| Method | `tampilkanData()` dan `cekKelulusan()` |

## Cara Menjalankan

**Prasyarat:** JDK (Java Development Kit) sudah terpasang.

1. Simpan kode program dalam file `Main.java`.
2. Buka terminal pada folder file tersebut.
3. Kompilasi program:
   ```bash
   javac Main.java
   ```
4. Jalankan program:
   ```bash
   java Main
   ```

## Contoh Output

```
=== INPUT DATA MAHASISWA ===

Mahasiswa ke-1
Nama  : Rayyan
NIM   : 25113
Nilai : 85

Mahasiswa ke-2
Nama  : Imam
NIM   : 2565
Nilai : 65

Mahasiswa ke-3
Nama  :Alex
NIM   : 2595
Nilai : 55

=== DATA MAHASISWA ===

--- Mahasiswa 1 ---
Nama   :Rayyan
NIM    : 25113
Nilai  : 85.0
Status : LULUS

--- Mahasiswa 2 ---
Nama   : Imam
NIM    : 2565
Nilai  : 65.0
Status : PERLU REMEDIAL

--- Mahasiswa 3 ---
Nama   : Alex
NIM    : 2595
Nilai  : 50.0
Status : TIDAK LULUS

Rata-rata nilai: 66.66666666666667
```

## Struktur Folder

```
mini-project-mahasiswa/
├── Main.java
└── README.md
```

## Pembuat

- **Nama:** Muhammad Rayyan
- **NIM:** 250810701100113
- **Mata Kuliah:** Pemograman Berorientasi Objek C

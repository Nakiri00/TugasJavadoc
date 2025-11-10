# Tugas Dokumentasi Menggunakan Javadoc

Proyek Java sederhana ini menggunakan Javadoc untuk dokumentasi.

## 📖 Cara Menghasilkan Dokumentasi

### Opsi 1: Melalui NetBeans (Direkomendasikan)

1.  Buka proyek di NetBeans.
2.  Di panel "Projects", klik kanan pada proyek `Tugas2`.
3.  Pilih **"Generate Javadoc"**.
4.  Dokumentasi akan dibuat di folder `dist/javadoc` dan otomatis terbuka di browser.

### Opsi 2: Melalui Terminal

1.  Buka terminal (Command Prompt/PowerShell) di folder utama proyek ini.
2.  Jalankan perintah berikut:
    ```bash
    javadoc -d docs -sourcepath src -subpackages tugas2
    ```
    * `-d docs`: Menentukan `docs` sebagai folder output.
    * `-sourcepath src`: Menentukan `src` sebagai folder kode sumber.
    * `-subpackages tugas2`: Memproses paket `tugas2`.

*(Catatan: Jika `javadoc` tidak dikenali, pastikan folder `bin` JDK Anda sudah ada di `PATH` environment variable).*

---

## 🖥️ Cara Melihat Dokumentasi

1.  Buka folder output yang telah dibuat (misalnya, `dist/javadoc` atau `docs`).
2.  Buka file `index.html`.
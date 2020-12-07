# TicTacToe

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**Please create a description for this project here**

## Credits
| NPM           | Name                       |  
| ------------- |----------------------------|
| 140810190008  | Daffa Anov Arkan Javier    |
| 140810190046  | Akmal Syawqi Albar         |
| 140810190060  | Alif Fachrel Anargya       |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (17/11/2020)** 
   -  Diskusi tentang pembagian kerja project
   -  Menelusuri Tentang game tic tac toe 

- **[Sprint 1](changelog/sprint-1.md) - (18/11/2020 - 24/11/2020)** 
   - Membuat JFrame untuk TicTacToe
   - Membuat Tulisan untuk mengetahui giliran pemain
   - Membuat panel 3x3
   - Membuat Player 1(X) dan 2(O)
   

- **[Sprint 2](changelog/sprint-2.md) - (25/11/2020 - 01/12/2020)** 
   - Membuat Fungsi pergantian pemain
   - Membuat Fungsi Score pemenang
   - Membuat Fungsi panel 3x3
   - Membuat Fungsi tombol reset
   - Membuat Fungsi tombol exit
   - Membuat Fungsi aturan permainan
   
- **[Sprint 3](changelog/sprint-3.md) - (02/12/2020 - 07/12/2020)** 
   - Penyempurnaan penanganan error
   - Penyempurnaan desain dari TicTacToeShort changes 2
   - Penyempurnaan desain dari TicTacToe

## Running The App
   - buka command di folder src
   - compile file dengan perintah "javac main.java"
   - run dengan perintah "java main"

## Classes Used

TO;DO

UML image here

## Notable Assumption and Design App Details

- Membuat frame panel 3x3.
- Membuat giliran X atau O.
- Mengubah isi panel menjadi X atau O sesuai giliran dengan berusaha membentuk garis horizontal ATAU vertikal ATAU diagonal sesuai peraturan tictactoe.
- Setelah salah satu kondisi diatas terpenuhi, maka player yang membentuk garis akan menjadi pemenang, dan ditampilkan dilayar serta dihitung scorenya.
- Jika kotak sudah terisi penuh dan tidak ada player yang bisa membentuk garis, permainan berakhir dan seri.
- player bisa merestart game ketika game sudah selesai.
- palyer bisa memencet "exit" jika ingin keluar dari game.

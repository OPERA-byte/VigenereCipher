# VigenereCipher
The VigenereCipher class provides an implementation of the Vigenère cipher, a method of encrypting and decrypting text using a series of different Caesar ciphers based on a keyword. The class includes various constructors, methods for encryption and decryption, and a method to print the cipher's dictionary.

The project is heavily inspired by a video created by YouTuber LEMINO. I thoroughly enjoy his content, especially this video. I suggest you watch the [Video](https://youtu.be/jVpsLMCIB0Y?si=haevvMONuUgkI6_0) yourself. 

# How it Works
First, a keyword (referred to as a dictionary key) is chosen to populate the beginning of a standard English alphabet. It is important to note that this preappended word is a rearrangement of the existing letters rather than an addition of new characters. In other words, the letters are reformatted so that the keyword appears at the front of the alphabet. I reffer to this new mutation of the alphabet as the Base Alphabet. This Base Alphabet will define the dictionary we use to encode characters. 

For example, if KRYPTOS is the keyword, the resulting base alphabet would be as follows: "KRYPTOSABCDEFGHIJLMNQUVWXZ". 

Next, this base alphabet is used to create an encryption table, which we refer to as the dictionary. The base alphabet is reformatted so that the first letter of the alphabet is appended to the end of the dictionary, and this process is repeated for every character. The result is a 26 x 26 dictionary we use to encode desired text. 

<p style="font-size: smaller; white-space: pre; margin-left: 40px;">
01 K RYPTOSABCDEFGHIJLMNQUVWXZ<br>
02 R YPTOSABCDEFGHIJLMNQUVWXZK<br>
03 Y PTOSABCDEFGHIJLMNQUVWXZKR<br>
04 P TOSABCDEFGHIJLMNQUVWXZKRY<br>
05 T OSABCDEFGHIJLMNQUVWXZKRYP<br>
06 O SABCDEFGHIJLMNQUVWXZKRYPT<br>
07 S ABCDEFGHIJLMNQUVWXZKRYPTO<br>
08 A BCDEFGHIJLMNQUVWXZKRYPTOS<br>
09 B CDEFGHIJLMNQUVWXZKRYPTOSA<br>
10 C DEFGHIJLMNQUVWXZKRYPTOSAB<br>
11 D EFGHIJLMNQUVWXZKRYPTOSABC<br>
12 E FGHIJLMNQUVWXZKRYPTOSABCD<br>
13 F GHIJLMNQUVWXZKRYPTOSABCDE<br>
14 G HIJLMNQUVWXZKRYPTOSABCDEF<br>
15 H IJLMNQUVWXZKRYPTOSABCDEFG<br>
16 I JLMNQUVWXZKRYPTOSABCDEFGH<br>
17 J LMNQUVWXZKRYPTOSABCDEFGHI<br>
18 L MNQUVWXZKRYPTOSABCDEFGHIJ<br>
19 M NQUVWXZKRYPTOSABCDEFGHIJL<br>
20 N QUVWXZKRYPTOSABCDEFGHIJLM<br>
21 Q UVWXZKRYPTOSABCDEFGHIJLMN<br>
22 U VWXZKRYPTOSABCDEFGHIJLMNQ<br>
23 V WXZKRYPTOSABCDEFGHIJLMNQU<br>
24 W XZKRYPTOSABCDEFGHIJLMNQUV<br>
25 X ZKRYPTOSABCDEFGHIJLMNQUVW<br>
26 Z KRYPTOSABCDEFGHIJLMNQUVWX<br>
</p>



                                                                          
                                                                        




            

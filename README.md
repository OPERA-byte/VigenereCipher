# VigenereCipher
The VigenereCipher class provides an implementation of the Vigenère cipher, a method of encrypting and decrypting text using a series of different Caesar ciphers based on a keyword. The class includes various constructors, methods for encryption and decryption, and a method to print the cipher's dictionary.

The project is heavily inspired by a video created by YouTuber LEMINO. I thoroughly enjoy his content, especially this video. I suggest you watch the [Video](https://youtu.be/jVpsLMCIB0Y?si=haevvMONuUgkI6_0) yourself. 

# How it Works
First, a keyword (referred to as a dictionary key) is chosen to populate the beginning of a standard English alphabet. It is important to note that this preappended word is a rearrangement of the existing letters rather than an addition of new characters. In other words, the letters are reformatted so that the keyword appears at the front of the alphabet. I reffer to this new mutation of the alphabet as the Base Alphabet. This Base Alphabet will define the dictionary we use to encode characters. 

For example, if KRYPTOS is the keyword, the resulting base alphabet would be as follows: "KRYPTOSABCDEFGHIJLMNQUVWXZ". 

Next, this base alphabet is used to create an encryption table, which we refer to as the dictionary. The base alphabet is reformatted so that the first letter of the alphabet is appended to the end of the dictionary, and this process is repeated for every character. The result is a 26 x 26 dictionary we use to encode desired text. 

<p style="font-size: smaller; white-space: pre; margin-left: 80px;">
<pre>
01 K RYPTOSABCDEFGHIJLMNQUVWXZ
02 R YPTOSABCDEFGHIJLMNQUVWXZK               Base Alphabet: [KRYPTOSABCDEFGHIJLMNQUVWXZ]
03 Y PTOSABCDEFGHIJLMNQUVWXZKR
04 P TOSABCDEFGHIJLMNQUVWXZKRY               The first letter of every alphabet was isolated and numbers were added   
05 T OSABCDEFGHIJLMNQUVWXZKRYP               for better readability. 
06 O SABCDEFGHIJLMNQUVWXZKRYPT           
07 S ABCDEFGHIJLMNQUVWXZKRYPTO
08 A BCDEFGHIJLMNQUVWXZKRYPTOS               Next, you choose a phrase or keyword; this will function as the keystream.  
09 B CDEFGHIJLMNQUVWXZKRYPTOSA               The keystream defines the index in the vertical direction and is crucial in
10 C DEFGHIJLMNQUVWXZKRYPTOSAB               the encryption process. Think of the keystream as the key that defines how 
11 D EFGHIJLMNQUVWXZKRYPTOSABC               much to shift every letter of the desired plaintext.
12 E FGHIJLMNQUVWXZKRYPTOSABCD
13 F GHIJLMNQUVWXZKRYPTOSABCDE               Let our keystream be **LEMON**. 
14 G HIJLMNQUVWXZKRYPTOSABCDEF
15 H IJLMNQUVWXZKRYPTOSABCDEFG
16 I JLMNQUVWXZKRYPTOSABCDEFGH
17 J LMNQUVWXZKRYPTOSABCDEFGHI
18 L MNQUVWXZKRYPTOSABCDEFGHIJ
19 M NQUVWXZKRYPTOSABCDEFGHIJL
20 N QUVWXZKRYPTOSABCDEFGHIJLM
21 Q UVWXZKRYPTOSABCDEFGHIJLMN
22 U VWXZKRYPTOSABCDEFGHIJLMNQ
23 V WXZKRYPTOSABCDEFGHIJLMNQU
24 W XZKRYPTOSABCDEFGHIJLMNQUV
25 X ZKRYPTOSABCDEFGHIJLMNQUVW
26 Z KRYPTOSABCDEFGHIJLMNQUVWX
</pre>
</p>




                                                                          
                                                                        




            

# VigenereCipher
The VigenereCipher class provides an implementation of the Vigenère cipher, a method of encrypting and decrypting text using a series of different Caesar ciphers based on a keyword. The class includes various constructors, methods for encryption and decryption, and a method to print the cipher's dictionary.

The project is heavily inspired by a video created by YouTuber LEMINO. I thoroughly enjoy his content, especially this video. I suggest you watch the [Video](https://youtu.be/jVpsLMCIB0Y?si=haevvMONuUgkI6_0) yourself. 

# How it Works
First, a keyword (referred to as a dictionary key) is chosen to populate the beginning of a standard English alphabet. It is important to note that this preappended word is a rearrangement of the existing letters rather than an addition of new characters. In other words, the letters are reformatted so that the keyword appears at the front of the alphabet. I reffer to this new mutation of the alphabet as the Base Alphabet. This Base Alphabet will define the dictionary we use to encode characters. 

For example, if KRYPTOS is the keyword, the resulting base alphabet would be as follows: "KRYPTOSABCDEFGHIJLMNQUVWXZ". 

Next, this base alphabet is used to create an encryption table, which we refer to as the dictionary. The base alphabet is reformatted so that the first letter of the alphabet is appended to the end of the dictionary, and this process is repeated for every character. The result is a 26 x 26 dictionary we use to encode desired text. 

<p style="font-size: smaller; white-space: pre;"> 
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;01 K RYPTOSABCDEFGHIJLMNQUVWXZ
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;02 R YPTOSABCDEFGHIJLMNQUVWXZK
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;03 Y PTOSABCDEFGHIJLMNQUVWXZKR
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;04 P TOSABCDEFGHIJLMNQUVWXZKRY
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;05 T OSABCDEFGHIJLMNQUVWXZKRYP
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;06 O SABCDEFGHIJLMNQUVWXZKRYPT
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;07 S ABCDEFGHIJLMNQUVWXZKRYPTO
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;08 A BCDEFGHIJLMNQUVWXZKRYPTOS
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;09 B CDEFGHIJLMNQUVWXZKRYPTOSA
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;10 C DEFGHIJLMNQUVWXZKRYPTOSAB
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11 D EFGHIJLMNQUVWXZKRYPTOSABC
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;12 E FGHIJLMNQUVWXZKRYPTOSABCD
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;13 F GHIJLMNQUVWXZKRYPTOSABCDE
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;14 G HIJLMNQUVWXZKRYPTOSABCDEF
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;15 H IJLMNQUVWXZKRYPTOSABCDEFG
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16 I JLMNQUVWXZKRYPTOSABCDEFGH
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;17 J LMNQUVWXZKRYPTOSABCDEFGHI
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;18 L MNQUVWXZKRYPTOSABCDEFGHIJ
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;19 M NQUVWXZKRYPTOSABCDEFGHIJL
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;20 N QUVWXZKRYPTOSABCDEFGHIJLM
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;21 Q UVWXZKRYPTOSABCDEFGHIJLMN
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;22 U VWXZKRYPTOSABCDEFGHIJLMNQ
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;23 V WXZKRYPTOSABCDEFGHIJLMNQU
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;24 W XZKRYPTOSABCDEFGHIJLMNQUV
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;25 X ZKRYPTOSABCDEFGHIJLMNQUVW
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;26 Z KRYPTOSABCDEFGHIJLMNQUVWX
</p>



                                                                          
                                                                        




            

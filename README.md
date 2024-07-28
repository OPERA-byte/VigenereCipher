# VigenereCipher
The VigenereCipher class provides an implementation of the Vigenère cipher, a method of encrypting and decrypting text using a series of different Caesar ciphers based on a keyword. The class includes various constructors, methods for encryption and decryption, and a method to print the cipher's dictionary.

The project is heavily inspired by a video created by YouTuber LEMINO. I thoroughly enjoy his content, especially this video. I suggest you watch the [Video](https://youtu.be/jVpsLMCIB0Y?si=haevvMONuUgkI6_0) yourself. 

# How it Works
First, a keyword (referred to as a dictionary key) is chosen to populate the beginning of a standard English alphabet. It is important to note that this preappended word is a rearrangement of the existing letters rather than an addition of new characters. In other words, the letters are reformatted so that the keyword appears at the front of the alphabet. I reffer to this new mutation of the alphabet as the Base Alphabet. This Base Alphabet will define the dictionary we use to encode characters. 

For example, if KRYPTOS is the keyword, the resulting base alphabet would be as follows: "KRYPTOSABCDEFGHIJLMNQUVWXZ". 

Next, this base alphabet is used to create an encryption table, which we refer to as the dictionary. The base alphabet is reformatted so that the first letter of the alphabet is appended to the end of the dictionary, and this process is repeated for every character. The result is a 26 x 26 dictionary we use to encode desired text. 

            01K RYPTOSABCDEFGHIJLMNQUVWXZ
            02R YPTOSABCDEFGHIJLMNQUVWXZK
            03Y PTOSABCDEFGHIJLMNQUVWXZKR
            04P TOSABCDEFGHIJLMNQUVWXZKRY
            05T OSABCDEFGHIJLMNQUVWXZKRYP
            06O SABCDEFGHIJLMNQUVWXZKRYPT
            07S ABCDEFGHIJLMNQUVWXZKRYPTO
            08A BCDEFGHIJLMNQUVWXZKRYPTOS
            09B CDEFGHIJLMNQUVWXZKRYPTOSA
            10C DEFGHIJLMNQUVWXZKRYPTOSAB
            11D EFGHIJLMNQUVWXZKRYPTOSABC
            12E FGHIJLMNQUVWXZKRYPTOSABCD
            13F GHIJLMNQUVWXZKRYPTOSABCDE
            14G HIJLMNQUVWXZKRYPTOSABCDEF
            15H IJLMNQUVWXZKRYPTOSABCDEFG
            16I JLMNQUVWXZKRYPTOSABCDEFGH
            17J LMNQUVWXZKRYPTOSABCDEFGHI
            18L MNQUVWXZKRYPTOSABCDEFGHIJ
            19M NQUVWXZKRYPTOSABCDEFGHIJL
            20N QUVWXZKRYPTOSABCDEFGHIJLM
            21Q UVWXZKRYPTOSABCDEFGHIJLMN
            22U VWXZKRYPTOSABCDEFGHIJLMNQ
            23V WXZKRYPTOSABCDEFGHIJLMNQU
            24W XZKRYPTOSABCDEFGHIJLMNQUV
            25X ZKRYPTOSABCDEFGHIJLMNQUVW
            26Z KRYPTOSABCDEFGHIJLMNQUVWX
                                                                          
                                                                    
                                                                                              
                                                                        Frail
                                                                        




            

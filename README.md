# VigenereCipher
The VigenereCipher class provides an implementation of the Vigenère cipher, a method of encrypting and decrypting text using a series of different Caesar ciphers based on a keyword. The class includes various constructors, methods for encryption and decryption, and a method to print the cipher's dictionary.

The project is heavily inspired by a video created by YouTuber LEMINO. I thoroughly enjoy his content, especially this video. I suggest you watch the [Video](https://youtu.be/jVpsLMCIB0Y?si=haevvMONuUgkI6_0) yourself. 

# How it Works
First, a keyword (referred to as a dictionary key) is chosen to populate the beginning of a standard English alphabet. It is important to note that this preappended word is a rearrangement of the existing letters rather than an addition of new characters. In other words, the letters are reformatted so that the keyword appears at the front of the alphabet. I reffer to this new mutation of the alphabet as the Base Alphabet. This Base Alphabet will define the dictionary we use to encode characters. 

For example, if KRYPTOS is the keyword, the resulting base alphabet would be as follows: "KRYPTOSABCDEFGHIJLMNQUVWXZ". 

Next, this base alphabet is used to create an encryption table, which we refer to as the dictionary. The base alphabet is reformatted so that the first letter of the alphabet is appended to the end of the dictionary, and this process is repeated for every character. The result is a 26 x 26 dictionary we use to encode desired text. 

<table>
  <tr><td><small>01</small></td><td><small>K RYPTOSABCDEFGHIJLMNQUVWXZ</small></td></tr>
  <tr><td><small>02</small></td><td><small>R YPTOSABCDEFGHIJLMNQUVWXZK</small></td></tr>
  <tr><td><small>03</small></td><td><small>Y PTOSABCDEFGHIJLMNQUVWXZKR</small></td></tr>
  <tr><td><small>04</small></td><td><small>P TOSABCDEFGHIJLMNQUVWXZKRY</small></td></tr>
  <tr><td><small>05</small></td><td><small>T OSABCDEFGHIJLMNQUVWXZKRYP</small></td></tr>
  <tr><td><small>06</small></td><td><small>O SABCDEFGHIJLMNQUVWXZKRYPT</small></td></tr>
  <tr><td><small>07</small></td><td><small>S ABCDEFGHIJLMNQUVWXZKRYPTO</small></td></tr>
  <tr><td><small>08</small></td><td><small>A BCDEFGHIJLMNQUVWXZKRYPTOS</small></td></tr>
  <tr><td><small>09</small></td><td><small>B CDEFGHIJLMNQUVWXZKRYPTOSA</small></td></tr>
  <tr><td><small>10</small></td><td><small>C DEFGHIJLMNQUVWXZKRYPTOSAB</small></td></tr>
  <tr><td><small>11</small></td><td><small>D EFGHIJLMNQUVWXZKRYPTOSABC</small></td></tr>
  <tr><td><small>12</small></td><td><small>E FGHIJLMNQUVWXZKRYPTOSABCD</small></td></tr>
  <tr><td><small>13</small></td><td><small>F GHIJLMNQUVWXZKRYPTOSABCDE</small></td></tr>
  <tr><td><small>14</small></td><td><small>G HIJLMNQUVWXZKRYPTOSABCDEF</small></td></tr>
  <tr><td><small>15</small></td><td><small>H IJLMNQUVWXZKRYPTOSABCDEFG</small></td></tr>
  <tr><td><small>16</small></td><td><small>I JLMNQUVWXZKRYPTOSABCDEFGH</small></td></tr>
  <tr><td><small>17</small></td><td><small>J LMNQUVWXZKRYPTOSABCDEFGHI</small></td></tr>
  <tr><td><small>18</small></td><td><small>L MNQUVWXZKRYPTOSABCDEFGHIJ</small></td></tr>
  <tr><td><small>19</small></td><td><small>M NQUVWXZKRYPTOSABCDEFGHIJL</small></td></tr>
  <tr><td><small>20</small></td><td><small>N QUVWXZKRYPTOSABCDEFGHIJLM</small></td></tr>
  <tr><td><small>21</small></td><td><small>Q UVWXZKRYPTOSABCDEFGHIJLMN</small></td></tr>
  <tr><td><small>22</small></td><td><small>U VWXZKRYPTOSABCDEFGHIJLMNQ</small></td></tr>
  <tr><td><small>23</small></td><td><small>V WXZKRYPTOSABCDEFGHIJLMNQU</small></td></tr>
  <tr><td><small>24</small></td><td><small>W XZKRYPTOSABCDEFGHIJLMNQUV</small></td></tr>
  <tr><td><small>25</small></td><td><small>X ZKRYPTOSABCDEFGHIJLMNQUVW</small></td></tr>
  <tr><td><small>26</small></td><td><small>Z KRYPTOSABCDEFGHIJLMNQUVWX</small></td></tr>
</table>


                                                                          
                                                                        




            

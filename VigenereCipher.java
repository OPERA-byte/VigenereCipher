import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class VigenereCipher {
    private String dictionaryKey;
    private String baseKeyStream;
    private String keyStream;
    private HashMap<Character, String> dictionary;
    private String baseAlphabet;

    /**
     * Default constructor for the VigenereCipher class.
     * Initializes the cipher with default values for the dictionary key, key stream,
     * and an empty dictionary.
     */
    public VigenereCipher() {
        baseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        dictionaryKey = "GLYPH";
        keyStream = "LEMON";
        baseKeyStream = keyStream;
        dictionary = new HashMap<>();
    }

    /**
     * Constructs a VigenereCipher object with the specified dictionary key and a default key stream.
     *
     * @param dictionaryKey The key used to initialize the cipher's dictionary.
     */
    public VigenereCipher(String dictionaryKey) {
        baseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.dictionaryKey = dictionaryKey;
        keyStream = "LEMON";
        baseKeyStream = keyStream;
    }

    /**
     * Constructs a VigenereCipher object with the specified dictionary key and key stream.
     *
     * @param dictionaryKey The key used to initialize the cipher's dictionary.
     * @param keyStream The key stream used for encryption and decryption.
     */
    public VigenereCipher(String dictionaryKey, String keyStream) {
        baseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.dictionaryKey = dictionaryKey;
        this.keyStream = keyStream;
        baseKeyStream = keyStream;
    }

    /**
     * This method takes a dictionary key and a base alphabet string, modifies the base alphabet by
     * rearranging it based on the characters in the dictionary key, and returns the modified alphabet.
     *
     * @param dictionaryKey the key used to rearrange the base alphabet, with spaces removed and converted to uppercase
     * @param baseAlphabet the original alphabet string that will be modified
     * @return the modified alphabet string with characters from the dictionary key prepended in reverse order
     */
    public String preAppendString(String dictionaryKey, String baseAlphabet) {
        String reformatAlphabet = baseAlphabet;
        dictionaryKey = dictionaryKey.toUpperCase();
        dictionaryKey = dictionaryKey.replace(" ", "");

        for(int i = 0; i < dictionaryKey.length(); i++) {
            char tempChar = dictionaryKey.charAt(dictionaryKey.length()-(i+1));
            reformatAlphabet = reformatAlphabet.replace(String.valueOf(tempChar), "");
            reformatAlphabet = tempChar + reformatAlphabet;
        }
        return reformatAlphabet;
    }

    /**
     * This method sets up a dictionary (hashmap) based on the base alphabet and dictionary key.
     * It first modifies the base alphabet using the dictionary key, then initializes a hashmap
     * where each character of the modified base alphabet is mapped to the rest of the string
     * with that character rotated to the end.
     */
    public void setDictionary() {
        this.baseAlphabet = preAppendString(dictionaryKey, baseAlphabet);
        String preBaseAlphabet = baseAlphabet;

        dictionary = new HashMap<>();
        for(int i = 0; i < baseAlphabet.length(); i++) {
            dictionary.put(baseAlphabet.charAt(0), baseAlphabet.substring(1));
            baseAlphabet += baseAlphabet.charAt(0);
            baseAlphabet = baseAlphabet.substring(1);
        }
        baseAlphabet = preBaseAlphabet;
    }

    /**
     * This method sets the key stream for the object. It initializes both the keyStream
     * and baseKeyStream fields with the provided keyStream string.
     *
     * @param keyStream the key stream string to be set
     */
    public void setKeyStream(String keyStream) {
        this.keyStream = keyStream;
        this.baseKeyStream = keyStream;
    }

    /**
     * This method returns the current key stream.
     *
     * @return the current key stream
     */
    public String getKeyStream() {
        return keyStream;
    }

    /**
     * This method reformats the key stream to match the length and structure of the plain text.
     * Non-alphabetic characters in the plain text are preserved in their positions, and alphabetic
     * characters from the key stream are used to fill in the rest.
     *
     * @param keyStream the original key stream to be reformatted
     * @param plainText the plain text that dictates the structure of the reformatted key stream
     * @return the reformatted key stream matching the structure of the plain text
     */
    public String reformatKeyStream(String keyStream, String plainText) {
        String reformatKeyStream = "";

        int j = 0;
        for(int i = 0; i < plainText.length(); i++) {
            String tempChar = String.valueOf(plainText.charAt(i));
            if (tempChar.matches(".*[^a-zA-Z].*")) {
                reformatKeyStream += tempChar;

                if(!tempChar.equals(" "))
                    dictionary.put(tempChar.charAt(0), tempChar);
            }else {
                if(j == keyStream.length())
                    j = 0;

                reformatKeyStream += keyStream.charAt(j);
                j++;
            }
        }
        return reformatKeyStream;
    }

    /**
     * This method encrypts the given plain text using the provided key stream.
     * It reformats the key stream to match the plain text, sets up the dictionary,
     * and generates the cipher text by substituting characters based on the dictionary.
     *
     * @param keyStreamIn the key stream used for encryption
     * @param plainText the plain text to be encrypted
     * @return the encrypted cipher text
     */
    public String encrypt(String keyStreamIn, String plainText) {
        String cipherText = "";

        baseKeyStream = keyStreamIn;
        setDictionary();
        plainText = plainText.toUpperCase();
        this.keyStream = reformatKeyStream(keyStreamIn, plainText);

        for(int i = 0; i < plainText.length(); i++) {
            int horizontalIndex;
            char tempCharacter;

            if(!Character.toString(plainText.charAt(i)).matches(".*[^a-zA-Z].*")) {
                horizontalIndex = dictionary.get(baseAlphabet.charAt(0)).indexOf(plainText.charAt(i));
                if(horizontalIndex == -1) {
                    tempCharacter = keyStream.charAt(i);
                }else {
                    tempCharacter = dictionary.get(keyStream.charAt(i)).charAt(horizontalIndex);
                }
                cipherText += tempCharacter;
            }else {
                if(Character.toString(plainText.charAt(i)).equals(" ")) {
                    cipherText += " ";
                }else {
                    cipherText += dictionary.get(plainText.charAt(i));
                }
            }
        }
        keyStream = baseKeyStream;
        return cipherText;
    }

    /**
     * This method encrypts the given plain text using the current key stream of the object.
     * It calls the encrypt method that takes both key stream and plain text as parameters.
     *
     * @param plainText the plain text to be encrypted
     * @return the encrypted cipher text
     */
    public String encrypt(String plainText) {
        String cipherText = encrypt(keyStream, plainText);
        return cipherText;
    }

    /**
     * This method decrypts the given cipher text using the provided dictionary key and key stream.
     * It sets up the dictionary, reformats the key stream, and generates the plain text by
     * reversing the substitution process used during encryption.
     *
     * @param dictionaryKeyIn the dictionary key used for setting up the dictionary
     * @param keyStreamIn the key stream used for decryption
     * @param cipherText the cipher text to be decrypted
     * @return the decrypted plain text
     */
    public String decrypt(String dictionaryKeyIn, String keyStreamIn, String cipherText) {
        String plainText = "";

        dictionaryKey = dictionaryKeyIn;
        setDictionary();
        baseKeyStream = keyStreamIn;
        keyStream = reformatKeyStream(keyStreamIn, cipherText);

        for(int i = 0; i < cipherText.length(); i++) {
            String tempCharacter = "";

            if(!Character.toString(cipherText.charAt(i)).matches(".*[^a-zA-Z].*")) {
                int horizontalIndex = dictionary.get(keyStream.charAt(i)).indexOf(cipherText.charAt(i));
                if(horizontalIndex == -1) {
                    tempCharacter = Character.toString(baseAlphabet.charAt(0));

                }else {
                    tempCharacter = Character.toString(dictionary.get(baseAlphabet.charAt(0)).charAt(horizontalIndex));
                }
                plainText += tempCharacter;
            }else {
                if(Character.toString(cipherText.charAt(i)).equals(" ")) {
                    plainText += " ";
                }else {
                    plainText += dictionary.get(cipherText.charAt(i));
                }
            }
        }
        keyStream = baseKeyStream;
        return plainText;
    }

    /**
     * This method decrypts the given cipher text using the current dictionary key and the provided key stream.
     * It calls the decrypt method that takes the dictionary key, key stream, and cipher text as parameters.
     *
     * @param keyStreamIn the key stream used for decryption
     * @param cipherText the cipher text to be decrypted
     * @return the decrypted plain text
     */
    public String decrypt(String keyStreamIn, String cipherText) {
        return decrypt(dictionaryKey, keyStreamIn, cipherText);
    }

    /**
     * This method decrypts the given cipher text using the current key stream of the object.
     * It calls the decrypt method that takes the key stream and cipher text as parameters.
     *
     * @param cipherText the cipher text to be decrypted
     * @return the decrypted plain text
     */
    public String decrypt(String cipherText) {
        return decrypt(keyStream, cipherText);
    }

    /**
     * Prints the contents of the dictionary.
     * This method iterates over the characters in the base alphabet and prints each
     * character along with its corresponding value from the dictionary.
     *
     * The output is formatted with a leading number, the character from the base alphabet,
     * and the associated value from the dictionary.
     */
    public void printDictionary() {
        System.out.println();
        ArrayList<String> nums = new ArrayList<>(Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"));
        for(int i = 0; i < baseAlphabet.length(); i++) {
            System.out.println("            " + nums.get(i) + baseAlphabet.charAt(i) + " " + dictionary.get(baseAlphabet.charAt(i)));
        }
    }

}

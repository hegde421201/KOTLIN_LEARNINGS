package crypto

import java.nio.charset.StandardCharsets
import java.util.*
import javax.crypto.BadPaddingException
import javax.crypto.Cipher
import javax.crypto.IllegalBlockSizeException
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.PBEKeySpec


import javax.crypto.spec.SecretKeySpec

fun main(){

    var requestMap = mapOf("UserID" to "Nikhil.Pawar",
        "SessionKey" to "1690376497602",
        "DeviceID" to "6bd5bef10d6164d2", "DeviceIP" to "192.0.0.4","IMEI" to "6bd5bef10d6164d2","isJioMetryLite" to "true",
        "Password" to "Nexus@2020","AppName" to "MTrack LCO Mapping New")

   var originalHegde = "{\\\"UserID\\\":\\\"Nikhil.Pawar\\\",\\\"SessionKey\\\":\\\"1690376497602\\\",\\\"DeviceID\\\":\\\"6bd5bef10d6164d2\\\",\\\"DeviceIP\\\":\\\"192.0.0.4\\\",\\\"IMEI\\\":\\\"6bd5bef10d6164d2\\\",\\\"isJioMetryLite\\\":\\\"true\\\",\\\"Password\\\":\\\"Nexus@2020\\\",\\\"AppName\\\":\\\"MTrack LCO Mapping New\\\"}\n"
    var inputMap = mapToJsonString(requestMap)

    inputMap = addBackslashBeforeQuotes(inputMap)
    println(inputMap)

    var serviceRequestMap = mapOf("Request" to inputMap)

    var serviceRequestJson = mapToJsonString(serviceRequestMap)

  //  println(inputMap)
  //  println(serviceRequestJson)

    val nikhilString = "nnI9+nEjyrMwGl5KeFD64hyiert5eawbQIzpLQQyiDFpgUf4k+571uY8Mn7wooVTzYwHlz/a/xgeNH2l8cwmN87OdIUV16JzcudzEVVyevihh3HU67UgJlJi/WjgNNXFQeXoMqH1nRQwERn170pQWKYB6kYf0B5UEQ4Pu7bP6LdzJFISfz2iCQ48Fd8514aedIYvmZ/s5oDqNwbvaLTtLbCKj7KL16OxmnXMtgaU9q/VVlwZtGgxWcKjMENp7GYKQXwPwk0TheosDT8FyqhgYCbAwwuuD0+Bx0Gt3n+AXug="

    val hegdeString =
        "nnI9+nEjyrMwGl5KeFD64hyiert5eawbQIzpLQQyiDFpgUf4k+571uY8Mn7wooVTzYwHlz/a/xgeNH2l8cwmN87OdIUV16JzcudzEVVyevihh3HU67UgJlJi/WjgNNXFQeXoMqH1nRQwERn170pQWKYB6kYf0B5UEQ4Pu7bP6LdzJFISfz2iCQ48Fd8514aedIYvmZ/s5oDqNwbvaLTtLbCKj7KL16OxmnXMtgaU9q/VVlwZtGgxWcKjMENp7GYKQXwPwk0TheosDT8FyqhgYCbAwwuuD0+Bx0Gt3n+AXug="

   // println(hegdeString == nikhilString)
    println(NewCryptoUtil.encrypt(originalHegde))
}

fun addBackslashBeforeQuotes(input: String): String {
    return input.replace("\"", "\\\"")
}

fun mapToJsonString(map: Map<String, String>): String {
    val entries = map.entries.joinToString(",") { (key, value) ->
        val escapedKey = escapeJsonString(key)
        val escapedValue = escapeJsonString(value)
        "\"$escapedKey\":\"$escapedValue\""
    }
    return "{$entries}"
}

fun escapeJsonString(value: String): String {
    return buildString {
        for (char in value) {
            when (char) {
                '\"' -> append("\\\"")
                '\\' -> append("\\\\")
                '\b' -> append("\\b")
                '\u000C' -> append("\\f")
                '\n' -> append("\\n")
                '\r' -> append("\\r")
                '\t' -> append("\\t")

                else -> append(char)
            }
        }
    }
}

object NewCryptoUtil {

    private var diff = arrayOf<String>()
    private var ENCRYPTION_CIPHER_BLOCK: Cipher
    private var DECRYPTION_CIPHER_BLOCK: Cipher

    private var chunks = arrayListOf<String>(
        "EVVWR",
        "FT",
        "w40QRl",
        "XORN",
        "FMOR",
        "lTWJE",
        "aadkUw",
        "JWbjNX",
        "VFpET",
        "SVUW5",
        "ZlMsB",
        "TYFhG",
        "dZdlT",
        "UNVRF",
        "hHTGV",
        "1dRh",
        "Far",
        "J1a1",
        "IEVWh",
        "mUQ",
        "NFeL",
        "NVRwhX",
        "WWR",
        "GNRVV",
        "MVN",
        "FWw9",
        "kUGV",
        "VeU",
        "5Gcu",
        "5UVw",
        "JEUU",
        "BzcW",
        "VFZHV",
        "WbNd",
        "XUq",
        "5UaN",
        "BDc",
        "yRlV",
        "FlDU",
        "R1TP"
    )

    init {

        val total = StringBuilder("=")
        for (param in chunks)
            total.append(param)

        var mushkil = total.reverse()

        val temp = String(Base64.getDecoder().decode(mushkil.toString()),StandardCharsets.UTF_8)

        println("Democracy $temp")

        diff = String(Base64.getDecoder().decode(temp.reversed()),StandardCharsets.UTF_8).split(",").toTypedArray()

        for(elemnets in diff){
            println(elemnets)
        }

        // Get Initialization Vector Parameter for AES encryption operation.

        var ivParam = Base64.getDecoder().decode(diff[3])
        ivParam = String(ivParam).toByteArray()

      //  println("ivParamBytes: ${ivParam.joinToString(", ")}")

        // Create cipher block for encryption.
        ENCRYPTION_CIPHER_BLOCK = Cipher.getInstance(diff[0])
        ENCRYPTION_CIPHER_BLOCK.init(
            Cipher.ENCRYPT_MODE,
            getSecretKey(), IvParameterSpec(ivParam)
        )

        // Create cipher block for decryption.
        DECRYPTION_CIPHER_BLOCK = Cipher.getInstance(diff[0])
        DECRYPTION_CIPHER_BLOCK.init(
            Cipher.DECRYPT_MODE,
            getSecretKey(), IvParameterSpec(ivParam)
        )
    }

    private fun getSecretKey(): SecretKeySpec {

       val password = Base64.getDecoder().decode(diff[4]).toString().toCharArray()
       val salt =  Base64.getDecoder().decode(diff[2]).toString().toByteArray(StandardCharsets.UTF_8)

        val i = 16
        val keySpec = PBEKeySpec(
            password, salt,
            i * i,
            i * i / 2
        )
        val secretKey =
            SecretKeyFactory.getInstance(diff[1]).generateSecret(keySpec)
        val secretKeyBytes = secretKey.encoded
        return SecretKeySpec(secretKeyBytes, "AES")
    }

    fun decrypt(encodedCipher: String): String {

        return try {

            val cipherBytes = Base64.getDecoder().decode(encodedCipher)

            val messageBytes =  DECRYPTION_CIPHER_BLOCK.doFinal(cipherBytes)
            String(messageBytes)
        } catch (e: BadPaddingException) {
            e.printStackTrace()
            ""
        } catch (e: IllegalBlockSizeException) {
            e.printStackTrace()
            ""
        }
    }

    fun encrypt(plainText: String): String {

        val messageBytes = plainText.toByteArray()
        return try {
            val encryptedBytes =  ENCRYPTION_CIPHER_BLOCK.doFinal(messageBytes)

            Base64.getEncoder().encodeToString(encryptedBytes)


            //Base64.getEncoder().encode(encryptedBytes).toString()
        } catch (e: BadPaddingException) {
            e.printStackTrace()
            ""
        } catch (e: IllegalBlockSizeException) {
            e.printStackTrace()
            ""
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }

}


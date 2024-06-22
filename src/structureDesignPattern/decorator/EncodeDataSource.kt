package src.structureDesignPattern.decorator

import java.util.*
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class EncodeDataSource(
    dataSource: DataSource
): DataSourceDecorator(dataSource) {
    private val encoder = Cipher.getInstance("AES/CBC/PKCS5Padding")
    private val key = SecretKeySpec("doSecret!!!!!dsajkhbghjskjd!!!!!".toByteArray(), "AES")
    private val initVector = IvParameterSpec("1234567890123456".toByteArray()) // 16 bytes IV


    override fun writeData(data: String): String {
        encoder.init(Cipher.ENCRYPT_MODE, key, initVector)
        val encryptedData = encoder.doFinal(data.toByteArray())
        val base64EncodedData = Base64.getEncoder().encodeToString(encryptedData)
        return super.writeData(base64EncodedData)
    }

    override fun readData(): String {
        encoder.init(Cipher.DECRYPT_MODE, key, initVector)
        val base64EncodedData = super.readData()
        val encryptedData = Base64.getDecoder().decode(base64EncodedData)
        val decryptedData = String(encoder.doFinal(encryptedData))
        return decryptedData
    }
}
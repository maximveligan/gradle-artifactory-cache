package plugin

/**
 * Created by grodion on 6/9/17.
 */

import java.util.*
import org.jfrog.artifactory.client.*
import org.junit.Assert.*
import org.junit.Test
import java.io.File
import org.apache.commons.io.FileUtils.readFileToByteArray

val artifactory = ArtifactoryClient.create("http://localhost:8081/artifactory/", "admin", "password")
val path = "testFiles/"
val fileName = "test1"
val testFile = File(path + fileName)
val testRepository = "example-repo-local"

public class ArtifactoryAPITest {
    @Test
    fun testLoad() {
        artifactory.repository(testRepository).upload(path + fileName , testFile).doUpload();
        val downloadedArtifact = artifactory.repository(testRepository).download(path + fileName).doDownload();
        val expectedByteArray = readFileToByteArray(testFile)
        val numberOfBytes = testFile.length()
        var actualByteArray: ByteArray
        var x = 0
        while (x < numberOfBytes) {
            assertTrue(downloadedArtifact.read().toByte() == expectedByteArray[x])
            x++
        }
//        Lots of room for optimization here. Rewrite code to use assertArrayEquals, and get read(Byte[]) working
//        with inputStream
    }
}


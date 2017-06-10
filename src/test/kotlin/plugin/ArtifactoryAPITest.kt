package plugin

/**
 * Created by grodion on 6/9/17.
 */

import java.util.*
import org.jfrog.artifactory.client.*
import org.junit.Assert.*
import org.junit.Test
import java.io.File

var artifactory = ArtifactoryClient.create("http://localhost:8081/artifactory/", "admin", "password")
var path = "testFiles/"
var testFile = File(path + "test1")

var testRepository = "example-repo-local"

public class ArtifactoryAPITest {
    @Test
    fun testLoad() {
        artifactory.repository(testRepository).upload(path , testFile).doUpload();
    }
}

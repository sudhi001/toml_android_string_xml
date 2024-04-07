package `in`.sudhi.toml
import com.moandjiezana.toml.Toml
import java.io.File

class TomlToXmlConverter {

    fun convertTomlToXml(tomlFolderPath: String, outputFolderPath: String) {
        val tomlFolder = File(tomlFolderPath)
        val outputFolder = File(outputFolderPath)

        if (!outputFolder.exists()) {
            outputFolder.mkdirs()
        }

        tomlFolder.listFiles()?.forEach { file ->
            if (file.extension == "toml") {
                val  nameArr:List<String> = file.name.split("_").toList()
                val name = if (nameArr.size>1) nameArr[1].substring(0, nameArr[1].lastIndexOf(".")) else ""
                val toml = Toml().read(file)
                // Process the TOML data and generate strings.xml content
                val stringsXmlContent = generateStringsXmlFromToml(toml)
                // Write to strings.xml file in the output folder
                val valuefilename = if (name.isEmpty()) "app/src/main/res/values" else "app/src/main/res/values-$name"
                val outputFolder = File(outputFolder, valuefilename)
                if (!outputFolder.exists()){
                    outputFolder.mkdirs()
                }
                val outputFile = File(outputFolder, "strings.xml")
                outputFile.writeText(stringsXmlContent)
            }
        }
    }

    private fun generateStringsXmlFromToml(toml: Toml): String {
        // Implement logic to convert TOML data to strings.xml format
        // You can use XML libraries or manual string building here
        // Example:
        val stringBuilder = StringBuilder()
        stringBuilder.appendLine("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
        stringBuilder.appendLine("<resources>")
        toml.toMap().forEach { (key, value) ->
            stringBuilder.appendLine("    <string name=\"$key\">$value</string>")
        }
        stringBuilder.appendLine("</resources>")
        return stringBuilder.toString()
    }
}

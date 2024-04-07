package `in`.sudhi.toml


import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class TomlToXmlAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {

        val project = e.project ?: return
        // Specify paths to TOML and output folders
        val tomlFolderPath =  "${project.baseDir.path}/toml"
        val outputFolderPath = "${project.baseDir.path}"

        // Convert TOML files to strings.xml
        val converter = TomlToXmlConverter()
        converter.convertTomlToXml(tomlFolderPath, outputFolderPath)

        // Refresh project to reflect changes in IDE
        project.baseDir.refresh(false, true)
        Messages.showMessageDialog(e.project,"Generator process completed.","TOML - Android String.xml",Messages.getInformationIcon())
    }
}

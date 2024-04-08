# TOML - Android String.xml Plugin


This plugin is designed to facilitate the conversion of TOML files into Android `strings.xml` files.

To use this plugin, follow these steps:

1. Create your TOML file under the project root folder like `<Project Root Folder>/toml/anyname.toml`.
2. To support multiple languages, name the file with the language code as the extension. For example:
    - `<code>anyname_en.toml</code>` for English
    - `<code>anyname_fr.toml</code>` for French

   These files with language extensions will be placed under corresponding `<code>values-</code>` directories in Android projects (e.g., `<code>values-en</code>` for English).


To get started with the TOML to Android Strings.xml plugin in a JetBrains IDE, follow these steps:

[![IMAGE ALT TEXT](http://img.youtube.com/vi/w1gz3UdEN9g/0.jpg)](http://www.youtube.com/watch?v=w1gz3UdEN9g "TOML - Android String.xml Plugin")

### Installation Steps:
1. **Install a JetBrains IDE**:
   - Make sure you have a compatible JetBrains IDE installed, such as IntelliJ IDEA, CLion, PyCharm, or any other IntelliJ-based IDE.
   - Download and install the IDE from the JetBrains website: [JetBrains Products](https://www.jetbrains.com/products/).

2. **Open Plugin Settings**:
   - Launch the installed JetBrains IDE.
   - Go to `Settings/Preferences` from the main menu (usually found under `File` or `IntelliJ IDEA` menu).

3. **Install "Toml To Android Strings.xml" Plugin**:
   - In the Settings/Preferences dialog, navigate to `Plugins`.
   - Click on `Marketplace` or `Browse repositories` (depending on the IDE version).
   - Search for "Toml To Android Strings.xml" plugin.
   - Click on the plugin in the search results and then click `Install` to install the plugin.
   - Follow any prompts to complete the installation process.

### Usage Steps:
1. **Create a "toml" Folder**:
   - Navigate to the root directory of your project.
   - Create a new folder named `toml`.

2. **Add TOML Files**:
   - Inside the `toml` folder, create a file named `message.toml`.
   - Populate `message.toml` with your string key-value pairs using TOML format.

3. **Support Multiple Languages**:
   - For Arabic support, create a file named `message_ar.toml` inside the `toml` folder.
   - For French support, create a file named `message_fr.toml` inside the `toml` folder.
   - Use the naming convention `filename_<LanguageCode>.toml` for additional language files (e.g., `filename_en.toml`, `filename_es.toml`, etc.).

4. **Access the "TOMLToXML" Menu**:
   - Open your Android project in the JetBrains IDE.
   - Look for the `TOMLToXML` menu option in the top toolbar of the IDE.
   - Click on `TOMLToXML` to trigger the conversion process.
   - The plugin will generate corresponding `strings.xml` files based on your TOML files, including localization for different languages.

By following these steps, you'll be able to install and use the "Toml To Android Strings.xml" plugin to manage your string resources efficiently using TOML files within your JetBrains IDE. Enjoy developing with enhanced localization support!

# Bugs or Requests

If you come across any difficulties, don't hesitate to open an [issue](https://github.com/sudhi001/toml_viewer/issues) on GitHub. If you believe that the library lacks a particular feature, please create a [ticket](https://github.com/sudhi001/toml_viewer/issues) on GitHub, and I'll investigate it. Additionally, I welcome pull requests if you would like to contribute to the project.

# Developer Information

## Project Contributors

This project is actively developed and maintained by a dedicated team of contributors. If you have any questions, suggestions, or issues related to the project, feel free to reach out to any of our team members listed below.

### Lead Developer

- **Name:** Sudhi S
- **GitHub:** [sudhi001](https://github.com/sudhi001)
- **Twitter** [X Platform](https://twitter.com/su_dhi)
- **Email:** devsudhi@icloud.com


### Contributors

We'd like to extend our gratitude to all the open-source contributors who have helped improve this project. Your contributions are greatly appreciated.

## How to Contribute

We welcome contributions from the community to help improve this project. If you're interested in contributing, please follow these guidelines:

Before submitting a Pull Request, please make sure to:

- Follow the project's coding style and guidelines.
- Write clear and concise commit messages.
- Test your changes thoroughly.
- Update documentation if necessary.

## Bug Reports and Feature Requests

If you encounter any bugs or have ideas for new features, please feel free to open an issue on GitHub. We appreciate your feedback and will do our best to address any concerns promptly.

